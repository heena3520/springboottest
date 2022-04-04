package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sendGreetings() {
        return "jjjjjjj   Hello,plllll6522sdddsdsp Kucdaadhwa  Woorld!";
    }
}
