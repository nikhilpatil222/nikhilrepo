package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demotestng2 {

	@BeforeClass
	public void BeforeClass()
	{
		
		System.out.println("BeforeClass1");
	}
	
	@Test(priority=1,groups="A")
	public void test5()
	{
		System.out.println("test5");
		
	}
	
	@AfterClass
	public void AfterClass()
	{
		
		System.out.println("AfterClass1");
	}

}
