package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String choice;
        Account account1 = new Account();

        do {

            System.out.println("Choose what you want to do: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3.See blance");
            System.out.println("4.Transaction History");
            System.out.println("5.search with transaction");
            System.out.println("6. Exit");

            System.out.println("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextLine();
                   
                if (choice.equals("1")) {
                    account1.deposit(readAmount());
                } else if (choice.equals("2")) {
                    account1.withdraw(readAmount());
                } else if (choice.equals("3")) {
                    System.out.println("Current Balance: " + account1.getBalance());
                } else if (choice.equals("4")) {
                    account1.printTransactionHistory();
                } else if (choice.equals("5")) {
                    System.out.println("Enter type to search:");
                        String searchType = sc.nextLine();
                        account1.searchByType(searchType);
                }
                else if (choice.equals("6")) {
                    System.exit(0);
                }
        }while (true);


    }

    public  static double readAmount() {
        Scanner sc = new Scanner(System.in);

        double amount;
        while (true) {
            System.out.println("Enter amount: ");

            String input = sc.nextLine();

            if (input.matches("-?\\d+")) {
                amount = Double.parseDouble(input);
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        return amount;
    }
}

