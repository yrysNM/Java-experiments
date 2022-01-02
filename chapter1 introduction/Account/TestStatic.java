class Account {
	static double interestRate = 0.01;
	double balance;

	Account(double balance) {
		this.balance = balance;
	}

	static double getRate() {
		return interestRate;
	}

	static void setRate(double newRate) {
		if(interestRate > 0)
			interestRate = newRate;
	}

	double getbalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}
}

public class TestStatic {
	public static void main(String[] args){
		Account motherAccount = new Account(100000);
		Account fatherAccount = new Account(300000);
		Account.setRate(0.1);

		System.out.println("Mother's intrest rate " + motherAccount.getRate());
		System.out.println("father's interest rate " + fatherAccount.getRate());
		Account.interestRate = 0.12;

		System.out.println("Mother's interest rate " + motherAccount.getRate());
		System.out.println("Father's interest rate " + fatherAccount.getRate());

	}
}