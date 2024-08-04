package org.example.CompositKey;


import javax.persistence.Column;
import java.io.Serializable;

public class LinkedPurchaseKey implements Serializable {

    @Column(name = "student_id")
    private int studentId;

    @Column(name = "course_id")
    private int courseID;


    public LinkedPurchaseKey() {
    }

    public LinkedPurchaseKey(int studentId, int courseID) {
        this.studentId = studentId;
        this.courseID = courseID;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
}
