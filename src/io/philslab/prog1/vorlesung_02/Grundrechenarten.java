package io.philslab.prog1.vorlesung_02;

import java.util.Locale;
import java.util.Scanner;

public class Grundrechenarten {

	public static void main(String[] args) {
		/*
		 * Erstellen Sie im Projekt vorlesung_02 ein Java-Programm namens
		 * Grundrechenarten, in welchem zwei einzugebende Fließkommazahlen addiert,
		 * subtrahiert, dividiert und multipliziert werden!
		 * 
		 * Beispiel: Geben Sie die erste Zahl ein: 5,3
		 * Geben Sie die zweite Zahl ein: 4,6
		 * 5,3 + 4,6 = 9,9
		 * 5,3 – 4,6 = 0,7
		 * 5,3 * 4,6 = 24,4
		 * 5,3 / 4,6 = 1,15
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

		// Calculation
		float sum = a + b;
		float sub = a - b;
		float mul = a * b;
		float div = a / b;

		// Output
		System.out.printf("%f + %f = %f \n", a, b, sum);
		System.out.printf("%f - %f = %f \n", a, b, sub);
		System.out.printf("%f * %f = %f \n", a, b, mul);
		System.out.printf("%f / %f = %f \n", a, b, div);
		
		// line seperator
		System.out.println("------");

		// Output (1 decimal place for the result)
		System.out.printf("%f + %f = %.1f \n", a, b, sum);
		System.out.printf("%f - %f = %.1f \n", a, b, sub);
		System.out.printf("%f * %f = %.1f \n", a, b, mul);
		System.out.printf("%f / %f = %.1f \n", a, b, div);

		// End scanner handle
		sc.close();
	}

}
