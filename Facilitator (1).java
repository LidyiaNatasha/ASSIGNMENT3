package com.java.project;


public class Facilitator extends EducationDayCampsCompany {

     private String name, gender, address, camp;
     private int id;
     private double salary;

    public Facilitator(){

    }

    public Facilitator(int id, String name, String gender, String address, String camp, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.camp = camp;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getCamp() {
        return camp;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCamp(String camp) {
        this.camp = camp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printCompanyInfo(){
        super.getCompInfo();
    }
    @Override
    public void printInfo() {
        System.out.println("ID                  : " + getId());
        System.out.println("Name                : " + getName());
        System.out.println("Gender              : " + getGender());
        System.out.println("Address             : " + getAddress());
        System.out.println("Facilitating Camp   : " + getCamp());
        System.out.println("Salary              : RM " + getSalary());

    }

}
