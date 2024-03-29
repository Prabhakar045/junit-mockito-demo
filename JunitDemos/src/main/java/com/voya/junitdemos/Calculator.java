package com.voya.junitdemos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {
	public int sum(int x, int y){
		
        return x+y;
        
    }
	
	public int product(int x,int y) {
		return x*y;
	}

	public String greet(String name) {
		return "Welcome...."+name.toUpperCase();
	}
	
	public List<String> showCourses(List<String> course) {
		
		Collections.sort(course);
		return course;
	}
}
