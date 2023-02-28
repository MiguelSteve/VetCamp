
package view;


public class atn_telaprincipalVIEW extends javax.swing.JFrame {

    
    public atn_telaprincipalVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/template66.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 570));

        MenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        MenuPrincipal.setPreferredSize(new java.awt.Dimension(500, 30));

        jMenu1.setText("Cadastro");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(100, 19));

        jMenuItem2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem2.setText("Animal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MenuPrincipal.add(jMenu1);

        jMenu2.setText("Agenda");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 19));
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem11.setText("Agendamento");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        MenuPrincipal.add(jMenu2);

        jMenu8.setText("Caixa");
        jMenu8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(100, 19));

        jMenuItem10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem10.setText("Venda");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        MenuPrincipal.add(jMenu8);

        jMenu9.setText("Sair");
        jMenu9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(100, 19));
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });

        jMenuItem13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem13.setText("Fechar o Sistema");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem13);

        MenuPrincipal.add(jMenu9);

        setJMenuBar(MenuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        /*Estou instanciando a classe atn_cadclienteVIEW */
        atn_cadclienteVIEW objcadcliente = new atn_cadclienteVIEW();
        /*Estou chamando a tela através do objeto*/
        objcadcliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        /*Estou instanciando a classe atn_cadanimalVIEW*/
        atn_cadanimalVIEW objcadanimal = new atn_cadanimalVIEW();
        /*Estou chamando a tela através do objeto*/
        objcadanimal.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        /*Estou instanciando a classe atn_agendaVIEW*/
        atn_agendaVIEW objagenda = new atn_agendaVIEW();
        /*Estou chamando a tela através do objeto*/
        objagenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        /*Estou instanciando a classe LoginVIEW */
        LoginVIEW obj = new LoginVIEW();
        /*Estou chamando a tela através do objeto*/
        obj.setVisible(true);
        /*E estou fechando a janela, após a operação*/
        dispose();
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed

    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        /*Estou instanciando a classe atn_vendasVIEW*/
        atn_vendasVIEW objvendas = new atn_vendasVIEW();
        /*Estou chamando a tela através do objeto*/
        objvendas.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atn_telaprincipalVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
