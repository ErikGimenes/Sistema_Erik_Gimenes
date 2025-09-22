package view;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import tools.Util;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDlgProduto extends javax.swing.JDialog implements ActionListener {

    boolean incluindo;
    MaskFormatter mascaraQuantidade, mascaraAno;

    public JDlgProduto(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cadastro de Produtos");

        // Adiciona ActionListeners aos botões
        jBtnEg_Incluir.addActionListener(this);
        jBtnEg_Alterar.addActionListener(this);
        jBtnExcluir.addActionListener(this);
        jBtnEg_Confirmar.addActionListener(this);
        jBtnEg_Cancelar.addActionListener(this);
        jBtnEg_Pesquisar.addActionListener(this);

        Util.desabilitar(true, jBtnEg_Incluir, jBtnEg_Pesquisar);
        Util.desabilitar(false, jBtnEg_Alterar, jBtnExcluir, jBtnEg_Confirmar, jBtnEg_Cancelar);
        Util.desabilitar(false, jTxtEcs_Nome, jTxtEg_Categoria, jTxtEg_Codigo, jTxtEgProduto,
                jFmtEg_ValorUnitario, jTxtEg_Descricao, jFmtEg_Quantidade, jFmtEg_AnoFabricacao);

        try {
            mascaraQuantidade = new MaskFormatter("#####");
            mascaraQuantidade.install(jFmtEg_Quantidade);

            mascaraAno = new MaskFormatter("####");
            mascaraAno.install(jFmtEg_AnoFabricacao);

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao configurar máscaras dos campos",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void habilitarCampos(boolean enable) {
        Util.habilitar(enable, jTxtEcs_Nome, jTxtEg_Categoria, jTxtEg_Codigo, jTxtEgProduto,
                jFmtEg_ValorUnitario, jTxtEg_Descricao, jFmtEg_Quantidade, jFmtEg_AnoFabricacao);
    }

    public void limparCampos() {
        Util.limparCampos(jTxtEcs_Nome, jTxtEg_Categoria, jTxtEg_Codigo, jTxtEgProduto,
                jFmtEg_ValorUnitario, jTxtEg_Descricao, jFmtEg_Quantidade, jFmtEg_AnoFabricacao);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jFmtEg_Quantidade = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFmtEg_AnoFabricacao = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtEcs_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtEgProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFmtEg_ValorUnitario = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtEg_Descricao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtEg_Categoria = new javax.swing.JTextField();
        jBtnEg_Incluir = new javax.swing.JButton();
        jBtnEg_Alterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnEg_Confirmar = new javax.swing.JButton();
        jBtnEg_Cancelar = new javax.swing.JButton();
        jBtnEg_Pesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTxtEg_Codigo = new javax.swing.JTextField();

        jFmtEg_Quantidade.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtEg_QuantidadeActionPerformed(evt);
            }

            private void jFmtEg_QuantidadeActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        jLabel5.setText("Quantidade");

        jLabel6.setText("Ano de Fabricação");

        jFmtEg_AnoFabricacao.setText("2222");

        jLabel1.setText("Nome");

        jTxtEcs_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEcs_NomeActionPerformed(evt);
            }

            private void jTxtEcs_NomeActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Produto");

        jLabel3.setText("Valor");

        jFmtEg_ValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtEg_ValorUnitarioActionPerformed(evt);
            }

            private void jFmtEg_ValorUnitarioActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        jLabel4.setText("Descrição");

        jLabel7.setText("Categoria");

        // Placeholder para imagens
        jBtnEg_Incluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); 
        jBtnEg_Incluir.setText("Incluir");

        jBtnEg_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); 
        jBtnEg_Alterar.setText("Alterar");

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); 
        jBtnExcluir.setText("Excluir");

        jBtnEg_Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); 
        jBtnEg_Confirmar.setText("Confirmar");

        jBtnEg_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); 
        jBtnEg_Cancelar.setText("Cancelar");

        jBtnEg_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); 
        jBtnEg_Pesquisar.setText("Pesquisar");

        jLabel8.setText("Código");

        jTxtEg_Codigo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEg_CodigoActionPerformed(evt);
            }
            private void jTxtEg_CodigoActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtEg_Categoria)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtEgProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFmtEg_ValorUnitario)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnEg_Incluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnEg_Alterar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnExcluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBtnEg_Confirmar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtnEg_Cancelar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtnEg_Pesquisar))
                                    .addComponent(jTxtEg_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTxtEg_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEg_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtEgProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFmtEg_ValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtEg_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTxtEg_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEg_Incluir)
                    .addComponent(jBtnEg_Alterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnEg_Confirmar)
                    .addComponent(jBtnEg_Cancelar)
                    .addComponent(jBtnEg_Pesquisar))
                .addGap(18, 18, 18))
        );

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jBtnEg_Incluir) {
            incluindo = true;
            habilitarCampos(true);
            limparCampos();
            Util.desabilitar(false, jBtnEg_Incluir, jBtnEg_Alterar, jBtnExcluir, jBtnEg_Pesquisar);
            Util.desabilitar(true, jBtnEg_Confirmar, jBtnEg_Cancelar);
        } else if (e.getSource() == jBtnEg_Alterar) {
            incluindo = false;
            habilitarCampos(true);
            Util.desabilitar(false, jBtnEg_Incluir, jBtnEg_Alterar, jBtnExcluir, jBtnEg_Pesquisar);
            Util.desabilitar(true, jBtnEg_Confirmar, jBtnEg_Cancelar);
        } else if (e.getSource() == jBtnExcluir) {
            int resp = JOptionPane.showConfirmDialog(this, "Deseja excluir o registro?", "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Registro excluído (simulado).");
                limparCampos();
                habilitarCampos(false);
                Util.desabilitar(true, jBtnEg_Incluir, jBtnEg_Pesquisar);
                Util.desabilitar(false, jBtnEg_Alterar, jBtnExcluir, jBtnEg_Confirmar, jBtnEg_Cancelar);
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
            Util.desabilitar(false, jBtnEg_Alterar, jBtnExcluir, jBtnEg_Confirmar, jBtnEg_Cancelar);
        } else if (e.getSource() == jBtnEg_Cancelar) {
            limparCampos();
            habilitarCampos(false);
            Util.desabilitar(true, jBtnEg_Incluir, jBtnEg_Pesquisar);
            Util.desabilitar(false, jBtnEg_Alterar, jBtnExcluir, jBtnEg_Confirmar, jBtnEg_Cancelar);
        } else if (e.getSource() == jBtnEg_Pesquisar) {
            JDlgProdutoPesquisar jDlgProdutoPesquisar = new JDlgProdutoPesquisar(null, true);
            jDlgProdutoPesquisar.setVisible(true);
            // Após fechar a tela de pesquisa, habilitar Alterar e Excluir (simulado)
            Util.desabilitar(true, jBtnEg_Alterar, jBtnExcluir);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jBtnEg_Alterar;
    private javax.swing.JButton jBtnEg_Cancelar;
    private javax.swing.JButton jBtnEg_Confirmar;
    private javax.swing.JButton jBtnEg_Incluir;
    private javax.swing.JButton jBtnEg_Pesquisar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JFormattedTextField jFmtEg_AnoFabricacao;
    private javax.swing.JFormattedTextField jFmtEg_Quantidade;
    private javax.swing.JFormattedTextField jFmtEg_ValorUnitario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTxtEcs_Nome;
    private javax.swing.JTextField jTxtEg_Categoria;
    private javax.swing.JTextField jTxtEg_Codigo;
    private javax.swing.JTextField jTxtEg_Descricao;
    private javax.swing.JTextField jTxtEgProduto;
    // End of variables declaration
}

