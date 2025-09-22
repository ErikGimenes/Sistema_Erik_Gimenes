package view;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDlgUsuarios extends javax.swing.JDialog implements ActionListener {

    boolean incluindo;
    MaskFormatter mascaraCpf, mascaraData;

    public JDlgUsuarios(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cadastro de Usuário");

        // Adiciona ActionListeners aos botões
        jBtnEg_Incluir.addActionListener(this);
        jBtnEg_Alterar.addActionListener(this);
        jBtnEg_Excluir.addActionListener(this);
        jBtnEg_Confirmar.addActionListener(this);
        jBtnEg_Cancelar.addActionListener(this);
        jBtnEg_Pesquisar.addActionListener(this);

        Util.desabilitar(true, jBtnEg_Incluir, jBtnEg_Pesquisar);
        Util.desabilitar(false, jBtnEg_Alterar, jBtnEg_Excluir, jBtnEg_Confirmar, jBtnEg_Cancelar);
        Util.desabilitar(false, jTxtEg_Nome, jFmtEg_DataNascimento, jTxtEg_Codigo, jTxtEg_Apelido,
                jFmtg_Cpf, jCboEg_Nivel, jCboEg_Ativo, jPwfEg_Senha);

        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraData = new MaskFormatter("##/##/####");
            jFmtg_Cpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
            jFmtEg_DataNascimento.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void habilitarCampos(boolean enable) {
        Util.habilitar(enable, jTxtEg_Nome, jFmtEg_DataNascimento, jTxtEg_Codigo, jTxtEg_Apelido,
                jFmtg_Cpf, jCboEg_Nivel, jCboEg_Ativo, jPwfEg_Senha);
    }

    public void limparCampos() {
        Util.limparCampos(jTxtEg_Codigo, jTxtEg_Nome, jTxtEg_Apelido, jFmtg_Cpf,
                jFmtEg_DataNascimento, jPwfEg_Senha);
        jCboEg_Nivel.setSelectedIndex(-1);
        jCboEg_Ativo.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtEg_Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtEg_Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtEg_Apelido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFmtEg_DataNascimento = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jPwfEg_Senha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jBtnEg_Incluir = new javax.swing.JButton();
        jCboEg_Nivel = new javax.swing.JComboBox<>();
        jBtnEg_Alterar = new javax.swing.JButton();
        jBtnEg_Excluir = new javax.swing.JButton();
        jBtnEg_Confirmar = new javax.swing.JButton();
        jBtnEg_Cancelar = new javax.swing.JButton();
        jBtnEg_Pesquisar = new javax.swing.JButton();
        jCboEg_Ativo = new javax.swing.JCheckBox();
        jFmtg_Cpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("Apelido");

        jLabel4.setText("Cpf");

        jLabel5.setText("Data de Nascimento");

        jLabel6.setText("Senha");

        jLabel7.setText("Nível");

        // Placeholder para imagens
        jBtnEg_Incluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); 
        jBtnEg_Incluir.setText("Incluir");

        jCboEg_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));

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

        jCboEg_Ativo.setText("Ativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtEg_Apelido)
                    .addComponent(jTxtEg_Nome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jFmtEg_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCboEg_Ativo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jCboEg_Nivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addComponent(jTxtEg_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(269, 269, 269))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnEg_Incluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEg_Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jBtnEg_Excluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEg_Confirmar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEg_Cancelar)
                        .addGap(37, 37, 37)
                        .addComponent(jBtnEg_Pesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jPwfEg_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFmtg_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEg_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEg_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEg_Apelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFmtg_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtEg_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboEg_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPwfEg_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboEg_Ativo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEg_Incluir)
                    .addComponent(jBtnEg_Excluir)
                    .addComponent(jBtnEg_Confirmar)
                    .addComponent(jBtnEg_Cancelar)
                    .addComponent(jBtnEg_Pesquisar)
                    .addComponent(jBtnEg_Alterar))
                .addContainerGap(16, Short.MAX_VALUE))
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
            JDlgUsuariosPesquisar jDlgUsuariosPesquisar = new JDlgUsuariosPesquisar(null, true);
            jDlgUsuariosPesquisar.setVisible(true);
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
    private javax.swing.JCheckBox jCboEg_Ativo;
    private javax.swing.JComboBox<String> jCboEg_Nivel;
    private javax.swing.JFormattedTextField jFmtEg_DataNascimento;
    private javax.swing.JFormattedTextField jFmtg_Cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPwfEg_Senha;
    private javax.swing.JTextField jTxtEg_Apelido;
    private javax.swing.JTextField jTxtEg_Codigo;
    private javax.swing.JTextField jTxtEg_Nome;
    // End of variables declaration
}

