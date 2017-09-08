package com.epam.lab.jdbc.dao;

import com.epam.lab.jdbc.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    void create(Student student) throws SQLException;
    void deleteByKode(Integer kode) throws SQLException;
    List<Student> getAllStudents() throws SQLException;
}
