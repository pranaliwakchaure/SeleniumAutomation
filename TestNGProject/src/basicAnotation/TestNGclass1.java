package basicAnotation;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGclass1
{
	@Test(dataProvider="getdata2")
public void loginTestCase(String username, String password)
{
		
		System.out.println(username);	
	System.out.println(password);
}
	
	@DataProvider
	public String[][] getdata()
	{
		String[][] data = new String[3][2];
		
		//Row 1
		data[0][0]="User1";
		data[0][1]="Password1";
		
		//Row 2
				data[1][0]="User2";
				data[1][1]="Password2";
				
				//Row 3
				data[2][0]="User3";
				data[2][1]="Password3";
		
		return data;
	}
	
	
	@DataProvider
	public String[][] getdata2() throws IOException
	{

		Xls_Reader xl=new Xls_Reader("E:\\SeleniumAutomation\\TestNGProject\\src\\basicAnotation\\PranaliTestData.xls");
        int rows=xl.getRowCount("Sheet1");
        int cols=xl.getColumnCount("Sheet1");
        
        String[][] data = new String[rows][cols];
        
        for(int r=1; r<=rows; r++)
        {
        	for(int c=1; c<=cols; c++)
        	{
        		//System.out.println(xl.getCellData("Sheet1",  r  , c ));
        		
        		data[r-1][c-1]=xl.getCellData("Sheet1",  r  , c );
        	}
        }
		
		
		/*
		 * //Row 1 data[0][0]="User1"; data[0][1]="Password1";
		 * 
		 * //Row 2 data[1][0]="User2"; data[1][1]="Password2";
		 * 
		 * //Row 3 data[2][0]="User3"; data[2][1]="Password3";
		 */
		
		return data;
	
}
}