package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleiFrame 
{
public static void main(String[] args) throws InterruptedException
{
	

	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
	 ChromeDriver dr=new ChromeDriver(); //constructor
	
	dr.manage().window().maximize();
	//Implicit wait
	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	dr.get("https://paytm.com/");
	
	Thread.sleep(2000);
	
	dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
	
	Thread.sleep(2000);
	dr.switchTo().frame(0);
	
	
	dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
	
		/*
		 * WebDriverWait wait= new WebDriverWait(dr, 20);
		 * wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath(
		 * "//a[text()='X']"))));
		 * 
		 * 
		 * dr.findElement(By.xpath("//a[text()='X']")).click();
		 */
}
}
