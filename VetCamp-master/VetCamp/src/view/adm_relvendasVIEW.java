
package view;

import dao.atnDAO;
import dto.adm_cadprodutoDTO;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class adm_relvendasVIEW extends javax.swing.JFrame {

    
    public adm_relvendasVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        saldoTotal.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paineltotal = new javax.swing.JPanel();
        saldoTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paineltotal.setBackground(new java.awt.Color(255, 255, 255));
        paineltotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saldoTotal.setBackground(new java.awt.Color(255, 255, 255));
        saldoTotal.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        saldoTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        saldoTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paineltotal.add(saldoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 30));

        getContentPane().add(paineltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 280, 30));

        tabelaVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Produto", "Preço Unitário", "Quant. de Produto", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaVendas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 640, 250));

        btnPesquisar.setBackground(new java.awt.Color(0, 206, 209));
        btnPesquisar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("GERAR RELATÓRIO");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        /*Chamada de métodos*/
        relatVenda();
        calcularSaldo();
    }//GEN-LAST:event_btnPesquisarActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_relvendasVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paineltotal;
    private javax.swing.JLabel saldoTotal;
    private javax.swing.JTable tabelaVendas;
    // End of variables declaration//GEN-END:variables

 /*Método privado do tipo void para atualizar a tabela de relatórios Vendas*/
 private void relatVenda() {

        try {

            /*Estou instanciando a classe atnDAO*/
            atnDAO objatnDAO = new atnDAO();

            /*Configurando a tabela Vendas para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaVendas.getModel();
            model.setNumRows(0);
            
            /*Estou criando uma arraylist para pegar informações do método relatorioVendas e adicionar a listaRe */
            ArrayList<adm_cadprodutoDTO> listaRe = objatnDAO.relatorioVendas();

            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < listaRe.size(); num++) {
                
                /*Estou adicionando os registros na tabelaVendas*/
                model.addRow(new Object[]{
                    listaRe.get(num).getNome_produto(),
                    listaRe.get(num).getPreco_venda(),
                    listaRe.get(num).getQuantidade_produto(),
                    listaRe.get(num).getData()

                });

            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Lista de clientes VIEW não está funcionando corretamente" + erro);

        }

    }
 
    /*Método privado do tipo void para calcular saldo*/
    public void calcularSaldo() {
        
        /*Criação da variavel do tipo double*/
        saldoTotal.setVisible(true);
        double soma = 0;
        
        /*Utilizei o for, para pegar da tabelaVendas, na coluna 1, todos os registros de preços para fazer a soma*/
        for (int i = 0; i < tabelaVendas.getRowCount(); i++) {
            soma = soma + Double.parseDouble(tabelaVendas.getValueAt(i, 1).toString());
        }
        

       /*Com o calculoo pronto, eu exibo ele através do campo saldoTotal*/
       saldoTotal.setText("SALDO TOTAL: " + Double.toString(soma));

       DecimalFormat formatador = new DecimalFormat("0.00");
       saldoTotal.setText("SALDO TOTAL:   R$" + formatador.format(soma));
      

        

    }


}
