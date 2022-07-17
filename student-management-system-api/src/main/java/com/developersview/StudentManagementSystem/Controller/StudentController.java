package com.developersview.StudentManagementSystem.Controller;

import com.developersview.StudentManagementSystem.Exception.UserAlreadyExistsException;
import com.developersview.StudentManagementSystem.Exception.UserNotFoundException;
import com.developersview.StudentManagementSystem.Model.Student;
import com.developersview.StudentManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 17/07/22
 */
@RestController
@RequestMapping("/StudentManagementSystem/api/v1")
public class StudentController {
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //to add a new student
    @PostMapping("/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) throws UserAlreadyExistsException{
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    //to get all students
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
    }

    //to get a student by id
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) throws UserNotFoundException{
        return new ResponseEntity<>(studentService.getStudentByID(id),HttpStatus.FOUND);
    }

    //to delete a student by id
    @DeleteMapping("/student/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable int id) throws UserNotFoundException{
        return new ResponseEntity<>(studentService.deleteStudent(id),HttpStatus.OK);
    }

    //to update a student by id
    @PutMapping("/student")
    public ResponseEntity<Student> updateStudentById(@RequestBody Student student) throws UserNotFoundException{
        return new ResponseEntity<>(studentService.updateStudent(student),HttpStatus.OK);
    }

}
