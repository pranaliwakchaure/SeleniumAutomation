package BasicAnnotations2;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass4 
{
	@Test
public void test1()
{
	System.out.println("Test 1 Class 4");
}
	@Test
public void test2()
{
	System.out.println("Test 2 Class 4");
}
	@Test
public void test3()
{
	System.out.println("Test 3 Class 4");
}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Class 4");
	}
	
	@AfterMethod
	public void aftereMethod()
	{
		System.out.println("After Method Class 4");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class 4");
	}
	
	@AfterClass
	public void afterclas()
	{
		System.out.println("After Class 4");
	}
	
	@BeforeTest
	@Parameters({"browser"})
	public void masterMaintainance(String browser)
	{
		System.out.println("Before CAS");
		System.out.println("Browser name:"+browser);
	}
	
	
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After CAS");
	}

}
