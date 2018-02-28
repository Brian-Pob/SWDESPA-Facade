import java.util.Scanner;

//import Withdrawal.*;
//import Deposit.*;
import shared.*;

//this is AD speaking to you from hell
//i like potatoes 
public class ATM{
	
	public void useATM() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		boolean choiceMade = false;
		System.out.println("ATM START");
		
		
		do {
			System.out.println("Withdraw 	[1]"
					 		 + "Deposit  	[2]"
					 		 + "Inquire Bal [3]");
			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("You must enter a valid choice.");
			}
			
			if(choice == 1) {
				withdraw();
				choiceMade = true;
			}else if (choice == 2) {
				deposit();
				choiceMade = true;
			}else if (choice == 3) {
				inquireBalance();
				choiceMade = true;	
			}
			
			System.out.println("Would you like to continue your transaction? [Y/N]");
			if(sc.nextLine().equalsIgnoreCase("n"))
				choiceMade = true;
			
		}while(!choiceMade);
		
		//printReceipt()
	}
	public void withdraw(){
		
	}

	public void deposit(){
		
	}

	public void inquireBalance(){
	}


}
