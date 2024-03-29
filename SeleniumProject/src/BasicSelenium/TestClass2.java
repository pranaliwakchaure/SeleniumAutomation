package BasicSelenium;

import java.util.List;

import org.openqa.selenium.Alert;
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
		
		//dropdown 1
		WebElement ele=dr.findElement(By.name("passCount"));
		
		Select sel=new Select(ele);
		
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		
		sel.selectByValue("2");
		
        Thread.sleep(2000);
		
		sel.selectByVisibleText("4");
		
		//dropdown 2
		WebElement ele2=dr.findElement(By.name("fromPort"));
		
		Select sel2=new Select(ele2);
		
		sel2.selectByValue("Acapulco");;
		
		Thread.sleep(2000);
		
		sel2.selectByValue("Frankfurt");
		
        Thread.sleep(2000);
		
		sel2.selectByVisibleText("Paris");
        Thread.sleep(2000);
		
		sel2.selectByVisibleText("Sydney");
		
		//dropdown 3
		WebElement ele3=dr.findElement(By.name("fromMonth"));
		
		Select sel3=new Select(ele3);
		
		sel3.selectByValue("1");
		
		Thread.sleep(2000);
		
		sel3.selectByValue("2");
		
        Thread.sleep(2000);
		
		sel3.selectByValue("3");
        Thread.sleep(2000);
		
		sel3.selectByValue("4");
Thread.sleep(2000);
		
		sel3.selectByValue("5");
Thread.sleep(2000);
		
		sel3.selectByValue("6");
Thread.sleep(2000);
		
		sel3.selectByValue("7");
Thread.sleep(2000);
		
		sel3.selectByValue("8");
Thread.sleep(2000);
		
		sel3.selectByValue("9");
Thread.sleep(2000);
		
		sel3.selectByValue("10");
Thread.sleep(2000);
		
		sel3.selectByValue("11");
		Thread.sleep(2000);
		//
WebElement ele4=dr.findElement(By.name("fromDay"));
		
		Select sel4=new Select(ele4);
		
		sel4.selectByIndex(12);
		Thread.sleep(2000);
		
		sel4.selectByValue("2");
		Thread.sleep(2000);
		sel4.selectByValue("12");
		Thread.sleep(2000);
		sel4.selectByValue("19");
		Thread.sleep(2000);
		sel4.selectByValue("23");
		Thread.sleep(2000);
		sel4.selectByValue("30");
		Thread.sleep(2000);
		
		
		//button
		dr.findElement(By.name("findFlights")).click();
		
		//webtable 1
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
        
		//webtable 2
				WebElement tbl2=dr.findElement(By.xpath("//table[2][@cellpadding='2'][@cellspacing='1'][1]/tbody"));
				//return list
				List<WebElement> rows1=tbl2.findElements(By.tagName("tr"));
		 
				//enhance for loop to read List element
				for(WebElement r:rows1)
				{
					List<WebElement> cols=r.findElements(By.tagName("td"));
					for(WebElement c:cols)
					{
						System.out.println(c.getText());
					}


}
				dr.findElement(By.name("reserveFlights")).click();
				
				//checkbox
				dr.findElement(By.name("ticketLess")).click();
				System.out.println(dr.findElement(By.name("ticketLess")).isSelected());
				
				
				WebElement country=dr.findElement(By.name("delCountry"));
				
				Select Contsel=new Select(country);
				
				Contsel.selectByIndex(3);
				
				//alert handling
				Alert alt=dr.switchTo().alert();
				
				System.out.println(alt.getText());
				//ok
				//alt.accept();
				
				alt.dismiss();
				

				//button
				dr.findElement(By.name("buyFlights")).click();
				
				//text Area
				
			
				
				System.out.println(dr.findElement(By.xpath("//font[@size='+1']")).getText());
				
				dr.close();
	
}	
}
