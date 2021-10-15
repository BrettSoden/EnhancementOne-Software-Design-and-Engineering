/*
 * Author: Brett C. Soden
 * Date: 4/1/2021
 * Class: CS 320 
 * Module 5-1 Milestone Appointment Service
 */

package Appointments;

import java.util.Date;            //import Date utility from java library

public class Appointment {
	
	private String appointID;                 //initialize appointID as a String
	private String firstName;                 //initialize first name as a string
	private String lastName;                  //intialize last name as a string
	private Date currentDate = new Date();    //initialize current date as a new date
	private Date appointDate;                 //initialize appointDate as a Date type variable
	private String appointDescription;        //initialize appointDescription as a string
	
    
	public Appointment(String appointID, String firstName, String lastName, Date appointDate, String appointDescription, Date currentDate) {

		if(appointID == null || appointID.length() != 10) {     //if length is greater than 10 exception thrown
			throw new IllegalArgumentException("Invalid ID");
		}
		if(firstName == null || firstName.length() > 20) {
			throw new IllegalArgumentException("Invalid Name Length");
		}
		if(lastName == null || lastName.length() > 20) {
			throw new IllegalArgumentException("Invalid Name Length");
		}
		if(appointDate == null || appointDate.before(currentDate)) {   //if appointment date is before current date 
			throw new IllegalArgumentException("Invalid Date");        //exception thrown
		}
		if(appointDescription == null || appointDescription.length() > 50) {  //if description is above 50 characters
			throw new IllegalArgumentException("Invalid Description");        //exception thrown
		}
		
		// this appoint ID pints to appointment string
		this.appointID = appointID;
		this.firstName = firstName;
		this.lastName = lastName;
		//this currentDate ensures new date is always selected
		this.currentDate = currentDate;
		this.appointDate = appointDate;
		this.appointDescription = appointDescription;
	}
	
    //appointment id is received and returned.
	public String getAppointID() {
		return appointID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public Date getCurrentDate() {
		return currentDate;
	}
	
	public Date getAppointDate() {
		return appointDate;
	}
	//appointment description limited to less than 50 characters.
	public String getAppointDescription() {
		return appointDescription;
	}

}
