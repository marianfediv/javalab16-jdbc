package com.epam.lab.jdbc;

import com.epam.lab.jdbc.model.Student;
import com.epam.lab.jdbc.service.StudentService;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Student student;
        StudentService studentService = new StudentService();

        System.out.println("----- Get All Students -----");
        List<Student> students = studentService.getAllStudents();

        for (Student st : students) {
            System.out.println(st.toString());
        }

        System.out.println("----- Create new student -----");
        student = new Student(33, "test", "test", Date.valueOf("1994-10-10"), Student.Sex.male);
        studentService.create(student);

        System.out.println("----- Get All Students -----");
        List<Student> studentsAfterAdd = studentService.getAllStudents();

        for (Student st : studentsAfterAdd) {
            System.out.println(st.toString());
        }

        System.out.println("----- Delete student by kod -----");
        studentService.delete(33);

        System.out.println("----- Get All Students -----");
        List<Student> studentsAfterDelete = studentService.getAllStudents();

        for (Student st : studentsAfterDelete) {
            System.out.println(st.toString());
        }
    }
}
