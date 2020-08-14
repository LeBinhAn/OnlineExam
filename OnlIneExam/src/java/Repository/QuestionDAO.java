/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Entity.Question;
import Entity.User;
import com.connection.ConnectionFactory;
import java.sql.Connection;
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
public class QuestionDAO {
     public ArrayList<Question> getQuestions() {
        ArrayList<Question> questionList = new ArrayList();
        Connection connection = ConnectionFactory.getConnection();
        String getStudentListQuery = "SELECT * FROM question";
        try {
            Statement _statement = connection.createStatement();
            ResultSet resultSet = _statement.executeQuery(getStudentListQuery);
            while(resultSet.next()){
                Question question = new Question();
                question.setId(resultSet.getString(1));
                question.setQuestion(resultSet.getString(2));
                question.setType(resultSet.getString(3));
                question.setSubject(resultSet.getString(4));
                questionList.add(question);
            }
            resultSet.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return questionList; 
    }
}
