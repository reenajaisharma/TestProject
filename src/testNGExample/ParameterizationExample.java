package testNGExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	@Parameters({"browser"})
	@Test
	public void toDisplayTheBrowserName(String browser)
	{
		System.out.println("the browser name is : "+ browser);
	}
	
	@Parameters({"username","password"})
	@Test
	public void toDisplayUserPass(String username,String password)
	{
		System.out.println("the user name is :" + username);
		System.out.println("the password is :" + password);
	}
	

}
