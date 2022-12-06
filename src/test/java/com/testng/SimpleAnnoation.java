package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnoation {

	@BeforeSuite
	private void subMethod() {

		System.out.println("Before Suite");

	}
	@BeforeTest
	private void subMethod1() {
		System.out.println("Before Test");
	}

	@BeforeClass
	private void subMethod2() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	private void subMethod3() {
		System.out.println("Before Method");
	}

	@Test
	private void subMethod4() {
		System.out.println("Test 1");

	}

	@AfterMethod
	private void subMethod5() {
		System.out.println("After Method");
	}

	@Test
	private void subMethod6() {
		System.out.println("Test 2");

	}
	
	@AfterClass
	private void subMethod7() {
		System.out.println("After Class");
	}
	
	@AfterTest
	private void subMethod8() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	private void subMethod9() {
		System.out.println("After Suite");
	}
	
}
