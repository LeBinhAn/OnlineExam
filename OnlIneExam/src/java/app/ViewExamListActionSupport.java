/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Exam;
import Repository.ExamDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author lebinhan
 */
public class ViewExamListActionSupport extends ActionSupport {
    private ArrayList<Exam> exams;
    
    public ArrayList<Exam> getExams(){
        ExamDAO examDAO = new ExamDAO();
        exams = examDAO.getExams();
        return exams;
    }
    public void setExams(ArrayList<Exam> exams){
        this.exams = exams;
    }
    
    public ViewExamListActionSupport() {
    }
    
    public String execute() throws Exception {
        return "SUCCESS";
    }
}
