package com.healthcare.backend_health.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class AuthController {

    @GetMapping("/home")
    public String user() {
        return "home";
    }

    @GetMapping("/user")
    public String other() {
        return "other";
    }

}
