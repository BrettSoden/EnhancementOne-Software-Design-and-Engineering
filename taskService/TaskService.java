/*
 * Author: Brett C. Soden
 * Date: 3/27/2021
 * Class: CS 320 
 * Module 4-1 Milestone Task Service
 */

package taskService;

import java.util.List;            
import java.util.ArrayList;                //Imports an array list for contact information
import java.util.UUID;                     //Imports a random number feature
import taskService.TaskService;

public class TaskService {
	
	private String taskID;
	private String taskName;
	private String taskDescription;
	
	private List<TaskService> taskList = new ArrayList<>(); {
		
	    taskID = UUID.randomUUID().toString().substring(          // requirements call for a random number
			        0, Math.min(toString().length(), 10));         // so a random string of length 10 is selected
	    taskName = getTaskName();
	    taskDescription = getTaskDescription();
			  }
	
	public void newID(String taskID) {		 
		 TaskService taskService = new TaskService();
		 taskList.add(taskService);                       //new taskID added to task list and put in list
	}
	
	//task info strings placed into  contact list
		public void addTaskInfo(String taskID, String taskName, String taskDescription) {
			 TaskService taskService = new TaskService();
			 taskList.add(taskService);
		}
		//easy deletion of task list ID, name, and description
		public void deleteTaskIdInfo(String taskID, String taskName, String taskDescription) {
			 TaskService taskService = new TaskService();
			 taskList.remove(taskService);
		}
		//searches for name through random unique ID
		 public void updateTaskName(String taskName) throws Exception {
			    searchForTask(taskID).updateTaskName(taskName);   //task name is substring under ID  
		 }
		 
		 public void updateDescription(String taskDescription) throws Exception {
			    searchForTask(taskID).updateDescription(taskDescription);     //taskDescription is substring under ID
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
	     
		 protected List<TaskService> getTaskList() { 
		     return taskList; 
		 }

		private TaskService searchForTask(String taskID) throws Exception {
		   int index = 0;
		   while (index < taskList.size()) {         //while loop for iterating through list
			 if (taskID.equals(taskList.get(index).getTaskID())) {
			   return taskList.get(index);
			 }
			 index++;  //iterates through list
	     }
	     throw new Exception("Task does not exist!");   //If task does not exist exception
	}
		private TaskService searchForTaskName(String taskName) throws Exception {
			   int index = 0;
			   while (index < taskList.size()) {         //while loop for iterating through list
				 if (taskName.equals(taskList.get(index).getTaskName())) {
				   return taskList.get(index);
				 }
				 index++;  //iterates through list
		     }
		     throw new Exception("Task name does not exist!");   //If task does not exist exception
		}
		private TaskService searchForTaskDescription(String taskDescription) throws Exception {
			   int index = 0;
			   while (index < taskList.size()) {         //while loop for iterating through list
				 if (taskDescription.equals(taskList.get(index).getTaskDescription())) {
				   return taskList.get(index);
				 }
				 index++;  //iterates through list
		     }
		     throw new Exception("Task description does not exist!");   //If task does not exist exception
		}


}