/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Exam;
import Entity.Question;
import Repository.ExamDAO;
import Repository.QuestionDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author lebinhan
 */
public class AdminActionSupport extends ActionSupport {
    private ArrayList<Exam> exams;
    private ArrayList<Question> questions;
    
    public ArrayList<Exam> getExams(){
        ExamDAO examDAO = new ExamDAO();
        exams = examDAO.getExams();
        return exams;
    }
    public void setExams(ArrayList<Exam> exams){
        this.exams = exams;
    }
    
    public ArrayList<Question> getQuestions(){
        QuestionDAO questionDAO = new QuestionDAO();
        questions = questionDAO.getQuestions();
        return questions;
    }
    public void setStudent(ArrayList<Questionr> question){
        this.questions = questions;
    }
    
    public AdminActionSupport() {
    }
    
    public String execute() throws Exception {
        return "SUCCESS";
    }
    
}
