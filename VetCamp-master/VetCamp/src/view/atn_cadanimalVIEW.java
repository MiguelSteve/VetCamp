
package view;

import dao.admDAO;
import dao.atnDAO;
import dto.adm_cadusuarioDTO;
import dto.atn_cadanimalDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class atn_cadanimalVIEW extends javax.swing.JFrame {

   
    public atn_cadanimalVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        txtId.setVisible(false); /*Estou iniciando o campo txtId com a configuração para ele não ser vísivel ao usuário*/
        dadosComboBoxcliente(); /*Esta inicializando o método para listar os dados na comboboxcliente*/
        listarAnimais(); /*Esta inicializando o método para listar os Animais*/

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
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxCliente = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAnimal = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btncarregarCampo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Animais");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_dados.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jPanel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Proprietário:");
        jPanel_dados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nome:");
        jPanel_dados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Idade:");
        jPanel_dados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Categoria:");
        jPanel_dados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Descrição:");
        jPanel_dados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        jPanel_dados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, 30));
        jPanel_dados.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, 30));
        jPanel_dados.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 250, 30));
        jPanel_dados.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Sexo:");
        jPanel_dados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        cbxCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cbxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClienteActionPerformed(evt);
            }
        });
        jPanel_dados.add(cbxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 30));

        txtId.setEditable(false);
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_dados.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 40, 30));
        jPanel_dados.add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 30));

        getContentPane().add(jPanel_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 390));

        tabelaAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROPRIETÁRIO", "NOME", "IDADE", "SEXO", "CATEGORIA", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaAnimal);
        if (tabelaAnimal.getColumnModel().getColumnCount() > 0) {
            tabelaAnimal.getColumnModel().getColumn(0).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabelaAnimal.getColumnModel().getColumn(1).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(2).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(3).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(4).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(5).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 580, 430));

        btnCadastrar.setBackground(new java.awt.Color(50, 205, 50));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 80, 35));

        btnExcluir.setBackground(new java.awt.Color(240, 72, 66));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 90, 35));

        btnAlterar.setBackground(new java.awt.Color(30, 144, 255));
        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 90, 35));

        btncarregarCampo.setBackground(new java.awt.Color(0, 206, 209));
        btncarregarCampo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncarregarCampo.setForeground(new java.awt.Color(255, 255, 255));
        btncarregarCampo.setText("Carregar Campos");
        btncarregarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarregarCampoActionPerformed(evt);
            }
        });
        getContentPane().add(btncarregarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 160, 35));

        btnLimpar.setBackground(new java.awt.Color(205, 133, 63));
        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 80, 35));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            cadastrarAnimais();
            limparCampos();
            listarAnimais();
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
            listarAnimais();
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
            listarAnimais();
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        /*Chamada de métodos*/
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void cbxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClienteActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atn_cadanimalVIEW().setVisible(true);
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
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel_dados;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaAnimal;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables

    /*Estou criando um vetor do tipo inteiro para armazenar o Id_cliente que vem do banco de dados*/
    Vector<Integer> id_cliente = new Vector<Integer>();
    
    /*Método privado, do tipo void, para carregar dados da combobox*/
    private void dadosComboBoxcliente() {

        try {

            /*Estou instanciando a classe atnDAO*/
            atnDAO objatndao = new atnDAO();
            
            /*O ResultSet está esperando algum dado da classe listarCliente*/
            ResultSet rs = objatndao.listarCliente();
            
            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adicione na combobox*/
            while (rs.next()) {

                id_cliente.addElement(rs.getInt(1));
                cbxCliente.addItem(rs.getString(2));

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "atn_cadanimalVIEW - dadosComboBoxcliente: " + erro);
        }

    }
    
    /*Método privado, do tipo void, para cadastrar animais*/
    private void cadastrarAnimais() {
        
        /*Criação das variaveis do tipo String e Int*/
        String nome, idade, sexo, descricao, categoria;
        int fk_cliente;

        nome = txtNome.getText();
        idade = txtIdade.getText();
        sexo = txtSexo.getText();
        descricao = txtDescricao.getText();
        categoria = txtCategoria.getText();
        fk_cliente = id_cliente.get(cbxCliente.getSelectedIndex() - 1);

        /*Estou instanciando a classe atn_cadanimalDTO*/
        atn_cadanimalDTO objcadanimaldto = new atn_cadanimalDTO();
        /*Estou passando os valores armazanedos nas variaveis locais, para o objcadanimaldto através dos setters*/
        objcadanimaldto.setNome(nome);
        objcadanimaldto.setIdade(idade);
        objcadanimaldto.setSexo(sexo);
        objcadanimaldto.setDescricao(descricao);
        objcadanimaldto.setFk_cliente(fk_cliente);
        objcadanimaldto.setCategoria(categoria);

        /*Estou instanciando a classe atnDAO*/
        atnDAO objatndao = new atnDAO();
        /*Passando o objeto objcadanimaldto por parametro com seus respectivos dados*/
        objatndao.cadAnimalDAO(objcadanimaldto);

    }
    
    /*Método privado, do tipo void para limpar campos*/
    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtIdade.setText("");
        txtCategoria.setText("");
        txtSexo.setText("");
        txtDescricao.setText("");
        txtCategoria.setText("");
        cbxCliente.setSelectedIndex(0);

    }

    /*Método privado do tipo void para listar animais*/
    private void listarAnimais() {

        try {
            
            /*Estou instanciando a classe atnDAO*/
            atnDAO objatndao = new atnDAO();

            /*Configurando a tabela Animal para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaAnimal.getModel();
            model.setNumRows(0);
            
            /*Estou criando uma arraylist para pegar informações do método pesquisarAnimais e adicionar a listap */
            ArrayList<atn_cadanimalDTO> listaa = objatndao.pesquisarAnimais();
            
            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < listaa.size(); num++) {

                /*Estou adicionando os registros na tabelaAnimal*/
                model.addRow(new Object[]{
                    listaa.get(num).getId_animal(),
                    listaa.get(num).getFk_cliente(),
                    listaa.get(num).getNome(),
                    listaa.get(num).getIdade(),
                    listaa.get(num).getSexo(),
                    listaa.get(num).getCategoria(),
                    listaa.get(num).getDescricao()
                   

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "atn_cadanimalVIEW - listarAnimais: " + erro);
        }
    }
    
    /*Metodo privado do tipo void para alterar informações dos dados do animal*/
    private void alterarDados() {

        /*Criação das variaveis do tipo String e Int, para coletar os dados do campos*/
        String nome_animal, idade_animal, sexo_animal, descricao_animal, categoria_animal;
        int fk_cliente, id_animal;

        id_animal = Integer.parseInt(txtId.getText());
        nome_animal = txtNome.getText();
        idade_animal = txtIdade.getText();
        sexo_animal = txtSexo.getText();
        descricao_animal = txtDescricao.getText();
        categoria_animal = txtCategoria.getText();
        fk_cliente = id_cliente.get(cbxCliente.getSelectedIndex() - 1);

        /*Instanciando a classe atn_cadanimalDTO*/
        atn_cadanimalDTO objcadanimaldto = new atn_cadanimalDTO();
        /*Estou passando os valores das variaveis, e passando para objcadanimaldto através dos setters*/
        objcadanimaldto.setId_animal(id_animal);
        objcadanimaldto.setNome(nome_animal);
        objcadanimaldto.setIdade(idade_animal);
        objcadanimaldto.setSexo(sexo_animal);
        objcadanimaldto.setDescricao(descricao_animal);
        objcadanimaldto.setFk_cliente(fk_cliente);
        objcadanimaldto.setCategoria(categoria_animal);

        /*Instanciando a classe atnDAO*/
        atnDAO objatndao = new atnDAO();
        /*Passando o objeto objcadanimaldto por parametro com seus respectivos dados*/
        objatndao.alterarAnimal(objcadanimaldto);
    }

    /*Método privado do tipo void, para carregar os valores que estão na tabela para os respectivos campos */
    private void carregarCampos() {
        
        /*Variavel setar, do tipo int, para armazenar a linha que o usuário selecionou*/
        int setar = tabelaAnimal.getSelectedRow();

        txtId.setText(tabelaAnimal.getModel().getValueAt(setar, 0).toString());
        String cliente = (tabelaAnimal.getModel().getValueAt(setar, 1).toString());
        cbxCliente.setSelectedIndex(Integer.parseInt(cliente));
        txtNome.setText(tabelaAnimal.getModel().getValueAt(setar, 2).toString());
        txtIdade.setText(tabelaAnimal.getModel().getValueAt(setar, 3).toString());
        txtSexo.setText(tabelaAnimal.getModel().getValueAt(setar, 4).toString());
        txtCategoria.setText(tabelaAnimal.getModel().getValueAt(setar, 5).toString());
        txtDescricao.setText(tabelaAnimal.getModel().getValueAt(setar, 6).toString());

    }

    /*Método privado para deletar os registros do animal*/
    private void deletarDados() {
        
        /*Criação da variavel do tipo int para coletar informações do campo Id_animal*/
        int id_animal;
        
        /*Estou convertendo o valor do campo txtId(String) para Inteiro*/
        id_animal = Integer.parseInt(txtId.getText());
        
        /*Instanciando a classe atn_cadanimalDTO*/
        atn_cadanimalDTO objcadanimaldto = new atn_cadanimalDTO();
        /*Estou passando os valores armazanedos nas variaveis locais, para o objcadanimaldto através dos setters*/
        objcadanimaldto.setId_animal(id_animal);
        
        /*Instanciando a classe atnDAO*/
        atnDAO objatndao = new atnDAO();
        /*Passando o objeto objcadanimaldto por parametro com seus respectivos dados*/
        objatndao.deletarAnimal(objcadanimaldto);

    }

}
