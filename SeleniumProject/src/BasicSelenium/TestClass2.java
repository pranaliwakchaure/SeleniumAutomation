package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestClass2
{
	ChromeDriver dr;
	@Test
public void bookAflight() throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		//
		 dr=new ChromeDriver(); //constructor
		
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/");
		
		//textBox
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		
		//button
		dr.findElement(By.name("login")).click();
		
		//Radio Button
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		//dropdown
		WebElement ele=dr.findElement(By.name("passCount"));
		
		Select sel=new Select(ele);
		
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		
		sel.selectByValue("2");
		
        Thread.sleep(2000);
		
		sel.selectByVisibleText("4");
		
		//button
		dr.findElement(By.name("findFlights")).click();
		
		//webtable
		WebElement tbl=dr.findElement(By.xpath("//table[1][@cellpadding='2'][@cellspacing='1'][1]/tbody"));
		//return list
		List<WebElement> rows=tbl.findElements(By.tagName("tr"));
 
		//enhance for loop to read List element
		for(WebElement r:rows)
		{
			List<WebElement> cols=r.findElements(By.tagName("td"));
			for(WebElement c:cols)
			{
				System.out.println(c.getText());
			}
		}
}
	
}
