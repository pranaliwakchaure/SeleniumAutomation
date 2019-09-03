package Assignment_Practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Psngr1_oneway 
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
		
		sel.selectByValue("1");
		
       
		
		//dropdown 2
		WebElement ele2=dr.findElement(By.name("fromPort"));
		
		Select sel2=new Select(ele2);
		
		sel2.selectByValue("Acapulco");;
		
		Thread.sleep(2000);
		
		sel2.selectByValue("Frankfurt");
		
        Thread.sleep(2000);
		
		
		
		//dropdown 3
		WebElement ele3=dr.findElement(By.name("fromMonth"));
		
		Select sel3=new Select(ele3);
		
		sel3.selectByValue("1");
		
		Thread.sleep(2000);
		
		sel3.selectByValue("2");
		
        Thread.sleep(2000);
		
		
WebElement ele4=dr.findElement(By.name("fromDay"));
		
		Select sel4=new Select(ele4);
		
		sel4.selectByIndex(1);
		Thread.sleep(2000);
		
		sel4.selectByValue("2");
		Thread.sleep(2000);
	
		
WebElement ele5=dr.findElement(By.name("toPort"));
		
		Select sel5=new Select(ele5);
		
		sel5.selectByValue("Frankfurt");
		
		Thread.sleep(2000);
		
		
		
		//button
		dr.findElement(By.name("findFlights")).click();
		
		//webtable 1
		WebElement tbl=dr.findElement(By.xpath("//table[1][@cellpadding='2'][@cellspacing='1'][1]/tbody"));
		//return list
		
		//Radio Button
				dr.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
	
				dr.findElement(By.name("reserveFlights")).click();
				
				//checkbox
				
				dr.findElement(By.name("passFirst0")).sendKeys("Pranali");
				
				dr.findElement(By.name("passLast0")).sendKeys("Wakchaure");
				Thread.sleep(2000);
				
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
				
			
				
				//System.out.println(dr.findElement(By.xpath("//font[@size='+1']")).getText());
				
				dr.close();
	
}	
}

	

