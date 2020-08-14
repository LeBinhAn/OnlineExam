/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Entity.Exam;
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
public class ExamDAO {
    Exam exam = new Exam();
     public static ArrayList<Exam> getExams() {
        ArrayList<Exam> examList = new ArrayList();
        Connection connection = ConnectionFactory.getConnection();
        String getExamListQuery = "SELECT id, classroom, semester, start_at, duration, status FROM exam";
        try {
            Statement _statement = connection.createStatement();
            ResultSet resultSet = _statement.executeQuery(getExamListQuery);
            while(resultSet.next()){
                Exam exam = new Exam();
                exam.setId(resultSet.getString(1));
                exam.setClassroom(resultSet.getString(2));
                exam.setSemester(resultSet.getString(3));
                exam.setStart_time(resultSet.getString(4));
                exam.setDuration(resultSet.getString(5));
                exam.setStatus(resultSet.getString(6));
                examList.add(exam);
            }
            resultSet.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return examList; 
    }
    public static void main(String args[]){
        ArrayList<Exam> list= getExams();
        list.forEach((exam)->{
            System.out.println("Result = ");
            System.out.println(exam.getClassroom());
        });
    }
}
