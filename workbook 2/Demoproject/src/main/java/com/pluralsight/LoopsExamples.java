package com.pluralsight;

import java.util.Scanner;

public class LoopsExamples {
    // Demonstrates: for loop, while loop, do...while loop
        public static void main(String[] args) {

            // 1. FOR LOOP
            // Use when you know how many times you want to repeat
            System.out.println("For Loop: Counting from 1 to 5");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Iteration " + i);
            }

            // 2. WHILE LOOP
            // Use when you don't know how many times in advance
            System.out.println("\nWhile Loop: Counting down from 5");
            int j = 5;
            while (j > 0) {
                System.out.println("Countdown: " + j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                j--;
            }

            // 3. DO...WHILE LOOP
            // Always runs at least once, even if condition is false
            Scanner scanner = new Scanner(System.in);
            String input;

            input = scanner.nextLine();
            do {
                System.out.println("\nType 'exit' to exit");

            } while (!input.equals("exit"));

    }


    //boolean passwordIncorrect = true;
   // String password = "1234";
   // String enterPassword = "";

          //  while (passwordIncorrect = true) {
     //   System.out.println("What is the password?");
    //    enterPassword = read.nextLine();
     //   if(!enterPassword.equals(password)) ;
        {

          //  System.out.println("Incorrect");
        }
        //passwordIncorrect = false;
}
