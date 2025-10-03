package com.pluralsight;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-"); //4

        System.out.println(dashPosition);
        String vendor = productCode.substring(0, dashPosition);  // cut the text between 0 and 4 characters
        System.out.println(vendor);
        String productNum = productCode.substring(dashPosition + 1);
        System.out.println(productNum);


        String firstname = "Nazik";
        String partOfTheName = firstname.substring(2, 4);
        System.out.println(partOfTheName);

        String myEmailaddress = "rguerrero@my.yearup.org";
        int atIndex = myEmailaddress.indexOf("@");

        if (myEmailaddress.endsWith("my.yearup.org")) {

            System.out.println("Valid address");
        }
            else{
                System.out.println("Please enter a valid Email address");
            }

            // this is true

    }
        public static void validateEmailAddresses(String email){
            int atIndex = email.indexOf("@");

            String emaildomain = email.substring(atIndex);
            if (emaildomain.endsWith("my.yearup.org")) {

                System.out.println("Valid address");
            }
            else{
                System.out.println("Please enter a valid Email address");
            }


        }
}
