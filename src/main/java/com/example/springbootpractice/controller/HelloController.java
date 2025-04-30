package com.example.springbootpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello(@RequestParam(value = "name", required = false) String name) {
        if (name != null && !name.isBlank()) {
            return "Hello, " + name + "님";
        }
        return "Hello, World!";
    }
}
