package com.tcs.pim.domain;

import java.io.Serializable;
import java.util.List;

public class HazardTasks implements Serializable{
	private int taskId;
	private String taskDescription;
	private String taskType;
	private String discussionTxt;
	private String taskInformation;
	private int order;
	private String country;
	private String language;
	private List<TaskToHazard> hazard;

	public List<TaskToHazard> getHazard() {
		return hazard;
	}

	public void setHazard(List<TaskToHazard> hazard) {
		this.hazard = hazard;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getDiscussionTxt() {
		return discussionTxt;
	}

	public void setDiscussionTxt(String discussionTxt) {
		this.discussionTxt = discussionTxt;
	}

	public String getTaskInformation() {
		return taskInformation;
	}

	public void setTaskInformation(String taskInformation) {
		this.taskInformation = taskInformation;
	}

}
