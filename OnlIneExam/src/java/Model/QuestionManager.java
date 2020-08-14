/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class QuestionManager {
    public int addQuestion(String id, String question, String type, String subject, String created_by){
        String loginSQLScript = "INSERT INTO question VALUES(?,?,?,?,?,?)";
        Connection connect = ConnectionFactory.getConnection();
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);
        try {
            PreparedStatement prst = connect.prepareStatement(loginSQLScript);
            prst.setString(1, id);
            prst.setString(2, question);
            prst.setString(3, type);
            prst.setString(4, subject);
            prst.setDate(5, date);
            prst.setString(6, created_by);
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
