package com.pp.sun.repository;

import com.pp.sun.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student,Integer> {

     Student findByName(String shiv);
}
