package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello, World!";
    }

    @GetMapping("/world")
    public String getWord() {
        return "Hello, World!";
    }

    @GetMapping("/hworld")
    public String gethWord() {
        return "Hello, World!";
    }
}