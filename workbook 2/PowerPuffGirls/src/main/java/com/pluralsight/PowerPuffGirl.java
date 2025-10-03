package com.pluralsight;

public class PowerPuffGirl {

    // instance variables (typically hidden)
    private String name;
    private int health;
    private String outfitcolor;
    private int attackDamage;
    private int power;

    //Consutructor (parameters with a _name)
    public PowerPuffGirl(String _name, String _outfitcolor) {
        this.name = _name;
        this.outfitcolor = _outfitcolor;
        this.power = 100; // default values
        this.health = 100; // default values
        this.attackDamage = 100; // default values
    }

    public String getName() {
        return this.name;
    }


    public int getHealth() {
        return this.health;
    }

    public void setHealth(int _newHealth) {
        if(_newHealth >= 0 && _newHealth <= 100) {
            this.health = _newHealth;
        } else {
            System.out.println("Come on, this is not possible. Try again!");
        }
    }

    public void Heal(int _howMuchHealth) {
        System.out.print("Drinking potion");
        this.setHealth(this.health+ _howMuchHealth);
         //this.health = this.health + howMuchHealth;

        int sum = this.health  + _howMuchHealth;
            if(sum > 100) {
                this.setHealth(100);
                System.out.println("Fully recovered");
            }
        int newHealth = this.health  + _howMuchHealth;
        if(newHealth >= 100) {
            this.setHealth(100);
            System.out.println("Fully recovered");
        }
        else {
            setHealth(newHealth);
        }
    }








}
