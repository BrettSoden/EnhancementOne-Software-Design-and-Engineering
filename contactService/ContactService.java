/*
 * Author: Brett C. Soden
 * Date: 3/21/2021
 * Class: CS 320 
 * Module 3-2 Milestone Contact Service
 */

package contactService;

import java.util.List;            
import java.util.ArrayList;                //Imports an array list for contact information
import java.util.UUID;                     //Imports a random number feature

public class ContactService {
	

	private String uniqueId;            //initialize protected string uniqueId
	
	private String firstName;           //initialize protected string firstName
	
	private String lastName;           //initialize protected string lastName
	
	private String phoneNumber;        //initialize protected string phoneNumber
	
	private String address;            //initialize protected string address
	
	private List<ContactService> contactList = new ArrayList<>(); {
	
    uniqueId = UUID.randomUUID().toString().substring(          // requirements call for a random number
		        0, Math.min(toString().length(), 10));         // so a random string of length 10 is selected
    firstName = getFirstName();
    lastName = getLastName();
    phoneNumber = getPhoneNumber();
    address = getAddress();
		  }

	public void newID(String uniqueId) {		 
		 ContactService contactService = new ContactService();
		 contactList.add(contactService);                       //new ID added to contact list and put in list
	}
	//contact info strings placed into  contact list
	public void addContactInfo(String firstName, String lastName, String phoneNumber, String Address) {
		 ContactService contactService = new ContactService();
		 contactList.add(contactService);
	}
	//easy deletion of contact list name, phone number, and address from service
	public void deleteContactInfo(String firstName, String lastName, String phoneNumber, String Address) {
		 ContactService contactService = new ContactService();
		 contactList.remove(contactService);
	}
	//searches for name through random unique ID
	 public void updateFirstName(String firstName) throws Exception {
		    searchForContact(uniqueId).updateFirstName(firstName);   //first name is substring under ID  
	 }
	 
	 public void updateLastName(String lastName) throws Exception {
		    searchForContact(uniqueId).updateLastName(lastName);     //last name is substring under ID
     }
     
	 public void updatePhoneNumber(String phoneNumber) throws Exception {    //exception for phone numnber
		    searchForContact(uniqueId).updatePhoneNumber(phoneNumber);       //connected to ID
     }
	 
	 public void updateAddress(String address) throws Exception {
		    searchForContact(uniqueId).updateAddress(address);
  }

	public String getContactId() {
		return uniqueId;
	}

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getPhoneNumber() {
    	return phoneNumber;
    }
    
    public String getAddress() {
    	return address;
    }


	protected List<ContactService> getContactList() { 
		return contactList; 
		}

	private ContactService searchForContact(String uniqueId) throws Exception {
	    int index = 0;
	    while (index < contactList.size()) {         //while loop for iterating through list
	      if (uniqueId.equals(contactList.get(index).getContactId())) {
	        return contactList.get(index);
	      }
	      index++;  //iterates through list
	    }
	    throw new Exception("Contact does not exist!");   //If contact does not exist exception
	  }
	private ContactService searchForContactFirstName(String firstName) throws Exception {
	    int index = 0;
	    while (index < contactList.size()) {         //while loop for iterating through list
	      if (firstName.equals(contactList.get(index).getFirstName())) {
	        return contactList.get(index);
	      }
	      index++;  //iterates through list
	    }
	    throw new Exception("Contact does not exist!");   //If contact does not exist exception
	  }
	private ContactService searchForContactLastName(String lastName) throws Exception {
	    int index = 0;
	    while (index < contactList.size()) {         //while loop for iterating through list
	      if (lastName.equals(contactList.get(index).getLastName())) {
	        return contactList.get(index);
	      }
	      index++;  //iterates through list
	    }
	    throw new Exception("Contact does not exist!");   //If contact does not exist exception
	  }
	private ContactService searchForContactPhoneNumber(String phoneNumber) throws Exception {
	    int index = 0;
	    while (index < contactList.size()) {         //while loop for iterating through list
	      if (phoneNumber.equals(contactList.get(index).getPhoneNumber())) {
	        return contactList.get(index);
	      }
	      index++;  //iterates through list
	    }
	    throw new Exception("Contact does not exist!");   //If contact does not exist exception
	  }
	private ContactService searchForContactAddress(String Address) throws Exception {
	    int index = 0;
	    while (index < contactList.size()) {         //while loop for iterating through list
	      if (Address.equals(contactList.get(index).getAddress())) {
	        return contactList.get(index);
	      }
	      index++;  //iterates through list
	    }
	    throw new Exception("Contact does not exist!");   //If contact does not exist exception
	  }

}