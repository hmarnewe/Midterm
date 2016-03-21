package com.cisc181.core;

import java.util.UUID;


public class Enrollment{

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	/**
	 * no-arg constructor
	 */
	public Enrollment(){
	}
	
	/**
	 * 
	 * @param StudentID
	 * @param SectionID
	 */
	public Enrollment(UUID StudentID, UUID SectionID) {
		super();
		this.EnrollmentID = UUID.randomUUID();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	
	public UUID getSectionID() {
		return SectionID;
	}
	
	/**
	 * setSectionID - setter for sectionID
	 * @param sectionID
	 */
	public void setSectionID(UUID sectionID) { 
		 		SectionID = sectionID; 
			} 

	
	public UUID getStudentID(){
    	return StudentID;
    }
	
	/**
	 * setStudentID - setter for StudentID
	 * @param studentID
	 */
	public void setStudentID(UUID studentID) { 
		 		StudentID = studentID; 
		 	} 

	
	public UUID getEnrollmentID(){
    	return EnrollmentID;
    }
	
	/**
	 * setEnrollmentID - setter for enrollmentID
	 * @param enrollmentID
	 */
	public void setEnrollmentID(UUID enrollmentID){
    	EnrollmentID = enrollmentID;
    }
	
	public double getGrade(){
		return Grade;
	}
	
	/**
	 * setGrade - setter for Grade
	 * @param grade
	 */
	public void setGrade(double grade){
		Grade = grade;
	}
	
	
	
	

}
