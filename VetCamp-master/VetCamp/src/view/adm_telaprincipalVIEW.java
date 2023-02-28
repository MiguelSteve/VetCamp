
package view;


public class adm_telaprincipalVIEW extends javax.swing.JFrame {

    
    public adm_telaprincipalVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        background = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        jMCadastro = new javax.swing.JMenu();
        jmFornecedor = new javax.swing.JMenuItem();
        jmProduto = new javax.swing.JMenuItem();
        jmUsuario = new javax.swing.JMenuItem();
        jMEstoque = new javax.swing.JMenu();
        jmES = new javax.swing.JMenuItem();
        jMFinanceiro = new javax.swing.JMenu();
        jmControleCaixa = new javax.swing.JMenuItem();
        jMRelatorio = new javax.swing.JMenu();
        jmVendas = new javax.swing.JMenuItem();
        jMSair = new javax.swing.JMenu();
        jmExit = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/template66.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        MenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        MenuPrincipal.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        MenuPrincipal.setPreferredSize(new java.awt.Dimension(500, 30));

        jMCadastro.setText("Cadastro");
        jMCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMCadastro.setPreferredSize(new java.awt.Dimension(100, 19));

        jmFornecedor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jmFornecedor.setText("Fornecedor");
        jmFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFornecedorActionPerformed(evt);
            }
        });
        jMCadastro.add(jmFornecedor);

        jmProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jmProduto.setText("Produto");
        jmProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdutoActionPerformed(evt);
            }
        });
        jMCadastro.add(jmProduto);

        jmUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jmUsuario.setText("Usuário");
        jmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuarioActionPerformed(evt);
            }
        });
        jMCadastro.add(jmUsuario);

        MenuPrincipal.add(jMCadastro);

        jMEstoque.setText("Estoque");
        jMEstoque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMEstoque.setPreferredSize(new java.awt.Dimension(100, 19));
        jMEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEstoqueActionPerformed(evt);
            }
        });

        jmES.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jmES.setText("Entrada e Saída");
        jmES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmESActionPerformed(evt);
            }
        });
        jMEstoque.add(jmES);

        MenuPrincipal.add(jMEstoque);

        jMFinanceiro.setText("Financeiro");
        jMFinanceiro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMFinanceiro.setPreferredSize(new java.awt.Dimension(100, 19));

        jmControleCaixa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jmControleCaixa.setText("Controle de Caixa");
        jmControleCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmControleCaixaActionPerformed(evt);
            }
        });
        jMFinanceiro.add(jmControleCaixa);

        MenuPrincipal.add(jMFinanceiro);

        jMRelatorio.setText("Relatórios");
        jMRelatorio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMRelatorio.setPreferredSize(new java.awt.Dimension(100, 19));

        jmVendas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jmVendas.setText("Vendas");
        jmVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVendasActionPerformed(evt);
            }
        });
        jMRelatorio.add(jmVendas);

        MenuPrincipal.add(jMRelatorio);

        jMSair.setBackground(new java.awt.Color(204, 204, 204));
        jMSair.setText("Sair");
        jMSair.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMSair.setPreferredSize(new java.awt.Dimension(100, 19));
        jMSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSairActionPerformed(evt);
            }
        });

        jmExit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jmExit.setText("Fechar o Sistema");
        jmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmExitActionPerformed(evt);
            }
        });
        jMSair.add(jmExit);

        MenuPrincipal.add(jMSair);

        setJMenuBar(MenuPrincipal);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFornecedorActionPerformed
        /*Estou instanciando a classe adm_cadfornecedorVIEW */
        adm_cadfornecedorVIEW objcadfornecedor = new adm_cadfornecedorVIEW();
        /*Estou chamando a tela através do objeto*/
        objcadfornecedor.setVisible(true);
    }//GEN-LAST:event_jmFornecedorActionPerformed

    private void jmProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdutoActionPerformed
        /*Estou instanciando a classe adm_cadprodutoVIEW */
        adm_cadprodutoVIEW objcadproduto = new adm_cadprodutoVIEW();
        /*Estou chamando a tela através do objeto*/
        objcadproduto.setVisible(true);;
    }//GEN-LAST:event_jmProdutoActionPerformed

    private void jmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuarioActionPerformed
        /*Estou instanciando a classe adm_cadusuarioVIEW */
        adm_cadusuarioVIEW objcadusuario = new adm_cadusuarioVIEW();
        /*Estou chamando a tela através do objeto*/
        objcadusuario.setVisible(true);
    }//GEN-LAST:event_jmUsuarioActionPerformed

    private void jMEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEstoqueActionPerformed

    }//GEN-LAST:event_jMEstoqueActionPerformed

    private void jMSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSairActionPerformed

    }//GEN-LAST:event_jMSairActionPerformed

    private void jmESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmESActionPerformed
        /*Estou instanciando a classe adm_estprodutoVIEW */
        adm_estprodutoVIEW objestproduto = new adm_estprodutoVIEW();
        /*Estou chamando a tela através do objeto*/
        objestproduto.setVisible(true);
    }//GEN-LAST:event_jmESActionPerformed

    private void jmControleCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmControleCaixaActionPerformed
        /*Estou instanciando a classe adm_fincontrolecaixaVIEW */
        adm_fincontrolecaixaVIEW objfincontrolecaixa = new adm_fincontrolecaixaVIEW();
        /*Estou chamando a tela através do objeto*/
        objfincontrolecaixa.setVisible(true);
    }//GEN-LAST:event_jmControleCaixaActionPerformed

    private void jmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmExitActionPerformed
       /*Estou instanciando a classe LoginVIEW */
        LoginVIEW obj = new LoginVIEW();
        /*Estou chamando a tela através do objeto*/
        obj.setVisible(true);
        /*E estou fechando a janela, após a operação*/
        dispose();
    }//GEN-LAST:event_jmExitActionPerformed

    private void jmVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVendasActionPerformed
        /*Estou instanciando a classe adm_relvendasVIEW */
        adm_relvendasVIEW objrelvendas = new adm_relvendasVIEW();
        /*Estou chamando a tela através do objeto*/
        objrelvendas.setVisible(true);
    }//GEN-LAST:event_jmVendasActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_telaprincipalVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JLabel background;
    private javax.swing.JMenu jMCadastro;
    private javax.swing.JMenu jMEstoque;
    private javax.swing.JMenu jMFinanceiro;
    private javax.swing.JMenu jMRelatorio;
    private javax.swing.JMenu jMSair;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jmControleCaixa;
    private javax.swing.JMenuItem jmES;
    private javax.swing.JMenuItem jmExit;
    private javax.swing.JMenuItem jmFornecedor;
    private javax.swing.JMenuItem jmProduto;
    private javax.swing.JMenuItem jmUsuario;
    private javax.swing.JMenuItem jmVendas;
    // End of variables declaration//GEN-END:variables
}
