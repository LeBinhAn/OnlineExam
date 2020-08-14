/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.User;
import Repository.UserDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author lebinhan
 */
public class ViewStudentListActionSupport extends ActionSupport {
    private ArrayList<User> students;
    
    public ArrayList<User> getStudents(){
        UserDAO userDAO = new UserDAO();
        students = userDAO.getStudent();
        return students;
    }
    public void setStudent(ArrayList<User> students){
        this.students = students;
    }
    public ViewStudentListActionSupport() {
    }
    
    public String execute() throws Exception {
        return "SUCCESS";
    }
    
}
