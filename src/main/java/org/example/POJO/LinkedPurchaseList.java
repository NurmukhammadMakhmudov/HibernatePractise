package org.example.POJO;


import org.example.CompositKey.LinkedPurchaseKey;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "linkedpurchaselist")
public class LinkedPurchaseList {

    @EmbeddedId
    private LinkedPurchaseKey key;

    @Column(name = "student_id", insertable = false, updatable = false)
    private int studentId;

    @Column(name = "course_id", insertable = false, updatable = false)
    private int courseId;

    public LinkedPurchaseList() {
    }

    public LinkedPurchaseList(LinkedPurchaseKey key, int studentId, int courseId) {
        this.key = key;
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public LinkedPurchaseKey getKey() {
        return key;
    }

    public void setKey(LinkedPurchaseKey key) {
        this.key = key;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
