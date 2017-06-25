package br.com.gerenciamentoOS.dao;

import br.com.gerenciamentoOS.modelo.OrdemDeServico;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeServicoDAO {

    private Connection connection;

    public OrdemDeServicoDAO(Connection connection) {
        this.connection = connection;
        System.out.println(connection);
    }

    public void adicionarOS(OrdemDeServico os) throws SQLException {
        String sql = "insert into OrdemServico (dataOS, equipamento, defeito, servico, valor, idCliente) values (?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(os.getDataOS().getTimeInMillis()));
            stmt.setString(2, os.getEquipamento());
            stmt.setString(3, os.getDefeito());
            stmt.setString(4, os.getServico());
            stmt.setDouble(5, os.getValor());
            stmt.setInt(6, os.getIdClienteOS());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarOS(OrdemDeServico os) {
        String sql = "update OrdemServico set equipamento = ?, defeito = ?, servico = ?, valor = ? where idOS = ?";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            //stmt.setDate(1, new java.sql.Date(os.getDataOS().getTimeInMillis()));
            stmt.setString(1, os.getEquipamento());
            stmt.setString(2, os.getDefeito());
            stmt.setString(3, os.getServico());
            stmt.setDouble(4, os.getValor());
            stmt.setInt(5, os.getIdOS());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<OrdemDeServico> listaOS() {
        String sql = "select * from OrdemServico";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            List<OrdemDeServico> ordens = new ArrayList<OrdemDeServico>();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                OrdemDeServico os = new OrdemDeServico();

                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataOS"));
                os.setDataOS(data);

                os.setIdOS(rs.getInt("idOS"));
                os.setEquipamento(rs.getString("Equipamento"));
                os.setDefeito(rs.getString("Defeito"));
                os.setServico(rs.getString("Servico"));
                os.setValor(rs.getDouble("Valor"));
                os.setIdClienteOS(rs.getInt("idCliente"));

                ordens.add(os);
            }
            stmt.execute();
            rs.close();
            stmt.close();
            return ordens;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<OrdemDeServico> listaOSPorID(int idOS) {
        String sql = "select * from OrdemServico where idOS = " + idOS + "";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            List<OrdemDeServico> ordens = new ArrayList<OrdemDeServico>();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                OrdemDeServico os = new OrdemDeServico();

                os.setIdOS(rs.getInt("idOS"));
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataOS"));
                os.setDataOS(data);

                os.setEquipamento(rs.getString("Equipamento"));
                os.setDefeito(rs.getString("Defeito"));
                os.setServico(rs.getString("Servico"));
                os.setValor(rs.getDouble("Valor"));
                os.setIdClienteOS(rs.getInt("idCliente"));

                ordens.add(os);
            }
            stmt.execute();
            rs.close();
            stmt.close();
            return ordens;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void excluirOS(OrdemDeServico os) {
        String sql = "delete from OrdemServico where idOS = ?";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            
            stmt.setInt(1, os.getIdOS());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
