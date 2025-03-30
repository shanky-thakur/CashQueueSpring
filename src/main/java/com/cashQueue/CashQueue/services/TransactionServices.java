package com.cashQueue.CashQueue.services;

import java.util.List;
import com.cashQueue.CashQueue.entity.Transactions;
import com.cashQueue.CashQueue.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServices {

    @Autowired
    private Repository repository;

    // service to add transaction to db
    public void addTransaction(Transactions transaction) {
        repository.save(transaction);
    }

    // Retrieve all transactions for a specific user
    public List<Transactions> getTransactionsByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    // Retrieve all transactions for a specific year
    public List<Transactions> getTransactionsByYear(String year) {
        return repository.findByYear(year);
    }

    // Retrieve all transactions for a specific tag
    public List<Transactions> geTransactionsByTag(String tag) {
        return repository.findByTag(tag);
    }

}
