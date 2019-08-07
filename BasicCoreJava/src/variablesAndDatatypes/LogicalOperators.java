package variablesAndDatatypes;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=30;
		//logical and(&&)
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}else if(b>a && b>c)
		{
			System.out.println("b is greatest");
		}else
		{
			System.out.println("c is greatest");
		}

	}

}
