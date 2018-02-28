//Subsystem
package shared;

import java.util.Scanner;

public class Numpad{
	public float inputNum(){
		Scanner sc = new Scanner(System.in);
		
		float input = Float.parseFloat(sc.nextLine());
		
		sc.close();
		return input;
	}
}
