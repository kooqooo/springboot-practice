package com.example.springbootpractice.service;

import com.example.springbootpractice.entity.User;
import com.example.springbootpractice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public void create(String name, String email) {
        userRepository.save(new User(name, email));
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
