package BasicSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.Xls_Reader;

public class Firstseleniumcls 
{
	int rownum=2;
	int colnum=3;
	
    @Test(dataProvider="getData")
	public void login(String userName, String password) throws IOException, InterruptedException 
	{
		 System.out.println(userName+" "+password);  
    	
		 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			//
			 ChromeDriver dr=new ChromeDriver(); //constructor
			
			dr.manage().window().maximize();
			
			dr.get("http://newtours.demoaut.com/");
			
		/*
		 * dr.findElement(By.name("userName")).sendKeys(userName);
		 * dr.findElement(By.name("password")).sendKeys(password);
		 * dr.findElement(By.name("login")).click(); dr.close();
		 */
			
			
			
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
		
			WebElement ele=dr.findElement(By.name("country"));
			
			Select sel=new Select(ele);
			
			sel.selectByIndex(2);
			
			Thread.sleep(2000);
			
			sel.selectByValue("92");
			
			Thread.sleep(2000);
			dr.findElement(By.name("email")).sendKeys(userName);
			
			Thread.sleep(2000);
			
           dr.findElement(By.name("password")).sendKeys(password);
			
			Thread.sleep(2000);
			
           dr.findElement(By.name("confirmPassword")).sendKeys(password);
			
			Thread.sleep(2000);
			
			 dr.findElement(By.name("register")).click();
			 
			 dr.findElement(By.linkText("sign-in")).click();
				Thread.sleep(2000);
				
				dr.findElement(By.name("userName")).sendKeys(userName);
				dr.findElement(By.name("password")).sendKeys(password);
				
				//button
				dr.findElement(By.name("login")).click();
			

			
			
			
			String filepath="E:\\SeleniumAutomation\\FilePractice\\src\\BasicSelenium\\TestData.xls";
			
			Xls_Reader xl= new Xls_Reader(filepath);
			
			xl.setCellData("Sheet1", rownum, colnum, "PASS");
			rownum++; //write excel
	}
	
	@DataProvider   //return 2d array
	public String[][] getData() throws IOException
	{
		
		String filepath="E:\\SeleniumAutomation\\FilePractice\\src\\BasicSelenium\\TestData.xls";
		
		Xls_Reader xl= new Xls_Reader(filepath);
		
		int rows=xl.getRowCount("Sheet1");
		int cols=xl.getColumnCount("Sheet1");
		
		String[][] data= new String[rows-1][cols-1];//-1 due to header
		
		System.out.println(rows);
		System.out.println(cols);
		
		
		for(int r=2; r<=rows; r++) //+1 due to header
		{	
			for(int c=1; c<cols; c++)
			{	
			
		System.out.println(xl.getCellData("Sheet1", r, c));
		
		data[r-2][c-1]=xl.getCellData("Sheet1", r, c);
		//index started from zero but data r and c get 2 and 1 values
			}
		}
		
		return data;
	}
	
}
