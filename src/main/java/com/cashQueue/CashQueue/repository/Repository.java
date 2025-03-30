package com.cashQueue.CashQueue.repository;

import java.util.List;
import com.cashQueue.CashQueue.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Transactions, Long> {

    // Fetch all transactions by a specific user
    List<Transactions> findByUserId(String userId);

    // Fetch all transactions for a specific year
    List<Transactions> findByYear(String year);

    // Fetch all transactions for a specific tag
    List<Transactions> findByTag(String tag);

}
