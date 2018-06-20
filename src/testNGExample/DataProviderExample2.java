package testNGExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample2 {
	
	//create data-supply method
	@DataProvider(name="Authentication")
	public static Object[][] testData()
	{
		Object[][] arr={ {"user1","pass1"} , {"user2","pass2"}      };
		//return new Object[][]{{"admin1", "admin1"},{"admin2","admin2"}};
		
		return arr;
	}
	
	
	@Test(dataProvider="Authentication")
	public void testForLogin(String user,String pass)
	{
		System.out.println("user name is :"+ user);
		System.out.println("password is :"+ pass);
	}

}
