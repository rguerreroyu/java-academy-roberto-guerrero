package com.pluralsight;

import java.util.Scanner;

//import static jdk.internal.org.jline.utils.AttributedStringBuilder.append;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String Firstname = scanner.nextLine().trim();

        System.out.println("Middle name if applicable: ");
        String MiddleName = scanner.nextLine().trim();

        if (!MiddleName.isEmpty()) {

        }
        System.out.println("Last name: ");
        String Lastname = scanner.next().trim();

        System.out.println("Suffix: ");

        String Suffix = scanner.next().trim();

        StringBuilder FullName = new StringBuilder();
        FullName.append(Firstname)
                .append(" ")
                .append(MiddleName)
                .append(" ")
                .append(Lastname)
                .append(" ")
                .append(Suffix);
        if (!MiddleName.isEmpty()) {
            FullName.append(" ");
            FullName.append(MiddleName);
        }
        System.out.println(FullName.toString());
    }
}
