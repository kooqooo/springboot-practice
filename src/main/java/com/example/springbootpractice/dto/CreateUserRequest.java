package com.example.springbootpractice.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
    private String username;
    private String email;
    private String password;
}
