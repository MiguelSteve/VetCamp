
package view;

import dao.atnDAO;
import dao.conexaoDAO;
import dao.vetDAO;
import dto.atn_agendaDTO;
import dto.vet_atendimentoDTO;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.LoginVIEW;


public class vet_telaprincipalVIEW extends javax.swing.JFrame {

    
    public vet_telaprincipalVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        panelFicha.setVisible(false); /*Estou iniciando o painel de ficha com a configuração para ele não ser vísivel ao usuário*/
        listarAgenda(); /*Esta inicializando o método para listar a tabela agenda*/
    }

    Connection conn; /*A variavel conn é um objeto criado para trabalhar com a classe Connection*/
    PreparedStatement pstm; /*A variavel pstm é um objeto criado para trabalhar com a classe PreparedStatement*/
    ResultSet rs; /*A variavel rs é um objeto criado para trabalhar com a classe ResutlSet, que trará algum registro do Banco de Dados*/
    
    /*Criação da variavel do tipo int*/
    int set, resultado;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFicha = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabelIdade = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrescricao = new javax.swing.JTextArea();
        btnFinalizar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAtendimento = new javax.swing.JTable();
        btnFicha = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        jMConsulta = new javax.swing.JMenu();
        jmHistAnimais = new javax.swing.JMenuItem();
        jMSair = new javax.swing.JMenu();
        jmExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFicha.setBackground(new java.awt.Color(255, 255, 255));
        panelFicha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelFicha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelFicha.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 260, 30));

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNome.setText("Nome:");
        panelFicha.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        panelFicha.add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 30));

        jLabelIdade.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabelIdade.setText("Idade:");
        panelFicha.add(jLabelIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabelSexo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabelSexo.setText("Sexo:");
        panelFicha.add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));
        panelFicha.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, 30));
        panelFicha.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 260, 30));

        jLabelCategoria.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabelCategoria.setText("Categoria:");
        panelFicha.add(jLabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabelDescricao.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabelDescricao.setText("Descrição:");
        panelFicha.add(jLabelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        panelFicha.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, 30));

        txtPrescricao.setColumns(20);
        txtPrescricao.setRows(5);
        jScrollPane2.setViewportView(txtPrescricao);

        panelFicha.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 340, 190));

        btnFinalizar.setBackground(new java.awt.Color(153, 153, 153));
        btnFinalizar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        panelFicha.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 90, 35));

        btnLimpar.setBackground(new java.awt.Color(205, 133, 63));
        btnLimpar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        panelFicha.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 90, 35));

        btnCancelar.setBackground(new java.awt.Color(240, 72, 66));
        btnCancelar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelFicha.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 100, 35));

        getContentPane().add(panelFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 760, 300));

        tabelaAtendimento.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaAtendimento);
        if (tabelaAtendimento.getColumnModel().getColumnCount() > 0) {
            tabelaAtendimento.getColumnModel().getColumn(0).setResizable(false);
            tabelaAtendimento.getColumnModel().getColumn(0).setPreferredWidth(2);
            tabelaAtendimento.getColumnModel().getColumn(1).setResizable(false);
            tabelaAtendimento.getColumnModel().getColumn(2).setResizable(false);
            tabelaAtendimento.getColumnModel().getColumn(3).setResizable(false);
            tabelaAtendimento.getColumnModel().getColumn(4).setResizable(false);
            tabelaAtendimento.getColumnModel().getColumn(5).setResizable(false);
            tabelaAtendimento.getColumnModel().getColumn(6).setResizable(false);
            tabelaAtendimento.getColumnModel().getColumn(7).setResizable(false);
            tabelaAtendimento.getColumnModel().getColumn(8).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 940, 170));

        btnFicha.setBackground(new java.awt.Color(0, 206, 209));
        btnFicha.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnFicha.setForeground(new java.awt.Color(255, 255, 255));
        btnFicha.setText("Abrir Ficha");
        btnFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 150, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/template66.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 570));

        MenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        MenuPrincipal.setPreferredSize(new java.awt.Dimension(500, 30));

        jMConsulta.setText("Consulta");
        jMConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMConsulta.setPreferredSize(new java.awt.Dimension(100, 19));

        jmHistAnimais.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jmHistAnimais.setText("Histórico de Animais");
        jmHistAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmHistAnimaisActionPerformed(evt);
            }
        });
        jMConsulta.add(jmHistAnimais);

        MenuPrincipal.add(jMConsulta);

        jMSair.setText("Sair");
        jMSair.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMSair.setPreferredSize(new java.awt.Dimension(100, 19));
        jMSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSairActionPerformed(evt);
            }
        });

        jmExit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jmExit.setText("Fechar o Sistema");
        jmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmExitActionPerformed(evt);
            }
        });
        jMSair.add(jmExit);

        MenuPrincipal.add(jMSair);

        setJMenuBar(MenuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmHistAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmHistAnimaisActionPerformed
        /*Estou instanciando a classe vet_consultaFichaVIEW */
        vet_consultaFichaVIEW objconsulta = new vet_consultaFichaVIEW();
        /*Estou chamando a tela através do objeto*/
        objconsulta.setVisible(true);
    }//GEN-LAST:event_jmHistAnimaisActionPerformed

    private void jmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmExitActionPerformed
        /*Estou instanciando a classe LoginVIEW */
        LoginVIEW obj = new LoginVIEW();
        /*Estou chamando a tela através do objeto*/
        obj.setVisible(true);
        /*E estou fechando a janela, após a operação*/
        dispose();
    }//GEN-LAST:event_jmExitActionPerformed

    private void jMSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSairActionPerformed

    }//GEN-LAST:event_jMSairActionPerformed

    private void btnFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaActionPerformed
        
        /*estou mostrando a tela ao usuario*/
        panelFicha.setVisible(true);

        /*Variavel setar, do tipo int, para armazenar a linha que o usuário selecionou*/
        int setar = tabelaAtendimento.getSelectedRow();
        /*Estou convertendo o valor dos campo para Inteiro*/
        int cod = Integer.parseInt(tabelaAtendimento.getModel().getValueAt(setar, 4).toString());
        set = Integer.parseInt(tabelaAtendimento.getModel().getValueAt(setar, 0).toString());
        
        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "Select nome_animal, idade_animal, sexo_animal, categoria_animal, descricao_animal from atn_animal where id_animal = ?";
        conn = new conexaoDAO().conectaBD();

        try {
            
            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através da variavel cod, para os respectivos valores(?)*/
            pstm.setInt(1, cod);
            /*aqui estou passando os valores através da variavel cod, para os respectivos valores(?)*/
            rs = pstm.executeQuery();
            
             /*Entro no if após execução, e caso for falso ele mostra um JOptionPane e se não for ele entra no else e passa os resultados atraves do objeto rs para as minhas variaveis*/
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Problema com o carregamento de dados!");
            } else {

                String nome, idade, sexo, categoria, descricao;

                nome = rs.getString("nome_animal");
                idade = rs.getString("idade_animal");
                sexo = rs.getString("sexo_animal");
                categoria = rs.getString("categoria_animal");
                descricao = rs.getString("descricao_animal");

                txtNome.setText(nome.trim());
                txtIdade.setText(idade.trim());
                txtSexo.setText(sexo.trim());
                txtCategoria.setText(categoria.trim());
                txtDescricao.setText(descricao.trim());
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "vet_telaprincipal: " + e);
        }


    }//GEN-LAST:event_btnFichaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        /*Chamada de métodos*/
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        /*Chamada de métodos*/
        limparCampos();
        /*E exibi o painel ao usuario*/
        panelFicha.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        /*Chamada de métodos e JOptionPane para confirmação de decisão*/
        resultado = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resultado == JOptionPane.YES_OPTION){
            /*Criação das variaveis do tipo String*/
            String nome, idade, sexo, categoria, descricao, prescricao;

            nome = txtNome.getText();
            idade = txtIdade.getText();
            sexo = txtSexo.getText();
            categoria = txtCategoria.getText();
            descricao = txtDescricao.getText();
            prescricao = txtPrescricao.getText();

            /*Estou instanciando a classe vet_atendimentoDTO*/
            vet_atendimentoDTO objatendimento = new vet_atendimentoDTO();
            /*Estou passando os valores armazanedos nas variaveis locais, para o objatendimento através dos setters*/
            objatendimento.setNome(nome);
            objatendimento.setIdade(idade);
            objatendimento.setSexo(sexo);
            objatendimento.setCategoria(categoria);
            objatendimento.setDescricao(descricao);
            objatendimento.setPrescricao(prescricao);

            /*Estou instanciando a classe vetDAO*/
            vetDAO objvet = new vetDAO();
            /*Passando o objeto objatendimento por parametro com seus respectivos dados*/
            objvet.cadFicha(objatendimento);

            /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
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

            /*Chamada dos métodos e escondendo o painel Ficha do usuario*/
            listarAgenda();

            panelFicha.setVisible(false);
        
        }else if(resultado == JOptionPane.NO_OPTION){
            limparCampos();
        }
        

    }//GEN-LAST:event_btnFinalizarActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vet_telaprincipalVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFicha;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JMenu jMConsulta;
    private javax.swing.JMenu jMSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmExit;
    private javax.swing.JMenuItem jmHistAnimais;
    private javax.swing.JPanel panelFicha;
    private javax.swing.JTable tabelaAtendimento;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtPrescricao;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables

    /*Método privado do tipo void para atualizar a tabela Atendimento*/
    private void listarAgenda() {

        try {
            
            /*Estou instanciando a classe atnDAO*/
            atnDAO objatn = new atnDAO();
            
             /*Configurando a tabela atendimento para receber os dados*/
            DefaultTableModel model = (DefaultTableModel) tabelaAtendimento.getModel();
            model.setNumRows(0);
            
            /*Estou criando uma arraylist para pegar informações do método pesquisarAgenda e adicionar a listag */
            ArrayList<atn_agendaDTO> listag = objatn.pesquisarAgenda();
            
            /*Adicionei o for para entrar no laço enquanto tiver registros*/
            for (int num = 0; num < listag.size(); num++) {
                
                /*Estou adicionando os registros na tabelaAtendimento*/
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
            JOptionPane.showMessageDialog(null, "vet_telaprincipal - listarAgenda: " + erro);
        }
    }

    /*Método privado, do tipo void para limpar campos*/
    private void limparCampos() {

        txtNome.setText("");
        txtIdade.setText("");
        txtSexo.setText("");
        txtCategoria.setText("");
        txtDescricao.setText("");
        txtPrescricao.setText("");
    }

}
