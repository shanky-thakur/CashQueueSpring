package com.cashQueue.CashQueue.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.cashQueue.CashQueue.services.TransactionServices;
import com.cashQueue.CashQueue.entity.Transactions;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionServices services;

    // Endpoint to fetch all transactions by userId
    @GetMapping("/user/{userId}")
    public List<Transactions> getTransactionsByUserId(@PathVariable String userId) {
        return services.getTransactionsByUserId(userId);
    }

    // Endpoint to fetch all transactions by year
    @GetMapping("/year/{year}")
    public List<Transactions> getTransactionsByYear(@PathVariable String year) {
        return services.getTransactionsByYear(year);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addTransaction(@RequestBody Transactions transaction) {
        services.addTransaction(transaction);
        return new ResponseEntity<>("Transaction added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/tag/{tag}")
    public List<Transactions> getMethodName(@PathVariable String tag) {
        return services.geTransactionsByTag(tag);
    }
    
}
