package com.pluralsight;

public class Story {
        public static void main(String[] args) {
            String heroName = "Aria";       // hero's name
            int health = 100;               // whole-number HP
            int gold = 0;                   // coins collected
            double potionPower = 12.5;      // potion strength (decimal)
            boolean hasMagicSword = false;  // true/false
            int damage = 30;
            health = health - damage;
            if (health < 0) {
                health = 0;
                int health = 60;
                int potionHeal = 15;
                for (int i = 1; i <= 3; i++) {
                    health += potionHeal;
                    if (health > 100) health = 100;
                    System.out.println("After potion " + i + ": HP = " + health);
                }



            }
            System.out.println("HP: " + health); // prints 70
            String[] inventory = {"Torch", "Rope"}; // basic items

            System.out.println(heroName + " enters Javaia with " + health + " HP.");
        }
    }


