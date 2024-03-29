package com.voya.testcases;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.voya.junitdemos.Calculator;



//@RunWith(suite.class)
@SelectPackages({ "com.voya.testcases"})
//@RunWith(JUnitPlatform.class)
@IncludePackages({ "com.voya.testcases.trail","com.stud.testcases" })
//@ExcludePackages({"com.voya.testcases.greet"})
//@SelectClasses({CalculatorTest.class})
//@IncludeTags({"first","simple","neg"})
@ExcludeTags({"first"})
public class AllTests {

}
