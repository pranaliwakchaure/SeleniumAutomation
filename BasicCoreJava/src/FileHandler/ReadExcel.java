package FileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException
	{
		String filepath="E:\\SeleniumAutomation\\BasicCoreJava\\src\\FileHandler\\PranaliTestData.xls";
        FileInputStream file = new FileInputStream(filepath);
        
        //workbook
        HSSFWorkbook wb=new HSSFWorkbook(file);
        
        //worksheet
        HSSFSheet Sheet=wb.getSheet("Sheet1");
        
        //Row
        
        HSSFRow row=Sheet.getRow(0);
        
        //Cell
        HSSFCell cell=row.getCell(0);
        
       String value= cell.getStringCellValue();
       
       System.out.println(value);
        
	}

}
