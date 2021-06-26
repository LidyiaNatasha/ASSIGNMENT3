package com.java.project;


import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int respond;
        do {
            mainMenu();
            respond = scan.nextInt();
            System.out.println("----------------------------------------------------------");
            switch (respond) {
                case 1:
                    admin();
                    break;
                case 2:
                    participant();
                    break;
                case 3:
                    System.out.println("Thank you. Please come again.");
                    break;
                default:
                    System.out.println("Please enter 1-3 only!");
                    break;
            }

        } while (respond != 3);
    }

    public static void mainMenu() { //method for main menu
        System.out.println("---------------------------------------------------------------");
        System.out.println("   WELCOME TO 7DS CODING CLASS CAMP   ");
        System.out.println("---------------------------- MENU -----------------------------");
        System.out.println("What are your role?\n");
        System.out.println("1. An Admin");
        System.out.println("2. A Participant/Student");
        System.out.println("3. Exit");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Enter your option: ");
    }

    public static void admin() {

        double calculatedSalary = getAndShowFacilitatorInfo();
        double calculatedAdCost = getAndShowAdvertisementInfo();
        showMonthlyReport(calculatedSalary, calculatedAdCost);

    }

    public static double getAndShowFacilitatorInfo() {

        double sumSalary = 0.0;

        Facilitator compInfo = new Facilitator();
        compInfo.printCompanyInfo();

        System.out.println("\n--------------------REQUIRED DETAILS FOR FACILITATOR-------------------");
        System.out.print("How many employees you want to enter its information? ");
        int em = scan.nextInt();
        Facilitator[] emList = new Facilitator[em];
        for (int i = 0; i < emList.length; i++) {
            System.out.println("\nFacilitator " + (i + 1) + ": ");
            System.out.print("Enter ID: ");
            int id = scan.nextInt();
            System.out.print("Enter name: ");
            String name = scan.next() + scan.nextLine();
            System.out.print("Enter gender (Female/Male): ");
            String gender = scan.next();
            System.out.print("Enter address: ");
            String address = scan.next() + scan.nextLine();
            System.out.print("Enter facilitating camp: ");
            String camp = scan.next()  + scan.nextLine();
            System.out.print("Enter his/her salary: ");
            double salary = scan.nextDouble();
            sumSalary = salary + sumSalary;

            emList[i] = new Facilitator(id, name, gender, address, camp, salary);

        }

        System.out.println("***************** INFORMATION OF EMPLOYEES **********************");
        for (int j = 0; j < emList.length; j++) {
            System.out.println("Facilitator " + (j + 1) + ": ");
            emList[j].printInfo();
        }
        System.out.println("*****************************************************************");
        return sumSalary;

    }

    public static double getAndShowAdvertisementInfo() {

        Advertisement ad = new Advertisement();
        System.out.print("Enter Cost for Social Media : ");
        ad.setSocMed(scan.nextDouble());
        System.out.print("Enter Cost for Magazine : ");
        ad.setMagazine(scan.nextDouble());
        System.out.print("Enter Cost for Radio : ");
        ad.setFlyers(scan.nextDouble());
        ad.printInfo();

        //  I added month

        return ad.calculateTotalAdCost();
    }

    public static void showMonthlyReport(double monthlySalary, double monthlyAdCost) {

        System.out.println("\n--------------------REQUIRED DETAILS FOR FINANCE-------------------");

        System.out.print("Enter Last Month Balance : ");
        double lastMonthBalance = scan.nextInt();

        Finance f = new Finance(lastMonthBalance, 0, monthlyAdCost, monthlySalary);

        System.out.println("\n--------------------REQUIRED DETAILS FOR SALES-------------------");
        System.out.print("Enter sales for Merchandise : ");
        f.setMerchandiseSales(scan.nextDouble());
        System.out.print("Enter sales for Camps : ");
        f.setCampSales(scan.nextDouble());
        f.getPayment();
        f.printInfo();

    }

    public static void participant() {

        Registration participant = new Registration();

        System.out.print("Enter your name: ");
        participant.setName(scan.next() + scan.nextLine());
        System.out.print("Enter your gender (Female/Male): ");
        participant.setGender(scan.next());
        System.out.print("Enter your email address: ");
        participant.setEmail(scan.next());
        System.out.print("Enter your age: ");
        participant.setAge(scan.nextInt());
        System.out.print("Enter your phone number: ");
        participant.setContactNo(scan.nextInt());

        System.out.println("What do you want to learn from our program?");
        System.out.println("1. Introduction To Programming \n2. Object Oriented Programming \n3. Graphic Users Interface");
        int choose = scan.nextInt();

        String[] camp = {"Introduction To Programming", "Object Oriented Programming", "Graphic Users Interface"};
        String[] campInfo = {"For beginners to master to concept", "For intermediates to advance their skill", "For artist , who would like to play with codes"};

        double[] price = {50.00, 60.00, 100.00};

        participant.setCampName(camp[choose - 1]);
        participant.setCampDescription(campInfo[choose - 1]);
        participant.setCampPrice(price[choose - 1]);
        participant.getPayment();
        participant.printInfo();
        System.out.println("---------------------------------------------------------------------");

    }
}
