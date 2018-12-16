package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/test")
    public String test1(){
        System.out.println("shi wo ai si le zuotian");
        System.out.println("wo di ji mo");
        return "first test";
    }
}
