package dao;

import dto.adm_cadfornecedorDTO;
import dto.adm_cadprodutoDTO;
import dto.adm_cadusuarioDTO;
import dto.adm_controlDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class admDAO {

    Connection conn;
    /*A variavel conn é um objeto criado para trabalhar com a classe Connection*/
    PreparedStatement pstm;
    /*A variavel pstm é um objeto criado para trabalhar com a classe PreparedStatement*/
    ResultSet rs;
    /*A variavel rs é um objeto criado para trabalhar com a classe ResutlSet, que trará algum registro do Banco de Dados*/

    /*O ArrayList é uma classe genérica que traz uma lista de informações do banco de dados*/
    /*lista, listaf, listap, listae, listaes, listac são objetos dos ArrayLists criados*/
    ArrayList<adm_cadusuarioDTO> lista = new ArrayList<>();
    ArrayList<adm_cadfornecedorDTO> listaf = new ArrayList<>();
    ArrayList<adm_cadprodutoDTO> listap = new ArrayList<>();
    ArrayList<adm_cadprodutoDTO> listae = new ArrayList<>();
    ArrayList<adm_cadprodutoDTO> listaes = new ArrayList<>();
    ArrayList<adm_controlDTO> listac = new ArrayList<>();

    /*É um metodo do tipo void, que espera alguns parâmetros da classe adm_cadusuarioDTO, para fazer a inserção de dados do usuario na tabela adm_usuario(database:vetcamp).*/
    public void cadusuarioDAO(adm_cadusuarioDTO objcadusuariodto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "insert into adm_usuario (nome_usuario, cpf_usuario, endereco_usuario, telefone_usuario, login_usuario, login_senha, fk_cargo) values (?,?,?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe adm_cadusuarioDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadusuariodto.getNome());
            pstm.setString(2, objcadusuariodto.getCpf());
            pstm.setString(3, objcadusuariodto.getEndereco());
            pstm.setString(4, objcadusuariodto.getTelefone());
            pstm.setString(5, objcadusuariodto.getUsuario());
            pstm.setString(6, objcadusuariodto.getSenha());
            pstm.setInt(7, objcadusuariodto.getFkcargo());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Cadastro concluído!");
            /*Se der certo, exibe JOptionPane para mostrar ao usuário que o cadastro foi conclúido*/

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "admDAO - cadusuarioDAO: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a insersão do registro de dados deu errado, e mostra qual o erro através da variavél erro*/
        }

    }

    /*É um método do tipo Resultset que traz a informações  referente aos cargos*/
    public ResultSet listarCargo() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT * FROM adm_cargo ORDER BY descricao;";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            return pstm.executeQuery();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "admDAO - listarCargo: " + erro.getMessage());
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que o carregamento das infromações através do ResultSet falhou, e mostra qual o erro através da variavél erro*/
            return null;

        }

    }

    /*É um método do tipo Arraylist. que traz uma lista de todos os registro referente a tabela adm_usuario*/
    public ArrayList<adm_cadusuarioDTO> pesquisarUsuario() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT * FROM adm_usuario";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();

            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adicione a lista.add*/
            while (rs.next()) {

                /*Instanciando a classe adm_cadusuarioDTO*/
                adm_cadusuarioDTO objcadusuariodto = new adm_cadusuarioDTO();
                /*Estou pegando as informações do banco, através do rs(ResultSet), e passando para minha classe adm_cadusuarioDTO através dos setters*/
                objcadusuariodto.setId_usuario(rs.getInt("id_usuario"));
                objcadusuariodto.setNome(rs.getString("nome_usuario"));
                objcadusuariodto.setCpf(rs.getString("cpf_usuario"));
                objcadusuariodto.setEndereco(rs.getString("endereco_usuario"));
                objcadusuariodto.setTelefone(rs.getString("telefone_usuario"));
                objcadusuariodto.setUsuario(rs.getString("login_usuario"));
                objcadusuariodto.setSenha(rs.getString("login_senha"));
                objcadusuariodto.setFkcargo(rs.getInt("fk_cargo"));

                lista.add(objcadusuariodto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "admDAO - pesquisarUsuario: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
        }

        return lista;
        /*Retornando a lista*/

    }

    /*É um método do tipo void, que espera alguns parâmetros da classe adm_cadusuarioDTO para que possa fazer a  alteração nos registro da tabela adm_usuario*/
    public void alterarUsuario(adm_cadusuarioDTO objcadusuariodto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "UPDATE adm_usuario SET nome_usuario = ?, cpf_usuario = ? , endereco_usuario = ?, telefone_usuario = ?, login_usuario = ?, login_senha = ?, fk_cargo = ? where id_usuario = ?";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe adm_cadusuarioDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadusuariodto.getNome());
            pstm.setString(2, objcadusuariodto.getCpf());
            pstm.setString(3, objcadusuariodto.getEndereco());
            pstm.setString(4, objcadusuariodto.getTelefone());
            pstm.setString(5, objcadusuariodto.getUsuario());
            pstm.setString(6, objcadusuariodto.getSenha());
            pstm.setInt(7, objcadusuariodto.getFkcargo());
            pstm.setInt(8, objcadusuariodto.getId_usuario());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Alteração concluída!");
            /*Se der certo, exibe JOptionPane para mostrar ao usuário que a alteração foi conclúida*/

        } catch (SQLException erro) {

            JOptionPane.showInternalMessageDialog(null, "admDAO - alterarUsuario: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a alteração do registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }

    /*É um método do tipo void, que espera alguns parâmetro da classe adm_cadusuarioDTO para que possa deletar um registro da tabela adm_usuario*/
    public void deletarUsuario(adm_cadusuarioDTO objcadusuariodto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "DELETE FROM adm_usuario where id_usuario = ?";

        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);

            /*aqui estou passando os valores através dos gets da classe adm_cadusuarioDTO, para os respectivos valores(?)*/
            pstm.setInt(1, objcadusuariodto.getId_usuario());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Estou fechando a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Registro deletado!"); /*Se der certo, exibe JOptionPane para mostrar ao usuário que o registro foi deletado com sucesso*/
            

        } catch (Exception erro) {

            JOptionPane.showInternalMessageDialog(null, "admDAO - deletarUsuario: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que deletar o registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }

    //-----
    /*É um metodo do tipo void, que espera alguns parâmetros da classe adm_cadfornecedorDTO para fazer a inserção de dados na tabela adm_fornecedor*/
    public void cadfornecedorDAO(adm_cadfornecedorDTO objcadfornecedordto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "insert into adm_fornecedor (nome_fornecedor, cnpj_fornecedor, endereco_fornecedor, telefone_fornecedor, email_fornecedor) values (?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);

            /*aqui estou passando os valores através dos gets da classe adm_cadfornecedorDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadfornecedordto.getNome());
            pstm.setString(2, objcadfornecedordto.getCnpj());
            pstm.setString(3, objcadfornecedordto.getEndereco());
            pstm.setString(4, objcadfornecedordto.getTelefone());
            pstm.setString(5, objcadfornecedordto.getEmail());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Cadastro concluído!");
            /*Se der certo, exibe JOptionPane para mostrar ao usuário que o cadastro foi conclúido*/

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "admDAO - cadfornecedorDAO: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a insersão do registro de dados deu errado, e mostra qual o erro através da variavél erro*/
        }

    }

    /*É um método do tipo Arraylist. que traz uma lista de todos os registro referente a tabela adm_fornecedor*/
    public ArrayList<adm_cadfornecedorDTO> pesquisarFornecedor() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT * FROM adm_fornecedor";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();

            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adiciona a listaf.add*/
            while (rs.next()) {

                /*Instanciando a classe adm_cadfornecedorDTO*/
                adm_cadfornecedorDTO objcadfornecedordto = new adm_cadfornecedorDTO();

                /*Estou pegando as informações do banco, através do rs(ResultSet), e passando para minha classe adm_cadfornecedorDTO através dos setters*/
                objcadfornecedordto.setId_fornecedor(rs.getInt("id_fornecedor"));
                objcadfornecedordto.setNome(rs.getString("nome_fornecedor"));
                objcadfornecedordto.setCnpj(rs.getString("cnpj_fornecedor"));
                objcadfornecedordto.setEndereco(rs.getString("endereco_fornecedor"));
                objcadfornecedordto.setTelefone(rs.getString("telefone_fornecedor"));
                objcadfornecedordto.setEmail(rs.getString("email_fornecedor"));

                listaf.add(objcadfornecedordto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "admDAO - pesquisarFornecedor: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
        }

        return listaf;
        /*Retornando a lista*/

    }

    /*É um método do tipo void, que espera alguns parâmetros da classe adm_cadfornecedorDTO para que possa fazer a  alteração nos registro da tabela adm_fornecedor*/
    public void alterarFornecedor(adm_cadfornecedorDTO objcadfonecedordto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "UPDATE adm_fornecedor SET nome_fornecedor = ?, cnpj_fornecedor = ? , endereco_fornecedor = ?, telefone_fornecedor = ?, email_fornecedor = ? where id_fornecedor = ?";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);

            /*aqui estou passando os valores através dos gets da classe adm_cadfornecedorDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadfonecedordto.getNome());
            pstm.setString(2, objcadfonecedordto.getCnpj());
            pstm.setString(3, objcadfonecedordto.getEndereco());
            pstm.setString(4, objcadfonecedordto.getTelefone());
            pstm.setString(5, objcadfonecedordto.getEmail());
            pstm.setInt(6, objcadfonecedordto.getId_fornecedor());

            /*Aqui executa o comando sql*/
            pstm.execute();
            /*Fecha a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Ateração concluída!");
            /*Se der certo, exibe JOptionPane para mostrar ao usuário que a alteração foi conclúida*/

        } catch (SQLException erro) {

            JOptionPane.showInternalMessageDialog(null, "admDAO - alterarFornecedor: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a alteração do registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }

    /*É um método do tipo void, que espera alguns parâmetro da classe adm_cadfornecedorDTO para que possa deletar um registro da tabela adm_fornecedor*/
    public void deletarFornecedor(adm_cadfornecedorDTO objcadfornecedordto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "DELETE FROM adm_fornecedor where id_fornecedor = ?";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);

            /*aqui estou passando os valores através dos gets da classe adm_cadfornecedorDTO, para os respectivos valores(?)*/
            pstm.setInt(1, objcadfornecedordto.getId_fornecedor());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Registro deletado!");
            /*Se der certo, exibe JOptionPane para mostrar ao usuário que o registro foi deletado com sucesso*/

        } catch (Exception erro) {

            JOptionPane.showInternalMessageDialog(null, "admDAO - deletarFornecedor: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que deletar o registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }

    //-----
    /*É um metodo do tipo void, que espera alguns parâmetros da classe adm_cadprodutoDTO, para fazer a inserção de dados do produto na tabela adm_produto(database:vetcamp).*/
    public void cadprodutoDAO(adm_cadprodutoDTO objcadprodutodto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "insert into adm_produto (nome_produto, quantidade_produto, validade_produto, preco_unitario, preco_venda, fk_fornecedor) values (?,?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        
        try {

            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sql);

            /*aqui estou passando os valores através dos gets da classe adm_cadprodutoDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadprodutodto.getNome_produto());
            pstm.setString(2, objcadprodutodto.getQuantidade_produto());
            pstm.setString(3, objcadprodutodto.getValidade_produto());
            pstm.setString(4, objcadprodutodto.getPreco_unitario());
            pstm.setString(5, objcadprodutodto.getPreco_venda());
            pstm.setInt(6, objcadprodutodto.getFk_fornecedor());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Cadastro concluído!");
            /*Se der certo, exibe JOptionPane para mostrar ao usuário que o cadastro foi conclúido*/

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "admDAO - cadprodutoDAO: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a insersão do registro de dados deu errado, e mostra qual o erro através da variavél erro*/
        }

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sqle = " insert into adm_est(data_est, produto_est, quantidade) values (?,?,?)";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sqle);

            /*aqui estou passando os valores através dos gets da classe adm_cadprodutoDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadprodutodto.getData());
            pstm.setString(2, objcadprodutodto.getNome_produto());
            pstm.setString(3, objcadprodutodto.getQuantidade_produto());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "admDAO - cadprodutoDAO: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a insersão do registro de dados falhou, e mostra qual o erro através da variavél erro*/
        }
    }

    /*É um método do tipo Resultset que traz a informações  referente aos nomes dos fornecedores*/
    public ResultSet listarFornecedor() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT id_fornecedor, nome_fornecedor FROM adm_fornecedor;";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            return pstm.executeQuery();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "admDAO - listarFornecedor: " + erro.getMessage());
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que o carregamento das infromações através do ResultSet falhou, e mostra qual o erro através da variavél erro*/
            return null;

        }

    }

    /*É um método do tipo Arraylist. que traz uma lista de todos os registro referente a tabela adm_produto*/
    public ArrayList<adm_cadprodutoDTO> pesquisarProduto() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT * FROM adm_produto";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();

            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adicione a listap.add*/
            while (rs.next()) {

                /*Instanciando a classe adm_cadprodutoDTO*/
                adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
                /*Estou pegando as informações do banco, através do rs(ResultSet), e passando para minha classe adm_cadprodutoDTO através dos setters*/
                objcadprodutodto.setId_produto(rs.getInt("id_produto"));
                objcadprodutodto.setNome_produto(rs.getString("nome_produto"));
                objcadprodutodto.setQuantidade_produto(rs.getString("quantidade_produto"));
                objcadprodutodto.setValidade_produto(rs.getString("validade_produto"));
                objcadprodutodto.setPreco_unitario(rs.getString("preco_unitario"));
                objcadprodutodto.setPreco_venda(rs.getString("preco_venda"));
                objcadprodutodto.setFk_fornecedor(rs.getInt("fk_fornecedor"));

                listap.add(objcadprodutodto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "admDAO - pesquisarProduto: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
        }

        return listap;

    }

    /*É um método do tipo Arraylist. que traz uma lista de todos os registro referente a tabela adm_est*/
    public ArrayList<adm_cadprodutoDTO> pesquisarEstoque() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT data_est, produto_est, quantidade FROM adm_est";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();

            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adiciona a listae.add*/
            while (rs.next()) {

                /*Instanciando a classe adm_cadprodutoDTO*/
                adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
                /*Estou pegando as informações do banco, através do rs(ResultSet), e passando para minha classe adm_cadprodutoDTO através dos setters*/
                objcadprodutodto.setNome_produto(rs.getString("produto_est"));
                objcadprodutodto.setQuantidade_produto(rs.getString("quantidade"));
                objcadprodutodto.setData(rs.getString("data_est"));

                listae.add(objcadprodutodto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "admDAO - pesquisarEstoque: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
        }

        return listae;
        /*Retornando a lista*/

    }

    /*É um método do tipo Arraylist. que traz uma lista de todos os registro referente a tabela adm_estsaida*/
    public ArrayList<adm_cadprodutoDTO> pesquisarEstoqueSaida() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT data_est, prod_est, quant_est FROM adm_estsaida";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();

            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adiciona a listaes.add*/
            while (rs.next()) {
                /*Instanciando a classe adm_cadprodutoDTO*/
                adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
                /*Estou pegando as informações do banco, através do rs(ResultSet), e passando para minha classe adm_cadprodutoDTO através dos setters*/
                objcadprodutodto.setNome_produto(rs.getString("prod_est"));
                objcadprodutodto.setQuantidade_produto(rs.getString("quant_est"));
                objcadprodutodto.setData(rs.getString("data_est"));

                listaes.add(objcadprodutodto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "admDAO - pesquisarEstoqueSaida: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
        }

        return listaes;

    }

    /*É um método do tipo void, que espera alguns parâmetros da classe adm_cadprodutoDTO para que possa fazer a  alteração nos registro da tabela adm_produto*/
    public void alterarProduto(adm_cadprodutoDTO objcadprodutodto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "UPDATE adm_produto SET nome_produto = ?, quantidade_produto = ? , validade_produto = ?, preco_unitario = ?, preco_venda = ?, fk_fornecedor = ? where id_produto = ?";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe adm_cadprodutoDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadprodutodto.getNome_produto());
            pstm.setString(2, objcadprodutodto.getQuantidade_produto());
            pstm.setString(3, objcadprodutodto.getValidade_produto());
            pstm.setString(4, objcadprodutodto.getPreco_unitario());
            pstm.setString(5, objcadprodutodto.getPreco_venda());
            pstm.setInt(6, objcadprodutodto.getFk_fornecedor());
            pstm.setInt(7, objcadprodutodto.getId_produto());

            /*Aqui executa o comando sql*/
            pstm.execute();
            /*Fecha a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Alteração concluída!");
            /*Se der certo, exibe JOptionPane para mostrar ao usuário que a alteração foi conclúida*/

        } catch (SQLException erro) {

            JOptionPane.showInternalMessageDialog(null, "admDAO - alterarProduto: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a alteração do registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }

    /*É um método do tipo void, que espera alguns parâmetro da classe adm_cadprodutoDTO para que possa deletar um registro da tabela adm_produto*/
    public void deletarProduto(adm_cadprodutoDTO objcadprodutodto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "DELETE FROM adm_produto where id_produto = ?";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe adm_cadprodutoDTO, para os respectivos valores(?)*/
            pstm.setInt(1, objcadprodutodto.getId_produto());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Fecha a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Registro deletado!");
            /*Se der certo, exibe JOptionPane para mostrar ao usuário que o registro foi deletado com sucesso*/

        } catch (Exception erro) {

            JOptionPane.showInternalMessageDialog(null, "admDAO - deletarProduto: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que deletar o registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }

    /*É um método do tipo Arraylist. que traz uma lista de todos os registro referente a tabela adm_control*/
    public ArrayList<adm_controlDTO> pesquisarControl() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT data_control, tipo_control, descricao_control, valor_control, funcionario_control FROM adm_control";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();

            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adicione a listac.add*/
            while (rs.next()) {

                /*Instanciando a classe adm_controlDTO*/
                adm_controlDTO objcontrol = new adm_controlDTO();
                /*Estou pegando as informações do banco, através do rs(ResultSet), e passando para minha classe adm_controlDTO através dos setters*/
                objcontrol.setData(rs.getString("data_control"));
                objcontrol.setTipo(rs.getString("tipo_control"));
                objcontrol.setDescricao(rs.getString("descricao_control"));
                objcontrol.setValor(rs.getString("valor_control"));
                objcontrol.setFuncionario(rs.getString("funcionario_control"));

                listac.add(objcontrol);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "admDAO - pesquisarControl: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
        }

        return listac;
        /*Retornando a lista*/

    }

}
