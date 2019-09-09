package testScripts;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Configuration.Config;
import Library.ApllicationLibrary;
import Pages.Homepage;

public class TC_BookFlight_OnewayPassenger 
{
	@Test
	public void script()
	{
		
		ApllicationLibrary lib= new ApllicationLibrary();
		WebDriver dr=null;
		
		SoftAssert as= new SoftAssert();// For validations we used
		
		try {
			//lauch browser
		dr=lib.launchBrowser("Chrome");
		Assert.assertTrue(dr!=null);
		
		//navigate to the application
		
		lib.navigate(dr,Config.url);
		
		String title=dr.getTitle();
		
		//login
		Homepage page1= new Homepage(dr);
		page1.login(Config.globlUsers, Config.globlPassword);
		
		//validation -for no same title
		
		as.assertTrue(!dr.getTitle().equals(title));
			
		}catch(Exception e)
		{
			//Call recovery scenario
			e.printStackTrace();
			
			
		}finally {
			
			if(dr!=null)
				dr.close();
			as.assertAll();
			
		}
	}
	
}
