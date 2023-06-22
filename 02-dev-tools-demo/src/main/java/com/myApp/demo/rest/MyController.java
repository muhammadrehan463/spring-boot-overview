package com.myApp.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/abc")
    public String newController(){
        return "New Controller";
    }

    @GetMapping("/abcd")
    public String abcdController(){
        return "This is abcd Controller";
    }
}
