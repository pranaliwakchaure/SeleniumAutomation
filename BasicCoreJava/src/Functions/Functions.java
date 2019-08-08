package Functions;

public class Functions {

	public static void main(String[] args) 
	{
		//Function calling
		/*
		 * MyFirstFunction(); Sum(10,30); Sum(70,30); 
		 */
		 
		int add=Sum1(12,15);
		System.out.println(add);
	}
	
	//function with no return type and no arguments
	
	public static void MyFirstFunction()
	{
		System.out.println("Testing");
	}
	
	//2.function with no return type and 2 arguments
	public static void Sum(int a, int b)
	{
		
		System.out.println(a+b);
	}
	
	//3.function with integer return type and 2 arguments
	
		public static int Sum1(int a, int b)
		{
			return a+b;
			
		}
	
}
