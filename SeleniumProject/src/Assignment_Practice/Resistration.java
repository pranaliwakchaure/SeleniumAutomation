package Assignment_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Resistration

{
	ChromeDriver dr;
	@Test
	public void registration_new() throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			//
			 dr=new ChromeDriver(); //constructor
			
			dr.manage().window().maximize();
			
			dr.get("http://newtours.demoaut.com/");
			
			dr.findElement(By.linkText("REGISTER")).click();
			Thread.sleep(2000);
			dr.findElement(By.name("firstName")).sendKeys("Pranali");
			Thread.sleep(2000);
			dr.findElement(By.name("lastName")).sendKeys("Wakchaure");
			Thread.sleep(2000);
			dr.findElement(By.name("phone")).sendKeys("8888267589");
			Thread.sleep(2000);
			dr.findElement(By.name("userName")).sendKeys("abc@gmail.com");
			Thread.sleep(2000);
			dr.findElement(By.name("address1")).sendKeys("Dighi");
			Thread.sleep(2000);
			dr.findElement(By.name("city")).sendKeys("Pune");
			Thread.sleep(2000);
			dr.findElement(By.name("state")).sendKeys("Maharastra");
			Thread.sleep(2000);
			dr.findElement(By.name("postalCode")).sendKeys("422601");
			Thread.sleep(2000);
			dr.findElement(By.name("postalCode")).sendKeys("422601");
			Thread.sleep(2000);
			WebElement ele=dr.findElement(By.name("country"));
			
			Select sel=new Select(ele);
			
			sel.selectByIndex(2);
			
			Thread.sleep(2000);
			
			sel.selectByValue("92");
			
			Thread.sleep(2000);
			dr.findElement(By.name("email")).sendKeys("pranali");
			
			Thread.sleep(2000);
			
           dr.findElement(By.name("password")).sendKeys("pranali");
			
			Thread.sleep(2000);
			
           dr.findElement(By.name("confirmPassword")).sendKeys("pranali");
			
			Thread.sleep(2000);
			
			 dr.findElement(By.name("register")).click();
			 
			 dr.findElement(By.linkText("sign-in")).click();
				Thread.sleep(2000);
				
				dr.findElement(By.name("userName")).sendKeys("pranali");
				dr.findElement(By.name("password")).sendKeys("pranali");
				
				//button
				dr.findElement(By.name("login")).click();
			
}
}
