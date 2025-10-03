package com.pluralsight;
import java.util.Scanner;

public class Solutions {
    // Java Loop Examples - Solutions
// Author: Remsey Mailjard


        public static void main(String[] args) throws InterruptedException {

            // 1. FOR LOOP - Print only even numbers
            System.out.println("For Loop: Printing even numbers from 1 to 10");
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even number: " + i);
            }

            // 2. WHILE LOOP - Countdown timer with 1-second pause
            System.out.println("\nWhile Loop: Countdown timer from 5");
            int j = 5;
            while (j > 0) {
                System.out.println("Countdown: " + j);
                Thread.sleep(1000); // pause for 1 second
                j--;
            }
            System.out.println("Time's up!");

            // 3. DO...WHILE LOOP - Ask user for input until they type "exit"
            System.out.println("\nDo...While Loop: Type 'exit' to quit");
            Scanner scanner = new Scanner(System.in);
            String input;
            do {
                System.out.print("Enter something (type 'exit' to quit): ");
                input = scanner.nextLine();
            } while (!input.equalsIgnoreCase("exit"));

            System.out.println("Program ended.");
            scanner.close();
        }
}
