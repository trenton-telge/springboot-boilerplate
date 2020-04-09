package com.example.springbootDemoProject.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
    @Id
    int stid;
    @Column
    String fname;
    @Column
    String lname;

    public Student() {
    }

    public Student(int stid, String fname, String lname) {
        this.stid = stid;
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stid=" + stid +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
