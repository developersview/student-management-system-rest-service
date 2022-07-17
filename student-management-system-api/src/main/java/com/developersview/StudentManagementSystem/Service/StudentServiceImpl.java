package com.developersview.StudentManagementSystem.Service;

import com.developersview.StudentManagementSystem.Exception.UserAlreadyExistsException;
import com.developersview.StudentManagementSystem.Exception.UserNotFoundException;
import com.developersview.StudentManagementSystem.Model.Student;
import com.developersview.StudentManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author pranoy.chakraborty
 * @Date 17/07/22
 */
@Service
public class StudentServiceImpl implements StudentService {
    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) throws UserAlreadyExistsException {
        if (studentRepository.existsById(student.getId())) {
            throw new UserAlreadyExistsException();
        }
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByID(int id) throws UserNotFoundException {
        Student student;
        Optional optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            student = studentRepository.findById(id).get();
            return student;
        }
        throw new UserNotFoundException();
    }

    @Override
    public Student deleteStudent(int id) throws UserNotFoundException {
        Student deleteStudent;
        Optional optional = studentRepository.findById(id);
        if(optional.isPresent()){
            deleteStudent=studentRepository.findById(id).get();
            studentRepository.deleteById(id);
            return deleteStudent;
        }
        throw new UserNotFoundException();
    }

    @Override
    public Student updateStudent(Student student) throws UserNotFoundException {
        if(studentRepository.existsById(student.getId())){
           Student updateStudent;
           updateStudent=studentRepository.save(student);
           return updateStudent;
        }
        throw new UserNotFoundException();
    }
}
