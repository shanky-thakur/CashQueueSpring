package com.cashQueue.CashQueue.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transaction")
public class Transactions {

    // defining userId
    private String userId;

    // getter and setter for userId
    // getter
    public String getUserId() {
        return this.userId;
    }

    // setter
    public void setUserId(String id) {
        this.userId = id;
    }

    // defining transactionId as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    // getter and setter for transactionID
    // getter
    public long getTransactionId() {
        return this.transactionId;
    }

    // setter
    public void setTransactionId(long id) {
        this.transactionId = id;
    }

    // defining type of transaction - (expense or gain)
    @Column(nullable = false)
    private String typeOfTransaction;

    // getter and setter for type of transaction
    // getter
    public String getTypeOfTransaction() {
        return this.typeOfTransaction;
    }

    // setter
    public void setTypeOfTransaction(String type) {
        this.typeOfTransaction = type;
    }

    // amount of transaction
    @Column(nullable = false)
    private String amount;

    // getter and setter for amount
    // getter
    public String getAmount() {
        return this.amount;
    }

    // setter
    public void setAmount(String amount) {
        this.amount = amount;
    }

    // tag for filtration
    @Column
    private String tag;

    // getter and setter for tag
    // getter
    public String getTag() {
        return this.tag;
    }

    // setter
    public void setTag(String tag) {
        this.tag = tag;
    }

    // description for transaction
    @Column
    private String description;

    // getter and setter for description
    // getter
    public String getDescription() {
        return this.description;
    }

    // setter
    public void setDescription(String description) {
        this.description = description;
    }

    // defining date
    private String date;

    // getter and setter for date
    // getter
    public String getDate() {
        return this.date;
    }

    // setter
    public void setDate(String date) {
        this.date = date;
    }

    // defining year of transaction
    private String year;

    // getter and setter
    // getter
    public String getYear() {
        return this.year;
    }

    // setter
    public void setYear(String year) {
        this.year = year;
    }

    // constructor
    public Transactions(String userId, long transactionId, String type, String amount, String tag, String description, String date, String year) {
        setUserId(userId);
        setTransactionId(transactionId);
        setTypeOfTransaction(type);
        setAmount(amount);
        setTag(tag);
        setDescription(description);
        setDate(date);
        setYear(year);
    }

    public Transactions() {
        // Default constructor required by Hibernate
    }

}
