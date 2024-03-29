package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.junitdemos.Calculator;

public class CalculatorTest {
	
	Calculator calculator = null;
	

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
		calculator  = new Calculator();
		System.out.println("called before each test cases ");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("called after each test cases ");
	}

	@Test
	void testSum() {
		int actual = calculator.sum(12,20);
		assertEquals(30,actual,"output should be 30");
	}
	
	@Test
	void testProduct() {
		int actual = calculator.sum(12,20);
		assertEquals(30,actual,"output should be 30");
	}
	
	@Test
	@DisplayName("Test greet method")
	void testGreet() {
		String userName = "Prabhakar";
		String actual = calculator.greet(userName);
		assertEquals("Welcome prabhakar",actual,"not matched ");
	}
	
	@Tag("first")
	@Test
	@DisplayName("Test showCourses method")
	void testShowCourses() {
		List<String> courseInput = Arrays.asList("css","Angular","Java","Spring");
		List<String> expected = Arrays.asList("Angular","css","Java","Spring");
		List<String> actual = calculator.showCourses(courseInput);

		assertEquals(expected,actual);
	}

	
}
