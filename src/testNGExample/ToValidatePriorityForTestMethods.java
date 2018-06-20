package testNGExample;

import org.testng.annotations.Test;

public class ToValidatePriorityForTestMethods {
	
	@Test(priority=0)
	public void testcase0()
	{
		System.out.println("Priority is 0");
	}
	
	@Test(priority=1)
	public void testcase1()
	{
		System.out.println("Priority is 1");
	}
	
	@Test(priority=2)
	public void testcase2()
	{
		System.out.println("Priority is 2");
	}

}
