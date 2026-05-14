package com.smartwallet.controller;

import com.smartwallet.dto.TransactionRequest;
import com.smartwallet.model.Transaction;
import com.smartwallet.service.TransactionService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping("/send")
    public String sendMoney(
            @RequestBody TransactionRequest request) {

        return service.sendMoney(request);
    }
 @GetMapping("/history/{email}")
public List<Transaction> getHistory(@PathVariable String email) {
    return service.getTransactionHistory(email);
}
}