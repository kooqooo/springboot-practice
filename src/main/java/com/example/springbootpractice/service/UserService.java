package com.example.springbootpractice.service;

import com.example.springbootpractice.entity.User;
import com.example.springbootpractice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(String username, String email) {
        User user = new User(
                null,
                username,
                email,
                "password"
        );
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
