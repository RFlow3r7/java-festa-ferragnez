package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[]args) {
		
		//Dichiarazione e Inizializzazione degli Invitati:
		
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
		
		//Input dell'utente:

		Scanner input = new Scanner(System.in);	
		
		// Richiesta del Nome all'utente:
		
		System.out.println("Inserisci il tuo nome");
		
		// Lettura input che l'utente immette:
		
		String name = input.nextLine();
		
		// Ricerca dell'invitato all'interno della lista (Dichiarati nella String "nomiPartecipanti)
		
		boolean found = false;
		
		
		for (String participantName : nomiPartecipanti) {
			if (participantName.equalsIgnoreCase(name)) {
				found = true;
				break;
			}
		}
		
		// Messaggio di Autorizzazione o Negazione dell'entrata alla festa
		
		if (found) {
			System.out.println("Puoi Entrare");
		} else {
		    System.out.println("non puoi entrare");
		}
			
			// Chiusura dello scanner
			
			input.close();
		}
	}
