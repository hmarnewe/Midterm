package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	private UUID CourseID; 
	private String CourseName; 
	private int GradePoints; 
	private eMajor eMajor;
	
	public Course() {
		
	}
	
	public Course(UUID courseID, String courseName, int gradePoints, eMajor eMajor) {
		super(); 
		CourseID = courseID; 
		CourseName = courseName; 
		GradePoints = gradePoints; 
		this.eMajor = eMajor; 

	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	
	public int getGradePoints() {
		return GradePoints;
	}
	
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	
	
}
