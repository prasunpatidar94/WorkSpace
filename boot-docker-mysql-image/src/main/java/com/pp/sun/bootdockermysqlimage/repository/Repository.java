package com.pp.sun.bootdockermysqlimage.repository;


import com.pp.sun.bootdockermysqlimage.entity.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Programmer,Long> {
}
