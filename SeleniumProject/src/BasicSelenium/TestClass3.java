package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass3 
{
	ChromeDriver dr;
	@Test
	
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		 dr=new ChromeDriver(); //constructor
		
		dr.get("http://newtours.demoaut.com/");
		//image
		System.out.println(dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("height"));
		System.out.println(dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("width"));
	
	}
}
