package com.bl;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<PersonDetails> personDetails = new ArrayList<>();

    public PersonDetails personInputDetails() {
        Scanner sc = new Scanner(System.in);
        PersonDetails details = new PersonDetails();
        System.out.println("Enter First Name : ");
        details.firstName = sc.nextLine();
        System.out.println("Enter Last Name : ");
        details.lastName = sc.nextLine();
        System.out.println("Enter Address : ");
        details.address = sc.nextLine();
        System.out.println("Enter City : ");
        details.city = sc.nextLine();
        System.out.println("Enter State : ");
        details.state = sc.nextLine();
        System.out.println("Enter Email : ");
        details.email = sc.nextLine();
        System.out.println("Enter zip : ");
        details.zip = sc.nextInt();
        System.out.println("Enter PhoneNumber : ");
        details.phoneNumber = sc.nextLong();
        this.personDetails.add(details);
        return details;
    }

    public void showDetails() {
        for (PersonDetails aBook: personDetails) {
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
        for (PersonDetails cont : personDetails) {
            if (firstName.compareToIgnoreCase(cont.getFirstName()) == 0) {
                return personDetails.indexOf(cont);
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
            personDetails.set(index, personInputDetails());
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
            personDetails.remove(index);
            System.out.println("contact deleted");
        } else {
            System.out.println("no such contact to delete!!");
        }
    }
}

