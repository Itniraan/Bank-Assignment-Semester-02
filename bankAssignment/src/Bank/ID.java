package Bank;

/**
 *
 * @author Blake
 */
public class ID {

    private static int customerID = 0;
    private static int accountID = 0;
    private static int transactionID = 0;
    
    public ID() {
    }

    /**
     * This method will increment the static variable customerID by 1, and
     * return it to the class that called it.
     *
     * @return
     */
    public int getNewCustomerID() {
        this.customerID += 1;
        return this.customerID;
    } // End of getNewCustomerID method

    /**
     * This method will increment the static variable accountID by 1, and 
     * return it to the class that called it.
     * @return 
     */
    public int getNewAccountID() {
        this.accountID += 1;
        return this.accountID;
    } // End of getNewAccountID method
    
    /**
     * This method will increment the static variable transactionID by 1, and 
     * return it to the class that called it.  
     * @return 
     */
    public int getTransactionID() {
        this.transactionID += 1;
        return this.transactionID;
    }
}
