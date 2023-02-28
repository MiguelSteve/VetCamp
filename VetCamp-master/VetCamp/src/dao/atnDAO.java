package dao;

import dto.adm_cadprodutoDTO;
import dto.atn_agendaDTO;
import dto.atn_cadanimalDTO;
import dto.atn_cadclienteDTO;
import dto.vet_atendimentoDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.vet_consultaFichaVIEW;

public class atnDAO {

    Connection conn;/*A variavel conn é um objeto criado para trabalhar com a classe Connection*/
    PreparedStatement pstm;/*A variavel pstm é um objeto criado para trabalhar com a classe PreparedStatement*/
    ResultSet rs;/*A variavel rs é um objeto criado para trabalhar com a classe ResutlSet, que trará algum registro do Banco de Dados*/
    /*O ArrayList é uma classe genérica que traz uma lista de informações do banco de dados*/
    /*lista, listaa, listag, listaRe são objetos dos ArrayLists criados*/
    ArrayList<atn_cadclienteDTO> lista = new ArrayList<>();
    ArrayList<atn_cadanimalDTO> listaa = new ArrayList<>();
    ArrayList<atn_agendaDTO> listag = new ArrayList<>();
    ArrayList<adm_cadprodutoDTO> listaRe = new ArrayList<>();
    
