package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	/**
	 * 
	 * @param semesterID
	 * @param startDate
	 * @param endDate
	 */
	public Semester(UUID semesterID, Date startDate, Date endDate) {
		super();
		SemesterID = semesterID;
		StartDate = startDate;
		EndDate = endDate;
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

	public Date getStartDate() {
		return StartDate;
	}

	/**
	 * setStartDate - setter for startDate
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	/**
	 * setEndDate - setter for endDate
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

}
