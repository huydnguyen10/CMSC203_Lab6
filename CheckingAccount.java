
public class CheckingAccount extends BankAccount{
	private static final double FEE = 0.15;
	
	public CheckingAccount (String name, double amount) {
		super(name, amount);
		this.setAccountNumber(this.getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		boolean completed = true;
		if (amount <= this.getBalance() )
		{
			this.setBalance(this.getBalance() - amount - FEE);
		}
		else
		{
			completed = false;
		}
		return completed;
	}
}
