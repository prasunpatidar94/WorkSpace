package com.pp.sun.DockerImage1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class Controller {

    @GetMapping("/hi")
    public String hello() {
        return "Hello docker image is running.by docker plugin with case management..!";
    }
}
