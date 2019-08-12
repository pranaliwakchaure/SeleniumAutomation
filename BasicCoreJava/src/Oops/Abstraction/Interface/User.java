package Oops.Abstraction.Interface;

public class User {

	public static void main(String[] args) 
	{
	
		RBI obj=new SBI();
		obj.CurrentAccount();
		obj.SavingAccount();
		obj.debitcard();
		obj.creaditcard();
		
		
		RBI obj1=new IDBI();
		obj1.CurrentAccount();
		obj1.SavingAccount();
		obj1.debitcard();
		obj1.creaditcard();
		
		RBI obj2=new CitiBank();
		obj2.CurrentAccount();
		obj2.SavingAccount();
		obj2.debitcard();
		obj2.creaditcard();
		

	}

}
