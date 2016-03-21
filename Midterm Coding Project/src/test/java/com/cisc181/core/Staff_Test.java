package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.GregorianCalendar;
import java.util.regex.*;

import com.cisc181.eNums.eTitle;

import exceptions.PersonException;

public class Staff_Test {

	// Create an ArrayList of Staff class
	private static ArrayList<Staff> staffRecords = new ArrayList<Staff>();

	@BeforeClass
	public static void data() throws PersonException {
		// Add five sample Staff instances to the ArrayList with different
		// salaries.
		staffRecords.add(new Staff("Molly", "Something", "Smells", new GregorianCalendar(1996, 10, 1).getTime(),
				"275 Haines Street", "123-123-1234", "hava@udel.edu", "1 pm to 2 pm", 0, 10000,
				new GregorianCalendar(1995, 10, 1).getTime(), eTitle.MR));
		staffRecords.add(new Staff("Polly", "Something", "Smells", new GregorianCalendar(1996, 10, 1).getTime(),
				"275 Haines Street", "123-123-1234", "hava@udel.edu", "1 pm to 2 pm", 0, 20000,
				new GregorianCalendar(1995, 10, 1).getTime(), eTitle.MR));
		staffRecords.add(new Staff("Jolly", "Something", "Smells", new GregorianCalendar(1996, 10, 1).getTime(),
				"275 Haines Street", "123-123-1234", "hava@udel.edu", "1 pm to 2 pm", 0, 30000,
				new GregorianCalendar(1995, 10, 1).getTime(), eTitle.MR));
		staffRecords.add(new Staff("Dolly", "Something", "Smells", new GregorianCalendar(1996, 10, 1).getTime(),
				"275 Haines Street", "123-123-1234", "hava@udel.edu", "1 pm to 2 pm", 0, 40000,
				new GregorianCalendar(1995, 10, 1).getTime(), eTitle.MR));
		staffRecords.add(new Staff("Wally", "Something", "Smells", new GregorianCalendar(1996, 10, 1).getTime(),
				"275 Haines Street", "123-123-1234", "hava@udel.edu", "1 pm to 2 pm", 0, 50000,
				new GregorianCalendar(1995, 10, 1).getTime(), eTitle.MR));

	}

	@Test
	public void tests() throws PersonException {

		// Compute an average of the salaries and prove it with an assertEquals
		// method
		assertEquals(
				(staffRecords.get(0).getSalary() + staffRecords.get(1).getSalary() + staffRecords.get(2).getSalary()
						+ staffRecords.get(3).getSalary() + staffRecords.get(4).getSalary()) / 5,
				30000, 0.01);

		// Write a test for Staff with an invalid phone number and invalid DOB.
		Staff Staff_Test = new Staff("Olly", "Something", "Smells", new GregorianCalendar(1492, 10, 1).getTime(),
				"275 Haines Street", "12-123-1234", "hava@udel.edu", "1 pm to 2 pm", 0, 50000,
				new GregorianCalendar(1995, 10, 1).getTime(), eTitle.MR);
		
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		boolean test1 = false;
		Pattern pattern = Pattern.compile(regex);

		String number = Staff_Test.getPhone();
		Matcher matcher = pattern.matcher(number);

		if (!matcher.matches()) {
			test1 = true;
		}
		assertEquals(test1, true);

		boolean test2 = false;
		test2 = false;
		Calendar current = Calendar.getInstance();
		current.add(Calendar.YEAR, -100);

		if (Staff_Test.getDOB().before(current.getTime())) {
			test2 = true;
		}

		assertEquals(test2, true);
	}
}
