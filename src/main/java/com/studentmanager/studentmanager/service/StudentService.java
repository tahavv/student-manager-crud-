package com.studentmanager.studentmanager.service;


import com.studentmanager.studentmanager.model.Student;
import com.studentmanager.studentmanager.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student){
        student.setStuentcode(UUID.randomUUID().toString());
        return studentRepo.save(student);
    }

    public List<Student> findAllStudents(){
        return studentRepo.findAll();
    }

    public Student updateStudent(Student student){
        return studentRepo.save(student);
    }

    public Student findStudentById(Long id ){
        return studentRepo.findStudentByid(id).orElseThrow(()->new IllegalStateException("User id = "+id+" not found! "));
    }

    public void deleteStudentById(Long id){
        studentRepo.deleteStudentById(id);
    }
}
