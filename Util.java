package tools;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class Util {

    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (JComponent componente : componentes) {
            componente.setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent ... componentes) {
        for (JComponent componente : componentes) {
            if (componente instanceof JTextField jTextField) {
                jTextField.setText("");
            } else if (componente instanceof JPasswordField jPasswordField) {
                jPasswordField.setText("");
            } else if (componente instanceof JFormattedTextField jFormattedTextField) {
                jFormattedTextField.setText("");
            } else if (componente instanceof JTextArea jTextArea) {
                jTextArea.setText("");
            } else if (componente instanceof JComboBox jComboBox) {
                jComboBox.setSelectedIndex(-1);
            }
        }
    }



    public static void desabilitar(boolean b, JButton jBtnEg_Incluir, JButton jBtnEg_Pesquisar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void desabilitar(boolean b, JButton jBtnEg_Alterar, JButton jBtnEg_Excluir, JButton jBtnEg_Confirmar, JButton jBtnEg_Cancelar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void desabilitar(boolean b, JTextField jTxtEg_Nome, JFormattedTextField jFmtEg_Codigo, JTextField jTxtEg_Apelido, JFormattedTextField jFmtEg_Cpf, JFormattedTextField jFmtEg_DataNascimento, JTextField jTxtEg_Email, JTextField jTxtEg_Nacionalidade, JTextField jTxtEg_Endereco, JTextField jTxtEg_Bairro, JTextField jTxtEg_Escolaridade, JFormattedTextField jFmtEg_Celular, JComboBox<String> jCboEg_EstadoCivil, JTextField jTxtEg_Profissao, JTextField jCboEg_Sexo, JFormattedTextField jFmtEg_Rg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
