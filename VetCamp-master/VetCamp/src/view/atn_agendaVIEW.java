package view;

import dao.atnDAO;
import dao.conexaoDAO;
import dto.atn_agendaDTO;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class atn_agendaVIEW extends javax.swing.JFrame {

    public atn_agendaVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        txtIDAgenda.setVisible(false); /*Estou iniciando o campo txtIDAgenda com a configuração para ele não ser vísivel ao usuário*/
        txtCod.setVisible(false); /*Estou iniciando o campo txtNome com a configuração para ele não ser vísivel ao usuário*/
        txtSexo.setEnabled(false); /*Estou iniciando o campo txtSexo com a configuração para ele não ser editável ao usuário*/
        txtCategoria.setEnabled(false); /*Estou iniciando o campo txtCategoria com a configuração para ele não ser editável ao usuário*/
        txtDescricao.setEnabled(false); /*Estou iniciando o campo txtIdDescrição com a configuração para ele não ser editável ao usuário*/
        listarAgenda(); /*Esta inicializando o método para listar o agendamento*/
    }
    
    String nome, cod, sexo, categoria, descricao;
    
    Connection conn; /*A variavel conn é um objeto criado para trabalhar com a classe Connection*/
    PreparedStatement pstm; /*A variavel pstm é um objeto criado para trabalhar com a classe PreparedStatement*/
    ResultSet rs; /*A variavel rs é um objeto criado para trabalhar com a classe ResutlSet, que trará algum registro do Banco de Dados*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_dados = new javax.swing.JPanel();
        txtVeterinario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtIDAgenda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btncarregarCampo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgenda = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_dados.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jPanel_dados.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVeterinarioActionPerformed(evt);
            }
        });
        txtVeterinario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVeterinarioKeyPressed(evt);
            }
        });
        jPanel_dados.add(txtVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 120, 30));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setText("Data:");
        jPanel_dados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel8.setText("Descrição:");
        jPanel_dados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel3.setText("Categoria:");
        jPanel_dados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));
        jPanel_dados.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 110, 30));
        jPanel_dados.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 30));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel4.setText("Nome");
        jPanel_dados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        jPanel_dados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 30));
        jPanel_dados.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 320, 30));
        jPanel_dados.add(txtIDAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 30, 30));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel9.setText("Veterinário:");
        jPanel_dados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel10.setText("Sexo:");
        jPanel_dados.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        jPanel_dados.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 120, 30));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel11.setText("Tipo:");
        jPanel_dados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setText("AGENDA");
        jPanel_dados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));
        jPanel_dados.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, 30));

        txtCod.setEnabled(false);
        jPanel_dados.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 30, 30));

        getContentPane().add(jPanel_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 800, 170));

        btnCadastrar.setBackground(new java.awt.Color(50, 205, 50));
        btnCadastrar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Agendar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 90, 30));

        btnAlterar.setBackground(new java.awt.Color(30, 144, 255));
        btnAlterar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 90, 30));

        btncarregarCampo.setBackground(new java.awt.Color(0, 206, 209));
        btncarregarCampo.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btncarregarCampo.setForeground(new java.awt.Color(255, 255, 255));
        btncarregarCampo.setText("Carregar");
        btncarregarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarregarCampoActionPerformed(evt);
            }
        });
        getContentPane().add(btncarregarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 90, 30));

        tabelaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATA", "TIPO", "VETERINÁRIO", "ID ANIMAL", "NOME", "SEXO", "CATEGORIA", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaAgenda);
        if (tabelaAgenda.getColumnModel().getColumnCount() > 0) {
            tabelaAgenda.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 920, 360));

        btnLimpar.setBackground(new java.awt.Color(205, 133, 63));
        btnLimpar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 90, 30));

        btnExcluir.setBackground(new java.awt.Color(240, 72, 66));
        btnExcluir.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 90, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int resultado;
    /*Método privado do tipo void, criado para coletar informações sobre o animal selecionado pelo usuario*/
    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        /*Toda vez que o usuario pressionar a tecla enter, ele entra no if*/
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            /*Estou convertendo o valor do campo txtID(String) para Inteiro*/
            nome = txtNome.getText();
            /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
            String sql = "Select id_animal, sexo_animal, categoria_animal, descricao_animal from atn_animal where nome_animal = ?";
            conn = new conexaoDAO().conectaBD();

            try {

                pstm = conn.prepareStatement(sql);
                pstm.setString(1, nome);
                rs = pstm.executeQuery();

                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(null, "Cadastro do animal não encontrado!");
                } else {


                    cod = rs.getString("id_animal");
                    sexo = rs.getString("sexo_animal");
                    categoria = rs.getString("categoria_animal");
                    descricao = rs.getString("descricao_animal");

                    txtCod.setText(cod.trim());
                    txtSexo.setText(sexo.trim());
                    txtCategoria.setText(categoria.trim());
                    txtDescricao.setText(descricao.trim());
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "atn_agendaVIEW - KeyPressed: " + e);
            }
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            Agendar();
            limparCampos();
            listarAgenda();
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
            AlterarAgenda();
            limparCampos();
            listarAgenda();
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    /*Método privado do tipo void, criado para coletar informações sobre o animal selecionado pelo usuario*/
    private void txtVeterinarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVeterinarioKeyPressed
        /*Toda vez que o usuario pressionar a tecla enter, ele entra no if*/
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
            String sql = "SELECT nome_usuario from adm_usuario where fk_cargo = 3 and nome_usuario like '" + txtVeterinario.getText() + "%'";
            conn = new conexaoDAO().conectaBD();

            try {
                pstm = conn.prepareStatement(sql);
                rs = pstm.executeQuery();

                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(null, "Veterinário não encontrado!");
                } else {

                    String vet;

                    txtVeterinario.setText("");
                    vet = rs.getString("nome_usuario");
                    txtVeterinario.setText(vet.trim());

                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "atn_agendaVIEW - KeyPressed: ");
            }
        }
    }//GEN-LAST:event_txtVeterinarioKeyPressed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        /*Chamada de métodos*/
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVeterinarioActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
        
        /*Estou coletando o valor do campo txtIDAgenda e convertendo para inteiro e passando para string sql, para excluir o registro*/
        int set = Integer.parseInt(txtIDAgenda.getText());
        String sql = "DELETE FROM atn_agenda where id_agenda = ?";

            conn = new conexaoDAO().conectaBD();

            try {

                /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
                pstm = conn.prepareStatement(sql);
                /*aqui estou passando os valores através da variavel set, cod para os respectivos valores(?)*/
                pstm.setInt(1, set);

                /*Aqui executo o comando sql*/
                pstm.execute();
                /*Aqui fecho a conexão*/
                pstm.close();

            } catch (Exception erro) {

                JOptionPane.showInternalMessageDialog(null, "vet_telaprincipal - deletarRegistro: " + erro);

            }
            
            limparCampos();
            listarAgenda();
            
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
        
            
    }//GEN-LAST:event_btnExcluirActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atn_agendaVIEW().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel_dados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAgenda;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIDAgenda;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtVeterinario;
    // End of variables declaration//GEN-END:variables

    /*Método privado, do tipo void, para cadastrar dados na agenda*/
    private void Agendar() {
        
        /*Criação das variaveis do tipo String*/
        String data, tipo, sexo, categoria, descricao, nome_animal, vet;
        int id_animal;

        data = txtData.getText();
        tipo = txtTipo.getText();
        sexo = txtSexo.getText();
        categoria = txtCategoria.getText();
        descricao = txtDescricao.getText();
        nome_animal = txtNome.getText();
        id_animal = Integer.parseInt(txtCod.getText());
        vet = txtVeterinario.getText();
        
        /*Estou instanciando a classe atn_agendaDTO*/
        atn_agendaDTO objagenda = new atn_agendaDTO();
        
        /*Estou passando os valores armazanedos nas variaveis locais, para o objagenda através dos setters*/
        objagenda.setData_agenda(data);
        objagenda.setTipo_agenda(tipo);
        objagenda.setSexo_agenda(sexo);
        objagenda.setCategoria_agenda(categoria);
        objagenda.setDescricao_agenda(descricao);
        objagenda.setNome_animal(nome_animal);
        objagenda.setFk_animal(id_animal);
        objagenda.setVeterinario(vet);
        
        /*Estou instanciando a classe atnDAO*/
        atnDAO objatn = new atnDAO();
        /*Passando o objeto objagenda por parametro com seus respectivos dados*/
        objatn.agendaDAO(objagenda);

    }
    
    /*Método privado, do tipo void para limpar campos*/
    private void limparCampos() {

        txtVeterinario.setEnabled(true);
        txtNome.setEnabled(true);

        txtData.setText("");
        txtVeterinario.setText("");
        txtNome.setText("");
        txtCod.setText("");
        txtIDAgenda.setText("");
        txtSexo.setText("");
        txtTipo.setText("");
        txtVeterinario.setText("");
        txtCategoria.setText("");
        txtDescricao.setText("");
        txtData.requestFocus();
    }
    
    /*Método privado do tipo void para atualizar a tabela Agenda*/
    private void listarAgenda() {

        try {
            
            /*Estou instanciando a classe atnDAO*/
            atnDAO objatn = new atnDAO();
            
            /*Configurando a tabela agenda para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaAgenda.getModel();
            model.setNumRows(0);
            
            /*Estou criando uma arraylist para pegar informações do método pesquisarAgenda e adicionar a listag */
            ArrayList<atn_agendaDTO> listag = objatn.pesquisarAgenda();
            
            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < listag.size(); num++) {
                
                /*Estou adicionando os registros na tabelaAgenda*/
                model.addRow(new Object[]{
                    listag.get(num).getId_agenda(),
                    listag.get(num).getData_agenda(),
                    listag.get(num).getTipo_agenda(),
                    listag.get(num).getVeterinario(),
                    listag.get(num).getFk_animal(),
                    listag.get(num).getNome_animal(),
                    listag.get(num).getSexo_agenda(),
                    listag.get(num).getCategoria_agenda(),
                    listag.get(num).getDescricao_agenda()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "atn_agendaVIEW - listarAgenda: " + erro);
        }
    }
    
    /*Método privado do tipo void, para carregar os valores que estão na tabela para os respectivos campos*/
    private void carregarCampos() {
        
        /*Variavel setar, do tipo int, para armazenar a linha que o usuário selecionou*/
        int setar = tabelaAgenda.getSelectedRow();

        txtVeterinario.setEnabled(false);
        txtNome.setEnabled(false);

        txtIDAgenda.setText(tabelaAgenda.getModel().getValueAt(setar, 0).toString());
        txtData.setText(tabelaAgenda.getModel().getValueAt(setar, 1).toString());
        txtTipo.setText(tabelaAgenda.getModel().getValueAt(setar, 2).toString());
        txtVeterinario.setText(tabelaAgenda.getModel().getValueAt(setar, 3).toString());
        txtCod.setText(tabelaAgenda.getModel().getValueAt(setar, 4).toString());
        txtNome.setText(tabelaAgenda.getModel().getValueAt(setar, 5).toString());
        txtSexo.setText(tabelaAgenda.getModel().getValueAt(setar, 6).toString());
        txtCategoria.setText(tabelaAgenda.getModel().getValueAt(setar, 7).toString());
        txtDescricao.setText(tabelaAgenda.getModel().getValueAt(setar, 8).toString());
    }
    
    /*Metodo privado do tipo void para alterar informações dos dados da Agenda*/
    private void AlterarAgenda() {
        
        /*Criação das variaveis do tipo String e Int, para coletar os dados do campos*/
        String data, tipo;
        int id_agenda;

        id_agenda = Integer.parseInt(txtIDAgenda.getText());
        data = txtData.getText();
        tipo = txtTipo.getText();
        
        /*Instanciando a classe atn_agendaDTO*/
        atn_agendaDTO objagenda = new atn_agendaDTO();
        
        /*Estou passando os valores das variaveis, e passando para objagenda através dos setters*/
        objagenda.setId_agenda(id_agenda);
        objagenda.setData_agenda(data);
        objagenda.setTipo_agenda(tipo);
        
        /*Instanciando a classe atnDAO*/
        atnDAO objatn = new atnDAO();
        /*Passando o objeto objagenda por parametro com seus respectivos dados*/
        objatn.alterarAgenda(objagenda);

    }

}
