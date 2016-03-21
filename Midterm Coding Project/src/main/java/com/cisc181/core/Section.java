package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Section extends Course {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;

	/**
	 * 
	 * @param courseID
	 * @param semesterID
	 * @param sectionID
	 * @param roomID
	 */
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		super();
		CourseID = courseID;
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = roomID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	/**
	 * setSemesterID - setter for semesterID
	 * @param semesterID
	 */
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
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

	public int getRoomID() {
		return RoomID;
	}

	/**
	 * setRoomID - setter for roomID
	 * @param roomID
	 */
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	
	/**
	 * setCourseID - setter for courseID
	 * @param 
	 */
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	
	}

}
