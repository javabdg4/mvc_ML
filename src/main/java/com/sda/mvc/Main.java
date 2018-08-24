package com.sda.mvc;

import javax.swing.text.View;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                "John",
                "Novak",
                "123456");

        StudentView studentView = new StudentView();

        StudentController controller = new StudentController(
                studentView, student
        );

        controller.updateView();
//      student.setName("Other New Name");
        controller.setStudentName("New Name");
        controller.updateView();
    }

}
