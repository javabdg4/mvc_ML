package com.sda.mvc;

public class StudentController {

    private StudentView studentView;
    private Student student;

    // przekazywanie pol klasy przez kompozycje


    public StudentController(StudentView studentView, Student student) {
        this.studentView = studentView;
        this.student = student;
    }

    public void setStudentName(String name) {
        student.setName(name);
    }



    public void updateView() {
        studentView.printStudent(this.student);
    }
}
