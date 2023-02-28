
package view;

import dao.admDAO;
import dto.adm_cadprodutoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class adm_estprodutoVIEW extends javax.swing.JFrame {

    
    public adm_estprodutoVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        listarProduto(); /*Esta inicializando o método para atualizar a tabela entrada de produtos*/
        listarProdutoEs(); /*Esta inicializando o método para atualizar a tabela saida de produtos*/
        listarEstoque(); /*Esta inicializando o método para atualizar a tabela estoque*/
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaSaida = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEntrada = new javax.swing.JTable();
        jLabel_Saida = new javax.swing.JLabel();
        jLabel_Entrada = new javax.swing.JLabel();
        btnProd = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        jLabel_Entrada1 = new javax.swing.JLabel();
        btnCarregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque de Produto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "PRODUTO", "QUANTIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaSaida);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 460, 230));

        tabelaEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "PRODUTO", "QUANTIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaEntrada);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 230));

        jLabel_Saida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Saida.setText("Saída");
        getContentPane().add(jLabel_Saida, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        jLabel_Entrada.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Entrada.setText("Estoque");
        getContentPane().add(jLabel_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        btnProd.setBackground(new java.awt.Color(50, 205, 50));
        btnProd.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnProd.setForeground(new java.awt.Color(255, 255, 255));
        btnProd.setText("Adicionar Prod.");
        btnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 140, 40));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane3.setBorder(null);

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "VALIDADE", "PREÇO VENDA", "ESTOQUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaEstoque);
        if (tabelaEstoque.getColumnModel().getColumnCount() > 0) {
            tabelaEstoque.getColumnModel().getColumn(0).setResizable(false);
            tabelaEstoque.getColumnModel().getColumn(1).setResizable(false);
            tabelaEstoque.getColumnModel().getColumn(2).setResizable(false);
            tabelaEstoque.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 920, 180));

        jLabel_Entrada1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Entrada1.setText("Entrada");
        getContentPane().add(jLabel_Entrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btnCarregar.setBackground(new java.awt.Color(0, 206, 209));
        btnCarregar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnCarregar.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregar.setText("Carregar");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdActionPerformed
       /*Estou instanciando a classe adm_produtoVIEW*/
        adm_produtoVIEW obj = new adm_produtoVIEW();
        /*Estou chamando a tela através do objeto*/
        obj.setVisible(true);
    }//GEN-LAST:event_btnProdActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        /*Chamada de métodos*/
        listarEstoque();
        listarProduto();
        listarProdutoEs();
    }//GEN-LAST:event_btnCarregarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_estprodutoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Entrada;
    private javax.swing.JLabel jLabel_Entrada1;
    private javax.swing.JLabel jLabel_Saida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaEntrada;
    private javax.swing.JTable tabelaEstoque;
    private javax.swing.JTable tabelaSaida;
    // End of variables declaration//GEN-END:variables

    /*Método privado do tipo void para atualizar a tabela entrada*/
    public void listarProduto() {

        try {

            /*Estou instanciando a classe admDAO*/
            admDAO objadmdao = new admDAO();

            /*Configurando a tabela Entrada para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaEntrada.getModel();
            model.setNumRows(0);

            /*Estou criando uma arraylist para pegar informações do método pesquisarEstoque e adicionar a listae */
            ArrayList<adm_cadprodutoDTO> listae = objadmdao.pesquisarEstoque();

            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < listae.size(); num++) {

                /*Estou adicionando os registros na tabelaEntrada*/
                model.addRow(new Object[]{
                    listae.get(num).getData(),
                    listae.get(num).getNome_produto(),
                    listae.get(num).getQuantidade_produto()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_estprodutoVIEW - listarProduto: " + erro);
        }
    }
    
    /*Método privado do tipo void para atualizar a tabela saida*/
    private void listarProdutoEs() {

        try {

            /*Estou instanciando a classe admDAO*/
            admDAO objadmdao = new admDAO();

            /*Configurando a tabela Saida para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaSaida.getModel();
            model.setNumRows(0);

            /*Estou criando uma arraylist para pegar informações do método pesquisarEstoqueSaida e adicionar a listaes */
            ArrayList<adm_cadprodutoDTO> listaes = objadmdao.pesquisarEstoqueSaida();

            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < listaes.size(); num++) {

                /*Estou adicionando os registros na tabelaSaida*/
                model.addRow(new Object[]{
                    listaes.get(num).getData(),
                    listaes.get(num).getNome_produto(),
                    listaes.get(num).getQuantidade_produto()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_estprodutoVIEW - listarProdutoEs: " + erro);
        }
    }
    
    /*Método privado do tipo void para atualizar a tabela estoque*/
    private void listarEstoque() {

        try {
            
            /*Estou instanciando a classe admDAO*/
            admDAO objadmdao = new admDAO();

            /*Configurando a tabela estoque para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaEstoque.getModel();
            model.setNumRows(0);

            /*Estou criando uma arraylist para pegar informações do método pesquisarProduto e adicionar a listaep */
            ArrayList<adm_cadprodutoDTO> listap = objadmdao.pesquisarProduto();

            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < listap.size(); num++) {

                /*Estou adicionando os registros na tabelaEstoque*/
                model.addRow(new Object[]{
                    listap.get(num).getNome_produto(),
                    listap.get(num).getValidade_produto(),
                    listap.get(num).getPreco_venda(),
                    listap.get(num).getQuantidade_produto()
            

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_estprodutoVIEW - listarProduto: " + erro);
        }
    }

}
