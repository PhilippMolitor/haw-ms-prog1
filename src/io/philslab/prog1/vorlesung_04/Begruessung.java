package io.philslab.prog1.vorlesung_04;

/*
 * Schreiben Sie dann ein Programm Begruessung, das den Benutzer zur Eingabe
 * des Vornamens, des Nachnamens und des Geschlechts(m/w) auffordert.
 * Abschließend soll das Programm fragen, ob es den Benutzer duzen darf.
 * In Abhängigkeit von den Gemachten Eingaben soll das Programm dann den
 * Benutzer korrekt begrüßen:
 *
 * Hallo <Vorname>, ich heiße Dich willkommen!
 * Guten Tag Frau <Nachname>, ich heiße Sie willkommen!
 * Guten Tag Herr <Nachname>, ich heiße Sie willkommen!
 */

import java.util.Scanner;

public class Begruessung {
    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // input
        System.out.print("Vorname: ");
        String surname = reader.nextLine();
        System.out.print("Nachname: ");
        String name = reader.nextLine();
        System.out.print("Geschlecht (m/w): ");
        String gender = reader.nextLine();
        System.out.print("Duzen? (j/n): ");
        String duzen = reader.nextLine();

        // output
        if(duzen.equalsIgnoreCase("j")) {
            System.out.printf("Hallo %s, ich heiße Dich willkommen!\n", surname);
        } else {
            String title;

            if(gender.equalsIgnoreCase("m")) {
                title = "Herr";
            } else {
                title = "Frau";
            }

            System.out.printf("Guten Tag %s %s, ich heiße Sie willkommen!", title, name);
        }

        // close scanner object
        reader.close();
    }
}
