
package view;

import dao.conexaoDAO;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class adm_produtoVIEW extends javax.swing.JFrame {

    
    public adm_produtoVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
    }

    /*Criação das variaveis do tipo String e Int*/
    String nome, quantidade;
    int cod, resultado;

    Connection conn; /*A variavel conn é um objeto criado para trabalhar com a classe Connection*/
    PreparedStatement pstm; /*A variavel pstm é um objeto criado para trabalhar com a classe PreparedStatement*/
    ResultSet rs; /*A variavel rs é um objeto criado para trabalhar com a classe ResutlSet, que trará algum registro do Banco de Dados*/

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Data = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel_Produto = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel_Quantidade = new javax.swing.JLabel();
        txtQntd = new javax.swing.JTextField();
        jLabel_Cod = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtProd = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Produto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Data.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel_Data.setText("Data:");
        getContentPane().add(jLabel_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btnAdd.setBackground(new java.awt.Color(50, 205, 50));
        btnAdd.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 30));

        jLabel_Produto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel_Produto.setText("Produto:");
        getContentPane().add(jLabel_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 84, -1));
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 30));

        jLabel_Quantidade.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel_Quantidade.setText("Quantidade:");
        getContentPane().add(jLabel_Quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        txtQntd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQntdActionPerformed(evt);
            }
        });
        getContentPane().add(txtQntd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 140, 30));

        jLabel_Cod.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel_Cod.setText("Cod.Prod.:");
        getContentPane().add(jLabel_Cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodKeyPressed(evt);
            }
        });
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 30));
        getContentPane().add(txtProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 140, 30));

        btnLimpar.setBackground(new java.awt.Color(205, 133, 63));
        btnLimpar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 30));

        btnVoltar.setBackground(new java.awt.Color(153, 153, 153));
        btnVoltar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Método privado do tipo void, criado para coletar informações sobre o produto selecionado pelo usuario*/
    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        /*Toda vez que o usuario pressionar a tecla enter, ele entra no if*/
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            /*Estou convertendo o valor do campo txtCod(String) para Inteiro*/
            cod = Integer.parseInt(txtCod.getText());

            /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
            String sql = "select nome_produto, quantidade_produto from adm_produto where id_produto = ?";
            conn = new conexaoDAO().conectaBD();

            try {
                
                /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
                pstm = conn.prepareStatement(sql);
                
                /*aqui estou passando os valores através da variavel cod, para os respectivos valores(?)*/
                pstm.setInt(1, cod);
                /*Estou esperando o resultado da execução sql*/
                rs = pstm.executeQuery();
                
                /*Entro no if após execução, e caso for falso ele mostra um JOptionPane e se não for ele entra no else e passa os resultados atraves do objeto rs para as minhas variaveis*/
                if (rs.next() == false) {

                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    
                } else {

                    nome = rs.getString("nome_produto");
                    quantidade = rs.getString("quantidade_produto");
                    txtProd.setText(nome.trim());
                }
            } catch (Exception erro) {

                JOptionPane.showMessageDialog(null, "adm_prodadd - txtCodKeyPressed: " + erro);
            }

        }
        
        

    }//GEN-LAST:event_txtCodKeyPressed
    
    /*Método privado do tipo void, criado para pegar os valores respectivos e fazer a inserção no banco */
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            /*Criação das variaveis do tipo int*/
        /*a variavel qntd, ela pega e converte para inteiro o valor do campo txtQntd e variavel quant ela pega e converte o valor da variavel quantidade(variavel que armazena o valor vindo do banc no metodo anterior)*/
        int qntd = Integer.parseInt(txtQntd.getText());
        int quant = Integer.parseInt(quantidade);
        int soma;
        
        /*soma os valores*/
        soma = qntd + quant;

        /*Criação das variaveis do tipo String para pegar os valores para fazer a inserção na tabela adm_est*/
        String data, produto, quantidades;
        data = txtData.getText();
        produto = txtProd.getText();
        quantidades = String.valueOf(qntd);
        
        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sqli = "insert into adm_est (data_est, produto_est, quantidade) values (?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {
            
            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sqli);
            /*aqui estou passando os valores através da variavel data, produto, quantidade para os respectivos valores(?)*/
            pstm.setString(1, data);
            pstm.setString(2, produto);
            pstm.setString(3, quantidades);

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Produto adicionado!");
            

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "adm_prodadd - Insert add: " + e);
        }
        
        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "UPDATE adm_produto set quantidade_produto = ? where id_produto = ?";
        conn = new conexaoDAO().conectaBD();

        try {
            
            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através da variavel soma, cod para os respectivos valores(?)*/
            pstm.setInt(1, soma);
            pstm.setInt(2, cod);

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "adm_prodadd - btnAdd: " + e);
        }
        
        /*Configuração Dispose, para que quando o usuário clicar no botão sair, ele não feche todas as telas*/
        /*Após os procedimentos, ele fecha*/
        dispose();
        
        
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
        

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        /*Configuração Dispose, para que quando o usuário clicar no botão sair, ele não feche todas as telas*/
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        /*Chamada de métodos*/
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtQntdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQntdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQntdActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_produtoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Cod;
    private javax.swing.JLabel jLabel_Data;
    private javax.swing.JLabel jLabel_Produto;
    private javax.swing.JLabel jLabel_Quantidade;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtQntd;
    // End of variables declaration//GEN-END:variables

    /*Método privado, do tipo void para limpar campos*/
    private void limparCampos() {

        txtCod.setText("");
        txtData.setText("");
        txtProd.setText("");
        txtQntd.setText("");

        txtData.requestFocus();

    }


}
