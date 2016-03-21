package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;

	/**
	 * no arg-constructor
	 */
	public Course() {

	}

	/**
	 * 
	 * @param courseID
	 * @param courseName
	 * @param gradePoints
	 * @param eMajor
	 */
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
	/**
	 * setCourseID - setter for CourseID
	 * @param courseID
	 */
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	/**
	 * setCourseName - setter for CourseName
	 * @param courseName
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}
	/**
	 * setGradePoints - setter for gradePoints
	 * @param gradePoints
	 */
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

}
