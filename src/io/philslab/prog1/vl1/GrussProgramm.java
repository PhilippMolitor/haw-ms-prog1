package io.philslab.prog1.vl1;

import java.util.Scanner;

public class GrussProgramm {

	public static void main(String[] args) {
		/*
		 * Erstellen Sie im Projekt vorlesung_02 ein Java-Programm namens GrussProgramm, 
		 * bei dem der Benutzer seinen Vor-und Nachnamen eingibt und mit diesem danach begrüßt wird!
		 * 
		 * Beispiel:
		 * Geben Sie ihren Vornamen ein: John
		 * Geben Sie ihren Nachnamen ein: Doe
		 * Willkommen John Doe!
		 */
		
		Scanner sc = new Scanner(System.in);

		// Input vorname
		System.out.print("Geben Sie ihren Vornamen ein: ");
		String vorname = sc.nextLine();
		
		// Input nachname
		System.out.print("Geben Sie ihren Nachnamen ein: ");
		String nachname = sc.nextLine();
		
		// Output
		System.out.println("Willkommen " + vorname + " " + nachname + "!");
		
		// Close scanner
		sc.close();
	}

}
