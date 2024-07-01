package com.pp.sun.controller;

import com.pp.sun.entity.Student;
import com.pp.sun.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {


    @Autowired(required = true)
    private StudentServices studentServices;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents() {
        return  ResponseEntity.ok().body(studentServices.getStudents());
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudents(@PathVariable Integer id) {
        return  ResponseEntity.ok().body(studentServices.getStudentById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return  ResponseEntity.ok().body(studentServices.saveStudent(student));
    }

}
