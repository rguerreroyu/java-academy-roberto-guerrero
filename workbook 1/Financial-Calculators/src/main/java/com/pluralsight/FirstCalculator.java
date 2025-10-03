package com.pluralsight;

import java.util.Scanner;

public class FirstCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your loans total amount: ");
        double totalloanAmount = input.nextDouble();

        System.out.println("Please enter your Annual interest rate");
        double annualinterestrate = input.nextDouble();

        System.out.println("Please enter how many years the loan lasts.");
        double loanterm = input.nextDouble();

        double numberofmonthlyPayments = 12 * loanterm;
        System.out.println("Your number of monthly payments will be " + "$" + numberofmonthlyPayments);

        double monthlyinterestrate = annualinterestrate/12;
        System.out.println("Your monthly interest rate is " + "$"+ monthlyinterestrate);

        double monthlyPayments = totalloanAmount * (monthlyinterestrate* Math.pow(1+ monthlyinterestrate, numberofmonthlyPayments)) / (Math.pow((1 + monthlyinterestrate), numberofmonthlyPayments) -1);

        //calculator - used to calculate out how much a monthly payment for a loan would be (minus any insurance or taxes), as well as how much interest you would pay over the life of the loan.
        //M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1)

    }
}
