//Transactions to Deposit / Withdraw from the account.
public class Transaction {
	static double balance = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAtm t1 = new BankAtm();
		t1.deposit(15000);
		t1.withdraw(1000);
		t1.withdraw(1000);
		t1.withdraw(1000);
		t1.deposit(5000);
		t1.withdraw(8000);
		t1.withdraw(1000);
		t1.deposit(2000);
		t1.withdraw(1000);
		t1.withdraw(21000);
		t1.withdraw(1000);
	}
}
