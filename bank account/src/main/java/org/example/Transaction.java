package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private  LocalDateTime date;
    private  String type;
    private  double amount;
    private  double remainingBalance;

    public Transaction(String type, double amount, double remainingBalance) {
        this.date = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
        this.remainingBalance = remainingBalance;
    }

    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("[%s] %-10s | Amount: %-8.2f | Balance: %.2f", 
                date.format(formatter), type, amount, remainingBalance);
    }
}