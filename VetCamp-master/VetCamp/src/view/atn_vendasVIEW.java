
package view;

import dao.conexaoDAO;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class atn_vendasVIEW extends javax.swing.JFrame {

   
    public atn_vendasVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
        txtCod.setVisible(false);
    }

    Connection conn;
    /*A variavel conn é um objeto criado para trabalhar com a classe Connection*/
    PreparedStatement pstm;
    /*A variavel pstm é um objeto criado para trabalhar com a classe PreparedStatement*/
    ResultSet rs;
    /*A variavel rs é um objeto criado para trabalhar com a classe ResutlSet, que trará algum registro do Banco de Dados*/
    
    /*Criação das variaveis do tipo String e Int*/
    int code, cod, qntdS;
    String vt, dt, total, nome;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_dados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        spnQntd = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        txtData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelPagamento = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        jLabelTroco = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtPagamento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtExtrato = new javax.swing.JTextArea();
        btnRealizarVenda = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_dados.setBackground(new java.awt.Color(255, 255, 255));
        Panel_dados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Panel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Nome Prod.");
        Panel_dados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        Panel_dados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 30));

        txtCod.setEditable(false);
        Panel_dados.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 50, 30));

        spnQntd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQntdStateChanged(evt);
            }
        });
        Panel_dados.add(spnQntd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 50, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Qntd:");
        Panel_dados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Preço:");
        Panel_dados.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        txtPreco.setEditable(false);
        Panel_dados.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Valor:");
        Panel_dados.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, 20));

        txtValor.setEditable(false);
        Panel_dados.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 80, 30));

        btnAdicionar.setBackground(new java.awt.Color(50, 205, 50));
        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        Panel_dados.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 110, 40));
        Panel_dados.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Data:");
        Panel_dados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 20));

        getContentPane().add(Panel_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 170));

        jLabelPagamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPagamento.setText("PAGAMENTO");
        getContentPane().add(jLabelPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, 20));

        txtTroco.setEditable(false);
        getContentPane().add(txtTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 190, 30));

        tabelaVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Prod.", "Quantia", "Preço", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaVenda);
        if (tabelaVenda.getColumnModel().getColumnCount() > 0) {
            tabelaVenda.getColumnModel().getColumn(0).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(1).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(2).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 610, 350));

        jLabelTroco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTroco.setText("TROCO");
        getContentPane().add(jLabelTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, 20));

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTotal.setText("TOTAL");
        getContentPane().add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, 20));

        txtTotal.setEditable(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 190, 30));
        getContentPane().add(txtPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 190, 30));

        txtExtrato.setEditable(false);
        txtExtrato.setColumns(20);
        txtExtrato.setRows(5);
        txtExtrato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jScrollPane2.setViewportView(txtExtrato);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 290, 250));

        btnRealizarVenda.setBackground(new java.awt.Color(0, 206, 209));
        btnRealizarVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRealizarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarVenda.setText("Realizar Venda");
        btnRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRealizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 190, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*Método privado do tipo void, criado para coletar informações sobre o produto selecionado pelo usuario*/
    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        /*Toda vez que o usuario pressionar a tecla enter, ele entra no if*/
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            /*Estou coletando o valor inserido pelo usuário*/
           
            nome = txtNome.getText();
            
            /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
            String sql = "select id_produto, preco_venda from adm_produto where nome_produto = ?";
            conn = new conexaoDAO().conectaBD();

            try {
                
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, nome);
                rs = pstm.executeQuery();

                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                } else {
                    /*Se houver o registro, ele armazena os resultados nas variaveis respectivas*/
                    String preco;
                    
                    
                    preco = rs.getString("preco_venda");
                    code = rs.getInt("id_produto");
                    
                    txtPreco.setText(preco.trim());
                    txtCod.setText(String.valueOf(code));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "atn_vendasView - CodeKeyPressed: " + e);
            }
        }

    }//GEN-LAST:event_txtNomeKeyPressed
    
    private void spnQntdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnQntdStateChanged
        /*Estou pegando os valores da spinner(spnQntds) e o campo txtPreco, e multiplicando seus valores, e setando o resultado no campo txtValor*/
        int qnt = Integer.parseInt(spnQntd.getValue().toString());
        double preco = Double.parseDouble(txtPreco.getText());

        double total = qnt * preco;

        txtValor.setText(String.valueOf(total));
    }//GEN-LAST:event_spnQntdStateChanged
    
    /*Método privado do tipo void, para calcular o troco*/
    private void Troco() {
        /*Estou pegando os valores do campo txtTotal e o campo txtPagamento, e subtraindo seus valores, e setando no campo txtTroco*/
        double valor = Double.parseDouble(txtTotal.getText());
        double pagamento = Double.parseDouble(txtPagamento.getText());

        double totalv = pagamento - valor;

        txtTroco.setText(String.valueOf(totalv));

    }


    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        /*Configurando a tabela vendas para receber os dados*/
        DefaultTableModel model = new DefaultTableModel();

        model = (DefaultTableModel) tabelaVenda.getModel();
        /*Estou adicionando os registros na tabelaVenda*/
        model.addRow(new Object[]{
            //txtCod.getText(),
            txtNome.getText(),
            spnQntd.getValue().toString(),
            txtPreco.getText(),
            txtValor.getText()

        });
        
        /*Estou inicializando minha variavel do tipo double com o valor = 0*/
        double soma = 0;
         /*E a cada vez que um registro é adicionado a tabelaVendas, ele pega o valor da coluna 4, referente ao valor e soma*/
        /*Ele faz a soma enquanto haver produtos sendo adicionado a tabela*/
         for (int i = 0; i < tabelaVenda.getRowCount(); i++) {
            soma = soma + Double.parseDouble(tabelaVenda.getValueAt(i, 3).toString());
        }

        txtTotal.setText(Double.toString(soma));
        /*Criando variaveis para armazenar os valores do campo txtData, txtNome e spnQntd, para inserir no banco de dados, através da String sql*/
        String dataSaida, prodSaida, quantSaida;
        dataSaida = txtData.getText();
        prodSaida = txtNome.getText();
        quantSaida = String.valueOf(spnQntd.getValue().toString());
        
        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sqlSaida = "Insert into adm_estsaida(data_est, prod_est, quant_est) values (?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sqlSaida);
            pstm.setString(1, dataSaida);
            pstm.setString(2, prodSaida);
            pstm.setString(3, quantSaida);

            pstm.execute();
            pstm.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "atn_vendasVIEW: " + e);
        }
        
        /*Estou trazendo do banco de dados através do result set, as informações referentes ao produto*/
        String sqls = "Select quantidade_produto from adm_produto where id_produto = ?";
        
        conn = new conexaoDAO().conectaBD();
        code = Integer.parseInt(txtCod.getText());
        
        try {
            pstm = conn.prepareStatement(sqls);
            pstm.setInt(1, code);
            rs = pstm.executeQuery();
            
            /*Se houver registro, ele entra no if*/
            if (rs.next() == true) {
                
                /*Conversões dos valores e subtração para poder fazer o update no estoque de produtos*/
                /*Ou seja, toda vez que o usuario realizar uma venda, ele pega a quantidade do produto vendido e a quantidade no estoque, faz a subtração e logo após ele faz o update, atualizando os dados no estoque*/
                cod = Integer.parseInt(rs.getString("quantidade_produto"));
                qntdS = Integer.parseInt(spnQntd.getValue().toString());

                total = String.valueOf(cod - qntdS);

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "atn_vendasVIEW - : " + e);
        }

        String sql_ = "update adm_produto set quantidade_produto = ? where id_produto = ?";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql_);
            pstm.setString(1, total);
            pstm.setInt(2, code);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "atn_vendas - Produto: " + e);
        }
        
        /*Criação das variaveis do tipo string*/
        String nomevenda, valorvenda, quantvenda, datavenda;

        nomevenda = txtNome.getText();

        valorvenda = txtValor.getText();
        quantvenda = String.valueOf(spnQntd.getValue().toString());
        datavenda = txtData.getText();

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sqladd = "insert into atn_vendas (valor_venda, prod_venda, quant_venda, data_venda ) values (?,?,?,?)";
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sqladd);
            /*aqui estou passando os valores através dos gets das variaveis valorvenda, nomevenda, quantvenda, datavenda para os respectivos valores(?)*/
            pstm.setString(1, valorvenda);
            pstm.setString(2, nomevenda);
            pstm.setString(3, quantvenda);
            pstm.setString(4, datavenda);

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "atn_vendas - Vendas: " + e);
        }
        
        /*Limpar os campos*/
        txtNome.setText("");
        txtCod.setText("");
        txtPreco.setText("");
        txtValor.setText("");
        txtData.setText("");
        txtNome.requestFocus();
    }//GEN-LAST:event_btnAdicionarActionPerformed
    
    /*Metodo publico do tipo void, para realizar o extrato da venda*/
    public void Extrato() {

        String total = txtTotal.getText();
        String pag = txtPagamento.getText();
        String troco = txtTroco.getText();

        DefaultTableModel model = new DefaultTableModel();

        model = (DefaultTableModel) tabelaVenda.getModel();

        txtExtrato.setText(txtExtrato.getText() + "*********************************************\n");
        txtExtrato.setText(txtExtrato.getText() + "*                     extratro               \n");
        txtExtrato.setText(txtExtrato.getText() + "*********************************************\n");
        txtExtrato.setText(txtExtrato.getText() + "Produto" + "\t" + "Preço" + "\t" + "Valor" + "\n");

        for (int i = 0; i < model.getRowCount(); i++) {

            String nomep = (String) model.getValueAt(i, 0);
            String price = (String) model.getValueAt(i, 2);
            String valor = (String) model.getValueAt(i, 3);

            txtExtrato.setText(txtExtrato.getText() + nomep + "\t" + price + "\t" + valor + "\n");
        }

        txtExtrato.setText(txtExtrato.getText() + "\n");
        txtExtrato.setText(txtExtrato.getText() + "\n");

        txtExtrato.setText(txtExtrato.getText() + "\t" + "\t" + "Subtotal:" + total + "\n");
        txtExtrato.setText(txtExtrato.getText() + "\t" + "\t" + "Pagamento:" + pag + "\n");
        txtExtrato.setText(txtExtrato.getText() + "\t" + "\t" + "Troco:" + troco + "\n");

        txtExtrato.setText(txtExtrato.getText() + "*********************************************\n");
        txtExtrato.setText(txtExtrato.getText() + "*                     Volte Novamente!       \n");
        txtExtrato.setText(txtExtrato.getText() + "*********************************************\n");
    }

    private void btnRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVendaActionPerformed
        /*Chamada de metodos*/
        Troco();
        Extrato();
        
        /*variaveis para coletar os dados dos campos txtTotal, txtData*/
        vt = txtTotal.getText();
        dt = txtData.getText();
        
        /*Chamada de metodos*/
        controleCaixa();


    }//GEN-LAST:event_btnRealizarVendaActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atn_vendasVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_dados;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRealizarVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPagamento;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelTroco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnQntd;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextArea txtExtrato;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPagamento;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    /*É um metodo privado do tipo void, para inserir os dados da venda, na tabela adm_control*/
    private void controleCaixa() {

        /*Criação de variaveis do tipo string para pegar o valor da variavel global user*/
        String usuario;
        
        /*Instanciando a classe LoginVIEW*/
        LoginVIEW objlogin = new LoginVIEW();

        
        usuario = objlogin.user;
        
        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "Insert into adm_control(data_control, tipo_control, descricao_control, valor_control, funcionario_control) values(?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {
            
            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sql);
            
            /*aqui estou passando os valores através das variaveis dt, vt, usuario e dados como entrada e vendas, para os respectivos valores(?)*/
            pstm.setString(1, dt);
            pstm.setString(2, "Entrada");
            pstm.setString(3, "Vendas");
            pstm.setString(4, vt);
            pstm.setString(5, usuario);

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "atn_vendasVIEW - controleCaixa: " + e);
        }

    }

}
