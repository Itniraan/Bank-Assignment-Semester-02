/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author Blake
 */
public class chequingAccount extends Account{
    private double overdraft;
    public chequingAccount(String accountType, double balance, double overdraft) {
        super(accountType, balance);
        this.overdraft = overdraft;
    } // End of chequingAccount constructor
    
    /**
     * This method will return the overdraft available for the account
     * @return 
     */
    public double getOverdraft () {
        return overdraft;
    } // End of getOverdraft method
    
    /**
     * This method will set the overdraft variable, using a passes in parameter
     * @param overdraft 
     */
    public void setOverdraft (double overdraft) {
        this.overdraft = overdraft;
    } // End of setOverdraft method
} // End of chequingAccount class
