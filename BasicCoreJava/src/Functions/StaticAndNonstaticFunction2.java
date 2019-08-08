package Functions;

public class StaticAndNonstaticFunction2
{


	
	public static void main (String[] args)
	{
		//Static variables and functions calling from second class
		System.out.println(StaticAndNonstaticFunction.name);
		StaticAndNonstaticFunction.fun1();
		
		//Non Static variable and functions calling from second class
		StaticAndNonstaticFunction obj=new StaticAndNonstaticFunction();
		System.out.println(obj.surename);
		obj.fun2();

	}

}
