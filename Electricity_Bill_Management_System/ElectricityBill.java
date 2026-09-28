/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electricity_Bill_Management_System;

/**
 *
 * @author User
 */


public class ElectricityBill {
    private final String accountNumber;
    private final String customerName;
    private final String customerType;
    private final double previousReading;
    private final double currentReading;

    public ElectricityBill(String accountNumber, String customerName, String customerType, double previousReading, double currentReading) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerType = customerType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public double getConsumption() {
        return currentReading - previousReading;
    }

    public double calculateBill() {
        double consumption = getConsumption();
        double rate = 0;
        if (customerType.equalsIgnoreCase("Residential")) {
            if (consumption <= 100) rate = 10;
            else if (consumption <= 200) rate = 12;
            else rate = 15;
        } else { // Commercial
            if (consumption <= 100) rate = 15;
            else if (consumption <= 200) rate = 18;
            else rate = 22;
        }
        return consumption * rate;
    }

    public void displayBill() {
        System.out.println("===== ELECTRICITY BILL =====");
        System.out.println("Account: " + accountNumber + " | Name: " + customerName);
        System.out.println("Type: " + customerType + " | Consumption: " + getConsumption() + " kWh");
        System.out.println("Total Bill: P" + calculateBill());
    }

    public static void main(String[] args) {
        ElectricityBill b1 = new ElectricityBill("A101", "Juan Cruz", "Residential", 1000, 1180);
        ElectricityBill b2 = new ElectricityBill("A102", "ABC Store", "Commercial", 2000, 2250);
        b1.displayBill();
        b2.displayBill();
    }
}
    

