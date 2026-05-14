/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartwallet.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
/**
 *
 * @author ABC
 */
@Entity//this class hold the database table
@Table(name="transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int tranactionId;
    private String senderEmail;
    private String receiverEmail;
    private double amount;
    private String status;
    private LocalDateTime createdAt;
    
    public Transaction(String email, String email1, double amount1, String success, LocalDateTime now){}

    public Transaction(int tranactionId, String senderEmail, String receiverEmail, double amount, String status, LocalDateTime createdAt) {
        this.tranactionId = tranactionId;
        this.senderEmail = senderEmail;
        this.receiverEmail = receiverEmail;
        this.amount = amount;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getTranactionId() {
        return tranactionId;
    }

    public void setTranactionId(int tranactionId) {
        this.tranactionId = tranactionId;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
}
