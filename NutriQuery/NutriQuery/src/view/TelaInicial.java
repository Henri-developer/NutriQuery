package view;

import model.Consulta;
import model.ListaConsulta;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaInicial extends javax.swing.JFrame {

    private final String[] tableColumns = {"Nome", "CPF", "Telefone", "Data", "Já era paciente?", "Consulta realizada"};
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
    
    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        btnFinalizarConsulta = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnExcluirConsulta = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        tblDados.setBackground(new java.awt.Color(255, 255, 255));
        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "Data", "Já era paciente?", "Consulta realizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDados);

        btnFinalizarConsulta.setBackground(new java.awt.Color(204, 204, 204));
        btnFinalizarConsulta.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        btnFinalizarConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnFinalizarConsulta.setText("Finalizar Consulta");
        btnFinalizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarConsultaActionPerformed(evt);
            }
        });

        btnConsulta.setBackground(new java.awt.Color(204, 204, 204));
        btnConsulta.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        btnConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnConsulta.setText("Nova Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnExcluirConsulta.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluirConsulta.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        btnExcluirConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluirConsulta.setText("Excluir Consulta");
        btnExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirConsultaActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Boas vindas ao sistema de agendamentos");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinalizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblTitulo)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        TelaCadastroConsulta telaCadastroConsulta = new TelaCadastroConsulta();
        telaCadastroConsulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConsultaActionPerformed
        // Exclusão de consulta
        excluirConsulta(getPosConsulta());
    }//GEN-LAST:event_btnExcluirConsultaActionPerformed

    private void btnFinalizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarConsultaActionPerformed
        // Passo-01
        boolean sucesso;
        TelaFinalizar telaFinalizar = new TelaFinalizar(tblDados.getSelectedRow());
        
        ListaConsulta listaConsulta = new ListaConsulta();
        sucesso = listaConsulta.atualizarConsulta(tblDados.getSelectedRow());
        
        if(sucesso == false) {
            telaFinalizar.btnFinalizar.setEnabled(false);
        }
        
        telaFinalizar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFinalizarConsultaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnExcluirConsulta;
    private javax.swing.JButton btnFinalizarConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTable tblDados;
    // End of variables declaration//GEN-END:variables

    /*
        Método que vai atualizar a tabela toda vez que inserido, removido ou alterado dados de um aluno.
        Esse método deve ser chamado dentro do método inserirAluno, logo após o aluno ser inserido na lista
    */
    public void atualizarTabela() {
        ListaConsulta listaConsulta = new ListaConsulta();
        DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
        
        Consulta consulta;
        
        // Pega os dados cadastrados da Lista de Consulta
        List<Consulta> listaAtualizada = listaConsulta.listar();
        
        // Pegamos cada consulta que existe na lista e criamos uma linha para cada registro encontrado
        for (int i = 0; i < listaAtualizada.size(); i++) {
            consulta = listaAtualizada.get(i);
            
            // Montamos a linha
            String[] linha = {consulta.getNome(),
                              consulta.getCpf(),
                              consulta.getTelefone(),
                              consulta.getData(),
                              consulta.getPaciente(),
                              consulta.getFinalizada()
            };
            
            // Adicionamos as linhas na tabela
            tableModel.addRow(linha);
        }
        
        // Passando para tblDados as novas configurações da tabela
        this.tblDados.setModel(tableModel);
    }
    
    // Pegando a posição da table 
    private int getPosConsulta() {
        int posConsulta = tblDados.getSelectedRow();
        
        if(posConsulta == -1) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO! Selecione uma consulta!");
        }
        
        return posConsulta;
    }
    
    // Excluindo consulta
    private void excluirConsulta(int posConsulta) {
        ListaConsulta listaConsulta = new ListaConsulta();
        if(posConsulta >= 0) {
            String[] opcoes = {"Sim", "Não"};
            
            int opcao = JOptionPane.showOptionDialog(
                    rootPane, 
                    "Tem certeza que deseja exluir?", 
                    "Exclusão de consulta", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    opcoes,
                    opcoes[0]);
            
            if(opcao == 0) {
                listaConsulta.excluirConsulta(posConsulta);
                atualizarTabela();
            } else {
                tblDados.clearSelection();
            }
        }
    }
}
