package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String movieDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date  = LocalDate.parse(movieDate,formatter);
        DateTimeFormatter desiredformat = DateTimeFormatter.ofPattern("yyyy d MMM");

        String finalformattedDate = date.format(desiredformat);


        System.out.print("How many tickets would you like?: ");
        int numberoftickets = scanner.nextInt();

        if (numberoftickets >1){
            System.out.println(numberoftickets +" tickets reserved for "+finalformattedDate+ " under " + fullName);
        } else{
            System.out.println(numberoftickets +" ticket reserved for "+finalformattedDate+ " under " + fullName);
        }

        }

        //System.out.println()
        //Please enter your name: Geri Johnson↵
        //What date will you be coming (MM/dd/yyyy): 5/13/2023↵
        //Prompt the user for their full name, the date of the show, and the number of
        //tickets they will need.
       // Once the reservation is made, display a confirmation message to the customer in
       /// this format:
//# ticket(s) reserved for (date) under (LastName, FirstName)
    }