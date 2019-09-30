package io.philslab.prog1.vorlesung_02;

import java.util.Scanner;
import java.util.Locale;

public class DivisionsProgrammEVA {

	public static void main(String[] args) {
		/*
		 * Erstellen Sie im Projekt vorlesung_02 ein Java-Programm namens DivisionsProgrammEVA, 
		 * in welchem zwei einzugebende Fließkommazahlen dividiert werden!
		 * Ein-und Ausgabe sollen in deutscher Formatierung und das Ergebnis auf zwei 
		 * Nachkommastellen genau sein!
		 * 
		 * Beispiel:
		 * Geben Sie die erste Fließkommazahl ein: 5,3
		 * Geben Sie die zweite Fließkommazahl ein: 4,6
		 * Die Division der beiden Zahlen ergibt 1,15
		 */
		
		// New Scanner for STDIN
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.GERMAN); // Set to german locale handling

		// Input a
		System.out.print("Geben Sie die erste Fließkommazahl ein: ");
		float a = sc.nextFloat();

		// Input b
		System.out.print("Geben Sie die zweite Fließkommazahl ein: ");
		float b = sc.nextFloat();
		
		// Division
		float c = a / b;
		System.out.println(String.format("Die Division der beiden Zahlen ergibt %.2f !", c));
		
		// End scanner handle
		sc.close();
	}

}
