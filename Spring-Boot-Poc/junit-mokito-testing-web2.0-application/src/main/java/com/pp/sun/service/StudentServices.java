package com.pp.sun.service;


import com.pp.sun.entity.Student;
import com.pp.sun.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServices {

    @Autowired(required = true)
    private StudentRepository studentRepository;


    public List<Student> getStudents() {

        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }
}
