/*
 * Author: Brett C. Soden
 * Date: 3/21/2021
 * Class: CS 320 
 * Module 3-2 Milestone Contact Service
 */

package contactServiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;          //import for jupiter display name
import org.junit.jupiter.api.Test;

import contactService.Contact;                  //connects file to contact.java


class ContactTest {

	@Test
	@DisplayName("Test for unique ID")
	void testUniqueID() {
		Contact uniqueID = new Contact("1234567890");          //creates ID to test for assertTrue
	    assertTrue(uniqueID.getUniqueId().equals("1234567890"));     //gets ID from contact class
	}
	
	@Test
	@DisplayName("Exception test for a Unique ID that is too long")
	void testUniqueIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891011");      
		}); 
	}
	
	@Test
	@DisplayName("Exception test for a first name that is too long")
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Derek B. Johnson III");        //first name test is connected through Contact class
		}); 
	}
	
	@Test
	@DisplayName("Exception test for a Last that is too long")
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Derek B. Johnson III");        //Throws and exception when a name is over ten characters
		}); 
	}
	
	@Test
	@DisplayName("Exception test for a phone number that is too long")
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891011");
		}); 
	}
	
	@Test
	@DisplayName("Exception test for an Address that is too long")
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("7677 59th St. NW Clinton, NJ 7677 59th St. NW Clinton, NJ 7677 59th St. NW Clinton, NJ ");
		}); 
	}
	
	@AfterEach
	void teardown() {
	}
}
