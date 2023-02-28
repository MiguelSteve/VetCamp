
package view;

import dao.conexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class adm_fincontrolecaixawndVIEW extends javax.swing.JFrame {

    
    public adm_fincontrolecaixawndVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
    }
    
    int resultado;
    
    Connection conn; /*A variavel conn é um objeto criado para trabalhar com a classe Connection*/
    PreparedStatement pstm; /*A variavel pstm é um objeto criado para trabalhar com a classe PreparedStatement*/
    ResultSet rs; /*A variavel rs é um objeto criado para trabalhar com a classe ResutlSet, que trará algum registro do Banco de Dados*/

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Dados = new javax.swing.JLabel();
        jLabel_Descricao = new javax.swing.JLabel();
        jLabel_Tipo = new javax.swing.JLabel();
        jLabel_Data = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Caixa");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Dados.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel_Dados.setText("Valor:");
        getContentPane().add(jLabel_Dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel_Descricao.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel_Descricao.setText("Descrição:");
        getContentPane().add(jLabel_Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 84, -1));

        jLabel_Tipo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel_Tipo.setText("Tipo:");
        getContentPane().add(jLabel_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel_Data.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel_Data.setText("Data:");
        getContentPane().add(jLabel_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 30));

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 290, 30));

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 170, 30));

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 90, 30));

        btnAdd.setBackground(new java.awt.Color(50, 205, 50));
        btnAdd.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 40));

        btnLimpar.setBackground(new java.awt.Color(205, 133, 63));
        btnLimpar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 90, 40));

        btnVoltar.setBackground(new java.awt.Color(153, 153, 153));
        btnVoltar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 90, 41));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            controleCaixa();
            limparCampos();
            dispose();
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        /*Chamada de métodos*/
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        /*Configuração Dispose, para que quando o usuário clicar no botão sair, ele não feche todas as telas*/
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_fincontrolecaixawndVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Dados;
    private javax.swing.JLabel jLabel_Data;
    private javax.swing.JLabel jLabel_Descricao;
    private javax.swing.JLabel jLabel_Tipo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

/*É um método privado do tipo void, para para fazer a inserção de dados das contas na tabela adm_control(database:vetcamp)*/
private void controleCaixa() {

        /*Criacão da variavel do tipo String para poder pegar os dados da variavel user*/
        String usuario;

        /*Instanciando a classe LoginVIEW para poder acessar a variavel global user*/
        LoginVIEW objlogin = new LoginVIEW();

        usuario = objlogin.user;
        
        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "Insert into adm_control(data_control, tipo_control, descricao_control, valor_control, funcionario_control) values(?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {
            
            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sql);
            
            /*aqui estou passando os valores através dos campos, para os respectivos valores(?)*/
            pstm.setString(1, txtData.getText());
            pstm.setString(2, txtTipo.getText());
            pstm.setString(3, txtDescricao.getText());
            pstm.setString(4, txtValor.getText());
            pstm.setString(5, usuario);

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "adm_fincontrolecaixawndVIEW - controleCaixa: " + e);
        }

    }

/*Método privado, do tipo void para limpar campos*/
private void limparCampos(){
    
    txtData.setText("");
    txtDescricao.setText("");
    txtTipo.setText("");
    txtValor.setText("");
    
    txtData.requestFocus();
    
    adm_fincontrolecaixaVIEW objcontrole = new adm_fincontrolecaixaVIEW();
    objcontrole.listarControl();
}


}
