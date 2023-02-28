package dao;

import dto.vet_atendimentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.vet_consultaFichaVIEW;

public class vetDAO {

    Connection conn;
    /*A variavel conn é um objeto criado para trabalhar com a classe Connection*/
    PreparedStatement pstm;
    /*A variavel pstm é um objeto criado para trabalhar com a classe PreparedStatement*/
    ResultSet rs;
    /*A variavel rs é um objeto criado para trabalhar com a classe ResutlSet, que trará algum registro do Banco de Dados*/
    /*O ArrayList é uma classe genérica que traz uma lista de informações do banco de dados*/
    /*listahc são objetos dos ArrayLists criados*/
    ArrayList<vet_atendimentoDTO> listahc = new ArrayList<>();

    /*É um metodo do tipo void, que espera alguns parâmetros da classe vet_atendimentoDTO para fazer a inserção de dados na tabela vet_ficha*/
    public void cadFicha(vet_atendimentoDTO objatendimento) {

        /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
        String sql = "insert into vet_ficha (nome_ficha, idade_ficha, sexo_ficha, categoria_ficha, descricao_ficha, prescricao_ficha) values (?,?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);

            /*aqui estou passando os valores através dos gets da classe vet_atendimentoDTO, para os respectivos valores(?)*/
            pstm.setString(1, objatendimento.getNome());
            pstm.setString(2, objatendimento.getIdade());
            pstm.setString(3, objatendimento.getSexo());
            pstm.setString(4, objatendimento.getCategoria());
            pstm.setString(5, objatendimento.getDescricao());
            pstm.setString(6, objatendimento.getPrescricao());

            /*Aqui executo o comando sql*/
            pstm.execute();
            /*Fecho a conexão*/
            pstm.close();

            JOptionPane.showMessageDialog(null, "Atendimento concluído");
            /*Se der certo, exibe JOptionPane para mostrar ao usuário que o atendimento foi conclúido*/

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "vetDAO - cadFicha: " + erro);
        }/*Se der errado, exibe JOptionPane para mostrar ao usuário que a operação falhou, e mostra qual o erro através da variavél erro*/

    }

    /*É um método do tipo Arraylist. que traz uma lista dos registro referente a tabela vet_ficha*/
    public ArrayList<vet_atendimentoDTO> pesquisarConsulta() {

        /*Estou instanciando a classe vet_consultaFichaVIEW*/
        vet_consultaFichaVIEW objvetconsulta = new vet_consultaFichaVIEW();

        /*Estou passando o comando sql através da String sql*/
        String sql = "SELECT id_ficha, nome_ficha, idade_ficha, sexo_ficha, categoria_ficha from vet_ficha where nome_ficha like '" + objvetconsulta.print + "%'";
        conn = new conexaoDAO().conectaBD();

        /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            /*pstm está recebendo o resultado da conexão e também preapando para enviar o comando sql*/
            pstm = conn.prepareStatement(sql);
            /*Retorna o resultado sql*/
            rs = pstm.executeQuery();

            /*Estou utilizando o while, para que enquanto tiver linha(registro), ele adiciona a listahc.add*/
            while (rs.next()) {

                /*Estou instanciando a classe vet_atendimentoDTO*/
                vet_atendimentoDTO objvet = new vet_atendimentoDTO();

                /*Estou pegando as informações do banco, através do rs(ResultSet), e passando para minha classe vet_atendimentoDTO através dos setters*/
                objvet.setId(rs.getInt("id_ficha"));
                objvet.setNome(rs.getString("nome_ficha"));
                objvet.setIdade(rs.getString("idade_ficha"));
                objvet.setSexo(rs.getString("sexo_ficha"));
                objvet.setCategoria(rs.getString("categoria_ficha"));

                listahc.add(objvet);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - pesquisarConsultar: " + erro);
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a montagem da lista de dados falhou, e mostra qual o erro através da variavél erro*/
        }

        return listahc;
        /*Retornando a lista*/

    }
}
