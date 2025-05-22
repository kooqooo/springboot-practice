package com.example.springbootpractice.controller;

import com.example.springbootpractice.entity.User;
import com.example.springbootpractice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(
            @RequestBody User user
    ) {
        User created_user = userService.createUser(
                user.getUsername(),
                user.getEmail()
        );
        return ResponseEntity.ok(created_user);
    }

    @GetMapping
    public ResponseEntity<List<User>> get() {
        return ResponseEntity.ok(userService.getAll());
    }
}
