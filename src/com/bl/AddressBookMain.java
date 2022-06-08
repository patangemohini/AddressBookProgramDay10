package com.bl;

import java.util.Scanner;

public class AddressBookMain {

    static final int ADD_CONTACT = 1;
    static final int EDIT_CONTACT = 2;
    static final int DELETE_CONTACT = 3;
    static final int DISPLAY_DETAILS = 4  ;


    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!!");
        Scanner sc = new Scanner(System.in);
        AddMultipleContactsToAddressBook addressBook = new AddMultipleContactsToAddressBook();
        int option;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println(" 1.Add contact.");
            System.out.println(" 2.edit contact");
            System.out.println(" 3.delete contact.");
            System.out.println(" 4.display contact.");
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
                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }
        while (option != 6);
    }
}
