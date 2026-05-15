package com.smartwallet.service;

import com.smartwallet.dto.LoginRequest;
import com.smartwallet.model.User;
import com.smartwallet.repository.UserRepository;
import com.smartwallet.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public AuthService(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public String login(LoginRequest request) {

        User user = userRepository.findByEmail(request.getEmail());

        if (user == null) {
            return "Invalid email";
        }

        if (!user.getPassword().equals(request.getPassword())) {
            return "Invalid password";
        }

        return jwtUtil.generateToken(user.getEmail());
    }
}