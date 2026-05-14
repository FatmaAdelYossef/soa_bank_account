package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Enter a number: ");
            String input = sc.nextLine();

            if (input.matches("-?\\d+")) {
                number = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        //problem 1

        EvenOrOdd(number);

   //********************************************
        //problem 2
//        MultiplicationTable(number);

//********************************************
        //problem 3
       Max();

    }

    public static void EvenOrOdd(int number){
        if (number % 2 != 0)
            System.out.println("The number is ODD");
        else
            System.out.println("The number is EVEN");
    }

    public static void MultiplicationTable(int number){
        for (int i = 1; i <= 10; i++){
            System.out.println(i+" * "+ number+" = "+(number*i));
        }
    }

    public static int readNumber(Scanner input)
    {
        int num;
        while (true) {

            System.out.println("Enter number: ");
            String value = input.nextLine();

            if (value.matches("-?\\d+")) {
              num = Integer.parseInt(value);
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }
        return num;
    }
    public static void Max()
    {
        int num1,num2,num3,max;
        Scanner sc = new Scanner(System.in);
       num1=readNumber(sc);
       num2=readNumber(sc);
       num3=readNumber(sc);

        if (num1 > num2 && num1 > num3) {
            max = num1;
        }
        else if (num2 > num1 && num2 > num3) {
            max = num2;
        }
        else {
            max = num3;
        }
        System.out.println("Max number is : " +max);


    }



}

