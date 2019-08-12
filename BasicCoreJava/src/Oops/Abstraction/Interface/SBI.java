package Oops.Abstraction.Interface;

public class SBI implements RBI

{

	
	@Override
	public void SavingAccount() {
		System.out.println("Saving account in SBI bank");
		
	}

	@Override
	public void CurrentAccount() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Current account in SBI bank");
	}

	@Override
	public void debitcard() {
		// TODO Auto-generated method stub
		System.out.println("SBI bank debit card");
	}

	@Override
	public void creaditcard() {
		// TODO Auto-generated method stub
		
		System.out.println("SBI bank credit Card");
		
	}
}
