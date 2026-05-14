/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartwallet.dto;

/**
 *
 * @author ABC
 */
public class TransactionRequest {
    private String senderEmail;
    
    private String receiverEmail;
    
    private double amount;
    
    public TransactionRequest(){}

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public double getAmount() {
        return amount;
    }

    
}
