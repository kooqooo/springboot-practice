package com.example.springbootpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping()
    public String index() {
        return "안녕하세요";
    }
}
