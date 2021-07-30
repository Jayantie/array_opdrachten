package bludots_opdrachten_arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class opgave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lengtearray = 0;
		int hoogstewaarde = 0;
		ArrayList<Integer> arrayresultaat = new ArrayList<Integer>();
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Geef aan hoe groot de arraylist moet zijn ");
		lengtearray= input.nextInt();
		
		System.out.println("Geef de maximale getalwaarde aan ");
		hoogstewaarde= input.nextInt();
		
		// Roep randimarraylist methid aan en plaats returnvalue in arrayresultaat
		arrayresultaat = randomarraylist(hoogstewaarde, lengtearray);
		System.out.println(arrayresultaat);
		
		
		System.out.println("Return value = "+positierandomnummer(arrayresultaat, hoogstewaarde));
			
	}
	
	//2A
	//Method om arraylis te genereren en retourneren
	public static ArrayList<Integer> randomarraylist(int hoogstewaarde, int lengtearray) {
		ArrayList<Integer> arrayresultaat = new ArrayList<Integer>();
		
		for(int i=0; i<=lengtearray;i++) {
			int randomnummer = (int)(Math.random() * hoogstewaarde+1);
			arrayresultaat.add(randomnummer);
		}
		
		return arrayresultaat;
	}
	
	//2B
	//Method om een random nummer te zoeken in arraylist en index (of positie) van nummer retourneren
	public static int positierandomnummer( ArrayList<Integer> arrayresultaat, int hoogstewaarde) {
		int positie = 0;
		int nummervooropzoek = 0;
		
		nummervooropzoek = (int)(Math.random() * hoogstewaarde+1);
		
		System.out.println("Random nummer om op te zoeken = " + nummervooropzoek);
		
		positie = arrayresultaat.indexOf(nummervooropzoek);
		
		return positie;
		
	}

}

