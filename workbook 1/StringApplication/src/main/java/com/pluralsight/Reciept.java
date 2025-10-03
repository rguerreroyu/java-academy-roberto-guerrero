package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {
        String item = "Watermelon";
        double watermelonpriceperPound = 0.80;
        int watermelonWeight = 15;
        double totalPrice = watermelonpriceperPound * watermelonWeight;

        System.out.println("You bought a "+ item + " that weighs " + watermelonWeight + " pounds "+ "for " + "$"+totalPrice);
    }
}
