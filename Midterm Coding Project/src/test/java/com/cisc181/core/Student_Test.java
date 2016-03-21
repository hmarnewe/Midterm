package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

import exceptions.PersonException;

public class Student_Test {

	// Array lists
	private static ArrayList<Course> courseRecords = new ArrayList<Course>(); // ArrayLists
	private static ArrayList<Semester> semesterRecords = new ArrayList<Semester>();
	private static ArrayList<Section> sectionRecords = new ArrayList<Section>();
	private static ArrayList<Student> studentRecords = new ArrayList<Student>();
	private static ArrayList<Enrollment> enrollmentRecords = new ArrayList<Enrollment>();

	@BeforeClass
	public static void data() throws PersonException {

		// Add three Course records
		courseRecords.add(new Course(UUID.randomUUID(), "CISC", 0, eMajor.COMPSI));
		courseRecords.add(new Course(UUID.randomUUID(), "PHYS", 0, eMajor.PHYSICS));
		courseRecords.add(new Course(UUID.randomUUID(), "BUSI", 0, eMajor.BUSINESS));

		// Add two Semesters, one for Fall, one for Spring.
		semesterRecords.add(new Semester(UUID.randomUUID(), new GregorianCalendar(2015, 9, 1).getTime(),
				new GregorianCalendar(2015, 12, 19).getTime()));
		semesterRecords.add(new Semester(UUID.randomUUID(), new GregorianCalendar(2016, 2, 9).getTime(),
				new GregorianCalendar(2016, 5, 26).getTime()));

		// Add two Sections for each Course & Semester (total of six Sections).
		sectionRecords.add(new Section(courseRecords.get(0).getCourseID(), semesterRecords.get(0).getSemesterID(),
				UUID.randomUUID(), 101));
		sectionRecords.add(new Section(courseRecords.get(0).getCourseID(), semesterRecords.get(0).getSemesterID(),
				UUID.randomUUID(), 102));
		sectionRecords.add(new Section(courseRecords.get(1).getCourseID(), semesterRecords.get(1).getSemesterID(),
				UUID.randomUUID(), 201));
		sectionRecords.add(new Section(courseRecords.get(1).getCourseID(), semesterRecords.get(1).getSemesterID(),
				UUID.randomUUID(), 202));
		sectionRecords.add(new Section(courseRecords.get(2).getCourseID(), semesterRecords.get(0).getSemesterID(),
				UUID.randomUUID(), 301));
		sectionRecords.add(new Section(courseRecords.get(2).getCourseID(), semesterRecords.get(1).getSemesterID(),
				UUID.randomUUID(), 302));

		// Add ten Student records to an ArrayList of Student
		studentRecords.add(new Student("Hava", "Leandra", "Marneweck", new GregorianCalendar(1996, 10, 1).getTime(),
				eMajor.COMPSI, "275 Haines St.", "123-123-1234", "hava@udel.edu"));
		studentRecords.add(new Student("Catharina", "Maria", "Marneweck", new GregorianCalendar(1968, 8, 29).getTime(),
				eMajor.PHYSICS, "275 Haines St.", "123-456-789", "hava@udel.edu"));
		studentRecords
				.add(new Student("Cornelius", "Johannes", "Marneweck", new GregorianCalendar(1968, 8, 29).getTime(),
						eMajor.BUSINESS, "275 Haines St.", "123-456-789", "hava@udel.edu"));
		studentRecords.add(new Student("Elsje", "Elizabeth", "Marneweck", new GregorianCalendar(1990, 11, 27).getTime(),
				eMajor.COMPSI, "275 Haines St.", "123-123-1234", "hava@udel.edu"));
		studentRecords
				.add(new Student("Cornelius", "Johannes", "Marneweck", new GregorianCalendar(1990, 5, 26).getTime(),
						eMajor.PHYSICS, "275 Haines St.", "123-123-1234", "hava@udel.edu"));
		studentRecords.add(new Student("Eben", "D'Lewis", "Marneweck", new GregorianCalendar(1998, 3, 2).getTime(),
				eMajor.BUSINESS, "275 Haines St.", "123-123-1234", "hava@udel.edu"));
		studentRecords.add(new Student("Aden", "Quinto", "Marneweck", new GregorianCalendar(1999, 7, 14).getTime(),
				eMajor.COMPSI, "275 Haines St.", "123-1234-1234", "hava@udel.edu"));
		studentRecords.add(new Student("Albertus", "Dog", "Marneweck", new GregorianCalendar(1980, 8, 29).getTime(),
				eMajor.PHYSICS, "275 Haines St.", "123-123-1234", "hava@udel.edu"));
		studentRecords.add(new Student("Timoteus", "Cat", "Marneweck", new GregorianCalendar(2001, 7, 1).getTime(),
				eMajor.BUSINESS, "275 Haines St.", "123-123-1234", "hava@udel.edu"));
		studentRecords.add(new Student("Swimmy", "Fish", "Marneweck", new GregorianCalendar(2001, 7, 1).getTime(),
				eMajor.COMPSI, "275 Haines St.", "123-123-1234", "hava@udel.edu"));

		// Enroll the ten students you created in each of the Sections
		for (Section section : sectionRecords) {
			for (Student student : studentRecords) {
				enrollmentRecords.add(new Enrollment(student.getStudentID(), section.getSectionID()));

			}
		}

		// Determine each student’s GPA,
		for (Enrollment enrolls : enrollmentRecords) {
			enrolls.setGrade(0);
		}
	}

