package com.sun.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hi() {
        return "Hello World";
    }
}
