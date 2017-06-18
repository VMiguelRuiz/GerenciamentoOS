package br.com.gerenciamentoOS.controle.cliente;
import br.com.gerenciamentoOS.dao.cliente.ClienteDAO;
import br.com.gerenciamentoOS.modelo.cliente.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MetodosCliente {
    
    private ClienteDAO clienteDAO;
    
    public MetodosCliente(ClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }
    
    public void adicionarCliente(String nome, String endereco, String telefone, String email) throws SQLException{
            Cliente cliente = new Cliente();
            
            cliente.setNomeCliente(nome);
            cliente.setEndCliente(endereco);
            cliente.setFoneCliente(telefone);
            cliente.setEmailCliente(email);
        
            clienteDAO.adicionarCliente(cliente);
    }
    
    public void alterarCliente(int idCliente, String nome, String endereco, String telefone, String email){
        Cliente cliente = new Cliente();
        
        cliente.setIdCliente(idCliente);
        cliente.setNomeCliente(nome);
        cliente.setEndCliente(endereco);
        cliente.setFoneCliente(telefone);
        cliente.setEmailCliente(email);
        
        clienteDAO.alterarCliente(cliente);
    }
    
    public void excluirCliente(int idCliente){
        Cliente cliente = new Cliente();
        
        cliente.setIdCliente(idCliente);
        clienteDAO.excluirCliente(cliente);
    }
}
