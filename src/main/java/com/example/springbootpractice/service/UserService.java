package com.example.springbootpractice.service;

import com.example.springbootpractice.dto.CreateUserRequest;
import com.example.springbootpractice.entity.User;
import com.example.springbootpractice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(CreateUserRequest dto) {
        User user = new User(
                null,
                dto.getUsername(),
                dto.getEmail(),
                dto.getPassword()   // TODO: 평문을 암호문으로 수정이 필요
        );
        return userRepository.save(user);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
