package Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.Config;

public class ApllicationLibrary 
{
	public WebDriver launchBrowser(String browserName)
	
	{
		WebDriver dr=null;
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdiver.chrome.driver", Config.chromedriver);
			dr=new ChromeDriver();
			dr.manage().window().maximize();
			
		}
		
		return dr;
		
	}
	
	public String navigate(WebDriver dr, String url)
	{
		dr.get(url);
		return dr.getTitle();
	}

	//to check the element //>=1 minimun 1 from xpath
	public boolean isElementPresent(WebDriver dr, By element)
	{
		if(dr.findElements(element).size()>=1)
			return true;
		else
			return false;
			
	}
}
