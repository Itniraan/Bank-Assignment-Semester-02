/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author Blake
 */
public class Client {
    private String firstName;
    private String lastName;
    private String email;
    private String streetAddress;
    private int phoneNumber;
    private String city;
    private String prov;
    private String postalCode;
    private String dateOfBirth;
    
    
    /**
     * This is the default Client constructor, with no parameters needed
     */
   public Client() {
   } // End of default Client constructor
   
   /**
    * This is a Client constructor that takes the first name, last name, and email
    * of the client as Strings, then the phone number as an integer, then the city, 
    * province, postal code, and date of birth as Strings. 
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
   public Client(String firstName, String lastName, String email, String streetAddress, 
           int phoneNumber, String city, String prov, String postalCode, String dateOfBirth) {
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
   
   public String getFirstName() {
       return this.firstName;
   } // End of getFirstName method
   
   public String getLastName() {
       return this.lastName;
   } // End of getLastName method
   
   public String getEmail() {
       return this.email;
   } // End of getEmail method
   
   public String getStreetAddress() {
       return this.streetAddress;
   } // End of getStreetAddress method
   
   public int getPhoneNumber() {
       return this.phoneNumber;
   } // End of getPhoneNumber method
   
   public String getCity() {
       return this.city;
   } // End of getCity method
   
   public String getProv() {
       return this.prov;
   } // End of getProv method
   
   public String getPostalCode() {
       return this.postalCode;
   } // End of getPostalCode method
   
   public String getDateOfBirth() {
       return this.dateOfBirth;
   } // End of getDateOfBirth method
   
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   } // End of setFirstName method
   
   public void setLastName(String lastName) {
       this.lastName = lastName;
   } // End of setLastName method
   
   public void setEmail(String email) {
       this.email = email;
   } // End of setEmail method
   
   public void setStreetAddress(String streetAddress) {
       this.streetAddress = streetAddress;
   } // End of setStreetAddress method
   
   public void setPhoneNumber(int phoneNumber) {
       this.phoneNumber = phoneNumber;
   } // End of setPhoneNumber method
   
   public void setCity(String city) {
       this.city = city;
   } // End of setCity method
   
   public void setProv(String prov) {
       this.prov = prov;
   } // End of setProv method
   
   public void setPostalCode(String postalCode) {
       this.postalCode = postalCode;
   } // End of setPostalCode method
   
   public void setDateOfBirth(String dateOfBirth) {
       this.dateOfBirth = dateOfBirth;
   } // End of setDateOfBirth method
} // End of Client class
