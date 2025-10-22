package com.democlasses;

public class Reservation {
    String roomType;
    int numberofNights;
    boolean weekend;

    public Reservation(String roomType, int numberofNights, boolean weekend) {
        this.roomType = roomType;
        this.numberofNights = numberofNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberofNights() {
        return numberofNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberofNights(int numberofNights) {
        this.numberofNights = numberofNights;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    public double getPrice() {
        double basePrice = 0.0;

        if (roomType.equalsIgnoreCase("king")) {
            basePrice = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            basePrice = 124.00;
        }

        if (weekend) {
            basePrice *= 1.10;
        }

        return basePrice;
    }

    public double getReservationTotal() {
        return getPrice() * numberofNights;
    }
}
