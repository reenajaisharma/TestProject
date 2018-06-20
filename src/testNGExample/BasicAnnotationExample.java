package testNGExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotationExample {
	
	@BeforeSuite
	public void befSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void befTest()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void befClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void befMet()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("Test case 1");
	}
	
	
	
	@Test
	public void testcase2()
	{
		System.out.println("Test Case 2");
	}
	
	@AfterMethod
	public void aftMet()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void aftClass()
	{
		System.out.println("After Class");
	}

	@AfterTest
	public void aftTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void aftSuite()
	{
		System.out.println("After Suite");
	}
}
