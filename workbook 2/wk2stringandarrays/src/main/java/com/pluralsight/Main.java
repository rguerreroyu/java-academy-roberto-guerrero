package com.pluralsight;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== STRINGS ===");

        String name = "Child's Play";
        System.out.println("Hello, " + name); // Concatenation
        // String methods
        System.out.println("Length of name: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("LowercASE: " + name.toLowerCase());
        System.out.println("First letter: " + name.charAt(0));   //R
        System.out.println("Does it contain 'sey'? " + name.contains("sey")); //true or false

        // For loop
        System.out.println("Counting from 1 to 5:");
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("Number: " + counter);
        }
        // While loop
        System.out.println("\nPassword is incorrect:");
        Scanner read = new Scanner(System.in);

        boolean passwordIncorrect;
        String password = "1234";
        String enterPassword = "";

        while (!enterPassword.equals(password)) {
            System.out.println("What is the password?");
            enterPassword = read.nextLine();
            if (!enterPassword.equals(password)) ;
            {
                System.out.println("Incorrect");
            }


        }
    }
}