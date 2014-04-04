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
    
    public Teller() {
    } // End of default Teller constructor
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        boolean choiceCheck = false;
        System.out.println("Welcome to the bank! What would you like to do?");
        System.out.println("1. Log in");
        System.out.println("2. Create an account");
        do {
            System.out.print("Please choose an option: ");
            try {
                choice = input.nextInt();
                
            }
            catch (java.util.InputMismatchException e){
                System.out.println("\nThat is not a valid option, please try again.");
                
            }
        } while (choiceCheck == true);
    } // End of main method
    
    public void createAccount() {
        
    } // End of createAccount method
}
