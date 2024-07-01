package com.pp.sun.runner;

import com.pp.sun.entity.Student;
import com.pp.sun.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class SqlCommandLineRunner implements CommandLineRunner  {

@Autowired
private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {

        List<Student> students = Stream.of(
                new Student(0,"Prasun","Kasrawad"),
                new Student(0,"Kamal","Indore"),
                new Student(0,"Rekha","Likhi"),
                new Student(0,"Chandan","Kasrawad"),
                new Student(0,"Megha","Khargone")
        ).collect(Collectors.toList());

        studentRepository.saveAll(students);

    }
}
