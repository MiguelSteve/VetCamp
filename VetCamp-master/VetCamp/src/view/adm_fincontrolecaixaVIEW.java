
package view;

import dao.admDAO;
import dto.adm_controlDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class adm_fincontrolecaixaVIEW extends javax.swing.JFrame {

    
    public adm_fincontrolecaixaVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        listarControl(); /*Esta inicializando o método para atualizar a tabela entrada de controle de caixa*/
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaControl = new javax.swing.JTable();
        btninserirProdutos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Caixa ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaControl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "TIPO", "DESCRIÇÃO", "VALOR", "FUNCIONARIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaControl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 920, 360));

        btninserirProdutos.setBackground(new java.awt.Color(50, 205, 50));
        btninserirProdutos.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btninserirProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btninserirProdutos.setText("Inserir Contas");
        btninserirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninserirProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(btninserirProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 140, 40));

        jButton1.setBackground(new java.awt.Color(0, 206, 209));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Carregar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 140, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninserirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninserirProdutosActionPerformed
        /*Estou instanciando a classe adm_fincontrolecaixawndVIEW*/
        adm_fincontrolecaixawndVIEW objfincontrolecaixawnd = new adm_fincontrolecaixawndVIEW();
        /*Estou chamando a tela através do objeto*/
        objfincontrolecaixawnd.setVisible(true);
    }//GEN-LAST:event_btninserirProdutosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*Chamada de métodos*/
        listarControl();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_fincontrolecaixaVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btninserirProdutos;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaControl;
    // End of variables declaration//GEN-END:variables

    /*Método publico do tipo void para atualizar a tabela listarcontrol*/
    public void listarControl() {

        try {

            /*Estou instanciando a classe admDAO*/
            admDAO objadmdao = new admDAO();
            
            /*Configurando a tabela Controle de caixa para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaControl.getModel();
            model.setNumRows(0);
            
            /*Estou criando uma arraylist para pegar informações do método pesquisarControl e adicionar a listac */
            ArrayList<adm_controlDTO> listac = objadmdao.pesquisarControl();

            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < listac.size(); num++) {
                
                /*Estou adicionando os registros na tabelaControl*/
                model.addRow(new Object[]{
                    listac.get(num).getData(),
                    listac.get(num).getTipo(),
                    listac.get(num).getDescricao(),
                    listac.get(num).getValor(),
                    listac.get(num).getFuncionario()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_fincontrolecaixaVIEW - listarControl: " + erro);
        }
    }

}
