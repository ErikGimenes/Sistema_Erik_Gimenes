package view;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import tools.Util;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class JDlgVendedor extends javax.swing.JDialog implements ActionListener {

    boolean incluindo;
    MaskFormatter mascaraData, mascaraCpf, mascaraRg, mascaraTelefone;

    public JDlgVendedor(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cadastro de Vendedor");

        // Adiciona ActionListeners aos botões
        jBtnEg_Incluir.addActionListener(this);
        jBtnEg_Alterar.addActionListener(this);
        jBtnEg_Excluir.addActionListener(this);
        jBtnEg_Confirmar.addActionListener(this);
        jBtnEg_Cancelar.addActionListener(this);
        jBtnEg_Pesquisar.addActionListener(this);

        Util.desabilitar(true, jBtnEg_Incluir, jBtnEg_Pesquisar);
        Util.desabilitar(false, jBtnEg_Alterar, jBtnEg_Excluir, jBtnEg_Confirmar, jBtnEg_Cancelar);
        Util.desabilitar(false, jTxtEg_NomeVendedor, jFmtEg_Cpf, jFmtEg_DataNasc, jTxtEg_Apelido,
                jTxtEg_Endereco, jFmtEg_Bairro, jTxtEg_Escolaridade, jCboEg_EstadoCivil, jCboEg_Sexo,
                jFmtEg_Rg, jTxtEg_Codigo, jFmtEg_Telefone, jTxtEg_Email, jTxtEg_Nacionalidade);

        try {
            mascaraData = new MaskFormatter("##/##/####");
            mascaraData.install(jFmtEg_DataNasc);

            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraCpf.install(jFmtEg_Cpf);

            mascaraRg = new MaskFormatter("##.###.###-#");
            mascaraRg.install(jFmtEg_Rg);

            mascaraTelefone = new MaskFormatter("(##) #####-####");
            mascaraTelefone.install(jFmtEg_Telefone);

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao configurar máscaras dos campos",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void habilitarCampos(boolean enable) {
        Util.habilitar(enable, jTxtEg_NomeVendedor, jFmtEg_Cpf, jFmtEg_DataNasc, jTxtEg_Apelido,
                jTxtEg_Endereco, jFmtEg_Bairro, jTxtEg_Escolaridade, jCboEg_EstadoCivil, jCboEg_Sexo,
                jFmtEg_Rg, jTxtEg_Codigo, jFmtEg_Telefone, jTxtEg_Email, jTxtEg_Nacionalidade);
    }

    public void limparCampos() {
        Util.limparCampos(jTxtEg_NomeVendedor, jFmtEg_Cpf, jFmtEg_DataNasc, jTxtEg_Apelido,
                jTxtEg_Endereco, jFmtEg_Bairro, jTxtEg_Escolaridade, jFmtEg_Rg, jTxtEg_Codigo,
                jFmtEg_Telefone, jTxtEg_Email, jTxtEg_Nacionalidade);
        jCboEg_EstadoCivil.setSelectedIndex(-1);
        jCboEg_Sexo.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jFmtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jFmtEg_DataNasc = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtEg_NomeVendedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtEg_Codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtEg_Email = new javax.swing.JTextField();
        jFmtEg_Cpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFmtEg_Rg = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFmtEg_Telefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtEg_Escolaridade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtEg_Endereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtEg_Nacionalidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTxtEg_Apelido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jCboEg_Sexo = new javax.swing.JComboBox<>();
        jBtnEg_Incluir = new javax.swing.JButton();
        jBtnEg_Alterar = new javax.swing.JButton();
        jBtnEg_Excluir = new javax.swing.JButton();
        jBtnEg_Confirmar = new javax.swing.JButton();
        jBtnEg_Cancelar = new javax.swing.JButton();
        jBtnEg_Pesquisar = new javax.swing.JButton();
        jCboEg_EstadoCivil = new javax.swing.JComboBox<>();
        jFmtEg_Bairro = new javax.swing.JFormattedTextField();

        jLabel15.setText("Data de Nascimento");

{
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
            JDlgVendedorPesquisar jDlgVendedorPesquisar = new JDlgVendedorPesquisar(null, true);
            jDlgVendedorPesquisar.setVisible(true);
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
    private javax.swing.JComboBox<String> jCboEg_Sexo;
    private javax.swing.JFormattedTextField jFmtDataNascimento;
    private javax.swing.JFormattedTextField jFmtEg_Bairro;
    private javax.swing.JFormattedTextField jFmtEg_Cpf;
    private javax.swing.JFormattedTextField jFmtEg_DataNasc;
    private javax.swing.JFormattedTextField jFmtEg_Rg;
    private javax.swing.JFormattedTextField jFmtEg_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTxtEg_Codigo;
    private javax.swing.JTextField jTxtEg_Email;
    private javax.swing.JTextField jTxtEg_Endereco;
    private javax.swing.JTextField jTxtEg_Escolaridade;
    private javax.swing.JTextField jTxtEg_Nacionalidade;
    private javax.swing.JTextField jTxtEg_NomeVendedor;
    // End of variables declaration

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class e {

        private static JButton getSource() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public e() {
        }
    }
}

