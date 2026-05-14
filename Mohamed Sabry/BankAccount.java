package com.nti;

import java.util.*;

public class BankAccount {

    private double balance;

    private Map<String, List<String>> history = new HashMap<>();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;

        history.put("DEPOSIT", new ArrayList<>());
        history.put("WITHDRAWAL", new ArrayList<>());
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("تم الإيداع بنجاح");

            history.get("DEPOSIT")
                    .add("+" + amount + " | Balance: " + balance);
        } else {
            System.out.println("المبلغ غير صحيح");
        }
    }

    public void withdrawal(double amount) {

        if (amount <= 0) {
            System.out.println("المبلغ غير صحيح");
        }
        else if (amount > 500) {
            System.out.println("الحد الأقصى للسحب في العملية الواحدة هو 500");
        }
        else if (amount <= balance) {
            balance -= amount;
            System.out.println("تم السحب بنجاح");

            history.get("WITHDRAWAL")
                    .add("-" + amount + " | Balance: " + balance);
        }
        else {
            System.out.println("رصيد غير كافي");
        }
    }

    public void searchByType(String type) {

        type = type.toUpperCase();

        if (history.containsKey(type)) {

            List<String> list = history.get(type);

            if (list.isEmpty()) {
                System.out.println("لا يوجد معاملات من هذا النوع");
            } else {
                System.out.println("\n--- " + type + " ---");
                for (String record : list) {
                    System.out.println(record);
                }
            }

        } else {
            System.out.println("نوع غير صحيح (DEPOSIT / WITHDRAWAL)");
        }
    }

    public void showHistory() {

        System.out.println("\n--- DEPOSIT ---");
        if (history.get("DEPOSIT").isEmpty()) {
            System.out.println("لا يوجد إيداعات");
        } else {
            for (String r : history.get("DEPOSIT")) {
                System.out.println(r);
            }
        }

        System.out.println("\n--- WITHDRAWAL ---");
        if (history.get("WITHDRAWAL").isEmpty()) {
            System.out.println("لا يوجد سحوبات");
        } else {
            for (String r : history.get("WITHDRAWAL")) {
                System.out.println(r);
            }
        }
    }
}
