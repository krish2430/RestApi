package com.tcs.pim.domain;


public class Task {
	private String taskId;
	private String taskDescription;
	private String taskType;
	private String discussionTxt;
	private String taskInformation;
	private int order;
	private String country;
	private String language;
	private String hazardId;
	private String taskName;
	private String hazardCompleteName;
	private String hazardNmId;
	private String hazardSynId;




	public Task(Task t) {
		super();
		this.taskId =t.taskId;
		this.taskDescription =t.taskDescription;
		this.taskType =t.taskType;
		this.discussionTxt =t.discussionTxt;
		this.taskInformation =t.taskInformation;
		this.order =t.order;
		this.country =t.country;
		this.language =t.language;
		this.hazardId =t.hazardId;
		this.taskName =t.taskName;
		this.hazardCompleteName =t.hazardCompleteName;
		this.hazardNmId =t.hazardNmId;
		this.hazardSynId =t.hazardSynId;
	}



	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getHazardId() {
		return hazardId;
	}

	public void setHazardId(String hazardId) {
		this.hazardId = hazardId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getHazardCompleteName() {
		return hazardCompleteName;
	}

	public void setHazardCompleteName(String hazardCompleteName) {
		this.hazardCompleteName = hazardCompleteName;
	}

	public String getHazardNmId() {
		return hazardNmId;
	}

	public void setHazardNmId(String hazardNmId) {
		this.hazardNmId = hazardNmId;
	}

	public String getHazardSynId() {
		return hazardSynId;
	}

	public void setHazardSynId(String hazardSynId) {
		this.hazardSynId = hazardSynId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
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
