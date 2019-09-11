package testScripts;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Configuration.Config;
import Library.ApllicationLibrary;
import Pages.Fligthfinder;
import Pages.Homepage;

public class TC_BookFlight_OnewayPassenger 
{
	
	WebDriver dr=null;
	@Test
	
	public void login()
	{
		
		ApllicationLibrary lib= new ApllicationLibrary();
		
		
		SoftAssert as= new SoftAssert();// For validations we used
		
		
			//launch browser
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
		
		as.assertAll();		

	}
	
	@Test(dependsOnMethods= {"login"})
	public void bookAflight()
	{
		
		Fligthfinder page2= new Fligthfinder(dr);

		
		page2.clickOneWay();
		page2.selectPassangers("2");
		page2.clickOnContinu();
	}
	
}
