package bludots_opdrachten_arrays;

import java.util.Scanner;

public class opgave1 {

	public static void main(String[] args) {
		String inputtext="";
		int inputint=0;
//Scanner wacht op input van de gebruiker om ingelezen te worden
		Scanner input= new Scanner(System.in);
		
		System.out.println("Voer een textwaarde in: ");
		inputtext= input.next();
		
		System.out.println("Voer een getal in: ");
		inputint= input.nextInt();
		
		output(inputtext, inputint);
		
		
	}
//user defined method
	public static void output(String textwaarde, int digitwaarde) {
		for (int i=0; i<=digitwaarde; i++) {
			System.out.print(textwaarde);
		}
	}
}
