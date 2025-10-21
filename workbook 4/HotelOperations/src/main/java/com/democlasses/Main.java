package com.democlasses;

public class Main {
    public static void main(String[] args) {
        Reservation reservation = new Reservation("double", 1, false);
        System.out.println("Reservation");
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Weekend: " + reservation.isWeekend());
        System.out.println("Number of Nights: " + reservation.getNumberofNights());
        System.out.printf("Price per Night: $%.2f\n", reservation.getPrice());
        System.out.printf("Total Reservation Cost: $%.2f", reservation.getReservationTotal());
        System.out.println();

        System.out.println("Employee");
        Employee employee = new Employee("g59", "Rob Bob", "Sales Team", 22.00, 44.0);
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOvertimeHours());
        System.out.printf("Total Pay: ", employee.getTotalPay());
    }
}

