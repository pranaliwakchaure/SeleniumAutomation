package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClass 

{
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		//
		ChromeDriver dr=new ChromeDriver(); //constructor
		
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		dr.findElement(By.linkText("SIGN-OFF")).click();
		
	}

}
