
public class Account {
	private int balance;

	public Account() {
		this.balance = 0;
	}
	
	public Account(int amount) {
		deposit(amount);
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		if(amount>0) {
			balance=balance+amount;
		}
		else {
			System.out.println("Invalid amount");
		}
	}

	
	
	public void widrow(int wamount) {
		
		if(wamount>0) {
			if(balance>0) {
				if(balance>wamount) {
					balance=balance-wamount;
					System.out.println("widrow success");
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			else {
				System.out.println("balance is zero");
			}
		}
	
		else {
			System.out.println("how it is possible!!!");
		}
}
}
