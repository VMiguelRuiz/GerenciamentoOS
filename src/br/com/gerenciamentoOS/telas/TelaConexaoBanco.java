package br.com.gerenciamentoOS.telas;

import br.com.gerenciamentoOS.connectionFactory.ConnectionFactory;
import br.com.gerenciamentoOS.dao.ClienteDAO;
import br.com.gerenciamentoOS.dao.OrdemDeServicoDAO;
import static br.com.gerenciamentoOS.telas.TelaPrincipal.osDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaConexaoBanco extends javax.swing.JFrame {

    
    private Connection connection;
    private ClienteDAO clienteDAO;
    private OrdemDeServicoDAO osDAO;

    public TelaConexaoBanco() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldUserMySQL = new javax.swing.JTextField();
        jTextFieldSenhaMySQL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonConectar = new javax.swing.JButton();
        jTextFieldServidor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conexão com o Banco de Dados MySQL");
        setResizable(false);

        jLabel1.setText("Usuário MySQL ");

        jTextFieldUserMySQL.setText("root");
        jTextFieldUserMySQL.setToolTipText("Senha padrão: root\n");

        jLabel2.setText("Senha MySQL");

        jButtonConectar.setText("Conectar");
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        jTextFieldServidor.setText("localhost");
        jTextFieldServidor.setToolTipText("Padrão: localhost");

        jLabel3.setText("Servidor");

        jLabelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/information-icon.png"))); // NOI18N
        jLabelInfo.setText("Informações");
        jLabelInfo.setToolTipText("Informações ");
        jLabelInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelInfo)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldServidor)
                            .addComponent(jTextFieldUserMySQL)
                            .addComponent(jTextFieldSenhaMySQL)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 123, Short.MAX_VALUE)
                                .addComponent(jButtonConectar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldUserMySQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldSenhaMySQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        criaNovaConexao();
        if (!(connection == null)) {
            TelaPrincipal principal = new TelaPrincipal(clienteDAO, osDAO);
            principal.setVisible(true);
        }
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jLabelInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInfoMouseClicked
        TelaInfoBD infoBD = new TelaInfoBD();
        infoBD.setVisible(true);
    }//GEN-LAST:event_jLabelInfoMouseClicked

    public void criaNovaConexao() {
        try {
            String servidor = jTextFieldServidor.getText();
            String user = jTextFieldUserMySQL.getText();
            String senha = jTextFieldSenhaMySQL.getText();
            setConexao(servidor, user, senha);
            setClienteDAO(connection);
            setOsDAO(connection);

            if (connection == null) {
            } else {
                JOptionPane.showMessageDialog(null, "Conexão Estabelecida", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setOsDAO(Connection connection)throws SQLException {
        this.osDAO = new OrdemDeServicoDAO(connection);
    }
    
    public void setClienteDAO(Connection connection) throws SQLException {
        this.clienteDAO = new ClienteDAO(connection);
    }

    public void setConexao(String servidor, String user, String senha) throws SQLException {
        connection = new ConnectionFactory().getConnection(servidor, user, senha);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaPrincipal(dao).setVisible(true);
                new TelaConexaoBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JTextField jTextFieldSenhaMySQL;
    private javax.swing.JTextField jTextFieldServidor;
    private javax.swing.JTextField jTextFieldUserMySQL;
    // End of variables declaration//GEN-END:variables
}
