
package view;

import dao.admDAO;
import dto.adm_cadprodutoDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class adm_cadprodutoVIEW extends javax.swing.JFrame {

    
    public adm_cadprodutoVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        txtId.setVisible(false); /*Estou iniciando o campo txtId com a configuração para ele não ser vísivel ao usuário*/
        dadosComboBox(); /*Esta inicializando o método para listar os dados na combobox*/
        listarProduto();  /*Esta inicializando o método para listar os produtos*/
    }
    
    int resultado;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_dados = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        cbxFornecedor = new javax.swing.JComboBox<>();
        txtpVenda = new javax.swing.JTextField();
        txtValidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpUnit = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btncarregarCampo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_dados.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jPanel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblData.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblData.setText("Data:");
        jPanel_dados.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 50, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setText("Produto:");
        jPanel_dados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade:");
        jPanel_dados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel4.setText("Validade:");
        jPanel_dados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel5.setText("Preço Venda:");
        jPanel_dados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));
        jPanel_dados.add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, 30));

        cbxFornecedor.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        cbxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jPanel_dados.add(cbxFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));
        jPanel_dados.add(txtpVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 110, 30));
        jPanel_dados.add(txtValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 30));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel6.setText("Preço Unit.:");
        jPanel_dados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        jPanel_dados.add(txtpUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 30));

        txtId.setEditable(false);
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_dados.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel7.setText("Fornecedor:");
        jPanel_dados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        jPanel_dados.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 110, 30));
        jPanel_dados.add(txtProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 30));

        getContentPane().add(jPanel_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 300, 360));

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fornecedor", "Produto", "Quantidade", "Validade", "Preço Unit.", "Preço Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaProduto);
        if (tabelaProduto.getColumnModel().getColumnCount() > 0) {
            tabelaProduto.getColumnModel().getColumn(0).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaProduto.getColumnModel().getColumn(1).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(2).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(3).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(4).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 580, 430));

        btnCadastrar.setBackground(new java.awt.Color(50, 205, 50));
        btnCadastrar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 80, 35));

        btncarregarCampo.setBackground(new java.awt.Color(0, 206, 209));
        btncarregarCampo.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btncarregarCampo.setForeground(new java.awt.Color(255, 255, 255));
        btncarregarCampo.setText("Carregar Campos");
        btncarregarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarregarCampoActionPerformed(evt);
            }
        });
        getContentPane().add(btncarregarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, 140, 35));

        btnAlterar.setBackground(new java.awt.Color(30, 144, 255));
        btnAlterar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 80, 35));

        btnExcluir.setBackground(new java.awt.Color(240, 72, 66));
        btnExcluir.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 80, 35));

        btnLimpar.setBackground(new java.awt.Color(205, 133, 63));
        btnLimpar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 80, 35));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncarregarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarregarCampoActionPerformed
        /*Chamada de métodos*/
        carregarCampos();
    }//GEN-LAST:event_btncarregarCampoActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            cadastrarProduto();
            limparCampos();
            listarProduto();
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            alterarDados();
            limparCampos();
            listarProduto();
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            deletarDados();
            limparCampos();
            listarProduto();
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        /*Chamada de métodos*/
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_cadprodutoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btncarregarCampo;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel_dados;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblData;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValidade;
    private javax.swing.JTextField txtpUnit;
    private javax.swing.JTextField txtpVenda;
    // End of variables declaration//GEN-END:variables

    /*Método privado, do tipo void, para cadastrar produtos*/
    private void cadastrarProduto() {

        /*Criação das variaveis do tipo String e Int*/
        String nome, quantidade, validade, punit, pvenda, data;
        int fk_fornecedor;

        nome = txtProduto.getText();
        quantidade = txtQuantidade.getText();
        validade = txtValidade.getText();
        punit = txtpUnit.getText();
        pvenda = txtpVenda.getText();
        fk_fornecedor = id_fornecedor.get(cbxFornecedor.getSelectedIndex()-1);
        data = txtData.getText();
        
        /*Estou instanciando a classe adm_cadprodutoDTO*/
        adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
        
        /*Estou passando os valores armazanedos nas variaveis locais, para o objcadprodutoDTO através dos setters*/
        objcadprodutodto.setNome_produto(nome);
        objcadprodutodto.setQuantidade_produto(quantidade);
        objcadprodutodto.setValidade_produto(validade);
        objcadprodutodto.setPreco_unitario(punit);
        objcadprodutodto.setPreco_venda(pvenda);
        objcadprodutodto.setFk_fornecedor(fk_fornecedor);
        objcadprodutodto.setData(data);

        /*Estou instanciando a classe admDAO*/
        admDAO objadmdao = new admDAO();
        /*Passando o objeto objcadprodutodto por parametro com seus respectivos dados*/
        objadmdao.cadprodutoDAO(objcadprodutodto);

    }

    /*Estou criando um vetor do tipo inteiro para armazenar o Id_fornecedor que vem do banco de dados*/
    Vector<Integer> id_fornecedor = new Vector<Integer>();

    /*Método privado, do tipo void, para carregar dados da combobox*/
    public void dadosComboBox() {

        try {

            /*Estou instanciando a classe admDAO*/
            admDAO objadmdao = new admDAO();
            /*O ResultSet está esperando algum dado da classe listarFornecedor*/
            ResultSet rs = objadmdao.listarFornecedor();
            
            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adicione na combobox*/
            while (rs.next()) {

                id_fornecedor.addElement(rs.getInt(1));
                cbxFornecedor.addItem(rs.getString(2));

            }
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "adm_cadprodutoVIEW - dadosComboBox: " + erro);
        }

    }

    /*Método privado, do tipo void para limpar campos*/
    private void limparCampos() {

        txtId.setText("");
        txtData.setText("");
        txtData.setVisible(true);
        lblData.setVisible(true);
        txtProduto.setText("");
        txtQuantidade.setText("");
        txtValidade.setText("");
        txtpUnit.setText("");
        txtpVenda.setText("");
        cbxFornecedor.setSelectedIndex(0);

    }

    /*Método privado do tipo void para listar produto*/
    private void listarProduto() {

        try {
            
            /*Estou instanciando a classe admDAO*/
            admDAO objadmdao = new admDAO();
            
            /*Configurando a tabela Produto para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
            model.setNumRows(0);

            /*Estou criando uma arraylist para pegar informações do método pesquisarProduto e adicionar a listap */
            ArrayList<adm_cadprodutoDTO> listap = objadmdao.pesquisarProduto();
            
            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < listap.size(); num++) {
                
                /*Estou adicionando os registros na tabelaProduto*/
                model.addRow(new Object[]{
                    listap.get(num).getId_produto(),
                    listap.get(num).getFk_fornecedor(),
                    listap.get(num).getNome_produto(),
                    listap.get(num).getQuantidade_produto(),
                    listap.get(num).getValidade_produto(),
                    listap.get(num).getPreco_unitario(),
                    listap.get(num).getPreco_venda()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_cadprodutoVIEW - listarProduto: " + erro);
        }
    }
    
    /*Metodo privado do tipo void para alterar informações dos dados do Produto*/
    private void alterarDados() {
        
        /*Criação das variaveis do tipo String e Int, para coletar os dados do campos*/
        String nome_produto, quantidade_produto, validade_produto, preco_unitario, preco_venda;
        int fk_fornecedor, id_produto;

        id_produto = Integer.parseInt(txtId.getText());
        nome_produto = txtProduto.getText();
        quantidade_produto = txtQuantidade.getText();
        validade_produto = txtValidade.getText();
        preco_unitario = txtpUnit.getText();
        preco_venda = txtpVenda.getText();
        fk_fornecedor = id_fornecedor.get(cbxFornecedor.getSelectedIndex() - 1);
        
        /*Instanciando a classe adm_cadprodutoDTO*/
        adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
        /*Estou passando os valores das variaveis, e passando para objcadprodutodto através dos setters*/
        objcadprodutodto.setId_produto(id_produto);
        objcadprodutodto.setNome_produto(nome_produto);
        objcadprodutodto.setQuantidade_produto(quantidade_produto);
        objcadprodutodto.setValidade_produto(validade_produto);
        objcadprodutodto.setPreco_unitario(preco_unitario);
        objcadprodutodto.setPreco_venda(preco_venda);
        objcadprodutodto.setFk_fornecedor(fk_fornecedor);
        
         /*Instanciando a classe admDAO*/
        admDAO objadmdao = new admDAO();
        /*Passando o objeto objcadprodutodto por parametro com seus respectivos dados*/
        objadmdao.alterarProduto(objcadprodutodto);
    }
    
    /*Método privado do tipo void, para carregar os valores que estão na tabela para os respectivos campos */
    private void carregarCampos() {
        
        /*Variavel setar, do tipo int, para armazenar a linha que o usuário selecionou*/
        int setar = tabelaProduto.getSelectedRow();
        
        txtData.setVisible(false);
        lblData.setVisible(false);
        txtId.setText(tabelaProduto.getModel().getValueAt(setar, 0).toString());
        String fornecedor = (tabelaProduto.getModel().getValueAt(setar, 1).toString());
        cbxFornecedor.setSelectedIndex(Integer.parseInt(fornecedor));
        txtProduto.setText(tabelaProduto.getModel().getValueAt(setar, 2).toString());
        txtQuantidade.setText(tabelaProduto.getModel().getValueAt(setar, 3).toString());
        txtValidade.setText(tabelaProduto.getModel().getValueAt(setar, 4).toString());
        txtpUnit.setText(tabelaProduto.getModel().getValueAt(setar, 5).toString());
        txtpVenda.setText(tabelaProduto.getModel().getValueAt(setar, 6).toString());

    }
    
    /*Método privado para deletar os registros do produto*/
    private void deletarDados() {
        
        /*Criação da variavel do tipo int para coletar informações do campo Id_produto*/
        int id_produto;
        
        /*Estou convertendo o valor do campo txtId(String) para Inteiro*/
        id_produto = Integer.parseInt(txtId.getText());
        
        /*Instanciando a classe adm_cadprodutoDTO*/
        adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
        /*Estou passando os valores armazanedos nas variaveis locais, para o objcadprodutoDTO através dos setters*/
        objcadprodutodto.setId_produto(id_produto);
        
        /*Instanciando a classe admDAO*/
        admDAO objadmdao = new admDAO();
        /*Passando o objeto objcadprodutodto por parametro com seus respectivos dados*/
        objadmdao.deletarProduto(objcadprodutodto);

    }
}
