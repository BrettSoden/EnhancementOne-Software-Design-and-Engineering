package AppointmentServices;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Appointments.Appointment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;          //import for jupiter display name
import org.junit.jupiter.api.Assertions;
import java.util.Date;

class AppointmentTest {

		@Test
		@DisplayName("Test for unique appointment ID")
		void testAppointID() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment("1234567891011111", "Dave", "Smith", Date(10, 21, 20), "Dentist Appointment", new Date());        
			});        //appointment ID test is connected through Task class
		    
		}
		
		@Test
		@DisplayName("Exception test for a Appointment date that is in the past")
		void testAppointDateTooEarly() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment("1234567890", "Dave", "Smith", Date(10,21,20), "Dentist Appointment", new Date());        
			});        //appointment name test is connected through Task class
		}
		
		private Date Date(int i, int j, int k) {
			return null;
		}

		@Test
		@DisplayName("Exception test for a appointment description that is null")
		void testAppointmentDescriptionNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment("1234567890", null, null, new Date(), null, new Date());        
			});        //appoint name test is connected through appoint class
		}
		
		@AfterEach
		void teardown() {
		}
		}