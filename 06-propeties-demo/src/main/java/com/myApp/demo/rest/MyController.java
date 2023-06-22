package com.myApp.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // injecting cach and team name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String TeamInfo(){
        return "Coach:" + coachName +  ",Team Name:" + teamName;
    }

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
