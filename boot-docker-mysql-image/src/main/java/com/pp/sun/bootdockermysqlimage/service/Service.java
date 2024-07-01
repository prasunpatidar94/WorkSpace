package com.pp.sun.bootdockermysqlimage.service;

import com.pp.sun.bootdockermysqlimage.entity.Programmer;
import com.pp.sun.bootdockermysqlimage.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    public Object getProgrammers() {
        return repository.findAll();
    }

    public Object saveProgrammer(Programmer programmer) {
        return repository.save(programmer);
    }
}
