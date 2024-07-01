package com.pp.sun.bootdockermysqlimage.controller;

import com.pp.sun.bootdockermysqlimage.entity.Programmer;
import com.pp.sun.bootdockermysqlimage.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("docker")
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public ResponseEntity<Map<String,Object>> hiDocker(){
        Map<String,Object> res= new HashMap<>();
        res.put("code",1000);
        res.put("massage","Hi docker this is prasun world ");
        return ResponseEntity.ok(res);
    }

    @RequestMapping(value = "/save/programmer", method = RequestMethod.POST)
    public ResponseEntity<Map<String,Object>> saveProgrammer(@RequestBody Programmer programmer){
        Map<String,Object> res= new HashMap<>();
        res.put("code",1000);
        res.put("massage","Sucess");
        res.put("data",service.saveProgrammer(programmer));

        return ResponseEntity.ok(res);
    }

    @RequestMapping(value = "/get/programmer", method = RequestMethod.GET)
    public ResponseEntity<Map<String,Object>> getProgrammers(){
        Map<String,Object> res= new HashMap<>();
        res.put("code",1000);
        res.put("massage","Sucess");
        res.put("data",service.getProgrammers());
        return ResponseEntity.ok(res);
    }
}
