package baiThi;

import java.util.Scanner;

public class addressBook {
     String contactName;
    private String company;
    private  String email;
    private int phoneNumber;

    public addressBook() {
    }

    public addressBook(String contactName, String company, String email, int phoneNumber) {
        this.contactName = contactName;
        this.company = company;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    private Scanner sc = new Scanner(System.in);
    public void inputData(){
        System.out.println("Nhập dữ liệu cho AddressBook: ");
        System.out.println("Contact Name: ");
        contactName = sc.nextLine();
        System.out.println("Company: ");
        company = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Phone number: ");
        phoneNumber = sc.nextInt();

    }


    @Override
    public String toString() {
        return "Contact Name: "+contactName+" | Company: "+company+" | Email: "+email+" | Phone Number: "+phoneNumber;
    }
}
