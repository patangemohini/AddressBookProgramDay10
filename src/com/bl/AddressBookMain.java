package com.bl;

import java.util.Scanner;

public class AddressBookMain {

    static final int ADD_CONTACT = 1;
    static final int DISPLAY_DETAILS = 2;
    static final int EDIT_CONTACT = 3;
    static final int DISPLAY_EDIT_CONTACT = 4;
    static final int DELETE_CONTACT = 5;


    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!!");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int option;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println(" 1.Add a new contact.");
            System.out.println(" 2.display contact.");
            System.out.println(" 3.edit contact.");
            System.out.println(" 4.display edit contact.");
            option = sc.nextInt();

            switch (option) {
                case ADD_CONTACT:
                    addressBook.personInputDetails();
                    break;
                case DISPLAY_DETAILS:
                    addressBook.showDetails();
                    break;
                case EDIT_CONTACT:
                    addressBook.editContact();
                    break;
                case DISPLAY_EDIT_CONTACT:
                    addressBook.showDetails();
                    break;
                case DELETE_CONTACT:
                    addressBook.deleteContact();
                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }
        while (option != 6);
    }
}
