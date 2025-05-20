package com.example.springbootpractice.controller;

import com.example.springbootpractice.entity.User;
import com.example.springbootpractice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> post(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "email") String email
    ) {
        userService.create(name, email);
        return ResponseEntity.ok("saved");
    }

    @GetMapping
    public ResponseEntity<List<User>> get() {
        return ResponseEntity.ok(userService.getAll());
    }
}
