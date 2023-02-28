
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class conexaoDAO {
    
    /*É um metodo public do tipo Connection, que liga o arquivo fonte com o banco de dados*/
    public Connection conectaBD() {

        Connection conn = null;

         /*Após a conexão, ele irá entrar no método try, pois irá "tentar" fazer algo, se não conseguir ele entra no catch*/
        try {

            String url = "jdbc:mysql://localhost:3306/vetcamp?user=root&password=";
            conn = DriverManager.getConnection(url);

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "conexaoDAO - conectaBD: " + erro.getMessage());
            /*Se der errado, exibe JOptionPane para mostrar ao usuário que a conexão com o banco de dados deu errado, e mostra qual o erro através da variavél erro*/
        }
        return conn;
    }
    
}
