
public class BankAtm {
	int atmId;
	String bankName;
	String location;
	double balance;

	// Withdraw method to deduct the balance
	public void withdraw(double amt) {
		CheckMinBalance p = new CheckMinBalance();
		if (amt <= balance) {// Withdraw will allow only if the balance is
								// greater or equal to the withdrawal amount.
			// Exception block to check the minimum balance is maintained.
			try {
				p.setMinBalance(balance - amt);
				balance -= amt;
				System.out.println("DEBIT: " + amt + " Balance: " + balance);
			} catch (BankATMException e) {
				System.out.println("Withdraw of " + amt + " Failed :: Exception- " + e.getMessage());
			}
		} else
			System.out.println("Withdraw of " + amt + " Failed :: Message- Insufficient Funds");

	}

	// Deposit method to add the balance
	public void deposit(double amt) {
		balance += amt;
		System.out.println("CREDIT: " + amt + " Balance: " + balance);
	}
}
