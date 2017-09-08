package com.epam.lab.jdbc.model;

import java.sql.Date;

public class Student {
    private Integer kode;
    private String firstName;
    private String lastName;
    private Date birthday;
    private Sex sex;

    public Student(){}
    public Student(Integer kode, String firstName, String lastName, Date birthday, Sex sex) {
        this.kode = kode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.sex = sex;
    }

    public enum Sex {
        male, female
    }

    public Integer getKode() {
        return kode;
    }

    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        String result = String.format(
                "| kod: %7d | FirstName: %10s | LastName: %10s | Sex: %7s | Birthday: %10s |",
                kode, firstName, lastName, sex, birthday);
        return result;
    }
}
