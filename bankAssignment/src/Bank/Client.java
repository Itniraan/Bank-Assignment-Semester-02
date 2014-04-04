package Bank;

import java.util.ArrayList;

/**
 *
 * @author Blake
 */
public class Client {
    int clientID;
    private String firstName;
    private String lastName;
    private String email;
    private String streetAddress;
    private int phoneNumber;
    private String city;
    private String prov;
    private String postalCode;
    private String dateOfBirth;
    private ArrayList<String> clientAccounts = new ArrayList<String>();
    

    /**
     * This is the default Client constructor, with no parameters needed
     */
   public Client() {
   } // End of default Client constructor
   
   /**
    * This is a Client constructor that takes the first name, last name, and email
    * of the client as Strings, then the phone number as an integer, then the city, 
    * province, postal code, and date of birth as Strings. 
    * @param clientID
    * @param firstName
    * @param lastName
    * @param email
    * @param streetAddress
    * @param phoneNumber
    * @param city
    * @param prov
    * @param postalCode
    * @param dateOfBirth 
    */
   public Client(int clientID, String firstName, String lastName, String email, String streetAddress, 
           int phoneNumber, String city, String prov, String postalCode, String dateOfBirth) {
       this.clientID = clientID;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.streetAddress = streetAddress;
       this.phoneNumber = phoneNumber;
       this.city = city;
       this.prov = prov;
       this.postalCode = postalCode;
       this.dateOfBirth = dateOfBirth;
   } // End of Client constructor
   
   /**
    * This method will return the first name of the client
    * @return 
    */
   public String getFirstName() {
       return this.firstName;
   } // End of getFirstName method
   
   /**
    * This method will return the last name of the client
    * @return 
    */
   public String getLastName() {
       return this.lastName;
   } // End of getLastName method
   
   /**
    * This method will return the email of the client
    * @return 
    */
   public String getEmail() {
       return this.email;
   } // End of getEmail method
   
   /**
    * This method will return the street address of the client
    * @return 
    */
   public String getStreetAddress() {
       return this.streetAddress;
   } // End of getStreetAddress method
   
   /**
    * This method will return the phone number of the client
    * @return 
    */
   public int getPhoneNumber() {
       return this.phoneNumber;
   } // End of getPhoneNumber method
   
   /**
    * This method will return the city of the client
    * @return 
    */
   public String getCity() {
       return this.city;
   } // End of getCity method
   
   /**
    * This method will return the province of the client
    * @return 
    */
   public String getProv() {
       return this.prov;
   } // End of getProv method
   
   /**
    * This method will return the postal code of the client
    * @return 
    */
   public String getPostalCode() {
       return this.postalCode;
   } // End of getPostalCode method
   
   /**
    * This method will return the date of birth of the client
    * @return 
    */
   public String getDateOfBirth() {
       return this.dateOfBirth;
   } // End of getDateOfBirth method
   
   /**
    * This method will set the first name variable, using a passed in String parameter
    * @param firstName 
    */
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   } // End of setFirstName method
   
   /**
    * This method will set the last name variable, using a passed in String parameter
    * @param lastName 
    */
   public void setLastName(String lastName) {
       this.lastName = lastName;
   } // End of setLastName method
   
   /**
    * This method will set the email variable, using a passed in String parameter
    * @param email 
    */
   public void setEmail(String email) {
       this.email = email;
   } // End of setEmail method
   
   /**
    * This method will set the streetAddress variable, using a passed in String parameter
    * @param streetAddress 
    */
   public void setStreetAddress(String streetAddress) {
       this.streetAddress = streetAddress;
   } // End of setStreetAddress method
   
   /**
    * This method will set the phoneNumber variable, using a passed in integer parameter
    * @param phoneNumber 
    */
   public void setPhoneNumber(int phoneNumber) {
       this.phoneNumber = phoneNumber;
   } // End of setPhoneNumber method
   
   /**
    * This method will set the city variable, using a passed in String parameter
    * @param city 
    */
   public void setCity(String city) {
       this.city = city;
   } // End of setCity method
   
   /**
    * This method will set the prov variable, using a passed in String parameter
    * @param prov 
    */
   public void setProv(String prov) {
       this.prov = prov;
   } // End of setProv method
   
   /**
    * This method will set the postalCode variable, using a passed in String parameter
    * @param postalCode 
    */
   public void setPostalCode(String postalCode) {
       this.postalCode = postalCode;
   } // End of setPostalCode method
   
   /**
    * This method will set the dateOfBirth variable, using a passed in String parameter
    * @param dateOfBirth 
    */
   public void setDateOfBirth(String dateOfBirth) {
       this.dateOfBirth = dateOfBirth;
   } // End of setDateOfBirth method
} // End of Client class
