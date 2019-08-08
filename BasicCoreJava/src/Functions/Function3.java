package Functions;

public class Function3 {

	public static void main(String[] args) 
	{
		boolean a =Eligibility(40);
		
		if(a)
		{
			System.out.println("You are not Eligible");
		}
		else
		{
			System.out.println("You are Eligible");
		}

	}
	public static boolean Eligibility(int age)
	{
		if(age>=18 && age<=30)
		{
			return true;
		}else
		{
			return false;
		}
		
	}

}
