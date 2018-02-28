import java.util.Scanner;

//import Withdrawal.*;
//import Deposit.*;
import shared.*;


public class ATM{
	
	public void useATM() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("ATM START");
		System.out.println("Withdraw 	[1]"
						 + "Deposit  	[2]"
						 + "Inquire Bal [3]");
		
		try {
			choice = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(choice == 1) {
			withdraw();
		}else if (choice == 2) {
			deposit();
		}else if (choice == 3) {
			inquireBalance();
		}
	}
	public void withdraw(){
		
	}

	public void deposit(){
		
	}

	public void inquireBalance(){
	}


}
