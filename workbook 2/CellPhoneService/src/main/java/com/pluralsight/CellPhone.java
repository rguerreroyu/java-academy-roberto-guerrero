package com.pluralsight;

public class CellPhone {
    private String carrier;
    private String model;
    private int SerialNumber;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.SerialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";


    }
    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.SerialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }


    public String getcarrier() {
        return carrier;
    }

    public void setCarrier(String mobilecarrier) {
        carrier = mobilecarrier;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        SerialNumber = serialNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String phoneNumber) {
        System.out.println(getOwner() + "'s phone is calling " + phoneNumber);
    }
    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getcarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println(); // blank line for spacing
    }

}