	/**
	 * method that calculates GPA
	 * 
	 * @param student
	 * @return GPA
	 */
	private double GPA(Student student) {
		double GPA = 0;
		double dec = 0;
		for (int j = 0; j <= 59; j++) {
			dec++;
			if (enrollmentRecords.get(j).getGrade() >= 90) {
				GPA += 4.0;
			} else if (enrollmentRecords.get(j).getGrade() >= 80) {
				GPA += 3.0;
			} else if (enrollmentRecords.get(j).getGrade() >= 70) {
				GPA += 2.0;
			} else if (enrollmentRecords.get(j).getGrade() >= 60) {
				GPA += 1.0;
			} else {
				GPA += 0.0;
			}

		}
		GPA = GPA / dec;
		return GPA;

	}

	// Determine each course’s average grade

	@Test
	public void tests() {
		// Test GPA of student1 (Hava)
		assertEquals(GPA(studentRecords.get(0)), 0, 0);
		// Test GPA of Student2 (Catharina)
		assertEquals(GPA(studentRecords.get(1)), 0, 0);
		// Test GPA of Student3 (Cornelius 1968)
		assertEquals(GPA(studentRecords.get(2)), 0, 0);
		// Test GPA of Student4 (Elsje)
		assertEquals(GPA(studentRecords.get(3)), 0, 0);
		// Test GPA of Student5 (Cornelius 1990)
		assertEquals(GPA(studentRecords.get(4)), 0, 0);
		// Test GPA of Student6 (Eben)
		assertEquals(GPA(studentRecords.get(5)), 0, 0);
		// Test GPA of Student7 (Aden)
		assertEquals(GPA(studentRecords.get(6)), 0, 0);
		// Test GPA of Student8 (Albertus)
		assertEquals(GPA(studentRecords.get(7)), 0, 0);
		// Test GPA of Student9 (Timoteus)
		assertEquals(GPA(studentRecords.get(8)), 0, 0);
		// Test GPA of Student10 (Swimmy)
		assertEquals(GPA(studentRecords.get(9)), 0, 0);

		/// Determine each course’s average grade
		double Avg1 = (enrollmentRecords.get(0).getGrade() + enrollmentRecords.get(3).getGrade()
				+ enrollmentRecords.get(6).getGrade() + enrollmentRecords.get(8).getGrade()) / 4;
		double Avg2 = (enrollmentRecords.get(1).getGrade() + enrollmentRecords.get(4).getGrade()
				+ enrollmentRecords.get(7).getGrade()) / 3;
		double Avg3 = (enrollmentRecords.get(2).getGrade() + enrollmentRecords.get(5).getGrade()
				+ enrollmentRecords.get(8).getGrade()) / 3;

		assertEquals(Avg1, 0, 0);
		assertEquals(Avg2, 0, 0);
		assertEquals(Avg3, 0, 0);

		// Change the major of one of the Student records.
		studentRecords.get(1).seteMajor(eMajor.CHEM);
		assertEquals(eMajor.CHEM, studentRecords.get(1).geteMajor());

	}
}
