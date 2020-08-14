/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.Account;
import com.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author lebinhan
 */
public class LoginAuthenticator {
    public int checkLogin(String id, String password){
        String loginSQLScript = "SELECT * FROM user WHERE id=? and password=?";
        Connection connect = ConnectionFactory.getConnection();
        try {
            PreparedStatement prst = connect.prepareStatement(loginSQLScript);
            prst.setString(1, id);
            prst.setString(2, password);
            ResultSet resultSet = prst.executeQuery();
            if(resultSet.next()){
               return 1;
            }
            resultSet.close();
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
