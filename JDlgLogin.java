package view;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDlgLogin extends JDialog {
    private int attemptCount = 0;
    private static final int MAX_ATTEMPTS = 3;

    public JDlgLogin(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jfmtEg_Usuarios = new javax.swing.JTextField();
        jPwdEg_Senha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jBtnEg_Entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Usuário");

        jPwdEg_Senha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jPwdEg_SenhaActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha");

        jBtnEg_Entrar.setText("Entrar");
        jBtnEg_Entrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnEg_EntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPwdEg_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfmtEg_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jBtnEg_Entrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfmtEg_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPwdEg_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnEg_Entrar)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }

    private void jBtnEg_EntrarActionPerformed(ActionEvent evt) {
        String usuario = jfmtEg_Usuarios.getText();
        String senha = new String(jPwdEg_Senha.getPassword());

        if (usuario.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!");
            return;
        }

        // Simulação de login, sem DAO/Bean
        if (usuario.equals("admin") && senha.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
            dispose(); // Fecha a tela de login
        } else {
            attemptCount++;
            if (attemptCount >= MAX_ATTEMPTS) {
                JOptionPane.showMessageDialog(this, 
                    "Número máximo de tentativas excedido. O sistema será fechado.");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Usuário ou senha incorretos! Tentativa " + 
                    attemptCount + " de " + MAX_ATTEMPTS);
            }
        }
    }

    private void jPwdEg_SenhaActionPerformed(ActionEvent evt) {
        // Ação para o campo de senha, se necessário
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jBtnEg_Entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPwdEg_Senha;
    private javax.swing.JTextField jfmtEg_Usuarios;
    // End of variables declaration
}

