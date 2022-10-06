package com.SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeSuite	
	public void setUpBefore_Suite() {
		System.out.println("inside before suite");
	}
	@BeforeTest	
	public void setUpBefore_Test() {
		System.out.println("inside before test");
	}
	
	@BeforeClass	
	public void setUpBefore_Class() {
		System.out.println("inside before class");
	}

@BeforeMethod	                   //window
public void setUp() {
	System.out.println("inside before method");
}
	
		@Test          //TestNG starts from test case
		public void dropDawntest(){
			System.out.println("inside test method   1");
			//Assert.assertTrue(false);//not run
		}
		@Test  (groups="smoke",dependsOnMethods="dropDawntest")       //if we select some test for run,we can make groups
		public void dropDawntestTwo(){
			System.out.println("inside 2nd test method");
		}
		@Test    (priority=2)     
		public void dropDawntestThree(){
			System.out.println("inside 3rd test method@@@@@@");
		}
		@Test    (priority=1)      
		public void dropDawntestFour(){
			System.out.println("inside 4th test method#####");
		}
		
		
		
		/*@BeforeMethod	
public void setUp() {   //any where we write, beforemethod is working before
	System.out.println("inside before method");
}*/
/*@Test
		public void dropDawntest2(){
			System.out.println("inside 2 test method");
			Assert.assertTrue(false);
		}*/
		@AfterMethod	//quit
		public void setUp_After() {
			System.out.println("inside after method");
		}
		@AfterClass	
		public void setUpAfter_Class() {
			System.out.println("inside after class");
		}	
		@BeforeTest	
		public void setUpAfter_Test() {
			System.out.println("inside After test");
		}
		//@AfterSuite	
		//public void setUpAfter_Suite() {
		//	System.out.println("inside before suite");
		//}
		
		
		
	}


