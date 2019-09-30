package io.philslab.prog1.vorlesung_03;

/*
 * Schreiben Sie dann ein Programm MatheFunktion.
 * In diesem Programm sollen unterschiedliche mathematische Funktionen mit Hilfe des
 * Matheobjekts "Math" durchgeführt werden.
 * Hinweis: Tippen Sie Math. ein um die verfügbaren Funktionen zu sehen.
 *
 * Beispiel:
 * Geben Sie eine beliebige Ganzzahlen ein: 2
 * Geben Sie eine weiter Ganzzahl ein: -5
 *
 * Die Absolutwerte sind: 2, 5
 * Die kleiner Zahl ist: -5
 * Beide Zahlen multipliziert ergeben: -10
 * Cosinus von Zahl 1 ist: -0,41
 */

import java.util.Scanner;

public class MatheFunktion {
    public static void main(String[] args) {
        // Open scanner object
        Scanner reader = new Scanner(System.in);

        // Input a
        System.out.print("Enter a first integer: ");
        int a = reader.nextInt();

        // Input b
        System.out.print("Enter a second integer: ");
        int b = reader.nextInt();

        // Math functions
        // absolute integers
        int absA = Math.abs(a), absB = Math.abs(b);
        // max/min integer
        int minAB = Math.min(a, b), maxAB = Math.max(a, b);
        // multiplication
        int multAB = Math.multiplyExact(a, b);
        // sinus/cosinus
        double sinA = Math.sin(a), sinB = Math.sin(b);
        double cosA = Math.cos(a), cosB = Math.cos(b);
        // Randoms
        double randomFloat = (Math.random() * b) + a;
        int randomInt = (int) Math.round(randomFloat);

        // Output
        String output = String.format("absolute a: %d - b: %d\n" +
                "min: %d - max: %d\n" +
                "multiplied: %d\n" +
                "sinus a: %f - b: %f\n" +
                "cosinus: %f - b: %f\n" +
                "random between %d and %d: %f (rounded: %d)",
                absA, absB,
                minAB, maxAB,
                multAB,
                sinA, sinB,
                cosA, cosB,
                a, b, randomFloat, randomInt);
        System.out.println(output);

        // close scanner handle
        reader.close();
    }
}
