public class CheckMinBalance {
	// Check if the balance is always more than the minimum balance of 10000
	public void setMinBalance(double balance) throws BankATMException {
		// TODO Auto-generated method stub
		if (balance < 10000)
			throw new BankATMException(); // Throw exception if balance is not
											// maintained
	}
}
