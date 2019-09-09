package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//constructor
public class Xls_Reader 
{
String filepath =null;

public Xls_Reader (String filepath)
{
	this.filepath=filepath;
}

public String getCellData(String sheetName,int rowNum, int colNum) throws IOException
{
	 FileInputStream file = new FileInputStream(filepath);
     
     //workbook .xls format
     HSSFWorkbook wb=new HSSFWorkbook(file);
     
     //worksheet
     HSSFSheet Sheet=wb.getSheet(sheetName);
     
     //Row
     
     HSSFRow row=Sheet.getRow(rowNum-1);
     
     //Cell
     HSSFCell cell=row.getCell(colNum-1);
     
     
    String value= cell.getStringCellValue();
    
    
    return value;
}

public  void setCellData(String sheetName,int rowNum, int colNum,String value) throws IOException
{
	FileInputStream file = new FileInputStream(filepath);
    
    //workbook .xls format
    HSSFWorkbook wb=new HSSFWorkbook(file);
    
    //worksheet
    HSSFSheet Sheet=wb.getSheet(sheetName);
    
    //Row
    
    HSSFRow row=Sheet.getRow(rowNum-1);
    
    if(row==null)
    	row=Sheet.createRow(rowNum-1);
    
    //Cell
    HSSFCell cell=row.getCell(colNum-1);
    
    if(cell==null)
    	cell=row.createCell(colNum-1);
    
    
    cell.setCellValue(value);
    
    
    FileOutputStream fileout= new FileOutputStream(filepath);
    
    wb.write(fileout);
    
}

public int getRowCount(String sheetName) throws IOException
{
	FileInputStream file = new FileInputStream(filepath);
    
    //workbook .xls format
    HSSFWorkbook wb=new HSSFWorkbook(file);
    
    //worksheet
    HSSFSheet Sheet=wb.getSheet(sheetName);
    
    return Sheet.getLastRowNum()+1;
}

public int getColumnCount(String sheetName) throws IOException
{
	
	
FileInputStream file = new FileInputStream(filepath);
    
    //workbook .xls format
    HSSFWorkbook wb=new HSSFWorkbook(file);
    
    //worksheet
    HSSFSheet Sheet=wb.getSheet(sheetName);
    
    return Sheet.getRow(0).getLastCellNum();
}


}


