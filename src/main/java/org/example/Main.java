package org.example;

import org.example.CompositKey.LinkedPurchaseKey;
import org.example.POJO.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            List<Courses> list = session.createQuery("from Courses", Courses.class).getResultList();
            for (Courses course : list) {


                for(Students students: course.getStudentsList())
                {
                    int studentID = students.getId();
                    int courseID = course.getId();
                    LinkedPurchaseKey linkedPurchaseKey = new LinkedPurchaseKey();
                    linkedPurchaseKey.setStudentId(studentID);
                    linkedPurchaseKey.setCourseID(courseID);
                    LinkedPurchaseList linkedPurchaseList = new LinkedPurchaseList();
                    linkedPurchaseList.setKey(linkedPurchaseKey);
                    linkedPurchaseList.setCourseId(courseID);
                    linkedPurchaseList.setStudentId(studentID);
                    session.save(linkedPurchaseList);
                }
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}