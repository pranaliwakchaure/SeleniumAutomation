package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args)
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
		//drag and drop cordinates
		act.dragAndDropBy(dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']")), 50, 0).build().perform();

	}

}
