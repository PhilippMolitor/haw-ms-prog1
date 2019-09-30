package io.philslab.prog1.vorlesung_03;

import java.util.Scanner;

/*
 * Erstellen Sie im Projekt vorlesung_03 ein Java-Programm namens WerteBereichsChecker, das
 * Sie dazu auffordert, eine beliebige ganze Zahl einzugeben, die zwischen zwei
 * Zufallszahlen (0,100) liegt.
 * Lassen Sie das Programm (ohne Kontrollstruktur!) ein einfaches Feedback(true oder false)
 * geben, ob eine geeignete Zahl eingegeben wurde
 *
 * Beispiel:
 * Geben Sie eine beliebige Ganzzahl zwischen 15 und 27 ist: 7
 * false
 *
 * Alle die vorzeitig fertig werden, können das Programm so anpassen, dass die Grenzwerte
 * auch verwendet werden dürfen.
 */

public class WerteBereichsChecker {

    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // generate randoms
        int randomA = (int) Math.floor(Math.random() * 101);
        int randomB = (int) Math.floor(Math.random() * 101);
        int min = Math.min(randomA, randomB);
        int max = Math.max(randomA, randomB);

        // input integer
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int input = reader.nextInt();

        // output (excluding limits)
        System.out.println(min < input && input < max);
        // bonus task: output (including limits)
        System.out.println(min <= input && input <= max);

        // close scanner object
        reader.close();
    }
}
