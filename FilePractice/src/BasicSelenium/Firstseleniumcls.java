package BasicSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Firstseleniumcls 
{
	int rownum=2;
	int colnum=3;
	
    @Test(dataProvider="getData")
	public void login(String username, String password) throws IOException 
	{
		 System.out.println(username+" "+password);  
    	
		 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			//
			 ChromeDriver dr=new ChromeDriver(); //constructor
			
			dr.manage().window().maximize();
			
			dr.get("http://newtours.demoaut.com/");
			
			dr.findElement(By.name("userName")).sendKeys(username);
			dr.findElement(By.name("password")).sendKeys(password);
			dr.findElement(By.name("login")).click();
			dr.close();
			
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
