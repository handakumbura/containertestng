package org.testngrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class TestcaseOne 
{
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("run before each test method.");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("run after each test method.");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("run once before the execution of test class.");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("run once after the execution of test class.");
	}
	
	@Test
	public void testOne() {
		System.out.println("test 1, "+this.getClass());
	}
	
	@Test
	public void testTwo() {
		System.out.println("test 2, "+this.getClass());
	}
	
	@Test
	public void testThree() {
		System.out.println("test 3, "+this.getClass());
	}
	
	
}
