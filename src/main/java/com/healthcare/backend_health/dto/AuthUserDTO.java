package com.healthcare.backend_health.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AuthUserDTO {

    private int id;
    private String username;
    private String password;
    private String email;

}