    /*É um metodo do tipo void, que espera alguns parâmetros da classe atn_cadclienteDTO, para fazer a inserção de dados do usuario na tabela atn_cliente(database:vetcamp).*/
    public void cadclienteDAO(atn_cadclienteDTO objcadcliente) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "insert into atn_cliente (nome_cliente, cpf_cliente, endereco_cliente, telefone_cliente) values (?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe atn_cadclienteDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadcliente.getNome());
            pstm.setString(2, objcadcliente.getCpf());
            pstm.setString(3, objcadcliente.getEndereco());
            pstm.setString(4, objcadcliente.getTelefone());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Cadastro concluído!"); /*Se der certo, exibe JOptionPane para mostrar ao usuário que o cadastro foi conclúido*/

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "atmDAO - cadclienteDAO: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que a insersão do registro de dados deu errado, e mostra qual o erro através da variavél erro*/
        }

    }
   
    /*É um método do tipo Arraylist. que traz uma lista de todos os registro referente a tabela atn_cliente*/
    public ArrayList<atn_cadclienteDTO> pesquisarCliente() {
        
        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT * FROM atn_cliente";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();

             /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adicione a lista.add*/
            while (rs.next()) {

                /*Instanciando a classe atn_cadclienteDTO*/
                atn_cadclienteDTO objcadclientedto = new atn_cadclienteDTO();
                /*Estou pegando as informações do banco, através do rs(ResultSet), e passando para minha classe atn_cadclienteDTO através dos setters*/
                objcadclientedto.setId_cliente(rs.getInt("id_cliente"));
                objcadclientedto.setNome(rs.getString("nome_cliente"));
                objcadclientedto.setCpf(rs.getString("cpf_cliente"));
                objcadclientedto.setEndereco(rs.getString("endereco_cliente"));
                objcadclientedto.setTelefone(rs.getString("telefone_cliente"));

                lista.add(objcadclientedto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - pesquisarCliente: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
        }

        return lista; /*Retornando a lista*/

    }
    
    /*É um método do tipo void, que espera alguns parâmetros da classe atn_cadclienteDTO para que possa fazer a  alteração nos registro da tabela atn_cliente*/
    public void alterarCliente(atn_cadclienteDTO objcadclientedto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "UPDATE atn_cliente SET nome_cliente = ?, cpf_cliente = ? , endereco_cliente = ?, telefone_cliente = ? where id_cliente = ?";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe atn_cadclienteDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadclientedto.getNome());
            pstm.setString(2, objcadclientedto.getCpf());
            pstm.setString(3, objcadclientedto.getEndereco());
            pstm.setString(4, objcadclientedto.getTelefone());
            pstm.setInt(5, objcadclientedto.getId_cliente());
            
            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Alteração concluída!"); /*Se der certo, exibe JOptionPane para mostrar ao usuário que a alteração foi conclúida*/

        } catch (SQLException erro) {

            JOptionPane.showInternalMessageDialog(null, "atnDAO - alterarCliente: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que a alteração do registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }
    /*É um método do tipo void, que espera alguns parâmetro da classe atn_cadclienteDTO para que possa deletar um registro da tabela atn_cliente*/
    public void deletarCliente(atn_cadclienteDTO objcadclientedto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "DELETE FROM atn_cliente where id_cliente = ?";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {
            
            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe aatn_cadclienteDTO, para os respectivos valores(?)*/
            pstm.setInt(1, objcadclientedto.getId_cliente());
            
            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Estou fechando a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Registro deletado!"); /*Se der certo, exibe JOptionPane para mostrar ao usuário que o registro foi deletado com sucesso*/

        } catch (Exception erro) {

            JOptionPane.showInternalMessageDialog(null, "atnDAO - deletarCliente: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que deletar o registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }

    //-----
   
    /*É um método do tipo Resultset que traz a informações  referente aos clientes*/
    public ResultSet listarCliente() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT id_cliente, nome_cliente FROM atn_cliente ORDER BY nome_cliente;";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            return pstm.executeQuery();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - listarCliente: " + erro.getMessage()); /*Se der errado, exibe JOptionPane para mostrar ao usuário que o carregamento das infromações através do ResultSet falhou, e mostra qual o erro através da variavél erro*/
            return null;

        }

    }
    
    /*É um método do tipo Resultset que traz a informações  referente aa categorias*/
    public ResultSet listarCategoria() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT id_categoria, descricao FROM atn_categoria ORDER BY descricao;";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {
            
            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            return pstm.executeQuery();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - listarCategoria: " + erro.getMessage()); /*Se der errado, exibe JOptionPane para mostrar ao usuário que o carregamento das infromações através do ResultSet falhou, e mostra qual o erro através da variavél erro*/
            return null;

        }

    }
    /*É um metodo do tipo void, que espera alguns parâmetros da classe atn_cadanimalDTO, para fazer a inserção de dados dos animais na tabela atn_animal(database:vetcamp).*/
    public void cadAnimalDAO(atn_cadanimalDTO objcadanimaldto) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "insert into atn_animal (nome_animal, idade_animal, sexo_animal, descricao_animal, categoria_animal, fk_cliente) values (?,?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe aatn_cadanimalDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadanimaldto.getNome());
            pstm.setString(2, objcadanimaldto.getIdade());
            pstm.setString(3, objcadanimaldto.getSexo());
            pstm.setString(4, objcadanimaldto.getDescricao());
            pstm.setString(5, objcadanimaldto.getCategoria());
            pstm.setInt(6, objcadanimaldto.getFk_cliente());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Cadastro concluído!"); /*Se der certo, exibe JOptionPane para mostrar ao usuário que o cadastro foi conclúido*/

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "atnDAO - cadAnimalDAO: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que a insersão do registro de dados deu errado, e mostra qual o erro através da variavél erro*/
        }

    }
    
    /*É um método do tipo Arraylist. que traz uma lista de todos os registro referente a tabela atn_animal*/
    public ArrayList<atn_cadanimalDTO> pesquisarAnimais() {
        
        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT * FROM atn_animal";
        conn = new conexaoDAO().conectaBD();
        
        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {
            
            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();
            
            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adicione a listaa.add*/
            while (rs.next()) {
                
                /*Instanciando a classe atn_cadanimalDTO*/
                atn_cadanimalDTO objcadanimaldto = new atn_cadanimalDTO();
                /*Estou pegando as informações do banco, através do rs(ResultSet), e passando para minha classe atn_cadanimalDTO através dos setters*/
                objcadanimaldto.setId_animal(rs.getInt("id_animal"));
                objcadanimaldto.setNome(rs.getString("nome_animal"));
                objcadanimaldto.setIdade(rs.getString("idade_animal"));
                objcadanimaldto.setSexo(rs.getString("sexo_animal"));
                objcadanimaldto.setDescricao(rs.getString("descricao_animal"));
                objcadanimaldto.setFk_cliente(rs.getInt("fk_cliente"));
                objcadanimaldto.setCategoria(rs.getString("categoria_animal"));

                listaa.add(objcadanimaldto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - pesquisarAnimais: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
        }

        return listaa; /*Retornando a lista*/

    }
    
    /*É um método do tipo void, que espera alguns parâmetros da classe atn_cadanimalDTO para que possa fazer a  alteração nos registro da tabela atn_animal*/
    public void alterarAnimal(atn_cadanimalDTO objcadanimaldto) {
        
        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "UPDATE atn_animal SET nome_animal = ?, idade_animal = ? , sexo_animal = ?, descricao_animal = ?, fk_cliente = ?, categoria_animal = ? where id_animal = ?";
        conn = new conexaoDAO().conectaBD();
        
        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {
            
            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe atn_cadanimalDTO, para os respectivos valores(?)*/
            pstm.setString(1, objcadanimaldto.getNome());
            pstm.setString(2, objcadanimaldto.getIdade());
            pstm.setString(3, objcadanimaldto.getSexo());
            pstm.setString(4, objcadanimaldto.getDescricao());
            pstm.setInt(5, objcadanimaldto.getFk_cliente());
            pstm.setString(6, objcadanimaldto.getCategoria());
            pstm.setInt(7, objcadanimaldto.getId_animal());
            
            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Aqui fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Alteração concluída!"); /*Se der certo, exibe JOptionPane para mostrar ao usuário que a alteração foi conclúida*/

        } catch (SQLException erro) {

            JOptionPane.showInternalMessageDialog(null, "atnDAO - alterarAnimal: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que a alteração do registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }
    
    /*É um método do tipo void, que espera alguns parâmetro da classe aatn_cadanimalDTO para que possa deletar um registro da tabela atn_animal*/
    public void deletarAnimal(atn_cadanimalDTO objcadanimaldto) {
        
        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "DELETE FROM atn_animal where id_animal = ?";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {
            
            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe atn_cadanimalDTO, para os respectivos valores(?)*/
            pstm.setInt(1, objcadanimaldto.getId_animal());
            
            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Estou fechando a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Registro deletado!"); /*Se der certo, exibe JOptionPane para mostrar ao usuário que o registro foi deletado com sucesso*/

        } catch (Exception erro) {

            JOptionPane.showInternalMessageDialog(null, "atnDAO - deletarAnimal: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que deletar o registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }
    
    /*É um metodo do tipo void, que espera alguns parâmetros da classe atn_agendaDTO para fazer a inserção de dados na tabela atn_agenda*/
    public void agendaDAO(atn_agendaDTO objagenda) {

         /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "insert into atn_agenda (data_agenda, tipo_agenda, sexo_agenda, categoria_agenda, descricao_agenda, nome_animal, fk_animal, vet_agenda) values (?,?,?,?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*aqui estou passando os valores através dos gets da classe atn_agendaDTO, para os respectivos valores(?)*/
            pstm.setString(1, objagenda.getData_agenda());
            pstm.setString(2, objagenda.getTipo_agenda());
            pstm.setString(3, objagenda.getSexo_agenda());
            pstm.setString(4, objagenda.getCategoria_agenda());
            pstm.setString(5, objagenda.getDescricao_agenda());
            pstm.setString(6, objagenda.getNome_animal());
            pstm.setInt(7, objagenda.getFk_animal());
            pstm.setString(8, objagenda.getVeterinario());
            
            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Agendamento concluído!"); /*Se der certo, exibe JOptionPane para mostrar ao usuário que o cadastro foi conclúido*/

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "atnDAO - cagendaDAO: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que a insersão do registro de dados deu errado, e mostra qual o erro através da variavél erro*/
        }

    }
    
    /*É um método do tipo Arraylist. que traz uma lista de todos os registro referente a tabela atn_agenda*/
    public ArrayList<atn_agendaDTO> pesquisarAgenda() {
        
        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT * FROM atn_agenda";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {
            
            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();
            
            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adiciona a listag.add*/
            while (rs.next()) {

                /*Instanciando a classe atn_agendaDTO*/
                atn_agendaDTO objagenda = new atn_agendaDTO();
                /*Estou pegando as informações do banco, através do rs(ResultSet), e passando para minha classe atn_agendaDTO através dos setters*/
                objagenda.setId_agenda(rs.getInt("id_agenda"));
                objagenda.setData_agenda(rs.getString("data_agenda"));
                objagenda.setTipo_agenda(rs.getString("tipo_agenda"));
                objagenda.setSexo_agenda(rs.getString("sexo_agenda"));
                objagenda.setCategoria_agenda(rs.getString("categoria_agenda"));
                objagenda.setDescricao_agenda(rs.getString("descricao_agenda"));
                objagenda.setNome_animal(rs.getString("nome_animal"));
                objagenda.setFk_animal(rs.getInt("fk_animal"));
                objagenda.setVeterinario(rs.getString("vet_agenda"));

                listag.add(objagenda);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - pesquisarAgenda: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
        }

        return listag; /*Retornando a lista*/

    }
    
    /*É um método do tipo void, que espera alguns parâmetros da classe atn_agendaDTO para que possa fazer a  alteração nos registro da tabela atn_agenda*/
    public void alterarAgenda(atn_agendaDTO objagenda) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "UPDATE atn_agenda SET data_agenda = ?, tipo_agenda = ? where id_agenda = ?";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {
            
            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
             
            /*aqui estou passando os valores através dos gets da classe atn_agendaDTO, para os respectivos valores(?)*/
            pstm.setString(1, objagenda.getData_agenda());
            pstm.setString(2, objagenda.getTipo_agenda());
            pstm.setInt(3, objagenda.getId_agenda());
            
            /*Aqui executa o comando sql*/
            pstm.execute();
            /*Fecha a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Dados da consulta alterado!"); /*Se der certo, exibe JOptionPane para mostrar ao usuário que a alteração foi conclúida*/

        } catch (SQLException erro) {

            JOptionPane.showInternalMessageDialog(null, "atnDAO - alterarAgenda: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que a alteração do registro de dados falhou, e mostra qual o erro através da variavél erro*/

        }

    }
    
    /*É um método do tipo Arraylist. que traz uma lista de todos os registro referente a tabela atb_vendas*/
    public ArrayList<adm_cadprodutoDTO> relatorioVendas() {

        /*Estou passando o comando sql através da String sql*/
        String sql = "select * from atn_vendas";
        conn = new conexaoDAO().conectaBD();
        
        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {
            
            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();

            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adiciona a listaRe.add*/
            while (rs.next()) {

                /*Instanciando a classe adm_cadprodutoDTO*/
                adm_cadprodutoDTO objadm_cadprodutoDTO = new adm_cadprodutoDTO();
                objadm_cadprodutoDTO.setId_produto(rs.getInt("id_venda"));
                objadm_cadprodutoDTO.setNome_produto(rs.getString("prod_venda"));
                objadm_cadprodutoDTO.setPreco_venda(rs.getString("valor_venda"));
                objadm_cadprodutoDTO.setQuantidade_produto(rs.getString("quant_venda"));
                objadm_cadprodutoDTO.setData(rs.getString("data_venda"));

                listaRe.add(objadm_cadprodutoDTO);
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - relatorioVendas: " + erro.getMessage()); /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
            return null;

        }

        return listaRe; /*Retornando a lista*/

    }

    
}
