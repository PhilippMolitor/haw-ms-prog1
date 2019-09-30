package io.philslab.prog1.vorlesung_03;

import java.util.Scanner;

/*
 * Erstellen Sie im Projekt vorlesung_03 ein Java-Programm namens GeradeZahlenChecker, dass
 * Sie dazu auffordert, eine beliebige ganze, gerade Zahl einzugeben!
 * Lassen Sie das Programm (ohne Kontrollstruktur!) ein einfaches Feedback(true oder false)
 * geben, ob die Zahl tatsächlich gerade ist!
 *
 * Beispiel:
 * Geben Sie eine beliebige, gerade Ganzzahl ein: 7
 * false
 */


public class GeradeZahlenChecker {

    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // input integer
        System.out.print("Enter a number: ");
        int input = reader.nextInt();

        // output
        System.out.println(input % 2 == 0);
    }
}
