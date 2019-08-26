package BasicAnnotations2;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClass1 

{
    @Test(priority=0,enabled=false)
	public void test1()
	{
		System.out.println("Test case 1");
	}
    @Test(priority=1,dependsOnMethods={"test3"})
	public void test2()
	{
    	System.out.println("Test case 2");
	}
    @Test(priority=2)
	public void test3()
	{
    	System.out.println("Test case 3");
    	throw new SkipException("Skip this test");
	}
	
}
