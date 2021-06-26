package com.java.project;


import javax.swing.*;
import java.awt.*;

abstract public class CampsDescription {

    String campName , campDescription;
    Double campPrice;
    private JTextArea resadd;
    private Container c;


    public CampsDescription() {


    }

    public String getCampName() {
        return campName;
    }

    public void setCampName(String campName) {
        this.campName = campName;
    }

    public String getCampDescription() {
        return campDescription;
    }

    public void setCampDescription(String campDescription) {
        this.campDescription = campDescription;
    }

    public Double getCampPrice() {
        return campPrice;
    }

    public void setCampPrice(Double campPrice) {
        this.campPrice = campPrice;
    }

    public void printInfo(){

        System.out.println("--------------------------CAMP DETAILS-------------------------------");
        System.out.println("You have enrolled to " + getCampName() + " camp");
        System.out.println("Price of Camp  - RM " + getCampPrice());
        System.out.println("Description of Camp  \n" + getCampDescription());

    }

    public String getCampInfo() {
        return "\n--------------------------CAMP DETAILS-------------------------------\nYou have enrolled to " + getCampName() +
                " camp\nPrice of Camp  - RM " + getCampPrice()+
                "\nDescription of Camp - \n" + getCampDescription();


    }
}
