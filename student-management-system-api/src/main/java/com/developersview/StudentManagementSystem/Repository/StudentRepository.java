package com.developersview.StudentManagementSystem.Repository;

import com.developersview.StudentManagementSystem.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author pranoy.chakraborty
 * @Date 17/07/22
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
