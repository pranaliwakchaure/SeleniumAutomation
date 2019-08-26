package BasicAnnotations2;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass5 
{
	@Test
public void test1()
{
	System.out.println("Test 1 Class 5");
}
	@Test
public void test2()
{
	System.out.println("Test 2 Class 5");
}
	@Test
public void test3()
{
	System.out.println("Test 3 Class 5");
}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Class 5");
	}
	
	@AfterMethod
	public void aftereMethod()
	{
		System.out.println("After Method Class 5");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class 5");
	}
	
	@AfterClass
	public void afterclas()
	{
		System.out.println("After Class 5");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	
}
