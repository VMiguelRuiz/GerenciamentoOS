/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gerenciamentoOS.telas;

import br.com.gerenciamentoOS.controle.cliente.MetodosCliente;
import br.com.gerenciamentoOS.dao.cliente.ClienteDAO;
import br.com.gerenciamentoOS.modelo.cliente.Cliente;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class TelaCadastroCliente extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private ClienteDAO clienteDAO;

    public TelaCadastroCliente(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
        criandoColunasNaTabela();
        carregarTabela();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEnd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jLabelPesquisarCliente = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabelAtualizarTabela = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setDesktopIcon(getDesktopIcon());
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(900, 476));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Endereco");

        jLabel3.setText("Telefone");

        jLabel4.setText("E-Mail");

        jTextFieldID.setEditable(false);

        jLabel5.setText("ID");

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        jButtonAdicionar.setToolTipText("Adicionar Cliente");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/edit.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Alterar Cliente");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir Cliente\n");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTextFieldPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Look-icon.png"))); // NOI18N
        jLabelPesquisarCliente.setToolTipText("Pesquisar Cliente");
        jLabelPesquisarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPesquisarClienteMouseClicked(evt);
            }
        });

        jTableCliente.setModel(modelo);
        jTableCliente.getTableHeader().setReorderingAllowed(false);
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCliente);

        jLabelAtualizarTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh.png"))); // NOI18N
        jLabelAtualizarTabela.setToolTipText("Atualizar Tabela\n");
        jLabelAtualizarTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAtualizarTabelaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelAtualizarTabela))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelPesquisarCliente)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jButtonAdicionar)
                        .addGap(83, 83, 83)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisarCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabelAtualizarTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAlterar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        try {
            adicionarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jLabelPesquisarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarClienteMouseClicked
        excluirLinhasDaTabela();

        //Preenchendo tabela com novos dados
        if (jTextFieldPesquisa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de busca", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String pesquisaPorNome = jTextFieldPesquisa.getText();
            pesquisarClientePorNome(pesquisaPorNome);
        }
    }//GEN-LAST:event_jLabelPesquisarClienteMouseClicked

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterarCliente();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluirCliente();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        //Limpar seleção da tabela
        limparTextField();
        jTableCliente.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void jLabelAtualizarTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtualizarTabelaMouseClicked
        carregarTabela();
        limparTextField();
    }//GEN-LAST:event_jLabelAtualizarTabelaMouseClicked

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        //Pegando dados da seleção da tabela
        int linha = jTableCliente.getSelectedRow();
        jTextFieldID.setText(jTableCliente.getValueAt(linha, 0).toString());
        jTextFieldNome.setText(jTableCliente.getValueAt(linha, 1).toString());
        jTextFieldEnd.setText(jTableCliente.getValueAt(linha, 2).toString());
        jTextFieldFone.setText(jTableCliente.getValueAt(linha, 3).toString());
        jTextFieldEmail.setText(jTableCliente.getValueAt(linha, 4).toString());
    }//GEN-LAST:event_jTableClienteMouseClicked

    public void criandoColunasNaTabela() {
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Endereco");
        modelo.addColumn("Telefone");
        modelo.addColumn("E-Mail");
    }

    public void limparTextField() {
        //Limpando todos os JTextField
        jTextFieldPesquisa.setText("");
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldEnd.setText("");
        jTextFieldFone.setText("");
        jTextFieldEmail.setText("");
    }

    public void carregarTabela() {
        //Excluindo linhas antigas
        excluirLinhasDaTabela();

        //Preenchendo tabela com novos dados
        List<Cliente> clientes = clienteDAO.listaClientes();
        for (Cliente cliente : clientes) {
            modelo.addRow(new Object[]{cliente.getIdCliente(), cliente.getNomeCliente(), cliente.getEndCliente(), cliente.getFoneCliente(), cliente.getEmailCliente()});
        }
    }

    public void pesquisarClientePorNome(String nome) {
        List<Cliente> clientes = clienteDAO.pesquisarClientePorNome(jTextFieldPesquisa.getText());

        //Verificando se retornou algum cliente
        if (clientes.size() == 0) {
            //Caso não tenha retornado clientes, retorna mensagem
            JOptionPane.showMessageDialog(null, "Não existem clientes com esse nome");
        } else {
            //Caso tenha retornado clientes, preenche a tabela
            for (Cliente cliente : clientes) {
                //Preenchendo a tabela
                modelo.addRow(new Object[]{cliente.getIdCliente(), cliente.getNomeCliente(), cliente.getEndCliente(), cliente.getFoneCliente(), cliente.getEmailCliente()});
            }
        }
    }

    public void adicionarCliente() throws SQLException {
        try {
            String nome = jTextFieldNome.getText();
            String endereco = jTextFieldEnd.getText();
            //Recebendo um inteiro, pois o campo de telefone não pode ser uma String
            int fone = Integer.parseInt(jTextFieldFone.getText());
            //Transformando o telefone para uma String
            String telefone = Integer.toString(fone);
            String email = jTextFieldEmail.getText();

            if (nome.equals("") || endereco.equals("") || telefone.equals("") || email.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para adicionar um novo Cliente", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //Instanciando classe com o metodo para adicionar cliente
                MetodosCliente cliente = new MetodosCliente(clienteDAO);
                //Chamando metodo para adicionar cliente
                cliente.adicionarCliente(nome, endereco, telefone, email);

                carregarTabela();
                limparTextField();
            }
        } catch (NumberFormatException e) {
            //Tratamento de erro quando o campo de telefone receber uma String
            JOptionPane.showMessageDialog(null, "Insira somente numeros no campo de Telefone", "Erro",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldFone.setText("");
            jTextFieldFone.requestFocus();
        }
    }

    public void alterarCliente() {
        //Recebendo id do Cliente em String
        String idCli = jTextFieldID.getText();
        String nome = jTextFieldNome.getText();
        String endereco = jTextFieldEnd.getText();
        //Recebendo um inteiro, pois o campo de telefone não pode ser uma String
        int fone = Integer.parseInt(jTextFieldFone.getText());
        //Transformando o telefone para uma String
        String telefone = Integer.toString(fone);
        String email = jTextFieldEmail.getText();

        try {
            if (idCli.equals("")) {
                JOptionPane.showMessageDialog(null, "Selecione um Cliente para Alterar", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            } else if (nome.equals("") || endereco.equals("") || telefone.equals("") || email.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para adicionar um novo Cliente", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar " + jTextFieldNome.getText() + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
                if (opcao == JOptionPane.YES_OPTION) {
                    //Convertendo id do Cliente para inteiro
                    int idCliente = Integer.parseInt(idCli);

                    //Instanciando classe com o metodo para alterar o cliente
                    MetodosCliente cliente = new MetodosCliente(clienteDAO);
                    //chamando metedo alterar cliente
                    cliente.alterarCliente(idCliente, nome, endereco, telefone, email);

                    carregarTabela();
                    limparTextField();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira somente numeros no campo de Telefone", "Erro",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldFone.setText("");
            jTextFieldFone.requestFocus();
        }
    }

    public void excluirCliente() {
        //Recebendo id do Cliente em String
        String idCli = jTextFieldID.getText();

        if (jTextFieldID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um contato para excluir", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir " + jTextFieldNome.getText() + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                //Convertendo id do Cliente para inteiro
                int idCliente = Integer.parseInt(idCli);

                //Instanciando classe com o metodo para adicionar cliente
                MetodosCliente cliente = new MetodosCliente(clienteDAO);
                //Chamando metodo para excluir cliente
                cliente.excluirCliente(idCliente);

                carregarTabela();
                limparTextField();
            }
        }
    }

    public void excluirLinhasDaTabela() {
        //Excluindo linhas preenchidas da tabela
        while (modelo.getRowCount() > 0) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                modelo.removeRow(i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAtualizarTabela;
    private javax.swing.JLabel jLabelPesquisarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEnd;
    private javax.swing.JTextField jTextFieldFone;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
