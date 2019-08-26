package BasicAnnotations2;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2 
{
	@Test
public void test1()
{
	System.out.println("Test 1 Class 2");
}
	@Test
public void test2()
{
	System.out.println("Test 2 Class 2");
}
	@Test
public void test3()
{
	System.out.println("Test 3 Class 2");
}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method class 2");
	}
	
	@AfterMethod
	public void aftereMethod()
	{
		System.out.println("After Method class 2");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class 2");
	}
	
	@AfterClass
	public void afterclas()
	{
		System.out.println("After Class 2");
	}
	
	@BeforeTest
	@Parameters({"browser"})
	public void masterSFDC(String browser)
	{
		System.out.println("Before SFDC");
		System.out.println("Browser name:"+browser);
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After SFDC");
	}

	
}
