/*
 * Author: Brett C. Soden
 * Date: 3/22/2021
 * Class: CS 320 
 * Module 3-2 Milestone Contact Service
 */

package contactServiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import contactService.ContactService;
//Connect Contact service to contactservicetest
public class ContactServiceTest extends ContactService{ 
	
	protected String uniqueId;           //initialize protected string uniqueId
	protected String firstName;          //initialize protected string firstName
	protected String lastName;           //initialize protected string lastName
	protected String phoneNumber;        //initialize protected string phoneNumber
	protected String address;            //initialize protected string address
	
	protected void setUniqueId() {
	}{
		uniqueId = "12345678901";     //assigning value for id
	}
	
	protected void setUpFirstName() {
	}{
		firstName = "Derek";          //assigning value for first name
	}
	
	protected void setUpLastName() {
	}{
		lastName = "Johnson";          //assigning value for last name
	}
	
	protected void setUpPhoneNumber() {
	}{
		phoneNumber = "1234567890";     //assigning value for phone number
	}
	
	protected void setUpAddress() {
	}{
		address = "7677 59th St. NW Clinton, NJ";    //assigning value for address
	}
	
	@Test
	public void testAddUniqueId() {                  //Test method for random ID
		String result = uniqueId;
		assertTrue(result == "12345678901");
	}
	
	@Test
	public void testAddFirstName() {                //Test method for first name
		String result = firstName;
		assertTrue(result == "Derek");
	}
	@Test
	public void testAddFalseFirstName() {                //Test method for first name
		String result = firstName;
		assertFalse(result == "Derekudhsfkahkjdhfkjahdkjfhakjdhgfkabhndkjgfkjasdbkgfbakjsdbfkbhasdkjgvbkjadsbg");
	}
	
	@Test
	public void testAddLastName() {                //Test method for last name
		String result = lastName;
		assertTrue(result == "Johnson");
	}
	
	@Test
	public void testAddFalseLastName() {                //Test method for last name
		String result = lastName;
		assertFalse(result == "Johnsondknflkainjdlkfnlkadnvgflkndslknflkadsnlkfjlkdsjflkjalkdjnfglkajndlkfgjlkadjfl");
	}
	
	@Test
	public void testAddPhoneNumber() {             //Test method for phone numer
		String result = phoneNumber;
		assertTrue(result == "1234567890");
	}
	
	@Test
	public void testAddFalsePhoneNumber() {             //Test method for phone numer
		String result = phoneNumber;
		assertFalse(result == "123456789012345678909876543212345678908765432123456789876543245678909876543456789");
	}
	
	@Test
	public void testAddress() {                     //Test method for address
		String result = address;
		assertTrue(result == "7677 59th St. NW Clinton, NJ");
	}
	
	@Test
	public void testFalseAddress() {                     //Test method for address
		String result = address;
		assertFalse(result == "asjhdfuaheiuryeh9f8af8dy865s54d68aruejw09ehf76dtf67vgaeuwj09utrnfediv98re9jrg0eas98jrgih89sadhfg8jr8e9h89rg98aeh89rhg98ah98rhg98hae98rjgo9he98rhg8har98");
	}
	
	@AfterEach
	void teardown() {                             //Jupiter teardown after each test
	}
}

