package Anotation123;

import java.io.IOException;

public class TestXls_Reader 
{

	public static void main(String[] args) throws IOException
	
	{
		
		
		Xls_Reader xl=new Xls_Reader("E:\\SeleniumAutomation\\TestNGpractice\\src\\Anotation123\\TEST.xls");
        int rows=xl.getRowCount("Sheet1");
        int cols=xl.getColumnCount("Sheet1");
        
       
        for(int r=1; r<=rows; r++)
        {
        	for(int c=1; c<=cols; c++)
        	{
        		System.out.println(xl.getCellData("Sheet1",  r  , c ));
        	}
        	
        }
	}

}
