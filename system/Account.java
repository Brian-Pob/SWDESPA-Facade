package system;

public class Account {
	private String name;
	private int pin;
	private int accountNo;
	private int cardNo;
	private double balance;
	
	public Account(String name, int pin, int accountNo, int cardNo, double balance) {
		this.name = name;
		this.pin = pin;
		this.accountNo = accountNo;
		this.cardNo = cardNo;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
