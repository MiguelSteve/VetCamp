
package view;

import dao.admDAO;
import dto.adm_cadusuarioDTO;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class adm_cadusuarioVIEW extends javax.swing.JFrame {

    
    public adm_cadusuarioVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        txtId.setVisible(false); /*Estou iniciando o campo txtId com a configuração para ele não ser vísivel ao usuário*/
        dadosComboBox(); /*Esta inicializando o método para listar os dados na combobox*/
        listarUsuario(); /*Esta inicializando o método para listar os usuarios*/
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
        txtCpf = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        cbxCargo = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel_login = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btncarregarCampo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Cadastro de Usuário");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_dados.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");
        jPanel_dados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setText("CPF:");
        jPanel_dados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel3.setText("Endereço:");
        jPanel_dados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel4.setText("Telefone:");
        jPanel_dados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel5.setText("Cargo:");
        jPanel_dados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        jPanel_dados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 30));
        jPanel_dados.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 30));
        jPanel_dados.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 250, 30));
        jPanel_dados.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, 30));

        cbxCargo.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jPanel_dados.add(cbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 30));

        txtId.setEditable(false);
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_dados.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel8.setText("CADASTRO");
        jPanel_dados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        getContentPane().add(jPanel_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, 350));

        jPanel_login.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_login.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jPanel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel6.setText("Usuario:");
        jPanel_login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel_login.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 30));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel7.setText("Senha:");
        jPanel_login.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel_login.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 30));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel9.setText("LOGIN");
        jPanel_login.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        getContentPane().add(jPanel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 300, 170));

        btnCadastrar.setBackground(new java.awt.Color(50, 205, 50));
        btnCadastrar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 90, 35));

        btncarregarCampo.setBackground(new java.awt.Color(0, 206, 209));
        btncarregarCampo.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btncarregarCampo.setForeground(new java.awt.Color(255, 255, 255));
        btncarregarCampo.setText("Carregar Campos");
        btncarregarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarregarCampoActionPerformed(evt);
            }
        });
        getContentPane().add(btncarregarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 140, 35));

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "ENDEREÇO", "TELEFONE", "CARGO", "USUARIO", "SENHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaUsuario);
        if (tabelaUsuario.getColumnModel().getColumnCount() > 0) {
            tabelaUsuario.getColumnModel().getColumn(0).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaUsuario.getColumnModel().getColumn(1).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(2).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(3).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(4).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(5).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(6).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(7).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 580, 430));

        btnAlterar.setBackground(new java.awt.Color(30, 144, 255));
        btnAlterar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 90, 35));

        btnExcluir.setBackground(new java.awt.Color(240, 72, 66));
        btnExcluir.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 90, 35));

        btnLimpar.setBackground(new java.awt.Color(205, 133, 63));
        btnLimpar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 90, 35));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(51, 51, 51));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            cadastrarUsuario();
            limparCampos();
            listarUsuario();
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
            listarUsuario();
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
            listarUsuario();
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
                new adm_cadusuarioVIEW().setVisible(true);
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
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel_dados;
    private javax.swing.JPanel jPanel_login;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    /*Método privado, do tipo void, para cadastrar usuários*/
    private void cadastrarUsuario() {
        
        /*Criação das variaveis do tipo String e Int*/
        String nome, cpf, endereco, telefone, usuario, senha;
        int fkcargo;
        
        nome = txtNome.getText();
        cpf = txtCpf.getText();
        endereco = txtEndereco.getText();
        telefone = txtTelefone.getText();
        fkcargo = id_cargo.get(cbxCargo.getSelectedIndex() - 1);
        usuario = txtUsuario.getText();
        senha = txtSenha.getText();
        
        /*Estou instanciando a classe adm_cadusuarioDTO*/
        adm_cadusuarioDTO objcadusuariodto = new adm_cadusuarioDTO();
        
        /*Estou passando os valores armazanedos nas variaveis locais, para o objcadusuarioDTO através dos setters*/
        objcadusuariodto.setNome(nome);
        objcadusuariodto.setCpf(cpf);
        objcadusuariodto.setEndereco(endereco);
        objcadusuariodto.setTelefone(telefone);
        objcadusuariodto.setFkcargo(fkcargo);
        objcadusuariodto.setUsuario(usuario);
        objcadusuariodto.setSenha(senha);
        
        /*Estou instanciando a classe admDAO*/
        admDAO objadmdao = new admDAO();
        /*Passando o objeto objcadusuariodto por parametro com seus respectivos dados*/
        objadmdao.cadusuarioDAO(objcadusuariodto);
        
    }
    
    /*Estou criando um vetor do tipo inteiro para armazenar o Id_cargo que vem do banco de dados*/
    Vector<Integer> id_cargo = new Vector<Integer>();

    /*Método privado, do tipo void, para carregar dados da combobox*/
    private void dadosComboBox() {
        
        try {
            
            /*Estou instanciando a classe admDAO*/
            admDAO objadmdao = new admDAO();
            /*O ResultSet está esperando algum dado da classe listarCargo*/
            ResultSet rs = objadmdao.listarCargo();
            
            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adicione na combobox*/
            while (rs.next()) {
                
                id_cargo.addElement(rs.getInt(1));
                cbxCargo.addItem(rs.getString(2));
                
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "adm_cadusuarioVIEW - dadosComboBox: " + erro);
        }
        
    }
    
    /*Método privado, do tipo void para limpar campos*/
    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cbxCargo.setSelectedIndex(0);
        txtUsuario.setText("");
        txtSenha.setText("");
        txtNome.requestFocus();
    }
    
     /*Método privado do tipo void para listar usuário*/
    private void listarUsuario() {
        
        try {
            
            /*Estou instanciando a classe admDAO*/
            admDAO objadmdao = new admDAO();
            
            /*Configurando a tabela Usuario para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaUsuario.getModel();
            model.setNumRows(0);
            
            /*Estou criando uma arraylist para pegar informações do método pesquisarUsuario e adicionar a lista */
            ArrayList<adm_cadusuarioDTO> lista = objadmdao.pesquisarUsuario();
            
            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < lista.size(); num++) {
                
                /*Estou adicionando os registros na tabelaUsuario*/
                model.addRow(new Object[]{
                    lista.get(num).getId_usuario(),
                    lista.get(num).getNome(),
                    lista.get(num).getCpf(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getFkcargo(),
                    lista.get(num).getUsuario(),
                    lista.get(num).getSenha(),
                    lista.get(num).getFkcargo()
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_cadusuarioVIEW - listarUsuario: " + erro);
        }
    }
    
    /*Metodo privado do tipo void para alterar informações dos dados do Usuario*/
    private void alterarDados() {
        
        /*Criação das variaveis do tipo String e Int, para coletar os dados do campos*/
        String nome_usuario, cpf_usuario, endereco_usuario, telefone_usuario, login_usuario, login_senha;
        int fk_cargo, id_usuario;
        
        id_usuario = Integer.parseInt(txtId.getText());
        nome_usuario = txtNome.getText();
        cpf_usuario = txtCpf.getText();
        endereco_usuario = txtEndereco.getText();
        telefone_usuario = txtTelefone.getText();
        login_usuario = txtUsuario.getText();
        login_senha = txtSenha.getText();
        fk_cargo = id_cargo.get(cbxCargo.getSelectedIndex() - 1);
        
        /*Instanciando a classe adm_cadusuarioDTO*/
        adm_cadusuarioDTO objcadusuariodto = new adm_cadusuarioDTO();
        /*Estou passando os valores das variaveis, e passando para objcadusuariodto através dos setters*/
        objcadusuariodto.setId_usuario(id_usuario);
        objcadusuariodto.setNome(nome_usuario);
        objcadusuariodto.setCpf(cpf_usuario);
        objcadusuariodto.setEndereco(endereco_usuario);
        objcadusuariodto.setTelefone(telefone_usuario);
        objcadusuariodto.setUsuario(cpf_usuario);
        objcadusuariodto.setUsuario(login_usuario);
        objcadusuariodto.setSenha(login_senha);
        objcadusuariodto.setFkcargo(fk_cargo);
        
        /*Instanciando a classe admDAO*/
        admDAO objadmdao = new admDAO();
        /*Passando o objeto objcadusuariodto por parametro com seus respectivos dados*/
        objadmdao.alterarUsuario(objcadusuariodto);
    }
    
    /*Método privado do tipo void, para carregar os valores que estão na tabela para os respectivos campos */
    private void carregarCampos() {
        
        /*Variavel setar, do tipo int, para armazenar a linha que o usuário selecionou*/
        int setar = tabelaUsuario.getSelectedRow();
        
        
        txtId.setText(tabelaUsuario.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaUsuario.getModel().getValueAt(setar, 1).toString());
        txtCpf.setText(tabelaUsuario.getModel().getValueAt(setar, 2).toString());
        txtEndereco.setText(tabelaUsuario.getModel().getValueAt(setar, 3).toString());
        txtTelefone.setText(tabelaUsuario.getModel().getValueAt(setar, 4).toString());
        String cargo = (tabelaUsuario.getModel().getValueAt(setar, 5).toString());        
        cbxCargo.setSelectedIndex(Integer.parseInt(cargo));
        txtUsuario.setText(tabelaUsuario.getModel().getValueAt(setar, 6).toString());
        txtSenha.setText(tabelaUsuario.getModel().getValueAt(setar, 7).toString());
        
    }
    
    /*Método privado para deletar os registros do usuario*/
    private void deletarDados() {
        
        /*Criação da variavel do tipo int para coletar informações do campo Id_usuario*/
        int id_usuario;
        
        /*Estou convertendo o valor do campo txtId(String) para Inteiro*/
        id_usuario = Integer.parseInt(txtId.getText());
        
        /*Instanciando a classe adm_cadusuarioDTO*/
        adm_cadusuarioDTO objcadusuariodto = new adm_cadusuarioDTO();
        /*Estou passando os valores armazanedos nas variaveis locais, para o objcadusuarioDTO através dos setters*/
        objcadusuariodto.setId_usuario(id_usuario);
        
        /*Instanciando a classe admDAO*/
        admDAO objadmdao = new admDAO();
        /*Passando o objeto objcadusuariodto por parametro com seus respectivos dados*/
        objadmdao.deletarUsuario(objcadusuariodto);
        
    }
    
}
