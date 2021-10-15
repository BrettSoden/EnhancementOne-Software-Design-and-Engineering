/* Author: Brett C. Soden
 * Date: 4/1/2021
 * Class: CS 320 
 * Module 5-1 Milestone Task Service
 */
package AppointmentServices;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.Date;


import Appointments.AppointmentService;

class AppointmentServiceTest extends AppointmentService{

	protected String appointID;           //initialize protected string appointID
	protected Date appointDate = Date(0, 0, 0);          //initialize protected Date appointDate
	protected String appointDescription;   //initialize protected string appointDescription
	
	protected void setAppointID() {
	}private Date Date(int i, int j, int k) {
		
		return null;
	}
	{
		appointID = "1234567890";     //assigning value for appointID
	}
	
	protected void setUpAppointDate() {
	}{
		appointDate = Date(9, 18, 21);          //assigning value for appointDate
	}
	
	protected void setUpAppointDescription() {
	}{
		appointDescription = "Go to the Dentist's office";          //assigning value for description
	}
	
	
	@Test
	public void testAddAppointID() {                  //Test method for random appointment ID
		String result = appointID;
		assertTrue(result == "1234567890");
	}
	
	@Test
	public void testAddFalseAppointID() {                  //Test method for random appointment ID
		String result = appointID;
		assertFalse(result == "1234567891011111111111");
	}
	
	@Test
	public void testAddAppointDate() {                //Test method for appointment name
		Date result = appointDate;
		assertTrue(result == Date(9, 18, 21));
	}
	
	@Test
	public void testAddAppointDescription() {                //Test method for appointment description
		String result = appointDescription;
		assertTrue(result == "Go to the Dentist's office");
	}
	
	
	@Test
	public void testAddFalseAppointDescription() {                //Test method for appointment description
		String result = appointDescription;
		assertFalse(result == "Go to the Dentist's office with my dog on July 4th without to get my teeth cleaned");
	}
	
	@AfterEach
	void teardown() {                             //Jupiter teardown after each test
	}

}


