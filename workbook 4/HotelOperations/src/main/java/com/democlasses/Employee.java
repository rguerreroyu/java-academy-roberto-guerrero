package com.democlasses;

public class Employee {
    String employeeId;
    String name;
    String department;
    double payRate;
    double hoursWorked;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
            double regularPay = getRegularHours() * payRate;
            double overtimePay = getOvertimeHours() * payRate * 1.5;
            return regularPay + overtimePay;
        }

    public double getRegularHours(){
        return Math.min(hoursWorked, 40);

    }

    public double getOvertimeHours(){
        return Math.max(hoursWorked - 40.0, 0.0);
    }
}
