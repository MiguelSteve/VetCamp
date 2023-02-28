package view;

import dao.admDAO;
import dao.atnDAO;
import dto.adm_cadusuarioDTO;
import dto.atn_cadclienteDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class atn_cadclienteVIEW extends javax.swing.JFrame {

    public atn_cadclienteVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        txtId.setVisible(false); /*Estou iniciando o campo txtIdcom a configuração para ele não ser vísivel ao usuário*/
        listarCliente(); /*Esta inicializando o método para listar o agendamento*/
    }
    
    int resultado;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_dados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btncarregarCampo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setFont(new java.awt.Font("AcadEref", 0, 10)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_dados.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jPanel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel_dados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CPF:");
        jPanel_dados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Endereço:");
        jPanel_dados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefone:");
        jPanel_dados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel_dados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 30));
        jPanel_dados.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 30));
        jPanel_dados.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, 30));
        jPanel_dados.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 30));

        txtId.setEditable(false);
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_dados.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, 30));

        getContentPane().add(jPanel_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 300, 310));

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "ENDEREÇO", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaCliente);
        if (tabelaCliente.getColumnModel().getColumnCount() > 0) {
            tabelaCliente.getColumnModel().getColumn(0).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(2);
            tabelaCliente.getColumnModel().getColumn(1).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(2).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(3).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 580, 430));

        btnCadastrar.setBackground(new java.awt.Color(50, 205, 50));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, 35));

        btnExcluir.setBackground(new java.awt.Color(240, 72, 66));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 80, 35));

        btnAlterar.setBackground(new java.awt.Color(30, 144, 255));
        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 80, 35));

        btncarregarCampo.setBackground(new java.awt.Color(0, 206, 209));
        btncarregarCampo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncarregarCampo.setForeground(new java.awt.Color(255, 255, 255));
        btncarregarCampo.setText("Carregar Campos");
        btncarregarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarregarCampoActionPerformed(evt);
            }
        });
        getContentPane().add(btncarregarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 160, 35));

        btnLimpar.setBackground(new java.awt.Color(205, 133, 63));
        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 80, 35));

        jLabel_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(jLabel_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            cadastrarCliente();
            limparCampos();
            listarCliente();
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btncarregarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarregarCampoActionPerformed
        /*Chamada de métodos*/
        carregarCampos();
    }//GEN-LAST:event_btncarregarCampoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            alterarDados();
            limparCampos();
            listarCliente();
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
            listarCliente();
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
                new atn_cadclienteVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btncarregarCampo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_background;
    private javax.swing.JPanel jPanel_dados;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    /*Método privado, do tipo void, para cadastrar Cliente*/
    private void cadastrarCliente() {
        
        /*Criação das variaveis do tipo String*/
        String nome, cpf, endereco, telefone, descricao;

        nome = txtNome.getText();
        cpf = txtCpf.getText();
        endereco = txtEndereco.getText();
        telefone = txtTelefone.getText();
        
        /*Estou instanciando a classe atn_cadclienteDTO*/
        atn_cadclienteDTO objcadcliente = new atn_cadclienteDTO();
        /*Estou passando os valores armazanedos nas variaveis locais, para o objcadcliente através dos setters*/
        objcadcliente.setNome(nome);
        objcadcliente.setCpf(cpf);
        objcadcliente.setEndereco(endereco);
        objcadcliente.setTelefone(telefone);

        /*Estou instanciando a classe atnDAO*/
        atnDAO objatndao = new atnDAO();
        /*Passando o objeto objcadcliente por parametro com seus respectivos dados*/
        objatndao.cadclienteDAO(objcadcliente);

    }
    
    /*Método privado, do tipo void para limpar campos*/
    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtNome.requestFocus();

    }
    
    /*Método privado do tipo void para listar Cliente*/
    private void listarCliente() {

        try {
            
            /*Estou instanciando a classe atnDAO*/
            atnDAO objatndao = new atnDAO();
            
            /*Configurando a tabela Cliente para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
            model.setNumRows(0);
            
            /*Estou criando uma arraylist para pegar informações do método pesquisarCliente e adicionar a listap */
            ArrayList<atn_cadclienteDTO> lista = objatndao.pesquisarCliente();
            
            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < lista.size(); num++) {
                
                /*Estou adicionando os registros na tabelaCliente*/
                model.addRow(new Object[]{
                    lista.get(num).getId_cliente(),
                    lista.get(num).getNome(),
                    lista.get(num).getCpf(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getTelefone()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "atn_cadclienteVIEW - listarCliente: " + erro);
        }
    }
    
    /*Metodo privado do tipo void para alterar informações dos dados do Cliente*/
    private void alterarDados() {
        
        /*Criação das variaveis do tipo String e Int, para coletar os dados do campos*/
        String nome_cliente, cpf_cliente, endereco_cliente, telefone_cliente;
        int id_cliente;

        id_cliente = Integer.parseInt(txtId.getText());
        nome_cliente = txtNome.getText();
        cpf_cliente = txtCpf.getText();
        endereco_cliente = txtEndereco.getText();
        telefone_cliente = txtTelefone.getText();
        
        /*Instanciando a classe atn_cadclienteDTO*/
        atn_cadclienteDTO objcadclientedto = new atn_cadclienteDTO();
        /*Estou passando os valores das variaveis, e passando para objcadclientedto através dos setters*/
        objcadclientedto.setId_cliente(id_cliente);
        objcadclientedto.setNome(nome_cliente);
        objcadclientedto.setCpf(cpf_cliente);
        objcadclientedto.setEndereco(endereco_cliente);
        objcadclientedto.setTelefone(telefone_cliente);

        /*Instanciando a classe atnDAO*/
        atnDAO objatndao = new atnDAO();
        /*Passando o objeto objcadclientedto por parametro com seus respectivos dados*/
        objatndao.alterarCliente(objcadclientedto);

    }
    
    /*Método privado do tipo void, para carregar os valores que estão na tabela para os respectivos campos */
    private void carregarCampos() {

        /*Variavel setar, do tipo int, para armazenar a linha que o usuário selecionou*/
        int setar = tabelaCliente.getSelectedRow();

        txtId.setText(tabelaCliente.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaCliente.getModel().getValueAt(setar, 1).toString());
        txtCpf.setText(tabelaCliente.getModel().getValueAt(setar, 2).toString());
        txtEndereco.setText(tabelaCliente.getModel().getValueAt(setar, 3).toString());
        txtTelefone.setText(tabelaCliente.getModel().getValueAt(setar, 4).toString());

    }
    
    /*Método privado para deletar os registros do Cliente*/
    private void deletarDados() {

        /*Criação da variavel do tipo int para coletar informações do campo Id_cliente*/
        int id_cliente;

        /*Estou convertendo o valor do campo txtId(String) para Inteiro*/
        id_cliente = Integer.parseInt(txtId.getText());

        /*Instanciando a classe atn_cadclienteDTO*/
        atn_cadclienteDTO objcadclientedto = new atn_cadclienteDTO();
        /*Estou passando os valores armazanedos nas variaveis locais, para o objcadclienteDTO através dos setters*/
        objcadclientedto.setId_cliente(id_cliente);

        /*Instanciando a classe atnDAO*/
        atnDAO objatndao = new atnDAO();
        /*Passando o objeto objcadclientedto por parametro com seus respectivos dados*/
        objatndao.deletarCliente(objcadclientedto);

    }

}
