package com.pp.sun.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("docker")
public class Controller {

    @GetMapping("/war")
    public ResponseEntity<Map<String,Object>> hi(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",1000);
        map.put("massage","This is the docker war file image responce !");
        return ResponseEntity.ok(map);
    }
}
