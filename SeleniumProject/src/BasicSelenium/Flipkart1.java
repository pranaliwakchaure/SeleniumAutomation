package BasicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flipkart1
{
    @Test
	public void test1()
	{
    	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			
			 ChromeDriver dr=new ChromeDriver(); //constructor
			
			dr.manage().window().maximize();
			//Implicit wait
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			dr.get("https://www.flipkart.com/");
			
			dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			
			//Mouse over action
			
			Actions act=new Actions(dr);
			
			act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
	
			//Explicit wait
			WebDriverWait wait= new WebDriverWait(dr, 20);
			wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']"))));
			
			dr.findElement(By.xpath("//a[text()='Shirts']")).click();
			
			//next window
			String parent=dr.getWindowHandle();
			
			wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//img[@class='_3togXc']")))).click();;
			
			//returns
			Set<String> wins=dr.getWindowHandles();
			
			for(String w:wins)
			{
				if(!w.equals(parent))
				dr.switchTo().window(w);
			}
			
			dr.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("422015");
			
	        //dr.close();
	}
    
	
}
