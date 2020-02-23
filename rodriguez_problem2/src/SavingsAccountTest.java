public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1, saver2;
		saver1 = new SavingsAccount(2000.00);
		saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(0.04);
		
		System.out.printf("\t\t\tCurrent Balance are:\n");
		System.out.printf("Month\t\t Saver1\t\t\t Saver2\n");
		for (int i=1;i<=13;i++) {
			if (i!=13) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.printf("%d  \t\t %.2f\t\t %.2f \n",i,saver1.getBalance(), saver2.getBalance());
			}else {
				SavingsAccount.modifyInterestRate(0.05);
				saver1.calculateMonthlyInterest();
				saver2.calculateMonthlyInterest();
				System.out.printf("%d  \t\t %.2f\t\t %.2f \n",i,saver1.getBalance(), saver2.getBalance());
			}
		}

	}

}
