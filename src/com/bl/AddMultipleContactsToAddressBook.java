package com.bl;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMultipleContactsToAddressBook {

    ArrayList<AddMultiplePersonDetails> personDetailsArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        System.out.println("Enter Number of contacts to be added");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter contact details of person");
            personInputDetails();
        }
    }

    public AddMultiplePersonDetails personInputDetails() {

        AddMultiplePersonDetails details = new AddMultiplePersonDetails();
        System.out.println("Enter First Name : ");
        details.firstName = sc.next();
        System.out.println("Enter Last Name : ");
        details.lastName = sc.next();
        System.out.println("Enter Address : ");
        details.address = sc.next();
        System.out.println("Enter City : ");
        details.city = sc.next();
        System.out.println("Enter State : ");
        details.state = sc.next();
        System.out.println("Enter Email : ");
        details.email = sc.next();
        System.out.println("Enter zip : ");
        details.zip = sc.nextInt();
        System.out.println("Enter PhoneNumber : ");
        details.phoneNumber = sc.nextLong();
        this.personDetailsArrayList.add(details);
        return details;
    }

    public void showDetails() {
        for (AddMultiplePersonDetails aBook: personDetailsArrayList) {
            System.out.println("First name : " + aBook.firstName);
            System.out.println("last name : " + aBook.lastName);
            System.out.println("Address : " + aBook.address);
            System.out.println("City : " + aBook.city);
            System.out.println("State : " + aBook.state);
            System.out.println("Email Id : " + aBook.email);
            System.out.println("Phone number : " + aBook.phoneNumber);
            System.out.println("Zipcode : " + aBook.zip);

        }
    }

    public int findContact(String firstName) {
        for (AddMultiplePersonDetails cont : personDetailsArrayList) {
            if (firstName.compareToIgnoreCase(cont.getFirstName()) == 0) {
                return personDetailsArrayList.indexOf(cont);
            }
        }
        return -1;
    }

    public void editContact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String firstName = scan.next();
        int index = findContact(firstName);
        if (index == 0) {
            personDetailsArrayList.set(index, personInputDetails());
        } else {
            System.out.println("Contact not found ");
        }
    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name to delete : ");
        String firstName = sc.next();
        int index = findContact(firstName);
        if (index == 0) {
            personDetailsArrayList.remove(index);
            System.out.println("contact deleted");
        } else {
            System.out.println("no such contact to delete!!");
        }
    }
}

