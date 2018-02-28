//Subsystem
package deposit;
public class DepositSlot{
	private double depAmt;
	
	public void receiveCash(double money){
		this.depAmt = money;
	}

	public void addToBalance(double money){
		money += depAmt;
	}
}
