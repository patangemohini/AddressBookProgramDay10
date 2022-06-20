package com.bl;

import java.util.Scanner;

public class AddressBookMain {

    static final int ADD_CONTACT = 1;
    static final int EDIT_CONTACT = 2;
    static final int DELETE_CONTACT = 3;
    static final int DISPLAY_DETAILS = 4 ;
    static final int DUPLICATE_NAME = 5;


    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!!");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int option;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println(" 1.Add contact.");
            System.out.println(" 2.edit contact");
            System.out.println(" 3.delete contact.");
            System.out.println(" 4.display contact.");
            System.out.println(" 5.duplicate Entry.");
            System.out.println("-------------------------------------------------");
            option = sc.nextInt();

            switch (option) {
                case ADD_CONTACT:
                    addressBook.addContact();
                    break;
                case EDIT_CONTACT:
                    addressBook.editContact();
                    break;
                case DELETE_CONTACT:
                    addressBook.deleteContact();
                    break;
                case DISPLAY_DETAILS:
                    addressBook.showDetails();
                    break;
                case DUPLICATE_NAME:
                    System.out.println("Enter first name to check for duplicate verification");
                    String enterName = sc.next();
                    addressBook.duplicateCheck(enterName);
                    break;
                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }
        while (option != 7);
    }
}
