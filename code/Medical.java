public class Medical {

	private int balance;

	public Medical() {
		balance = 0;
	}

	public Medical(int b) {
		balance = b;
	}

	public void add(int amount) {
		balance += amount;
		System.out.println(this.toString());
	}

	public void use(int amount) {
		if(balance > amount)
			balance -= amount;
		else
			System.out.println("Not enough balance!!");
		System.out.println(this.toString());
	}

	public int getbalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Medical balance is $" + balance;

	}

}