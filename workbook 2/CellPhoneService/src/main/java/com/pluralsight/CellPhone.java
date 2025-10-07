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
    }







