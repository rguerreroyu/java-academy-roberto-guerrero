package com.democlasses;

public class Room {
    int NumberOfBeds;
    int price;
    boolean occupied;
    boolean dirty;
    boolean available;
    boolean checkIn;
    boolean checkOut;
    boolean cleanRoom;


    public Room(int numberOfBeds, int price, boolean occupied, boolean dirty, boolean available) {
        NumberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;


    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isCleanRoom() {
        return cleanRoom;
    }

    public void setCleanRoom(boolean cleanRoom) {
        this.cleanRoom = cleanRoom;
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

    public void checkIn() {
        if (this.isDirty()) {
            this.occupied = true;
            this.dirty = false;
        }
    }

    public void checkOut() {
        if (this.occupied) {
            this.occupied = false;
            this.dirty = false;
        }

    }
    public void cleanRoom() {
        this.dirty = false;
    }

}
