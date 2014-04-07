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
    public static int getNewCustomerID() {
        return (++customerID);
    } // End of getNewCustomerID method

    /**
     * This method will increment the static variable accountID by 1, and 
     * return it to the class that called it.
     * @return 
     */
    public static int getNewAccountID() {
        return (++accountID);
    } // End of getNewAccountID method
    
    /**
     * This method will increment the static variable transactionID by 1, and 
     * return it to the class that called it.  
     * @return 
     */
    public static int getTransactionID() {
        return (++transactionID);
    }
}
