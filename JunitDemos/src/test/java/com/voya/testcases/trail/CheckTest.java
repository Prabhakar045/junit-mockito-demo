package com.voya.testcases.trail;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.junitdemos.StudentDetails;

import exception.InvalidNumberException;

public class CheckTest {
	

	
	@Tag("first")
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		String username = "Prabhakar";
		System.out.println("called before all the test cases ");
	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all the test cases ");
	}

	@Tag("simple")
	@BeforeEach
	void setUp() throws Exception {
	
		System.out.println("called before each test cases ");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("called after each test cases ");
	}

}
