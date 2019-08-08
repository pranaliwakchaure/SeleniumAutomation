package Functions;

public class StaticAndNonstaticFunction {

	
		public static String name="Pranali";
		public String surename="Wakchaure";

	
	public static void fun1()
	{
		
	}
	public void fun2()
	{
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(name);
		
		fun1();
		
		StaticAndNonstaticFunction obj=new StaticAndNonstaticFunction();
		
		System.out.println(obj.surename);
		obj.fun2();
	}

}
