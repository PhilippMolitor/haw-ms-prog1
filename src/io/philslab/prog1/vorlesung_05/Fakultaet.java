package io.philslab.prog1.vorlesung_05;

/*
 * Schreiben Sie ein Programm Fakultät, das die sogenannte Fakultät einer Zahl
 * mit Hilfe einer For-Schleife berechnet!
 * Recherchieren Sie ggf. vorher, wie die Fakultät einer Zahl berechnet wird!
 *
 * Beispiel:
 * Zahl, deren Fakultät berechnet werden soll: 7
 * Die Fakultät der Zahl 7 beträgt 5040
 *
 * Stellen Sie Ihr Programm als UML Aktivitätsdiagramm dar!
 */

import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args) {
        // scanner
        Scanner reader = new Scanner(System.in);

        // input
        System.out.print("Fakultät von: ");
        int input = reader.nextInt();

        // calculate
        int fak = 1;
        for(int i = 1; i <= input; i++) {
            fak *= i;
        }

        // output
        System.out.printf("Fakultät von %d ist: %d\n", input, fak);

        // close scanner handle
        reader.close();
    }
}
