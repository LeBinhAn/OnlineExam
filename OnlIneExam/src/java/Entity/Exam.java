/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author lebinhan
 */
public class Exam {
    private String id;

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    private String classroom;
    private String semester;
    private String duration;
    private String status;
    private String start_time;
    private String created_at;
    private String created_by;
    private String updated_at;
    private String updated_by;

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }
  
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
}
