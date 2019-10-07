package io.philslab.prog1.vorlesung_04;

/*
 * Schreiben Sie dann ein Programm Zahlenschreiber, das dazu auffordert,
 * eine beliebige ganze Zahl zwischen 1 und 5 einzugeben.
 * Lassen Sie das Programm die eingegebene Zahl dann als Wort ausgeben!
 * Wird etwas anderes als eine Zahl zwischen 1 und 5 eingegeben, soll
 * „Zahl unbekannt“ ausgegeben werden.
 *
 * Beispiel:
 * Geben Sie eine Ganzzahl zwischen 1 und 5 ein: 4
 * Vier
 */

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Zahlenschreiber {
    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // input
        System.out.print("Geben Sie eine Ganzzahl zwischen 1 und 5 ein: ");
        int input = reader.nextInt();

        // Output
        String output;
        switch (input) {
            case 1:
                output = "Eins";
                break;
            case 2:
                output = "Zwei";
                break;
            case 3:
                output = "Drei";
                break;
            case 4:
                output = "Vier";
                break;
            case 5:
                output = "Fünf";
                break;
            default:
                output = "Zahl unbekannt";
        }
        System.out.println(output);

        // close scanner object
        reader.close();
    }
}
