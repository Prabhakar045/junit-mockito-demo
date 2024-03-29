package com.stud.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.junitdemos.StudentDetails;

import exception.InvalidNumberException;

class StudentTest {
	StudentDetails studentDetails = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all the test cases ");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all the test cases ");
	}

	@BeforeEach
	void setUp() throws Exception {
		studentDetails = new StudentDetails();
		System.out.println("called before each test cases ");
	}

	@AfterEach
	void tearDown() throws Exception {
		studentDetails = null;
		System.out.println("called after each test cases ");
	}

//	@Tag("neg")
//	@Test
//	@DisplayName("Test sum method")
//	void testTotalMarks() {
//		assertEquals(250, studentDetails.totalMarks(90, 80, 70),"not correct");
//	}
//	
//	
//	
//	@Test
//	@DisplayName("Test positive marks")
//	void testPositiveMarks() {
//		assertThrows(InvalidNumberException.class, () -> studentDetails.totalMarks(90,80,70));
//	}
	
	@Test
	@DisplayName("Test for greater than 100")
	void testGreaterMarks() throws InvalidNumberException{
		assertThrows(InvalidNumberException.class, () -> studentDetails.totalMarks(190,80,170));
	}
	

}
