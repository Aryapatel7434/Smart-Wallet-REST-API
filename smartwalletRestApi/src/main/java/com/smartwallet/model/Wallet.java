package com.smartwallet.model;

import jakarta.persistence.*;

@Entity
@Table(name = "wallets")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int walletId;

    private int userId;

    private double balance;

    private String walletAddress;

    public Wallet() {
    }

    public Wallet(int userId, double balance, String walletAddress) {
        this.userId = userId;
        this.balance = balance;
        this.walletAddress = walletAddress;
    }

    public int getWalletId() {
        return walletId;
    }

    public int getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public String getWalletAddress() {
        return walletAddress;
    }
}