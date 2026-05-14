package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private double balance;
    private int accountNumber;
    private double dailyLimit = 500.0;
   
    private final List<Transaction> transactionHistory;

    private static int accountCounter = 1000;

    public Account() {
        this.balance = 0.0;
        this.accountNumber = ++accountCounter;
        this.transactionHistory = new ArrayList<>();
        System.out.println("Account Number " + accountNumber + " Created. Balance: " + balance);
    }

    public Account(Double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = ++accountCounter;
        this.transactionHistory = new ArrayList<>();
        System.out.println("Account Number " + accountNumber + " Created. Balance: " + balance);
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            balance += amount;
           
            transactionHistory.add(new Transaction("Deposit", amount, balance));
            System.out.println("Deposited " + amount + " to Account: " + accountNumber);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Amount is invalid, please try again.");
        }
    }

    public void withdraw(Double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }

        if (amount > dailyLimit) {
            System.out.println("Action denied: You exceeded your daily limit!");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            dailyLimit -= amount; 
            
            transactionHistory.add(new Transaction("Withdrawal", amount, balance));
            
            System.out.println("Withdraw Successful.");
            System.out.println("Balance is now: " + balance);
            
            if (dailyLimit == 0) {
                System.out.println("Notice: You have reached your daily limit.");
            }
        } else {
            System.out.println("Insufficient balance! Please try again.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("\n======= Transaction History for Acc: " + accountNumber + " =======");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions recorded yet.");
        } else {
            for (Transaction t : transactionHistory) {
                System.out.println(t); 
            }
        }
        System.out.println("==========================================================\n");
    }

    public void searchByType(String type) {
    System.out.println("\n--- Search Results for: " + type + " ---");
    boolean found = false;

    for (Transaction t : transactionHistory) {
        if (t.getType().equalsIgnoreCase(type)) {
            System.out.println(t);
            found = true;
        }
    }

    if (!found) {
        System.out.println("No transactions found with type: " + type);
    }
}
    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}