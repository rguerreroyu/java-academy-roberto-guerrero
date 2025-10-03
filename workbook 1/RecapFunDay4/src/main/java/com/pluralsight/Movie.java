package com.pluralsight;

public class Movie {
    public static void main(String[] args){
        String movieTitle = "Halloween";
        int friends = 15;
        double pizzaPrice = 4.50;
        boolean popcorn = true;

        System.out.println("As a reminder movie night is tonight at 7 PM, we’re watching " + movieTitle + " while eating popcorn and pizza " + "with " + friends + " friends!");
        System.out.println("Since we all agreed to split the pizza the price will be " + pizzaPrice * friends);

        if(popcorn) {
            System.out.println("Popcorn time!");
        } else {
            System.out.println("We do not have any popcorn yet.");
        }
    }


}
