package br.com.gerenciamentoOS.connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    //metodo responsavel por manter conexao com o banco de dados
    public Connection getConnection(String servidor, String user, String senha) throws SQLException {
        Connection connection = null;
        String url = "jdbc:Mysql://"+servidor+"/GerenciamentoOS";
        // Criando conexao com o banco de dados
        try {
            connection = DriverManager.getConnection(url, user, senha);
            return connection;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o Banco de Dados, informe seus dados corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
