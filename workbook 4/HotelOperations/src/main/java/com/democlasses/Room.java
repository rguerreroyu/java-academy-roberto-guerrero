package com.democlasses;

public class Room {
    int NumberOfBeds;
    int price;
    boolean occupied;
    boolean dirty;
    boolean available;

    public Room(int numberOfBeds, int price, boolean occupied, boolean dirty, boolean available) {
        NumberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int getNumberOfBeds() {
        return NumberOfBeds;
    }

    public int getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }



}
