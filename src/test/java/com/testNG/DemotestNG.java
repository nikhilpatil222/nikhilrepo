package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemotestNG {
	
	
	@BeforeSuite
	public void Beforesuite()
	{
		
		System.out.println("Beforesuite");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void AfterClass()
	{
		
		System.out.println("AfterClass");
	}
	
	
	public void test()
	{
		System.out.println("test1");
		
	}
	
	public void test2()
	{
		System.out.println("test2");
		
	}
	
	
	
	public void test3()
	{
		System.out.println("test3");
		
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
		
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("Aftermethod");
		
	}
	
	
	
	@AfterSuite
	public void Aftersuite()
	{
		
		System.out.println("Aftersuite");
	}
	
	


}
