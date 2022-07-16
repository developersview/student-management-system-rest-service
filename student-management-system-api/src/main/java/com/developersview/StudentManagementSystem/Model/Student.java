package com.developersview.StudentManagementSystem.Model;

import javax.persistence.*;

/**
 * @author pranoy.chakraborty
 * @Date 16/07/22
 */
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String LastName;
    private String registrationNumber;
    private String classNumber;
    private String section;
    private String department;
    private String grade;
    private long phoneNumber;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String registrationNumber, String classNumber, String section, String department, String grade, long phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.registrationNumber = registrationNumber;
        this.classNumber = classNumber;
        this.section = section;
        this.department = department;
        this.grade = grade;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
