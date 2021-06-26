package com.java.project;


import java.util.Scanner;

public class Advertisement implements Payment {

    double socMed;
    double magazine;
    double flyers;
    String month;

    public Advertisement() {

    }

    public double getSocMed() {
        return socMed;
    }

    public void setSocMed(double socMed) {
        this.socMed = socMed;
    }

    public double getMagazine() {
        return magazine;
    }

    public void setMagazine(double magazine) {
        this.magazine = magazine;
    }

    public double getFlyers() {
        return flyers;
    }

    public void setFlyers(double flyers) {
        this.flyers = flyers;
    }

    public double calculateTotalAdCost() {
        return flyers + magazine+ socMed;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void printInfo() {
        System.out.println("********************* INFORMATION OF ADVERTISEMENT ****************");
        System.out.println("Cost for Magazine      : " + getMagazine());
        System.out.println("Cost for Flyers        : " + getFlyers());
        System.out.println("Cost for Social Media  :" + getSocMed());
        System.out.println("********************************************************************");
    }


    @Override
    public void getPayment() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Total Cost for Advertisement is  : " + calculateTotalAdCost());
        double paymentAmount = scan.nextDouble();

        while (paymentAmount < calculateTotalAdCost() || paymentAmount > calculateTotalAdCost()) {
            System.out.println("Incorrect amount entered. Enter payment amount again: ");
            paymentAmount = scan.nextDouble();
        }
        System.out.println("Thanks for your payment.");
    }
}
