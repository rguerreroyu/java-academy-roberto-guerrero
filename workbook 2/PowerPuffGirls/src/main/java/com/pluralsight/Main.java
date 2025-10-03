package com.pluralsight;

import com.pluralsight.PowerPuffGirl;

public class Main {
    public static void main(String[] args) {

        // Todo: A PowerPuff fighting game
        // Features
        // Play online, play solo

        // Customizing Characters
        // Customes
        // Finishing Moves
        // Team attack
        // Dialogue
        // Health boost

        PowerPuffGirl blossom = new PowerPuffGirl("Blossom", "pink");
        System.out.println(blossom.getName() +" is now entering the fight!");
        System.out.println("Oh no! Mojo jojo strikes with a bomb");
        blossom.setHealth(15);
        System.out.println(blossom.getName() +" is now at " + blossom.getHealth() + " HP");
        blossom.Heal(50);

    }

}