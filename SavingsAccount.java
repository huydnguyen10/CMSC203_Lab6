import javax.swing.text.StyledEditorKit.BoldAction;

public class SavingsAccount extends BankAccount {
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
		this.savingsNumber++;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		this.savingsNumber = oldAccount.getSavingsNumber();
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
		this.savingsNumber++;
	}
	
	public void postInterest() {
		double tpamount = this.getBalance() * (2.5 / 12 / 100);
		this.deposit(tpamount);
	}
	
	@Override
	public String getAccountNumber()
	{
		return this.accountNumber;
	}

	public int getSavingsNumber() {
		return this.savingsNumber;
	}

	public void setSavingsNumber(int savingsNumber) {
		this.savingsNumber = savingsNumber;
	} 
}
