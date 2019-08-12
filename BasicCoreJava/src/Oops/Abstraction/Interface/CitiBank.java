package Oops.Abstraction.Interface;

public class CitiBank implements RBI
{

	@Override
	public void SavingAccount() {
		System.out.println("Saving account in citi bank");
		
	}

	@Override
	public void CurrentAccount() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Current account in citi bank");
	}

	@Override
	public void debitcard() {
		// TODO Auto-generated method stub
		System.out.println("Citi bank debit card");
	}

	@Override
	public void creaditcard() {
		// TODO Auto-generated method stub
		
		System.out.println("Citi bank credit Card");
		
	}

}
