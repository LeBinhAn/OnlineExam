/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Entity.User;
import Model.LoginAuthenticator;
import com.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lebinhan
 */
public class UserDAO {

    public ArrayList<User> getStudent() {
        ArrayList<User> studentList = new ArrayList();
        Connection connection = ConnectionFactory.getConnection();
        String getStudentListQuery = "SELECT * FROM user WHERE role='student'";
        try {
            Statement _statement = connection.createStatement();
            ResultSet resultSet = _statement.executeQuery(getStudentListQuery);
            while(resultSet.next()){
                User student = new User();
                student.setId(resultSet.getString(1));
                student.setName(resultSet.getString(2));
                student.setRole(resultSet.getString(3));
                studentList.add(student);
            }
            resultSet.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return studentList; 
    }
}
