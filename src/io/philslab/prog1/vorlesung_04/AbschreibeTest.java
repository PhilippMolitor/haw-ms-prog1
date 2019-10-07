package io.philslab.prog1.vorlesung_04;

/*
 * Schreiben Sie dann ein Programm AbschreibeTest, dass den Benutzer dazu auffordert
 * einen vorgegeben Text abzutippen.
 * Den abzutippenden Text dürfen Sie frei wählen.
 * Nach der Eingabe soll geprüft werden, ob richtig abgeschrieben wurde.
 *
 * Beispiel:
 * Bitte Tippen Sie - Keep It SimpeL sTupiD: keep it simpel stupid
 * Die Eingabe war leider nicht korrekt!
 */

import java.util.Scanner;

public class AbschreibeTest {
    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // Comparison text
        String validText = "Visit https://phils-lab.io !";
        System.out.printf("Bitte geben Sie ein \"%s\" ein: ", validText);
        String inputText = reader.nextLine();

        // Compare both
        boolean textsAreEqual = inputText.equals(validText);

        // output
        if(textsAreEqual) {
            System.out.println("Korrekt abgetippt!");
        } else {
            System.out.println("Die Eingabe war leider nicht korrekt!");
        }

        // close scanner object
        reader.close();
    }
}
