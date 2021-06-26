package com.java.project;

import java.util.Scanner;

public abstract class Sales implements Payment {

    double merchandiseSales;
    double campSales;
    double salesDepositAmount;

    public Sales() {


    }

    public double getMerchandiseSales() {
        return merchandiseSales;
    }

    public void setMerchandiseSales(double merchandiseSales) {
        this.merchandiseSales = merchandiseSales;
    }

    public double getCampSales() {
        return campSales;
    }

    public void setCampSales(double campSales) {
        this.campSales = campSales;
    }

    public double calculateTotalSales() {
        return this.campSales + this.merchandiseSales;
    }

    public double getSalesDepositAmount() {
        return salesDepositAmount;
    }

    public void setSalesDepositAmount(double salesDepositAmount) {
        this.salesDepositAmount = salesDepositAmount;
    }

    public void printInfo() {
        System.out.println("\n********************* INFORMATION OF SALES ****************");
        System.out.println(" Sales for Merchandise  : " + getMerchandiseSales());
        System.out.println(" Sales for Camp         : " + getCampSales());
        System.out.println("********************************************************************");

    }

    @Override
    public void getPayment() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEstimated sales generated for this month is  : " + calculateTotalSales());
        System.out.print("Please enter the above said amount that will deposit to Finance : RM ");
        this.salesDepositAmount=scan.nextDouble();

    }


}
