package com.beans;

public class Job {
	
	private int id;
	private String jobName;
	private String jobDescription;
	private int jobVacancy;
	private String jobLocation;
	private String jobType;
	private String jobPackage;
	private String jobCreationDate;
	private String jobEndingDate;
	private String jobQualification;
	private int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public int getJobVacancy() {
		return jobVacancy;
	}
	public void setJobVacancy(int jobVacancy) {
		this.jobVacancy = jobVacancy;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getJobPackage() {
		return jobPackage;
	}
	public void setJobPackage(String jobPackage) {
		this.jobPackage = jobPackage;
	}
	public String getJobCreationDate() {
		return jobCreationDate;
	}
	public void setJobCreationDate(String jobCreationDate) {
		this.jobCreationDate = jobCreationDate;
	}
	public String getJobEndingDate() {
		return jobEndingDate;
	}
	public void setJobEndingDate(String jobEndingDate) {
		this.jobEndingDate = jobEndingDate;
	}
	public String getJobQualification() {
		return jobQualification;
	}
	public void setJobQualification(String jobQualification) {
		this.jobQualification = jobQualification;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", jobName=" + jobName + ", jobDescription=" + jobDescription + ", jobVacancy="
				+ jobVacancy + ", jobLocation=" + jobLocation + ", jobType=" + jobType + ", jobPackage=" + jobPackage
				+ ", jobCreationDate=" + jobCreationDate + ", jobEndingDate=" + jobEndingDate + ", jobQualification="
				+ jobQualification + ", userId=" + userId + "]";
	}
	public Job(int id, String jobName, String jobDescription, int jobVacancy, String jobLocation, String jobType,
			String jobPackage, String jobCreationDate, String jobEndingDate, String jobQualification, int userId) {
		super();
		this.id = id;
		this.jobName = jobName;
		this.jobDescription = jobDescription;
		this.jobVacancy = jobVacancy;
		this.jobLocation = jobLocation;
		this.jobType = jobType;
		this.jobPackage = jobPackage;
		this.jobCreationDate = jobCreationDate;
		this.jobEndingDate = jobEndingDate;
		this.jobQualification = jobQualification;
		this.userId = userId;
	}
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
