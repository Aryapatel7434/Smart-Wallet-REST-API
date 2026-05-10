package com.smartwallet.service;

import com.smartwallet.dto.RegisterRequest;
import com.smartwallet.model.User;
import com.smartwallet.model.Wallet;
import com.smartwallet.repository.UserRepository;
import com.smartwallet.repository.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final WalletRepository walletRepository;
    //constructor injection
    public UserService(UserRepository userRepository, WalletRepository walletRepository) {
        this.userRepository = userRepository;
        this.walletRepository = walletRepository;
    }
//this method receives user data from controller.
    public String registerUser(RegisterRequest request) {

        User existingUser = userRepository.findByEmail(request.getEmail());

        if (existingUser != null) {
            return "User already exists";
        }

        User user = new User(
                request.getName(),
                request.getEmail(),
                request.getPassword()
        );

        User savedUser = userRepository.save(user);

        String walletAddress =
                "WALLET_" + savedUser.getName().toUpperCase() + "_" + savedUser.getUserId();

        Wallet wallet = new Wallet(
                savedUser.getUserId(),
                0.0,
                walletAddress
        );

        walletRepository.save(wallet);

        return "User registered successfully. Wallet Address: " + walletAddress;
    }

    public Wallet getWalletByEmail(String email) {

        User user = userRepository.findByEmail(email);

        if (user == null) {
            return null;
        }

        return walletRepository.findByUserId(user.getUserId());
    }
}