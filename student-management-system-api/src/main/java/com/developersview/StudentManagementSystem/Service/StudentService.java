package com.developersview.StudentManagementSystem.Service;

import com.developersview.StudentManagementSystem.Model.Student;

import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 17/07/22
 */
public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentByID(int id);

    Student deleteStudent(int id);

    Student updateStudent(Student student);
}
