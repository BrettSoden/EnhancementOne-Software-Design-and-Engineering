/*
 * Author: Brett C. Soden
 * Date: 3/21/2021
 * Class: CS 320 
 * Module 3-2 Milestone Contact Service
 */

package contactService;

public class Contact {
	
	private String uniqueId;        //initialize private string for contacts
	
	private String firstName; //intialize first name
	
	private String lastName;  //initialize last name
	
	private String phoneNumber;  //intialize phone number
	
	private String address;     //initialize address	

	
	public Contact(String uniqueId) {
		if(uniqueId == null || uniqueId.length() > 20) {                  //if the length is greater than ten or null
			throw new IllegalArgumentException("Invalid ID");  //then an exception is thrown
		}
		
		this.uniqueId = uniqueId;
	}
	
	public void FirstName(String firstName) {
		if(firstName == null || firstName.length() > 20) {      //If length is greater than ten or null
			throw new IllegalArgumentException("Invalid First Name");   //an exception is thrown
		}
		
		this.firstName = firstName;
	}
	
	public void LastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {             //If length is greater than ten or null
			throw new IllegalArgumentException("Invalid Last Name"); //an exception is thrown
		}
		
		this.lastName = lastName;
	}
	
	public void PhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length() != 10) {            //If string is not ten characters
            throw new IllegalArgumentException("Invalid Phone Number");    //an exception is thrown
		}
		
		this.phoneNumber = phoneNumber;
	}
	
	public void Address(String address) {                           
		if(address == null || address.length() > 30) {                  //If string is greater than 30
			throw new IllegalArgumentException("Invalid Adress");       //characters and exception is thrown
		}
		
		this.address = address;
	}
	//pulls and returns id
	public String getUniqueId() {                  
		return uniqueId;
    	}
    //pulls and returns contact's first name
	public String getFirstName( ) {        
		return firstName;
	}
    //pulls and returns contact's last name
	public String getLastName( ) {
		return lastName;
   }
	//pulls and returns contact's phone number
	public String getPhoneNumber( ) {
		return phoneNumber;
   }
	//pulls and returns contact's address
	public String getAddress( ) {
		return address;
   }

}