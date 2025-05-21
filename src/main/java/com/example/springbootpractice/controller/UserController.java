package com.example.springbootpractice.controller;

import com.example.springbootpractice.dto.CreateUserRequest;
import com.example.springbootpractice.entity.User;
import com.example.springbootpractice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User createUser(@RequestBody CreateUserRequest dto) {
        return userService.createUser(dto);
    }

    @GetMapping
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
