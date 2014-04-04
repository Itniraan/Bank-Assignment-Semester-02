/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Blake
 */
public class Teller {

    private ArrayList<String> customerList = new ArrayList<String>();
    private static int currentCustomerId;

    /**
     * This is the default Teller constructor, that requires no parameters
     */
    public Teller() {
    } // End of default Teller constructor

    /**
     * This is the main method, that drives and controls the program
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean choiceCheck = true;
        System.out.println("Welcome to the bank! Are you a: ");
        do {
            System.out.println("1. New customer?");
            System.out.println("2. Existing customer?");
            System.out.print("Please choose an option: ");

            try {
                choice = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.err.println("Error caught: " + e + "\nPlease enter a numeric value.");
                input.nextLine();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException IE) {
                    System.err.println("Thread Interuptted!!");
                }

            }
            if (choice == 1) {
                choiceCheck = false;
                createCustomer();
                loginCustomer();
            } else if (choice == 2) {
                choiceCheck = false;
            } else {
                System.out.println("That is not a valid choice. Please try again.");
            }
        } while (choiceCheck);
    } // End of main method

    /**
     * This method will call the Account class to create an account for the
     * client
     */
    public static void createAccount() {
    } // End of createAccount method

    /**
     * This method will take the user's input, and create a new Client class for
     * them.
     */
    public static int createCustomer() {
        String firstName="", lastName="", address="", city="", prov="", postalCode="", 
                DOB="", email="", typeOfAccount="";
        int phone = 0;
        double openingBalance = 0;
        boolean inputCheck = true;
        Scanner input = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.println("Please enter your first name");
            firstName = input.nextLine();

            System.out.println("Please enter your last name");
            lastName = input.nextLine();

            System.out.println("Please enter your street address");
            address = input.nextLine();

            System.out.println("Please enter your city");
            city = input.nextLine();

            System.out.println("Please enter your province");
            prov = input.nextLine();

            System.out.println("Please enter your postal code");
            postalCode = input.nextLine();

            System.out.println("Please enter your phone number");
            phone = keyboard.nextInt();
            
            System.out.println("Please enter your date of birth");
            DOB = input.nextLine();
            
            System.out.println("Please enter your email address");
            email = input.nextLine();
            
            System.out.println("What type of account would you like (C for Chequing or S for Savings)?");
            typeOfAccount = input.nextLine();
            if (typeOfAccount.equalsIgnoreCase("C")) {
                System.out.println("Your overdraft will be $500.00");
                System.out.println("What would you like to deposit to open your account?:");
                openingBalance = keyboard.nextInt();
            }
            System.out.println("Thank you. Your account will now be set up.");
            // VERIFY
        } catch (java.util.InputMismatchException e) {
        }
        
        ID newCustomer = new ID();
        int accountID = newCustomer.getNewAccountID();
        currentCustomerId = newCustomer.getNewCustomerID();
        Client newClient = new Client(currentCustomerId, firstName, lastName, email, address, phone,
                city, prov, postalCode, DOB);
        if (typeOfAccount.equalsIgnoreCase("C")) {
            Account newAccount = new chequingAccount(accountID, openingBalance, 500.00);
        }
        else if (typeOfAccount.equalsIgnoreCase("S")) {
            Account newAccount = new savingsAccount(accountID, openingBalance);
        }
        return currentCustomerId;
    } // End of createCustomer method
}