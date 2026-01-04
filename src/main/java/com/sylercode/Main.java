package com.sylercode;

import javax.xml.transform.Source;
import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterst = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 100000");
        }

        while (true) {
            System.out.println("Annial Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterst = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                 numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter value between 1 and 30.");
        }

        double mortgage = principal
                * (monthlyInterst * Math.pow(1 + monthlyInterst, principal))
                / (Math.pow(1 + monthlyInterst, numberOfPayments));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().toString();
        System.out.println("Mostgage: " + mortgageFormatted);









//        String[] fruits = { "Apple", "Mango", "Orange" };
//
//        for (int i = 0; i < fruits.length; i++)
//            System.out.println(fruits[i]);
//
//        for (String fruit : fruits)
//            System.out.println(fruit);




        //while Loop
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.print("input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }

        //for Loop
//        for (int i = 0; i < 5; i++)
//            System.out.println("Hello World " + i );





//        Scanner scanner = new Scanner(System.in);
//      System.out.print("Temperature: ");
//      String temp = scanner.nextLine();
//      switch (temp){
//          case "Cold":
//              System.out.println("Temperature is between 1 to 20 degree");
//              break;
//
//          case "Warm":
//              System.out.println("Temperature is between 21 to 30 degree");
//              break;
//
//          case "Hot":
//              System.out.println("Temperature is > 30 degree");
//              break;
//
//          default:
//              System.out.println("Freezing to death");
//      }




//        int income = 120_000;
//        String className;
//        if (income > 100_000)
//            className = "First";
//        else
//            className = "Economy";
//        System.out.println(className);
//
//         className = (income < 100_000) ? "First" : "Economy";
//        System.out.println(className);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Temperature: ");
//        byte temp = scanner.nextByte();
//        if (temp > 30) {
//            System.out.println("It's a hot day");
//            System.out.println("Drink water");
//        }
//        else if (temp > 20)
//            System.out.println("Beautiful day");
//        else if (temp > 0) {
//            System.out.println("Cold day");
//
//        } else
//            System.out.println("Freezing to death");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name; ");
//        String name = scanner.nextLine().trim();
//        System.out.print("Age; ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + name.toUpperCase());
//        System.out.println("You are " + age + " Year old");
////        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = "$"+ currency.format(128374.345);
//        System.out.println(result);

//        int x = 1;
//        int y = ++x;
//        y = y+2;
//        y *= 2;
//        System.out.println(x);
//        System.out.println(y);
        //modern way
//        int [][] numbers = { {11,2,3},{6,7,4} };
//        Arrays.sort(numbers[0]);
//        Arrays.sort(numbers[1]);
//        System.out.println(Arrays.deepToString(numbers));

        //normal way
//        int [][] numbers = new int [2][3];
//        numbers [0][0] = 1;
//        numbers [0][1] = 2;
//        numbers [0][2] = 9;
//        numbers [1][0] = 1;
//        numbers [1][1] = 2;
//        numbers [1][2] = 9;
//        System.out.println(Arrays.deepToString(numbers));
//        //ARRAYS
        //modern way
//        int [] numbers = {1,5,10,15};
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));        //normal way

//        int number1 = 1;
//        int number2 = 2;
//        int [] numbers = new int [3];
//        numbers [0] = 1;
//        numbers [1] = 5;
//        numbers [2] = 10;
//        System.out.println(Arrays.toString(numbers));
//
//        String firstname = "Syler ";
//        String lastname = "Bustarde";
//        String fullname = firstname + lastname;
//        System.out.println(fullname.startsWith("Sy"));

        //Reference

//        Point p1 = new Point(1,1);
//        Point p2 = p1;
//        p1.x=2;
//        System.out.println(p2);

        //premitive

//        int x = 1;
//        int y = x;
//        x=2;
//        System.out.println(y);
//

//        int myAge = 30;
//        int herAge = myAge;
//        System.out.println(herAge);
    }
}
