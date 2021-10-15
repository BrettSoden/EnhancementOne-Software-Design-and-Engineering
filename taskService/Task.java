/*
 * Author: Brett C. Soden
 * Date: 3/27/2021
 * Class: CS 320 
 * Module 4-1 Milestone Task Service
 */

package taskService;

public class Task {
	
	private String taskID;            //initialize task ID as string
	private String taskName;          //initialize task name as string 
	private String taskDescription;   //initialize task description as string
	
	public Task(String taskID, String taskName, String taskDescription) {
		if(taskID == null || taskID.length() != 10) {             //if length is greater than 10 exception thrown
			throw new IllegalArgumentException("Invalid Input");
		}
		else if (taskName == null || taskName.length() > 20) {    //if length is greater than 20 exception thrown
			throw new IllegalArgumentException("Invalid Input");
		}
		else if(taskDescription == null || taskDescription.length() > 50) {
			throw new IllegalArgumentException("Invalid Input");    //if length is greater than 10 exception thrown
		}
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
	}
	
	
	public String getTaskID() {
		return taskID;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public String getTaskDescription() {
		return taskDescription;
	}
	
}
