package Oops.Inheritance;

public class PranaliUsers {

	public static void main(String[] args) 
	{
		Telephone phone=new Telephone();
		phone.calling();
		
		Mobile mob=new Mobile();
		mob.texting();
		mob.calling();
		
		
		SmartPhone sp=new SmartPhone();
		sp.internet();
		sp.texting();
		sp.calling();
		

	}

}
