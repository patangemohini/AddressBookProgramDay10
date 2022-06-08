package com.bl;

import java.util.Scanner;

public class AddressBook {

    public void personInputDetails() {
        Scanner sc = new Scanner(System.in);
        PersonDetails personDetails = new PersonDetails();
        System.out.println("Enter First Name : ");
        personDetails.firstName = sc.nextLine();
        System.out.println("Enter Last Name : ");
        personDetails.lastName = sc.nextLine();
        System.out.println("Enter Address : ");
        personDetails.address = sc.nextLine();
        System.out.println("Enter City : ");
        personDetails.city = sc.nextLine();
        System.out.println("Enter State : ");
        personDetails.state = sc.nextLine();
        System.out.println("Enter Email : ");
        personDetails.email = sc.nextLine();
        System.out.println("Enter zip : ");
        personDetails.zip = sc.nextInt();
        System.out.println("Enter PhoneNumber : ");
        personDetails.phoneNumber = sc.nextLong();
    }
}
