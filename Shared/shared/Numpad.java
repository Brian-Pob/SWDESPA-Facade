//Subsystem
package shared;

import java.util.Scanner;

public class Numpad{
	public double inputNum(){
		Scanner sc = new Scanner(System.in);
		
		double input = Double.parseDouble(sc.nextLine());
		
		sc.close();
		return input;
	}
}
