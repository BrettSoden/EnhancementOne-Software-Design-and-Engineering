/* Author: Brett C. Soden
 * Date: 3/27/2021
 * Class: CS 320 
 * Module 4-1 Milestone Task Service
 */

package taskServiceTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import taskService.TaskService;

class TaskServiceTest extends TaskService {

	protected String taskID;           //initialize protected string taskID
	protected String taskName;          //initialize protected string taskName
	protected String taskDescription;   //inproitialize protected string taskDescription
	
	protected void setTaskID() {
	}{
		taskID = "1234567890";     //assigning value for taskID
	}
	
	protected void setUpTaskName() {
	}{
		taskName = "Wash Dishes";          //assigning value for task name
	}
	
	protected void setUpTaskDescription() {
	}{
		taskDescription = "Wash the dishes on the counter top.";          //assigning value for description
	}
	
	@Test
	public void testAddTaskID() {                  //Test method for random task ID
		String result = taskID;
		assertTrue(result == "1234567890");
	}
	
	@Test
	public void testAddFalseTaskID() {                  //Test method for random task ID
		String result = taskID;
		assertFalse(result == "123456789047957893475987493758973947859");
	}
	
	@Test
	public void testAddTaskName() {                //Test method for task name
		String result = taskName;
		assertTrue(result == "Wash Dishes");
	}
	
	@Test
	public void testAddFalseTaskName() {                //Test method for task name
		String result = taskName;
		assertFalse(result == "jsadfoajhoiuehjfoiajhoidfnjikajdfijaoijeifjioajsndifnjoiansdgfionasdkjngknadskfgnkjdsa");
	}
	
	@Test
	public void testAddTaskDescription() {                //Test method for task description
		String result = taskDescription;
		assertTrue(result == "Wash the dishes on the counter top.");
	}
	
	@Test
	public void testAddFalseTaskDescription() {                //Test method for task description
		String result = taskDescription;
		assertFalse(result == "sjdefiue4r8htqfae9hrgfiueqahriut4hthgiuehws89gfhiuhiuqe4hrhfg8u9ewr4h8th49hfr8tawe98wh489gthe9w84h98ufhewuhr9gt4gf98uhewa984rh8tfwh8ghf98u4hew8hg98hew48g");
	}
	
	@AfterEach
	void teardown() {                             //Jupiter teardown after each test
	}

}
