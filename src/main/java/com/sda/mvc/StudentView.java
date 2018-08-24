package com.sda.mvc;

public class StudentView {

    public void printStudent(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Last name: " + student.getLastName());
        System.out.println("Student's Index: " + student.getIndexNumber());
    }
}
