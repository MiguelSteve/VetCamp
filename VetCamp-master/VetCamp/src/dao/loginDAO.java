package dao;

import dto.adm_cadusuarioDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class loginDAO {

    Connection conn; /*A variavel conn é um objeto criado para trabalhar com a classe Connection*/
    PreparedStatement pstm; /*A variavel pstm é um objeto criado para trabalhar com a classe PreparedStatement*/
    ResultSet rs; /*A variavel rs é um objeto criado para trabalhar com a classe ResutlSet, que trará algum registro do Banco de Dados*/

    /*É um método do tipo Resultset que traz a informações  referente aos usuarios logados*/
    public ResultSet autenticacaoUsuario(adm_cadusuarioDTO obj) {
        conn = new conexaoDAO().conectaBD();

        try {
            
            /*Estou passando o comando sql através da String sql, e os valores com um ponto de interrogação, por que não sei o que o usuário vai inserir*/
            String sql = "Select fk_cargo from adm_usuario where login_usuario = ? and login_senha = ? ";
            
            /*Preparando a conexão e enviando o comando, através da String sql para fazer a insersão dos dados*/
            pstm = conn.prepareStatement(sql);
            
             /*aqui estou passando os valores através dos gets da classe adm_cadusuarioDTO, para os respectivos valores(?)*/
            pstm.setString(1, obj.getUsuario());
            pstm.setString(2, obj.getSenha());
            
             /*Executa e retorna o resultado sql*/
            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "loginDAO - autenticacaoUsuario: " + erro); /*Se der errado, exibe JOptionPane para mostrar ao usuário que o login falhou, e mostra qual o erro através da variavél erro*/
            return null;
        }
    }

}
