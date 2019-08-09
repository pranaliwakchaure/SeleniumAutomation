package Oops.Polymerphizem;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.sum(60,20);
		obj.sum(40,30,20);

	}

	
	public int sum(int a,int b)
	{
		return a+b;
	
	}
	
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	
	}
}
