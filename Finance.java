package com.java.project;


import java.util.Scanner;

public class Finance extends Sales implements Payment {

    double lastMonthBalance;
    double miscellaneousCost;
    double advertisementCost;
    double employeeTotalSalary;

    public Finance(double lastMonthBalance, double miscellaneousCost, double advertisementCost, double employeeTotalSalary) {
        this.lastMonthBalance = lastMonthBalance;
        this.miscellaneousCost = miscellaneousCost;
        this.advertisementCost = advertisementCost;
        this.employeeTotalSalary = employeeTotalSalary;
    }

    public double getMiscellaneousCost() {
        return miscellaneousCost;
    }

    public void setMiscellaneousCost(double miscellaneousCost) {
        this.miscellaneousCost = miscellaneousCost;
    }

    public double calculateMonthlyRevenue() {
        return (lastMonthBalance + super.getSalesDepositAmount()) - (employeeTotalSalary + advertisementCost + getMiscellaneousCost());
    }

    public double getLastMonthBalance() {
        return lastMonthBalance;
    }

    public void setLastMonthBalance(double lastMonthBalance) {
        this.lastMonthBalance = lastMonthBalance;
    }

    public double getAdvertisementCost() {
        return advertisementCost;
    }

    public void setAdvertisementCost(double advertisementCost) {
        this.advertisementCost = advertisementCost;
    }

    public double getEmployeeTotalSalary() {
        return employeeTotalSalary;
    }

    public void setEmployeeTotalSalary(double employeeTotalSalary) {
        this.employeeTotalSalary = employeeTotalSalary;
    }

    @Override
    public void printInfo() {
        System.out.println("\n****************REPORT FOR THIS MONTH********************************");
        System.out.println("Total Facilitator's Salary          : RM " + this.employeeTotalSalary);
        System.out.println("Total Advertisement Cost            : RM " + this.advertisementCost);
        System.out.println("Total Miscellaneous Cost            : RM " + this.miscellaneousCost);
        double totalCost = employeeTotalSalary + advertisementCost + this.miscellaneousCost;
        System.out.println("Total Cost                          : RM " + totalCost);
        System.out.println("Total Sales ( Merchandise + Camp )  : RM " + super.getSalesDepositAmount());
        System.out.println("Net Profit                          : RM " + calculateMonthlyRevenue());
        System.out.println("*********************************************************************");
    }

    @Override
    public void getPayment() {

        super.printInfo();
        super.getPayment();
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease make the payment for below incurred costs :");
        System.out.println("1. Tax Payment  : RM 100.00");
        System.out.println("2. Utilities    : RM 100.00");
        System.out.println("3. Rental       : RM 100.00");
        System.out.print("Enter the amount here : RM ");
        this.miscellaneousCost = scan.nextDouble();
    }
}
