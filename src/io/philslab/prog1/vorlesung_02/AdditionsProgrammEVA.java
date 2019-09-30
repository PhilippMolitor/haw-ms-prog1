package io.philslab.prog1.vorlesung_02;// Scanner importieren
import java.util.Scanner;

public class AdditionsProgrammEVA {

	public static void main(String[] args) {
		/*
		 * Erstellen Sie im Projekt vorlesung_02 ein Java-Programm namens AdditionsProrammEVA, 
		 * das zwei ganze Zahlen, die nacheinander eingegeben werden, addiert!
		 * 
		 * Beispiel:
		 * Geben Sie die erste Zahl ein: 12
		 * Geben Sie die zweite Zahl ein: 4
		 * Die Summe der beiden Zahlen ist 16
		 */
		
		// Instanziierter Scanner
		Scanner reader = new Scanner(System.in);
		
		// Eingabe fuer a
		System.out.print("Geben sie die erste Zahl ein: ");
		int a = reader.nextInt();
		
		// Eingabe fuer a
		System.out.print("Geben sie die zweite Zahl ein: ");
		int b = reader.nextInt();
		
		// Addition
		int c = a + b;
		System.out.println("Die Summe der beiden Zahlen ( " + a + " + " + b + " ) ist " + c + "!");
		
		// Handle zu Scanner-Object schließen
		reader.close();
	}

}
