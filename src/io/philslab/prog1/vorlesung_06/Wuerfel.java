package io.philslab.prog1.vorlesung_06;

/*
 * Schreiben Sie ein Programm Wuerfel, das einen Würfel mit sechs Seiten simuliert!
 * Verwenden Sie zur Abbildung der Würfelseiten eine Aufzählung!
 *
 * Hinweis: Mit der (statischen) Methode values() einer Aufzählung erhalten Sie einen
 * Array all ihrer möglichen Werte.
 *
 * Beispiel:
 * Der Würfel zeigt VIER
 * Nochmal würfeln (j/n)? j
 * Der Würfel zeigt ZWEI
 * Nochmal würfeln (j/n)? n
 */

import java.util.Random;
import java.util.Scanner;

public class Wuerfel {
    private enum DiceSide {
        EINS,
        ZWEI,
        DREI,
        VIER,
        FUENF,
        SECHS
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;

        do {
            DiceSide w = DiceSide.values()[new Random().nextInt(DiceSide.values().length)];

            System.out.printf("Der Würfel zeigt: %s\n", w.toString());
            System.out.print("Nochmal würfeln? (j/n): ");
            input = reader.nextLine();
        } while(input.equalsIgnoreCase("j"));

        // close scanner
        reader.close();
    }
}
