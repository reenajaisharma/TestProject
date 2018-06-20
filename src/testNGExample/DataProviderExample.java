package testNGExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	//create data-supply method
	@DataProvider(name="Authentication")
	public static Object[][] testData()
	{
		
		return new Object[][]{{"admin1", "admin1"},{"admin2","admin2"}};
	}
	
	
	@Test(dataProvider="Authentication")
	public void testForLogin(String user,String pass)
	{
		System.out.println("user name is :"+ user);
		System.out.println("password is :"+ pass);
	}

}
