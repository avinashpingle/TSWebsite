package com.testingshastra.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	@Id
	private int courseid;
	private String courseName;
	private int courseDurationInMonths;
	private float courseFees;
	private String trainerName;
	
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseDurationInMonths() {
		return courseDurationInMonths;
	}
	public void setCourseDurationInMonths(int courseDurationInMonths) {
		this.courseDurationInMonths = courseDurationInMonths;
	}
	public float getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(float courseFees) {
		this.courseFees = courseFees;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

}
