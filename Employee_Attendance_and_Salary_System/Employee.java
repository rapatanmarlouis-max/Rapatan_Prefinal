/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee_Attendance_and_Salary_System;

/**
 *
 * @author User
 */


public class Employee {
    private final String employeeId;
    private final String name;
    private final String department;
    private final int daysWorked;
    private final double dailyRate;

    public Employee(String employeeId, String name, String department, int daysWorked, double dailyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }

    public double calculateRegularPay() {
        return Math.min(daysWorked, 22) * dailyRate;
    }
    public double calculateOvertimePay() {
        if (daysWorked > 22) return (daysWorked - 22) * dailyRate * 1.25;
        return 0;
    }
    public double calculateGrossPay() {
        return calculateRegularPay() + calculateOvertimePay();
    }
    public double calculateDeduction() {
        return calculateGrossPay() * 0.10; // 10% deduction
    }
    public double calculateNetPay() {
        return calculateGrossPay() - calculateDeduction();
    }
    public String getAttendanceClassification() {
        if (daysWorked < 15) return "Poor";
        else if (daysWorked < 22) return "Good";
        else if (daysWorked == 22) return "Perfect";
        else return "With Overtime";
    }
    public void displayPayroll() {
        System.out.println("===== PAYROLL =====");
        System.out.println(name + " (" + employeeId + ") - " + department);
        System.out.println("Regular: P" + calculateRegularPay() + " | Overtime: P" + calculateOvertimePay());
        System.out.println("Gross: P" + calculateGrossPay() + " | Deduction: P" + calculateDeduction());
        System.out.println("Net Pay: P" + calculateNetPay() + " | Attendance: " + getAttendanceClassification());
    }

    public static void main(String[] args) {
        Employee e = new Employee("E001", "Maria Santos", "IT", 25, 800);
        e.displayPayroll();
    }
}