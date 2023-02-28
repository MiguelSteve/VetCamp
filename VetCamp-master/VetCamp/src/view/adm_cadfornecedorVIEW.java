
package view;

import dao.admDAO;
import dto.adm_cadfornecedorDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class adm_cadfornecedorVIEW extends javax.swing.JFrame {

    
    public adm_cadfornecedorVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        txtId.setVisible(false); /*Estou iniciando o campo txtId com a configuração para ele não ser vísivel ao usuário*/
        listarFornecedor(); /*Esta inicializando o método para listar os fornecedores*/
    }
    
    int resultado;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_dados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        btncarregarCampo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_dados.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");
        jPanel_dados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setText("CNPJ:");
        jPanel_dados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel3.setText("Endereço:");
        jPanel_dados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel4.setText("Telefone:");
        jPanel_dados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel5.setText("E-mail:");
        jPanel_dados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        jPanel_dados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 30));
        jPanel_dados.add(txtCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 30));
        jPanel_dados.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 250, 30));
        jPanel_dados.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 250, 30));
        jPanel_dados.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, 30));

        txtId.setEditable(false);
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_dados.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, -1));

        getContentPane().add(jPanel_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 300, 350));

        btnEditar.setBackground(new java.awt.Color(30, 144, 255));
        btnEditar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(70, 24));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 80, 35));

        btnSalvar.setBackground(new java.awt.Color(50, 205, 50));
        btnSalvar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 80, 35));

        btnExcluir.setBackground(new java.awt.Color(240, 72, 66));
        btnExcluir.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 80, 35));

        jScrollPane2.setBackground(new java.awt.Color(236, 236, 236));

        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CNPJ", "ENDEREÇO", "TELEFONE", "E-MAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFornecedor.setGridColor(new java.awt.Color(236, 236, 236));
        tabelaFornecedor.setShowGrid(true);
        jScrollPane2.setViewportView(tabelaFornecedor);
        if (tabelaFornecedor.getColumnModel().getColumnCount() > 0) {
            tabelaFornecedor.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 580, 430));

        btncarregarCampo.setBackground(new java.awt.Color(0, 206, 209));
        btncarregarCampo.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btncarregarCampo.setForeground(new java.awt.Color(255, 255, 255));
        btncarregarCampo.setText("Carregar Campos");
        btncarregarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarregarCampoActionPerformed(evt);
            }
        });
        getContentPane().add(btncarregarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 140, 35));

        btnLimpar.setBackground(new java.awt.Color(205, 133, 63));
        btnLimpar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 35));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            cadastrarFornecedor();
            limparCampos();
            listarFornecedor();
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            alteraFornecedor();
            limparCampos();
            listarFornecedor();
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btncarregarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarregarCampoActionPerformed
        /*Chamada de métodos*/
        carregarCampos();
    }//GEN-LAST:event_btncarregarCampoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            deletarDados();
            limparCampos();
            listarFornecedor();
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
                new adm_cadfornecedorVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btncarregarCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel_dados;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaFornecedor;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    /*Método privado, do tipo void, para cadastrar fornecedores*/
    private void cadastrarFornecedor() {
        
        /*Criação das variaveis do tipo String*/
        String nome, cnpj, endereco, telefone, email;

        nome = txtNome.getText();
        cnpj = txtCnpj.getText();
        endereco = txtEndereco.getText();
        telefone = txtTelefone.getText();
        email = txtEmail.getText();
        
        /*Estou instanciando a classe sdm_cadfornecedorDTO*/
        adm_cadfornecedorDTO objcadfornecedordto = new adm_cadfornecedorDTO();
        /*Estou passando os valores armazanedos nas variaveis locais, para o objcadfornecedorDTO através dos setters*/
        objcadfornecedordto.setNome(nome);
        objcadfornecedordto.setCnpj(cnpj);
        objcadfornecedordto.setEndereco(endereco);
        objcadfornecedordto.setTelefone(telefone);
        objcadfornecedordto.setEmail(email);
        
        /*Estou instanciando a classe admDAO*/
        admDAO objadmdao = new admDAO();
        /*Passando o objeto objcadfornecedordto por parametro com seus respectivos dados*/
        objadmdao.cadfornecedorDAO(objcadfornecedordto);

    }
    
    /*Método privado, do tipo void para limpar campos*/
    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtCnpj.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtNome.requestFocus();

    }

    /*Método privado do tipo void para listar fornecedor*/
    private void listarFornecedor() {

        try {
            
            /*Estou instanciando a classe admDAO*/
            admDAO objadmdao = new admDAO();
            
            /*Configurando a tabela Fornenecedor para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaFornecedor.getModel();
            model.setNumRows(0);
            
            /*Estou criando uma arraylist para pegar informações do método pesquisarFonecedor e adicionar a listaf */
            ArrayList<adm_cadfornecedorDTO> listaf = objadmdao.pesquisarFornecedor();

             /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < listaf.size(); num++) {
                
                /*Estou adicionando os registros na tabelaFornecedor*/
                model.addRow(new Object[]{
                    listaf.get(num).getId_fornecedor(),
                    listaf.get(num).getNome(),
                    listaf.get(num).getCnpj(),
                    listaf.get(num).getEndereco(),
                    listaf.get(num).getTelefone(),
                    listaf.get(num).getEmail()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_cadfornecedorVIEW - listarFornecedor: " + erro);
        }
    }
    
    /*Método privado do tipo void, para carregar os valores que estão na tabela para os respectivos campos*/
    private void carregarCampos() {
        
        /*Variavel setar, do tipo int, para armazenar a linha que o usuário selecionou*/
        int setar = tabelaFornecedor.getSelectedRow();
 
        txtId.setText(tabelaFornecedor.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaFornecedor.getModel().getValueAt(setar, 1).toString());
        txtCnpj.setText(tabelaFornecedor.getModel().getValueAt(setar, 2).toString());
        txtEndereco.setText(tabelaFornecedor.getModel().getValueAt(setar, 3).toString());
        txtTelefone.setText(tabelaFornecedor.getModel().getValueAt(setar, 4).toString());
        txtEmail.setText(tabelaFornecedor.getModel().getValueAt(setar, 5).toString());

    }
    
    /*Metodo privado do tipo void para alterar informações dos dados do Fornecedor*/
    private void alteraFornecedor() {
        
        /*Criação das variaveis do tipo String e Int, para coletar os dados do campos*/
        String nome_fornecedor, cnpj_fornecedor, endereco_fornecedor, telefone_fornecedor, email_fornecedor;
        int id_fornecedor;
        
        id_fornecedor = Integer.parseInt(txtId.getText());
        nome_fornecedor = txtNome.getText();
        cnpj_fornecedor = txtCnpj.getText();
        endereco_fornecedor = txtEndereco.getText();
        telefone_fornecedor = txtTelefone.getText();
        email_fornecedor = txtEmail.getText();
        
        /*Instanciando a classe adm_cadfornecedorDTO*/
        adm_cadfornecedorDTO objcadfornecedordto = new adm_cadfornecedorDTO();
        
        /*Estou passando os valores das variaveis, e passando para objcadFornecedordto através dos setters*/
        objcadfornecedordto.setId_fornecedor(id_fornecedor);
        objcadfornecedordto.setNome(nome_fornecedor);
        objcadfornecedordto.setCnpj(cnpj_fornecedor);
        objcadfornecedordto.setEndereco(endereco_fornecedor);
        objcadfornecedordto.setTelefone(telefone_fornecedor);
        objcadfornecedordto.setEmail(email_fornecedor);
        
        /*Instanciando a classe admDAO*/
        admDAO objadmdao = new admDAO();
        /*Passando o objeto objcadfornecedordto por parametro com seus respectivos dados*/
        objadmdao.alterarFornecedor(objcadfornecedordto);
    }
    
    /*Método privado para deletar os registros do fornecedor*/
    private void deletarDados() {
        
        /*Criação da variavel do tipo int para coletar informações do campo Id_fornecedor*/
        int id_fornecedor;
        
        /*Estou convertendo o valor do campo txtId(String) para Inteiro*/
        id_fornecedor = Integer.parseInt(txtId.getText());
        
        /*Instanciando a classe adm_cadfornecedorDTO*/
        adm_cadfornecedorDTO objcadfornecedordto = new adm_cadfornecedorDTO();
        /*Estou passando os valores armazanedos nas variaveis locais, para o objcadfornecedorDTO através dos setters*/
        objcadfornecedordto.setId_fornecedor(id_fornecedor);

        /*Instanciando a classe admDAO*/
        admDAO objadmdao = new admDAO();
        /*Passando o objeto objcadfornecedordto por parametro com seus respectivos dados*/
        objadmdao.deletarFornecedor(objcadfornecedordto);
    }
}
