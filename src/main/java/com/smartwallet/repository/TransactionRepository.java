package com.smartwallet.repository;

import com.smartwallet.model.Transaction;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository
        extends JpaRepository<Transaction, Integer> {

    List<Transaction> findBySenderEmail(String senderEmail);

    List<Transaction> findByReceiverEmail(String receiverEmail);
    
    List<Transaction>findBySenderEmailOrReceiverEmail(String senderEmail,String receiverEmail);
}