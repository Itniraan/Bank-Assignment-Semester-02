/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author Blake
 */
public class savingsAccount extends Account{
    private double interestRate;
    
    public savingsAccount(String accountType, double balance) {
        super(accountType, balance);
    } // End of savingsAccount constructor
    
    /**
     * This method will return the interest rate of the account
     * @return 
     */
    public double getInterestRate() {
        return interestRate;
    }
    
    /**
     * This method will set the interestRate variable, using a passed in double parameter
     * @param interestRate 
     */
    public void setInterestRate (double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void generateInterest() {
        
    }
} // End of savingsAccount class
