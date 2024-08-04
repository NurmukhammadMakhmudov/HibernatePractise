package org.example.CompositKey;

import javax.persistence.Column;
import java.io.Serializable;

public class PurchasesKey implements Serializable {

    @Column(name = "student_name")
    private String studentName;
    @Column(name = "course_name")
    private String courseName;

    public PurchasesKey(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public PurchasesKey() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
