package com.pluralsight;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "1234";

        Scanner scanner = new Scanner(System.in);
        if(password == "1234");
        System.out.print("Enter password: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("What do you want to do? ");
        System.out.print(" Enter 'add' or 'subtract': ");
        String action = scanner.nextLine();
    }
}
