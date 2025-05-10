package com.example.springbootpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootpractice.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;
    
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping
    public String sayHello(@RequestParam(value = "name", required = false) String name) {
        return helloService.getHelloMessage(name);
    }
}
