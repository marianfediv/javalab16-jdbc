package com.epam.lab.jdbc.service;

import com.epam.lab.jdbc.dao.implementation.StudentDaoImpl;
import com.epam.lab.jdbc.model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService {
    public void create(Student student) throws SQLException {
        new StudentDaoImpl().create(student);
    }

    public void delete(Integer kode) throws SQLException {
        new StudentDaoImpl().deleteByKode(kode);
    }

    public List<Student> getAllStudents() throws SQLException {
        return new StudentDaoImpl().getAllStudents();
    }
}
