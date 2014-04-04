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
    private static String currentCustomerId;

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
                choiceCheck = false;
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
                createCustomer();
            } else if (choice == 2) {
                
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
    public static String createCustomer() {
        
        return currentCustomerId;
    }
}
