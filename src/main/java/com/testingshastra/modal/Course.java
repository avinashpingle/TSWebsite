package com.testingshastra.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.testingshastra.services.StringPrefixedSequenceIdGenerator;

@Entity
@Table(name="Course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courses")
	@GenericGenerator(
			name="courses",
			strategy = "com.testingshastra.services.StringPrefixedSequenceIdGenerator",
			parameters = {
					@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value="50"),
					@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value="crs"),
					@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value="%02d")
			})
	private String courseid;
	private String courseName;
	private int courseDurationInMonths;
	private float courseFees;
	private String trainerName;
	
	
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
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
