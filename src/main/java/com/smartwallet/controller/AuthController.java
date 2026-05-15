package com.smartwallet.controller;

import com.smartwallet.dto.LoginRequest;
import com.smartwallet.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController//this tells spring this class handles rest apis
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService service;//service object

    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return service.login(request);
    }
}