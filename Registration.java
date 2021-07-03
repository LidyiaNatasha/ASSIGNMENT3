


import java.util.Scanner;

public class Registration extends CampsDescription implements Payment {

    String name, gender, email;
    int age, contactNo;

    public Registration() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }


    @Override
    public void getPayment() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have to pay " + getCampPrice());
        System.out.print("Enter payment amount : RM ");
        double paymentAmount = scan.nextDouble();
        while (paymentAmount < getCampPrice() || paymentAmount > getCampPrice()) {
            System.out.print("Enter payment amount again :  RM");
            paymentAmount = scan.nextDouble();
        }
        System.out.println("Thanks for your payment.");
    }

    @Override
    public void printInfo() {
        System.out.println("--------------------THIS IS YOUR REGISTRATION SLIP-------------------");
        System.out.println("Name      : " + getName());
        System.out.println("Gender    : " + getGender());
        System.out.println("Email     : " + getEmail());
        System.out.println("Age       : " + getAge());
        System.out.println("Contact No: " + getContactNo());
        super.printInfo();
    }

    public String getSlip() {
         return "--------------------THIS IS YOUR REGISTRATION SLIP-------------------"+
        "\nName       : " + getName()
       +"\nGender    : " + getGender()
       +"\nEmail       : " + getEmail()
       +"\nAge          : " + getAge()
       +"\nContact No : " + getContactNo()+
        super.getCampInfo();
    }


}

