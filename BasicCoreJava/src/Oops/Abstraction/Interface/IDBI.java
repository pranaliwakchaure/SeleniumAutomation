package Oops.Abstraction.Interface;

public class IDBI implements RBI

{

	@Override
	public void SavingAccount() {
		System.out.println("Saving account in IDBI bank");
		
	}

	@Override
	public void CurrentAccount() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Current account in IDBI bank");
	}

	@Override
	public void debitcard() {
		// TODO Auto-generated method stub
		System.out.println("IDBI bank debit card");
	}

	@Override
	public void creaditcard() {
		// TODO Auto-generated method stub
		
		System.out.println("IDBI bank credit Card");
		
	}
	
}
