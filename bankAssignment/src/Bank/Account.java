/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author Blake Murdock (200260568)
 */
public abstract class Account {
    private String accountID;
    private String accountType;
    private double balance;
    
    
    /**
     * This is the default constructor, with no parameters needed
     */
    public Account () { 
    } // End of default Account constructor
    
    /**
     * This is a Account constructor that accepts an account type as a String, 
     * and a starting balance as a double.
     * @param accountType
     * @param balance 
     */
    public Account(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    } // End of Account constructor
    
    /**
     * This method will subtract a passed in double parameter from the balance variable
     * @param amount 
     */
    public void withdraw (double amount) {
        balance -= amount;
    } // End of withdraw method
    
    /**
     * This method will add a passed in double parameter to the balance variable
     * @param amount 
     */
    public void deposit (double amount) {
        balance += amount;
    } // End of deposit method
    
    /**
     * This method will return the balance of the Account
     * @return 
     */
    public double getBalance() {
        return this.balance;
    } // End of getBalance method
    
    /**
     * This method will return the type of the Account
     * @return 
     */
    public String getAccountType() {
        return this.accountType;
    } // End of getAccountType method
    
    /**
     * This method will return the ID of the Account
     * @return 
     */
    public String getAccountID() {
        return this.accountID;
    } // End of getAcountID method
} // End of Account class
