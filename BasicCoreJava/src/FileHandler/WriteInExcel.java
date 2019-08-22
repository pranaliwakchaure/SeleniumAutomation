package FileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException
	
	{
		String filepath="E:\\SeleniumAutomation\\BasicCoreJava\\src\\FileHandler\\PranaliTestData.xls";
        FileInputStream file = new FileInputStream(filepath);
        
        //workbook .xls format
        HSSFWorkbook wb=new HSSFWorkbook(file);
        
        //worksheet
        HSSFSheet Sheet=wb.getSheet("Sheet1");
        
        //Row
        
        HSSFRow row=Sheet.getRow(11);
        
        if(row==null)
        	row=Sheet.createRow(11);
        
        //Cell
        HSSFCell cell=row.getCell(2);
        
        if(cell==null)
        	cell=row.createCell(2);
        
        
        cell.setCellValue("Pranali");
        
        
        FileOutputStream fileout= new FileOutputStream(filepath);
        
        wb.write(fileout);

	}

}
