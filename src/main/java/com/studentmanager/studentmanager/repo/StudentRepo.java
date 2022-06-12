package com.studentmanager.studentmanager.repo;

import com.studentmanager.studentmanager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student,Long> {

    Optional<Student> findStudentByid(Long id);

    void deleteStudentById(Long id);
}
