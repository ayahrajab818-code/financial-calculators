package com.pluralsight;

import java.util.Scanner;

public class mortageCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Get the user input
        System.out.print("Enter the principal loan: ");
        double principle = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter the number of years for the loan: ");
        int years = scanner.nextInt();

        //Convert to decimal
        double r = annualRate / 100 
        double i = r / 12;
        int n = years * 12;


        //Calculate monthly rate
        double monthlyPayment = principle * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);

        //Calculate total interest
        double totalInterest = (monthlyPayment * n ) - principle;

        //Result
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total interest: $%.2f%n" , totalInterest);
    }
}
