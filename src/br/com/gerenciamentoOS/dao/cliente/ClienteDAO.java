package br.com.gerenciamentoOS.dao.cliente;

import br.com.gerenciamentoOS.connectionFactory.ConnectionFactory;
import br.com.gerenciamentoOS.modelo.cliente.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {

    private Connection connection;

    public ClienteDAO(Connection connection) throws SQLException {
        this.connection = connection;
        System.out.println(connection);
    }

    public void adicionarCliente(Cliente cliente) throws SQLException {
        String sql = "insert into Clientes (nomeCliente, endCliente, foneCliente, emailCliente) values (?,?,?,?)";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getEndCliente());
            stmt.setString(3, cliente.getFoneCliente());
            stmt.setString(4, cliente.getEmailCliente());

            stmt.execute();
            JOptionPane.showMessageDialog(null, cliente.getNomeCliente() + " adicionado(a) com Sucesso");
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarCliente(Cliente cliente) {
        String sql = "update Clientes set nomeCliente = ?, endCliente = ?, foneCliente = ?, emailCliente = ? where idCliente = ?";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getEndCliente());
            stmt.setString(3, cliente.getFoneCliente());
            stmt.setString(4, cliente.getEmailCliente());
            stmt.setInt(5, cliente.getIdCliente());

            stmt.execute();
            JOptionPane.showMessageDialog(null, cliente.getNomeCliente() + " alterado(a) com Sucesso");
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Cliente> listaClientes() {
        String sql = "select * from Clientes";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            List<Cliente> clientes = new ArrayList<Cliente>();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setEndCliente(rs.getString("endCliente"));
                cliente.setFoneCliente(rs.getString("foneCliente"));
                cliente.setEmailCliente(rs.getString("emailCliente"));

                clientes.add(cliente);
            }

            stmt.execute();
            rs.close();
            stmt.close();
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String buscarNomeClientePorId(int idCliente){
        String sql = "select nomeCliente from Clientes where idCliente = " + idCliente + "";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            String nomeCliente = "";
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNomeCliente(rs.getString("nomeCliente"));

                nomeCliente = cliente.getNomeCliente();
            }

            stmt.execute();
            rs.close();
            stmt.close();
            return nomeCliente;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Cliente> pesquisarClientePorNome(String nomeCliente) {
        String sql = "select * from Clientes where nomeCliente like '%" + nomeCliente + "%'";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            List<Cliente> clientes = new ArrayList<Cliente>();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setEndCliente(rs.getString("endCliente"));
                cliente.setFoneCliente(rs.getString("foneCliente"));
                cliente.setEmailCliente(rs.getString("emailCliente"));

                clientes.add(cliente);
            }

            stmt.execute();
            rs.close();
            stmt.close();
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void excluirCliente(Cliente cliente){
        String sql = "delete from Clientes where idCliente = ?";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.setInt(1, cliente.getIdCliente());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
