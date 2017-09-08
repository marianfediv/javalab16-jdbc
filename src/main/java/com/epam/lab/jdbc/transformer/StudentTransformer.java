package com.epam.lab.jdbc.transformer;

import com.epam.lab.jdbc.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentTransformer {

    public Student fromResulstSetToObject(ResultSet rs) throws SQLException {

        Student result = null;

        if (rs.next()) {
            result = new Student();
            result.setKode(rs.getInt("kode"));
            result.setFirstName(rs.getString("firstname"));
            result.setLastName(rs.getString("lastname"));
            result.setBirthday(rs.getDate("birthday"));
            result.setSex(Student.Sex.valueOf(rs.getString("sex")));
        }

        return result;
    }
}
