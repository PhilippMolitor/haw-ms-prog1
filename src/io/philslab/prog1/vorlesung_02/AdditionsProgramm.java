package io.philslab.prog1.vorlesung_02;/*
 * AdditionsProgramm: Philipp Molitor - philipp.molitor@haw-hamburg.de
 */

public class AdditionsProgramm {
	
	public static void main(String[] args) {
		/*
		 * Legen Sie zunächst ein neues Java-Projekt namens vorlesung_02 an!
		 * 
		 * Erstellen Sie dann in diesem neuen Projekt ein Java-Programm (Klasse) namens AdditionsProgramm, 
		 * das die Summe aus zwei Ganzzahl-Variablen mit den initial zugeordneten Werten 1234
		 * und 3456 in einer dritten Variable aufsummiert und den Inhalt dieser Variablen auf der 
		 * Konsole ausgibt!
		 * 
		 * Wie lautet das Ergebnis dieser Addition?
		 */
		
		// a und b initialisieren
		int a = 1234, b = 4321;
		// c initialisieren mit addition
		int c = a + b;
		// ausgabe
		System.out.println("Summe: " + c);
		// inline-rechnung
		System.out.println("Summe: " + (a + b));
	}
	
}
