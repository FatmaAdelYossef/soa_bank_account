package com.nti;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(0);
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n1- Deposit");
            System.out.println("2- Withdrawal");
            System.out.println("3- Check Balance");
            System.out.println("4- Transaction History");
            System.out.println("5- Search By Type");
            System.out.println("6- Exit");

            int choice = input.nextInt();

            if (choice == 1) {

                System.out.print("ادخل المبلغ: ");
                double amount = input.nextDouble();
                account.deposit(amount);

            }
            else if (choice == 2) {

                System.out.print("ادخل المبلغ: ");
                double amount = input.nextDouble();
                account.withdrawal(amount);

            }
            else if (choice == 3) {

                System.out.println("الرصيد الحالي: " + account.getBalance());

            }
            else if (choice == 4) {

                account.showHistory();

            }
            else if (choice == 5) {

                System.out.print("ادخل النوع (DEPOSIT / WITHDRAWAL): ");
                String type = input.next();
                account.searchByType(type);


            }
            else if (choice == 6) {

                break;

            }
        }

        input.close();
    }
}