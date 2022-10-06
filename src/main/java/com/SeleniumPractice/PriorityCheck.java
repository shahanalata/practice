package com.SeleniumPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityCheck{

	@Test  (priority=2) 
	public void One() {
		System.out.println("1");
	}
	@Test   (priority=-1) 
	public void Two() {
		System.out.println("2");
	}	
	@Test  (priority=0) 
	public void o_Three() {
		System.out.println("3");
	}	
	@Test  (priority=1) 
	public void Four() {
		System.out.println("0");
	}
	@Test (priority=-2) 
	public void b_Five() {
		System.out.println("-1");
	}	                           //priority print from -2,-1. 0. 1. 2. 3
	@Test   (priority=3) 
	public void Six() {
		System.out.println("-2");
	}			
	
}
