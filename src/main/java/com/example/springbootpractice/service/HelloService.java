package com.example.springbootpractice.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getHelloMessage(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }
}
