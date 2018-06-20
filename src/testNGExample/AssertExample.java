package testNGExample;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {
	
	String companyName1="GlobalLogic";
	String companyName2="GlobalLogic";
	String companyName3="Accenture";
	String location1="Noida sector 144";
	String location2=null;
	
	//assertEquals
	@Test
	public void testcase1()
	{
		Assert.assertEquals(companyName1, companyName2);
	}
	
	//assertNotEquals
	@Test
	public void testcase2()
	{
		Assert.assertNotEquals(companyName1, companyName3);
	}
	
	           //assertTrue
	  	       @Test
		       public void testcase3()
		       {
			        Assert.assertTrue(companyName1.equals(companyName2));
			       
		       }
	
		       //assertFalse
				@Test
				public void testcase4()
				{
					Assert.assertFalse(companyName1.equals(companyName3));
				}
				
				//assertNull
				@Test
				public void testcase5()
				{
					Assert.assertNull(location2);
				}
				
				//assertNotNull
				@Test
				public void testcase6()
				{
					Assert.assertNotNull(location1);
				}
		
			//assertThrows
			//	
				
				

}
