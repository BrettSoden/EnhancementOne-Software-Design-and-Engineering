/*
 * Author: Brett C. Soden
 * Date: 4/1/2021
 * Class: CS 320 
 * Module 5-1 Milestone Appointment Service
 */

package Appointments;

import java.util.List;            
import java.util.ArrayList;                //Imports an array list for contact information
import java.util.Date;
import java.util.UUID;                     //Imports a random number feature


public class AppointmentService {
	
	private String appointID;                 //initialize appointment ID
	private String firstName;                 //initialize first name 
	private String lastName;                  //initialize last name 
	private Date currentDate = new Date();    //initialize a new date as current date
	private Date appointDate;                 //initialize an appointment date
	private String appointDescription;        //initialize an appointment descritpion
	
	
	private List<AppointmentService> appointList = new ArrayList<>(); {
		
	    appointID = UUID.randomUUID().toString().substring(          // requirements call for a random number
			        0, Math.min(toString().length(), 10));         // so a random string of length 10 is selected
	    firstName = getFirstName();
	    lastName = getLastName();
	    appointDate = getAppointDate();
			  }
	
	public void newID(String appointID) {		 
		 AppointmentService appointmentService = new AppointmentService();
		 appointList.add(appointmentService);                       //new appointID added to task list and put in list
	}
	
	//Appointment info strings placed into  appointment list
		public void addAppointInfo(String appointID, String firstName, String lastName, Date appointDate, String appointDescription) {
			 AppointmentService appointService = new AppointmentService();
			 appointList.add(appointService);
		}
		//Easy deletion of appointment list ID, name, and description
		public void deleteAppointIdInfo(String appointID, String firstName, String lastName, Date appointDate, String appointDescription) {
			 AppointmentService appointmentService = new AppointmentService();
			 appointList.remove(appointmentService);
		}
		//searches for name through random unique ID
		 public void updateAppointDate(Date appointDate) throws Exception {
			    searchForAppointment(appointID).updateAppointDate(appointDate);   //appointment name is substring under ID  
		 }
		 //receives and returns a publuc appointment ID
		 public String getAppointID() {
				return appointID;
		 }
		 //receives and returns a first name
		 public String getFirstName() {
			 return firstName;
		 }
		 //receives and returns a last name 
		 public String getLastName() {
			 return lastName;
		 }
         //receives and returns a date
		 public Date getAppointDate() {
		     return appointDate;
		 }
		 //receives and returns a description   
		 public String getAppointDescription() {
		     return appointDescription;
		 }
	     
		 protected List<AppointmentService> getAppointmentList() { 
		     return appointList; 
		 }

		private AppointmentService searchForAppointment(String appointID) throws Exception {
		   int index = 0;
		   while (index < appointList.size()) {         //while loop for iterating through list
			 if (appointID.equals(appointList.get(index).getAppointID())) {
			   return appointList.get(index);
			 }
			 index++;  //iterates through list
	     }
	     throw new Exception("Appointment ID does not exist!");   //If task does not exist exception
	}
		private AppointmentService searchForAppointmentFirstName(String firstName) throws Exception {
			   int index = 0;
			   while (index < appointList.size()) {         //while loop for iterating through list
				 if (firstName.equals(appointList.get(index).getFirstName())) {
				   return appointList.get(index);
				 }
				 index++;  //iterates through list
		     }
		     throw new Exception("Appointment for first name does not exist!");   //If task does not exist exception
		}
		
		private AppointmentService searchForAppointmentLastName(String lastName) throws Exception {
			   int index = 0;
			   while (index < appointList.size()) {         //while loop for iterating through list
				 if (lastName.equals(appointList.get(index).getLastName())) {
				   return appointList.get(index);
				 }
				 index++;  //iterates through list
		     }
		     throw new Exception("Appointment for last name does not exist!");   //If task does not exist exception
		}
		private AppointmentService searchForAppointmentAppointDate(String appointDate) throws Exception {
			   int index = 0;
			   while (index < appointList.size()) {         //while loop for iterating through list
				 if (appointDate.equals(appointList.get(index).getAppointDate())) {
				   return appointList.get(index);
				 }
				 index++;  //iterates through list
		     }
		     throw new Exception("Appointment date does not exist!");   //If task does not exist exception
		}

}



