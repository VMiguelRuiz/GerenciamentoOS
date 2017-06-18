package br.com.gerenciamentoOS.telas;

import br.com.gerenciamentoOS.dao.cliente.ClienteDAO;
import br.com.gerenciamentoOS.dao.os.OrdemDeServicoDAO;
import br.com.gerenciamentoOS.modelo.cliente.Cliente;
import br.com.gerenciamentoOS.modelo.os.OrdemDeServico;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaOS extends javax.swing.JInternalFrame {

    
    /*Modelos de tabela*/
    // Modelo  da tabela de Ordens de Servico
    DefaultTableModel modeloOrdens = new DefaultTableModel(); 
    // Modelo  da tabela de Clientes
    DefaultTableModel modelo = new DefaultTableModel(); 
    
    static ClienteDAO clienteDAO;
    static OrdemDeServicoDAO osDAO;

    public TelaOS(ClienteDAO clienteDAO, OrdemDeServicoDAO osDAO) {
        this.clienteDAO = clienteDAO;
        this.osDAO = osDAO;
        criandoColunasNasTabelas();
        carregarTabelas();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldBuscaCliente = new javax.swing.JTextField();
        jLabelBtnBuscarCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClienteOS = new javax.swing.JTable();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabelAtualizarTabelaDeClientes = new javax.swing.JLabel();
        jTextFieldEquip = new javax.swing.JTextField();
        jTextFieldDefeito = new javax.swing.JTextField();
        jTextFieldServico = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonEditarOS = new javax.swing.JButton();
        jButtonAdicionarOS = new javax.swing.JButton();
        jButtonExcluirOS = new javax.swing.JButton();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldIdOS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableOrdemDeServico = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPesquisaIdOS = new javax.swing.JTextField();
        jLabelPesquisarOS = new javax.swing.JLabel();
        jLabelAtualizarTabelaDeOS = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        jLabel3.setText("jLabel3");

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ordem de Serviço");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(900, 500));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabelBtnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Look-icon.png"))); // NOI18N
        jLabelBtnBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnBuscarClienteMouseClicked(evt);
            }
        });

        jTableClienteOS.setModel(modelo);
        jTableClienteOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClienteOS);

        jTextFieldIdCliente.setEditable(false);

        jLabel9.setText("Id Cliente");

        jLabelAtualizarTabelaDeClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh.png"))); // NOI18N
        jLabelAtualizarTabelaDeClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAtualizarTabelaDeClientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelBtnBuscarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAtualizarTabelaDeClientes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelBtnBuscarCliente)
                        .addComponent(jTextFieldBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jLabelAtualizarTabelaDeClientes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("Equipamento");

        jLabel6.setText("Defeito");

        jLabel7.setText("Serviço");

        jLabel8.setText("Valor Total");

        jButtonEditarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/edit icon os.png"))); // NOI18N
        jButtonEditarOS.setToolTipText("Editar Ordem de Serviço");
        jButtonEditarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarOSActionPerformed(evt);
            }
        });

        jButtonAdicionarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add icon os.png"))); // NOI18N
        jButtonAdicionarOS.setToolTipText("Adicionar Ordem de Serviço");
        jButtonAdicionarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarOSActionPerformed(evt);
            }
        });

        jButtonExcluirOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete icon os.png"))); // NOI18N
        jButtonExcluirOS.setToolTipText("Excluir Ordem de Serviço");
        jButtonExcluirOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirOSActionPerformed(evt);
            }
        });

        jTextFieldData.setEditable(false);

        jTextFieldIdOS.setEditable(false);

        jLabel1.setText("Data OS");

        jLabel2.setText("ID OS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordens de Serviço"));

        jTableOrdemDeServico.setModel(modeloOrdens);
        jTableOrdemDeServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOrdemDeServicoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableOrdemDeServico);

        jLabel11.setText("ID OS");

        jTextFieldPesquisaIdOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaIdOSKeyPressed(evt);
            }
        });

        jLabelPesquisarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Look-icon.png"))); // NOI18N
        jLabelPesquisarOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPesquisarOSMouseClicked(evt);
            }
        });

        jLabelAtualizarTabelaDeOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh.png"))); // NOI18N
        jLabelAtualizarTabelaDeOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAtualizarTabelaDeOSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPesquisaIdOS, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPesquisarOS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 675, Short.MAX_VALUE)
                        .addComponent(jLabelAtualizarTabelaDeOS)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldPesquisaIdOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(jLabelPesquisarOS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jLabelAtualizarTabelaDeOS)
                        .addGap(11, 11, 11)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldIdOS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButtonAdicionarOS)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonEditarOS)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonExcluirOS))
                                    .addComponent(jTextFieldDefeito, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEquip, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldServico, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDefeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAdicionarOS)
                            .addComponent(jButtonEditarOS)
                            .addComponent(jButtonExcluirOS)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarOSActionPerformed
        alterarOS();
    }//GEN-LAST:event_jButtonEditarOSActionPerformed

    public void setIdOS(String idOS) {
        jTextFieldIdOS.setText(idOS);
    }

    private void jButtonAdicionarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarOSActionPerformed
        try {
            adicionarOS();
        } catch (SQLException ex) {
            Logger.getLogger(TelaOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAdicionarOSActionPerformed

    private void jTableClienteOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteOSMouseClicked
        //Pegando id do cliente apos selecionar o cliente na tabela
        int linha = jTableClienteOS.getSelectedRow();
        String idCliente = jTableClienteOS.getValueAt(linha, 0).toString();
        jTextFieldIdCliente.setText(idCliente);
    }//GEN-LAST:event_jTableClienteOSMouseClicked

    private void jButtonExcluirOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirOSActionPerformed
        excluirOS();
    }//GEN-LAST:event_jButtonExcluirOSActionPerformed

    private void jLabelBtnBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnBuscarClienteMouseClicked
        excluirLinhasDaTabelaCliente();
        
        String pesquisarNomeCliente = jTextFieldBuscaCliente.getText();
        
        List<Cliente> clientes = clienteDAO.pesquisarClientePorNome(pesquisarNomeCliente);
        
        for (Cliente cliente : clientes) {
            modelo.addRow(new Object[]{cliente.getIdCliente(), cliente.getNomeCliente()});
        }
    }//GEN-LAST:event_jLabelBtnBuscarClienteMouseClicked

    private void jTableOrdemDeServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOrdemDeServicoMouseClicked
        //Pegando dados de Ordem de Servico apos selecionar na tabela
        int linha = jTableOrdemDeServico.getSelectedRow();
        jTextFieldIdOS.setText(jTableOrdemDeServico.getValueAt(linha, 0).toString());
        jTextFieldData.setText(jTableOrdemDeServico.getValueAt(linha, 1).toString());
        jTextFieldEquip.setText(jTableOrdemDeServico.getValueAt(linha, 2).toString());
        jTextFieldDefeito.setText(jTableOrdemDeServico.getValueAt(linha, 3).toString());
        jTextFieldServico.setText(jTableOrdemDeServico.getValueAt(linha, 4).toString());
        jTextFieldValor.setText(jTableOrdemDeServico.getValueAt(linha, 5).toString());
    }//GEN-LAST:event_jTableOrdemDeServicoMouseClicked

    private void jLabelPesquisarOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarOSMouseClicked
        buscarOS();
    }//GEN-LAST:event_jLabelPesquisarOSMouseClicked

    private void jLabelAtualizarTabelaDeClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtualizarTabelaDeClientesMouseClicked
        carregarTabelaCliente();
    }//GEN-LAST:event_jLabelAtualizarTabelaDeClientesMouseClicked

    private void jLabelAtualizarTabelaDeOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtualizarTabelaDeOSMouseClicked
        carregarTabelaOS();
    }//GEN-LAST:event_jLabelAtualizarTabelaDeOSMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        //Limpando Selecao da tabela e limpando os jTextField
        limparTextField();
        jTableClienteOS.clearSelection();
        jTableOrdemDeServico.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void jTextFieldPesquisaIdOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaIdOSKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarOS();
        }
    }//GEN-LAST:event_jTextFieldPesquisaIdOSKeyPressed
    public void excluirLinhasDaTabelaOS() {
        //Excluir linhas antigas da tabela de ordem de servico
        while (modeloOrdens.getRowCount() > 0) {
            for (int i = 0; i < modeloOrdens.getRowCount(); i++) {
                modeloOrdens.removeRow(i);
            }
        }
    }

    public void excluirLinhasDaTabelaCliente() {
        //Excluir linhas antigas da tabela de clientes
        while (modelo.getRowCount() > 0) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                modelo.removeRow(i);
            }
        }
    }

    public void buscarOS() {
        //excluindo linhas antigas da tabela de ordem de servico
        excluirLinhasDaTabelaOS();

        //Pegando ID da ordem de servico na jTextFieldPesquisaIdOS
        int idOrdemDeServico = Integer.parseInt(jTextFieldPesquisaIdOS.getText());

        List<OrdemDeServico> ordens = osDAO.listaOSPorID(idOrdemDeServico);

        //Preenchendo tabela com os dados retornados na pesquisa
        for (OrdemDeServico os : ordens) {
            String formataData = new SimpleDateFormat("dd/MM/yyyy").format(os.getDataOS().getTime());
            modeloOrdens.addRow(new Object[]{os.getIdOS(), formataData, clienteDAO.buscarNomeClientePorId(os.getIdClienteOS()), os.getEquipamento(), os.getDefeito(), os.getServico(), os.getValor()});
        }
    }

    public void criandoColunasNasTabelas() {
        //Colunas da tabela de Ordem de Servico
        modeloOrdens.addColumn("ID");
        modeloOrdens.addColumn("Data");
        modeloOrdens.addColumn("Cliente");
        modeloOrdens.addColumn("Equipamento");
        modeloOrdens.addColumn("Defeito");
        modeloOrdens.addColumn("Serviço");
        modeloOrdens.addColumn("Valor Total");
        
        //Colunas da tabela de Cliente
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
    }

    public void adicionarOS() throws SQLException {
        if (jTextFieldIdCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldDefeito.getText().equals("") || jTextFieldEquip.getText().equals("") || jTextFieldServico.getText().equals("") || jTextFieldValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            OrdemDeServico os = new OrdemDeServico();
            try {
                Calendar data = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                jTextFieldData.setText(sdf.format(new Date(System.currentTimeMillis())));

                String defeito = jTextFieldDefeito.getText();
                String equipamento = jTextFieldEquip.getText();
                String servico = jTextFieldServico.getText();
                double valor = Double.parseDouble(jTextFieldValor.getText());
                int idClienteOS = Integer.parseInt(jTextFieldIdCliente.getText());

                os.setDataOS(data);

                os.setDefeito(defeito);
                os.setEquipamento(equipamento);
                os.setIdClienteOS(idClienteOS);
                os.setServico(servico);
                os.setValor(valor);

                osDAO.adicionarOS(os);
                carregarTabelaOS();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido\n Exemplo correto: 99.99", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                jTextFieldValor.setText("");
                jTextFieldValor.requestFocus();
            }
        }
    }

    public void alterarOS() {
        if (jTextFieldIdOS.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma Ordem de Servico", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldDefeito.getText().equals("") || jTextFieldEquip.getText().equals("") || jTextFieldServico.getText().equals("") || jTextFieldValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            OrdemDeServico os = new OrdemDeServico();
            int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esta Ordem de Serviço?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                try {
                    Calendar data = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    jTextFieldData.setText(sdf.format(new Date(System.currentTimeMillis())));

                    int idOS = Integer.parseInt(jTextFieldIdOS.getText());
                    String defeito = jTextFieldDefeito.getText();
                    String equipamento = jTextFieldEquip.getText();
                    String servico = jTextFieldServico.getText();
                    double valor = Double.parseDouble(jTextFieldValor.getText());
                    //  int idClienteOS = Integer.parseInt(jTextFieldIdCliente.getText());

                    os.setIdOS(idOS);
                    os.setDataOS(data);
                    os.setDefeito(defeito);
                    os.setEquipamento(equipamento);
                    // os.setIdClienteOS(idClienteOS);
                    os.setServico(servico);
                    os.setValor(valor);

                    osDAO.alterarOS(os);
                    carregarTabelaOS();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor inválido\n Exemplo correto: 99.99", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    jTextFieldValor.setText("");
                    jTextFieldValor.requestFocus();
                }
            }
        }
    }

    public void excluirOS() {
        OrdemDeServico os = new OrdemDeServico();
        if (jTextFieldIdOS.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma Ordem de Servico", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esta Ordem de Serviço?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                int idOS = Integer.parseInt(jTextFieldIdOS.getText());

                os.setIdOS(idOS);

                osDAO.excluirOS(os);
                carregarTabelaOS();
                limparTextField();
            }
        }
    }

    public void carregarTabelaOS() {
        //Excluindo linhas antigas da tabela de Ordem de Servico
        excluirLinhasDaTabelaOS();
        
        List<OrdemDeServico> ordens = osDAO.listaOS();
        
        //Preenchendo a tabela com os novos dados
        for (OrdemDeServico os : ordens) {
            String formataData = new SimpleDateFormat("dd/MM/yyyy").format(os.getDataOS().getTime());
            modeloOrdens.addRow(new Object[]{os.getIdOS(), formataData, clienteDAO.buscarNomeClientePorId(os.getIdClienteOS()), os.getEquipamento(), os.getDefeito(), os.getServico(), os.getValor()});
        }
    }

    public void carregarTabelaCliente() {
        //Excluindo linhas antigas da tabela de Clientes
        excluirLinhasDaTabelaCliente();
        
        List<Cliente> clientes = clienteDAO.listaClientes();
        
        //Preenchendo a tabela com os novos dados
        for (Cliente cliente : clientes) {
            modelo.addRow(new Object[]{cliente.getIdCliente(), cliente.getNomeCliente()});
        }
    }

    public void carregarTabelas() {
        //Carregando as duas tabelas (Cliente e Ordem de Servico)
        carregarTabelaCliente();
        carregarTabelaOS();
    }

    public void limparTextField() {
        jTextFieldIdOS.setText("");
        jTextFieldData.setText("");
        jTextFieldDefeito.setText("");
        jTextFieldEquip.setText("");
        jTextFieldServico.setText("");
        jTextFieldValor.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAdicionarOS;
    private javax.swing.JButton jButtonEditarOS;
    private javax.swing.JButton jButtonExcluirOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAtualizarTabelaDeClientes;
    private javax.swing.JLabel jLabelAtualizarTabelaDeOS;
    private javax.swing.JLabel jLabelBtnBuscarCliente;
    private javax.swing.JLabel jLabelPesquisarOS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClienteOS;
    private javax.swing.JTable jTableOrdemDeServico;
    private javax.swing.JTextField jTextFieldBuscaCliente;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldDefeito;
    private javax.swing.JTextField jTextFieldEquip;
    private javax.swing.JTextField jTextFieldIdCliente;
    private javax.swing.JTextField jTextFieldIdOS;
    private javax.swing.JTextField jTextFieldPesquisaIdOS;
    private javax.swing.JTextField jTextFieldServico;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
