package view;

import model.Consulta;
import model.ListaConsulta;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class TelaCadastroConsulta extends javax.swing.JFrame {

    TelaInicial telaInicial = new TelaInicial();
    // ConsultaController consultaController = new ConsultaController();
    
    public TelaCadastroConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        lblNomePaciente = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblDataConsulta = new javax.swing.JLabel();
        chcEraPaciente = new javax.swing.JCheckBox();
        txtCpf = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        txtDataConsulta = new javax.swing.JTextField();
        lblMsgNome = new javax.swing.JLabel();
        lblMsgCpf = new javax.swing.JLabel();
        lblMsgTelefone = new javax.swing.JLabel();
        lblMsgData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Cadastrar Consulta");

        txtNomePaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtNomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePacienteActionPerformed(evt);
            }
        });
        txtNomePaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomePacienteKeyReleased(evt);
            }
        });

        lblNomePaciente.setForeground(new java.awt.Color(0, 0, 0));
        lblNomePaciente.setText("Nome do(a) paciente:");

        lblTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefone.setText("Telefone:");

        lblCpf.setForeground(new java.awt.Color(0, 0, 0));
        lblCpf.setText("CPF:");

        lblDataConsulta.setForeground(new java.awt.Color(0, 0, 0));
        lblDataConsulta.setText("Data da consulta:");

        chcEraPaciente.setForeground(new java.awt.Color(0, 0, 0));
        chcEraPaciente.setText("Já era paciente?");

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyReleased(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(51, 255, 0));
        btnCadastrar.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblMsg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(51, 255, 0));

        txtDataConsulta.setBackground(new java.awt.Color(255, 255, 255));
        txtDataConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataConsultaKeyReleased(evt);
            }
        });

        lblMsgNome.setForeground(new java.awt.Color(255, 0, 0));

        lblMsgCpf.setForeground(new java.awt.Color(255, 0, 0));

        lblMsgTelefone.setForeground(new java.awt.Color(255, 0, 0));

        lblMsgData.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(chcEraPaciente))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblTitulo))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomePaciente)
                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMsgNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomePaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblDataConsulta))
                        .addGap(78, 78, 78)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMsgCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMsgTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMsgData, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(42, 42, 42)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNomePaciente))
                    .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblMsgNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCpf))
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblMsgCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTelefone))
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMsgTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblMsgData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblDataConsulta)))
                .addGap(11, 11, 11)
                .addComponent(chcEraPaciente)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 447, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(461, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        boolean sucesso;
        if(!validarCampos()) {
            try {
                sucesso = formatoCampos();
                if(sucesso == true) {
                    adicionarConsulta(getConsulta());
                    telaInicial.setVisible(true);
                    this.dispose();
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "ATENÇÃO! Você inseriu a data de forma incorreta.");
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void txtNomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePacienteActionPerformed

    private void txtNomePacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomePacienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePacienteKeyReleased

    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased
        this.lblMsgCpf.setText("");
    }//GEN-LAST:event_txtCpfKeyReleased

    private void txtTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyReleased
        this.lblMsgTelefone.setText("");
    }//GEN-LAST:event_txtTelefoneKeyReleased

    private void txtDataConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataConsultaKeyReleased
        this.lblMsgData.setText("");
    }//GEN-LAST:event_txtDataConsultaKeyReleased

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
            java.util.logging.Logger.getLogger(TelaCadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JCheckBox chcEraPaciente;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataConsulta;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblMsgCpf;
    private javax.swing.JLabel lblMsgData;
    private javax.swing.JLabel lblMsgNome;
    private javax.swing.JLabel lblMsgTelefone;
    private javax.swing.JLabel lblNomePaciente;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataConsulta;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    // Validação de campos
    public boolean validarCampos() {
        boolean sucesso = true;
        
        if(this.txtNomePaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO! Nome não pode estar vazio.");
        } else if(this.txtCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO! CPF não pode estar vazio.");
        } else if(this.txtTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO! Telefone não pode estar vazio.");
        } else if(this.txtDataConsulta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO! Data não pode estar vazio.");
        } else {
            sucesso = false;
        }
        return sucesso;
    }
    
    // Retorna um objeto Consulta com todos os seus atributos preenchidos a partir das imformações dos campos da tela  
    public Consulta getConsulta() throws ParseException {
        Consulta consulta = new Consulta();
        
        consulta.setNome(this.txtNomePaciente.getText());
        consulta.setCpf(this.txtCpf.getText());
        consulta.setTelefone(this.txtTelefone.getText());
        String dataConsulta = this.txtDataConsulta.getText();
        
        // Formatando Data da Cosulta
        try {
            DateTimeFormatter entrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(dataConsulta, entrada);

            String dataFormatada = date.format(entrada);

            consulta.setData(dataFormatada);
        } catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "ATENÇÃO! Não pode ser adicionado uma data '00/00/0000'.");
        }
        
        // Verificando se já era ou não um paciente
        if(this.chcEraPaciente.isSelected()) {
            consulta.setPaciente("Sim");
        } else {
            consulta.setPaciente("Não");
        }
        
        // Inicialmete o valor será 'Não', por que é uma nova consulta
        consulta.setFinalizada("Não");
        
        return consulta;
    }
    
    // Aqui inseri um Aluno recebido por parâmetro e adiciona na List<Aluno> toda vez que se clicar em salvar
    public void adicionarConsulta(Consulta consulta) {
        ListaConsulta listaConsulta = new ListaConsulta();
        listaConsulta.inserirConsulta(consulta);
        
        // Chamando o método atualizar table
        telaInicial.atualizarTabela();
    }
    
    // Formatando os campos preenchidos
    public boolean formatoCampos() {
        boolean sucesso = false;
        
        // Campos CPF
        String cpf = this.txtCpf.getText();
        boolean formatCPF = cpf.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
        
        //Campo Telefone
        String telefone = this.txtTelefone.getText();
        boolean formatTelefone = telefone.matches("[(][0-9]{2}[)][ ][0-9]{4}[-][0-9]{4}");
        
        // Campo Data 
        String data = this.txtDataConsulta.getText();
        boolean formatData = data.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
        
        if(formatCPF == false) {
            this.lblMsgCpf.setText("ATENÇÃO! Preencha: 000.000.000-00");
        } else if(formatTelefone == false) {
            this.lblMsgTelefone.setText("ATENÇÃO! Preencha: (DD) 0000-0000");
        } else if(formatData == false) {
            this.lblMsgData.setText("ATENÇÃO! Preencha: dd/MM/yyyy");
        } else {
            sucesso = true;
        }
        return sucesso;
    } 
}
