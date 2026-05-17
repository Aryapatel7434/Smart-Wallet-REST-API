package com.smartwallet.controller;

import com.smartwallet.dto.RegisterRequest;
import com.smartwallet.model.User;
import com.smartwallet.model.Wallet;
import com.smartwallet.security.JwtUtil;
import com.smartwallet.service.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService service;
    private final JwtUtil jwtUtil;

    public UserController(UserService service, JwtUtil jwtUtil) {
        this.service = service;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/users/register")
    public String registerUser(@RequestBody RegisterRequest request) {
        return service.registerUser(request);
    }

    @GetMapping("/wallet/{email}")
    public Wallet getWallet(@PathVariable String email) {
        return service.getWalletByEmail(email);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(@RequestHeader("Authorization") String authHeader) {

        String token = authHeader.substring(7);
        String role = jwtUtil.extractRole(token);

        if (!role.equals("ADMIN")) {
            throw new RuntimeException("Access denied: ADMIN only");
        }

        return service.getAllUsers();
    }
}