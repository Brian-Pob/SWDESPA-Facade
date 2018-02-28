//Subsystem
package Deposit_ATM;

import System.Account;

public class Deposit{
	private double depAmt;
	
	public void receiveCash(double money){
		this.depAmt = money;
	}

	public void addToBalance(Account acc){
		acc.setBalance(acc.getBalance()+ this.depAmt);;
	}
}
