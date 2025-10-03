package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        String favoriteColor = "Grey";
        System.out.print("My favorite color is " + favoriteColor + "!");

        int yearStarted = 2025;
        System.out.println(" I started the Year Up program in "+ yearStarted);

        char nicknameInitial = 'R';
        System.out.println("My nick name initial is "+ nicknameInitial);

        boolean havePet = true;
        if(havePet);
        {
            System.out.println("It is " + havePet + " I have one pet");
        }
        String niceMessage = "I hope you have a great day!";
        System.out.println(niceMessage);

        //exercise 2

        int numberofdaysinWeek = 7;
        System.out.println("The number of days in a week are "+ numberofdaysinWeek);

        double priceofCoffee = 4.99;
        System.out.println("The price of the coffee is "+ priceofCoffee);

        char favoriteLetter = 'G';
        System.out.println("My favorite letter is "+ favoriteLetter);

        boolean isRaining = false;

        if (isRaining){
            System.out.println("It is not raining today");
        } else {
            System.out.print("It is raining cats and dogs today!");
        }



    }
}
