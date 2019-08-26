package BasicAnnotations2;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass3 
{
	@Test
public void test1()
{
	System.out.println("Test 1 Class 3");
}
	@Test
public void test2()
{
	System.out.println("Test 2 Class 3");
}
	@Test
public void test3()
{
	System.out.println("Test 3 Class 3");
}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Class 3");
	}
	
	@AfterMethod
	public void aftereMethod()
	{
		System.out.println("After Method Class 3");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class 3");
	}
	
	@AfterClass
	public void afterclas()
	{
		System.out.println("After Class 3");
	}
}
