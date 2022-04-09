package com.studentAp.studentAp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    /*@GeneratedValue(strategy = GenerationType.AUTO)*/
    private String studentId;
    private String firstname;
    private  String lastname;
    private int pocketmoney;
    private String birthday;

    public Student() {
    }

    public Student(String firstname, String lastname, int pocketmoney, String birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pocketmoney = pocketmoney;
        this.birthday = birthday;
    }

    public Student(String studentId, String firstname, String lastname, int pocketmoney, String birthday) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.pocketmoney = pocketmoney;
        this.birthday = birthday;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPocketmoney() {
        return pocketmoney;
    }

    public void setPocketmoney(int pocketmoney) {
        this.pocketmoney = pocketmoney;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
