/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Model.QuestionManager;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author lebinhan
 */
public class AddQuestionActionSupport extends ActionSupport {
    String id;
    String question;
    String type;
    String subject;
    String created_at;
    String created_by;
    String updated_at;
    String updated_by;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }
    
    public AddQuestionActionSupport() {
    }
    
    public String execute() throws Exception {
        QuestionManager questionManager  = new QuestionManager();
        if(questionManager.addQuestion(id, question, type, subject, created_by)>0){
            return "SUCCESS";
        }
            return "FAILED";
    }
    
}
