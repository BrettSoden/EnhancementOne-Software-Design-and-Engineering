/* Author: Brett C. Soden
 * Date: 3/27/2021
 * Class: CS 320 
 * Module 4-1 Milestone Task Service
 */

package taskServiceTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;          //import for jupiter display name
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import taskService.Task;                  //connects file to task.java

class TaskTest {

	@Test
	@DisplayName("Test for unique task ID")
	void testTaskID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567891011", null, null);        
		});        //task ID test is connected through Task class
	    
	}
	
	@Test
	@DisplayName("Exception test for a task name that is too long")
	void testTaskNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Wash the dishes then scrub the floors then organize the pantry.", null);        
		});        //task name test is connected through Task class
	}
	
	@Test
	@DisplayName("Exception test for a task description that is null")
	void testTaskDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, null, null);        
		});        //task name test is connected through Task class
	}
	
	@AfterEach
	void teardown() {
	}

}
