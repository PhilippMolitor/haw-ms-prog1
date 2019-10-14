package io.philslab.prog1.vorlesung_05;

/*
 * Schreiben Sie ein Programm Passwortabfrage, das den Benutzer höchstens 3
 * mal um die Eingabe eines Passworts (z.B. „Java“) fragt.
 * Bei korrekter Eingabe soll die Meldung „Zutritt gewährt“ ausgegeben werden.
 * Sollte das Passwort jedoch auch bei der dritten Eingabe Falsch sein, so
 * soll die Meldung „Zutritt verweigert“ ausgegeben werden.
 *
 * Beispiel (mit Passwort „Java“):
 * Passwort (1. Versuch): moin
 * Passwort (2. Versuch): Java
 * Zutritt gewährt!
 */

import java.util.Scanner;

public class Passwortabfrage {
    public static void main(String[] args) {
        // state
        int tries = 0;
        boolean correct = false;
        final String password = "phils-lab.io";

        // scanner
        Scanner reader = new Scanner(System.in);

        // ask for password
        do {
            System.out.printf("Passwort (%d): ", ++tries);
            String input = reader.nextLine();

            if(input.equals(password)) {
                correct = true;
                break;
            }
        } while (tries < 3);

        // message
        if(correct) {
            System.out.println("> Zutritt gewährt!");
        } else {
            System.out.println("> Zutritt verweigert!");
        }

        // close scanner handle
        reader.close();
    }
}
