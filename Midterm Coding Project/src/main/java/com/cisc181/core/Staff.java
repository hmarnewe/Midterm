package com.cisc181.core;

import java.util.Date;

import com.cisc181.eNums.eTitle;

public class Staff extends Employee {

	 private eTitle Title;

	   public Staff(eTitle title){
	        this.Title = title;
	    }

	    public void setTitle(eTitle title){
	        this.Title = title;
	    }
	    public eTitle getTitle(){
	        return this.Title;
	    }

    /**
     * 
     * @param FirstName
     * @param MiddleName
     * @param LastName
     * @param DOB
     * @param Address
     * @param Phone_number
     * @param Email
     * @param officeHours
     * @param rank
     * @param salary
     * @param hireDate
     * @param Title
     */
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eTitle Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}

}