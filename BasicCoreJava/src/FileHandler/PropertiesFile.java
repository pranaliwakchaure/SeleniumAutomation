package FileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class PropertiesFile
{

	public static void main(String[] args) throws IOException 
	{

		Properties Pranali=new Properties();
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\FileHandler\\Pranali.properties");
		
		Pranali.load(file);
		
		
		System.out.println(Pranali.get("name"));
		System.out.println(Pranali.get("surname"));
		//System.out.println(System.getProperty("user.dir"));//work location patch
	}

}
