package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please provide the following information:");

        System.out.println("Full name: ");
        String FullName = scanner.nextLine();

        // Billing
        System.out.println("Billing street ");
        String BillingStreet = scanner.nextLine();

        System.out.println("Billing city: ");
        String BillingCity = scanner.nextLine();

        System.out.println("Billing State");
        String BillingState = scanner.nextLine();

        System.out.println("Billing Zip: ");
        String BillingZip = scanner.nextLine();

        // Shipping
        System.out.println("Shipping Street: ");
        String ShippingStreet = scanner.nextLine();

        System.out.println("Shipping City: ");
        String ShippingCity = scanner.nextLine();

        System.out.println("Shipping State: ");
        String ShippingState = scanner.nextLine();

        System.out.println("Shipping Zip: ");
        String ShippingZip = scanner.nextLine();

        StringBuilder info = new StringBuilder();
        info.append(FullName).append("\n");
        info.append("Billing Address:").append("\n");
        info.append(BillingStreet).append(" ");
        info.append(BillingCity).append(", ");
        info.append(BillingState).append(" ");
        info.append(BillingZip).append("\n");
        info.append("Shipping Address:").append("\n");
        info.append(ShippingStreet).append(" ");
        info.append(ShippingCity).append(", ");
        info.append(ShippingState).append(" ");
        info.append(ShippingZip).append(" ");


        System.out.println(info);


    }
}