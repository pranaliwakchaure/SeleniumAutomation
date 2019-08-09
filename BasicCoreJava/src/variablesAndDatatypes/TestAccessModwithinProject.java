package variablesAndDatatypes;

import Functions.AcessModifier;

public class TestAccessModwithinProject extends AcessModifier

{
	public static void main(String[] args)
	{
		
	AcessModifier obj=new AcessModifier();
	 obj.publicFunction();
	 
	 TestAccessModwithinProject obj2=new TestAccessModwithinProject();
	 obj2.protectedFunction();
	
	 
	}
}

