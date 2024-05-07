package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[]args) {
	
		String[] nomiPartecipanti = {
		
				 "Dua Lipa",
			     "Paris Hilton",
			     "Manuel Agnelli",
			     "J-Ax",
			     "Francesco Totti",
			     "Ilary Blasi",
			     "Bebe Vio",
			     "Luis",
			     "Pardis Zarei",
			     "Martina Maccherone",
			     "Rachel Zeilic"

	};

		Scanner input = new Scanner(System.in);	
		
		
		System.out.println("Inserisci il tuo nome");
		
		String name = input.nextLine();
		
		boolean found = false;
		
		
		for (String participantName : nomiPartecipanti) {
			if (participantName.equalsIgnoreCase(name)) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println("Puoi Entrare");
		} else {
		    System.out.println("non puoi entrare");
		}

		}
	}
