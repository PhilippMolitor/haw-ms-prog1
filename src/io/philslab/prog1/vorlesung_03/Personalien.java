package io.philslab.prog1.vorlesung_03;

/*
 * Erstellen Sie im Projekt vorlesung_03 ein Java-Programm namens Personalien, in welchem
 * Personalien entsprechend des Beispiels eigegeben werden können.
 *
 * Beispiel:
 * Name: John
 * Nachname:Doe
 * Geschlecht: männlich
 * Geburtsdatum: 01.01.1980
 * Beruf: Müllmann
 *
 * John Doe; männlich; geb. 01.01.1980; Müllmann
 *
 * Hinweis: Verwenden Sie wenn möglich StringBuilder (google is the programmers friend)
 */

import java.util.Scanner;

public class Personalien {
    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // StringBuilder for output
        StringBuilder outputBuf = new StringBuilder();

        // inputs
        System.out.print("Name: ");
        outputBuf.append(reader.nextLine()).append(" ");
        System.out.print("Nachname: ");
        outputBuf.append(reader.nextLine()).append("; ");
        System.out.print("Geschlecht: ");
        outputBuf.append(reader.nextLine()).append("; ");
        System.out.print("Geburtsdatum: ");
        outputBuf.append("geb. ").append(reader.nextLine()).append("; ");
        System.out.print("Beruf: ");
        outputBuf.append(reader.nextLine());

        // output
        System.out.println(outputBuf.toString());

        // close scanner object
        reader.close();
    }
}
