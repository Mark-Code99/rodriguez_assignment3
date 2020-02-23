public class SavingsAccount {
	
	static private double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double saving) {
		this.savingsBalance = saving;
	}
	
	public double getBalance () {
		return this.savingsBalance;
	}
	
	public void calculateMonthlyInterest() {
		double month;
		month = (double)(this.savingsBalance * annualInterestRate / 12);
	    this.savingsBalance += month;
		
	}
	
	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate;
		
	}
	
	

}
