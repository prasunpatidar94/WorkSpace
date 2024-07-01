package com.pp.sun.service;

import com.pp.sun.entity.Student;
import com.pp.sun.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentServices studentServices;

    @MockBean
    private StudentRepository studentRepository;

    @BeforeEach
    public void setUp() {
        Optional<Student> student = Optional.of(new Student(1, "Prasun", "Kasrawad"));
        Mockito.when(studentRepository.findById(1)).thenReturn(student);

    }

    @Test
    public void testGetStudentById_Success() {

        Student expected = new Student(1, "Prasun", "Kasrawad");
        Student student = studentRepository.findById(1).get();

        assertEquals(expected, student);

    }


}
