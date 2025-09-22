package view;

import java.text.ParseException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import tools.Util;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDlgClientes extends javax.swing.JDialog implements ActionListener {

    boolean incluindo;
    MaskFormatter mascaraCpf, mascaraData, mascaraCelular, mascaraRg;

    public JDlgClientes(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cadastro de Clientes");
        
        // Adiciona ActionListeners aos botões
        jBtnEg_Incluir.addActionListener(this);
        jBtnEg_Alterar.addActionListener(this);
        jBtnEg_Excluir.addActionListener(this);
        jBtnEg_Confirmar.addActionListener(this);
        jBtnEg_Cancelar.addActionListener(this);
        jBtnEg_Pesquisar.addActionListener(this);

        Util.desabilitar(true, jBtnEg_Incluir, jBtnEg_Pesquisar);
        Util.desabilitar(false, jBtnEg_Alterar, jBtnEg_Excluir, jBtnEg_Confirmar, jBtnEg_Cancelar);
        Util.desabilitar(false, jTxtEg_Nome, jFmtEg_Codigo, jTxtEg_Apelido, jFmtEg_Cpf, jFmtEg_DataNascimento,
                jTxtEg_Email, jTxtEg_Nacionalidade, jTxtEg_Endereco, jTxtEg_Bairro, jTxtEg_Escolaridade,
                jFmtEg_Celular, jCboEg_EstadoCivil, jTxtEg_Profissao, jCboEg_Sexo, jFmtEg_Rg);

        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraCelular = new MaskFormatter("(##) #####-####");
            mascaraRg = new MaskFormatter("##.###.###-#");

            mascaraCpf.install(jFmtEg_Cpf);
            mascaraData.install(jFmtEg_DataNascimento);
            mascaraCelular.install(jFmtEg_Celular);
            mascaraRg.install(jFmtEg_Rg);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Este método não será mais usado, pois não há Bean
    // public void beanView(Clientes clientes) {
    //    // ...
    // }

    public void habilitarCampos(boolean enable) {
        Util.habilitar(enable, jTxtEg_Nome, jFmtEg_Codigo, jTxtEg_Apelido, jFmtEg_Cpf, jFmtEg_DataNascimento,
                jTxtEg_Email, jTxtEg_Nacionalidade, jTxtEg_Endereco, jTxtEg_Bairro, jTxtEg_Escolaridade,
                jFmtEg_Celular, jCboEg_EstadoCivil, jTxtEg_Profissao, jCboEg_Sexo, jFmtEg_Rg);
    }

    public void limparCampos() {
        Util.limparCampos(jFmtEg_Codigo, jTxtEg_Nome, jTxtEg_Apelido, jFmtEg_Cpf, jFmtEg_Rg,
                jTxtEg_Nacionalidade, jFmtEg_DataNascimento, jTxtEg_Endereco, jTxtEg_Bairro,
                jTxtEg_Profissao, jTxtEg_Escolaridade, jTxtEg_Email, jFmtEg_Celular, jCboEg_Sexo);
        jCboEg_EstadoCivil.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtEg_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFmtEg_Codigo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFmtEg_Cpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFmtEg_DataNascimento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtEg_Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFmtEg_Rg = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtEg_Endereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtEg_Escolaridade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtEg_Apelido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtEg_Nacionalidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jFmtEg_Celular = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jCboEg_EstadoCivil = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jTxtEg_Bairro = new javax.swing.JTextField();
        jBtnEg_Incluir = new javax.swing.JButton();
        jBtnEg_Alterar = new javax.swing.JButton();
        jBtnEg_Excluir = new javax.swing.JButton();
        jBtnEg_Confirmar = new javax.swing.JButton();
        jBtnEg_Cancelar = new javax.swing.JButton();
        jBtnEg_Pesquisar = new javax.swing.JButton();
        jTxtEg_Profissao = new javax.swing.JTextField();
        jCboEg_Sexo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Código");

        jLabel3.setText("Cpf");

        jLabel4.setText("Data de Nascimento");

        jLabel5.setText("E-mail");

        jLabel6.setText("Sexo");

        jLabel7.setText("Rg");

        jLabel8.setText("Endereço");

        jLabel9.setText("Escolaridade");

        jLabel10.setText("Apelido");

        jLabel11.setText("Nacionalidade");

        jLabel12.setText("Celular");

        jLabel13.setText("Profissão");

        jLabel14.setText("Estado Civil");

        jCboEg_EstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)", "União estável" }));

        jLabel15.setText("Bairro");

        // Placeholder para imagens
        jBtnEg_Incluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); 
        jBtnEg_Incluir.setText("Incluir");

        jBtnEg_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); 
        jBtnEg_Alterar.setText("Alterar");

        jBtnEg_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); 
        jBtnEg_Excluir.setText("Excluir");

        jBtnEg_Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); 
        jBtnEg_Confirmar.setText("Confirmar");

        jBtnEg_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); 
        jBtnEg_Cancelar.setText("Cancelar");

        jBtnEg_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); 
        jBtnEg_Pesquisar.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBtnEg_Incluir)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnEg_Alterar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnEg_Excluir))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jFmtEg_DataNascimento)
                                    .addComponent(jTxtEg_Email)
                                    .addComponent(jTxtEg_Endereco)
                                    .addComponent(jTxtEg_Escolaridade)
                                    .addComponent(jFmtEg_Celular)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEg_Apelido, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnEg_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEg_Profissao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtEg_Bairro, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtEg_Nacionalidade)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnEg_Confirmar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jBtnEg_Cancelar)
                                                .addGap(13, 13, 13))
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel15)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jCboEg_EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtEg_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jFmtEg_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jFmtEg_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jFmtEg_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jCboEg_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtEg_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTxtEg_Apelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtEg_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtEg_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtEg_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEg_Nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtEg_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEg_Profissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEg_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEg_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEg_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboEg_EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEg_Escolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFmtEg_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCboEg_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEg_Incluir)
                    .addComponent(jBtnEg_Alterar)
                    .addComponent(jBtnEg_Excluir)
                    .addComponent(jBtnEg_Confirmar)
                    .addComponent(jBtnEg_Cancelar)
                    .addComponent(jBtnEg_Pesquisar))
                .addContainerGap())
        );

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jBtnEg_Incluir) {
            incluindo = true;
            habilitarCampos(true);
            limparCampos();
            Util.desabilitar(false, jBtnEg_Incluir, jBtnEg_Alterar, jBtnEg_Excluir, jBtnEg_Pesquisar);
            Util.desabilitar(true, jBtnEg_Confirmar, jBtnEg_Cancelar);
        } else if (e.getSource() == jBtnEg_Alterar) {
            incluindo = false;
            habilitarCampos(true);
            Util.desabilitar(false, jBtnEg_Incluir, jBtnEg_Alterar, jBtnEg_Excluir, jBtnEg_Pesquisar);
            Util.desabilitar(true, jBtnEg_Confirmar, jBtnEg_Cancelar);
        } else if (e.getSource() == jBtnEg_Excluir) {
            int resp = JOptionPane.showConfirmDialog(this, "Deseja excluir o registro?", "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Registro excluído (simulado).");
                limparCampos();
                habilitarCampos(false);
                Util.desabilitar(true, jBtnEg_Incluir, jBtnEg_Pesquisar);
                Util.desabilitar(false, jBtnEg_Alterar, jBtnEg_Excluir, jBtnEg_Confirmar, jBtnEg_Cancelar);
            }
        } else if (e.getSource() == jBtnEg_Confirmar) {
            if (incluindo) {
                JOptionPane.showMessageDialog(this, "Registro incluído (simulado).");
            } else {
                JOptionPane.showMessageDialog(this, "Registro alterado (simulado).");
            }
            limparCampos();
            habilitarCampos(false);
            Util.desabilitar(true, jBtnEg_Incluir, jBtnEg_Pesquisar);
            Util.desabilitar(false, jBtnEg_Alterar, jBtnEg_Excluir, jBtnEg_Confirmar, jBtnEg_Cancelar);
        } else if (e.getSource() == jBtnEg_Cancelar) {
            limparCampos();
            habilitarCampos(false);
            Util.desabilitar(true, jBtnEg_Incluir, jBtnEg_Pesquisar);
            Util.desabilitar(false, jBtnEg_Alterar, jBtnEg_Excluir, jBtnEg_Confirmar, jBtnEg_Cancelar);
        } else if (e.getSource() == jBtnEg_Pesquisar) {
            JDlgClientesPesquisar jDlgClientesPesquisar = new JDlgClientesPesquisar(null, true);
            jDlgClientesPesquisar.setVisible(true);
            // Após fechar a tela de pesquisa, habilitar Alterar e Excluir (simulado)
            Util.desabilitar(true, jBtnEg_Alterar, jBtnEg_Excluir);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jBtnEg_Alterar;
    private javax.swing.JButton jBtnEg_Cancelar;
    private javax.swing.JButton jBtnEg_Confirmar;
    private javax.swing.JButton jBtnEg_Excluir;
    private javax.swing.JButton jBtnEg_Incluir;
    private javax.swing.JButton jBtnEg_Pesquisar;
    private javax.swing.JComboBox<String> jCboEg_EstadoCivil;
    private javax.swing.JTextField jCboEg_Sexo;
    private javax.swing.JFormattedTextField jFmtEg_Celular;
    private javax.swing.JFormattedTextField jFmtEg_Codigo;
    private javax.swing.JFormattedTextField jFmtEg_Cpf;
    private javax.swing.JFormattedTextField jFmtEg_DataNascimento;
    private javax.swing.JFormattedTextField jFmtEg_Rg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtEg_Apelido;
    private javax.swing.JTextField jTxtEg_Bairro;
    private javax.swing.JTextField jTxtEg_Email;
    private javax.swing.JTextField jTxtEg_Endereco;
    private javax.swing.JTextField jTxtEg_Escolaridade;
    private javax.swing.JTextField jTxtEg_Nacionalidade;
    private javax.swing.JTextField jTxtEg_Nome;
    private javax.swing.JTextField jTxtEg_Profissao;
    // End of variables declaration
}

