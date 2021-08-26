package notes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Note00_Sample {

	public static void main(String[] args) {
		
		System.out.println("Sup Om!");
		
		
		System.out.print("Enter an integer: ");
		Scanner inkey = new Scanner(System.in);
		
		try {
			int num = inkey.nextInt();
		}
		catch (InputMismatchException e) {
			
			System.out.println("Hey Dummy, that's not an integer");
			
		}
		
		
		
		
		
	}
	
}
