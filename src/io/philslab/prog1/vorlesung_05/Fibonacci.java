package io.philslab.prog1.vorlesung_05;

/*
 * Schreiben Sie ein Programm Fibonacci, das die sog. Fibonacci-Folge
 * für eine bis zu einer vom Benutzer eigegebenen Anzahl an Elementen
 * ausgibt. Für die Fibonacci-Folge gilt:
 * 1. Die ersten beiden Zahlen haben den Wert 1
 * 2. Jede weitere Zahl ist die Summe ihrer beiden Vorgänger
 *
 * Beispiel:
 * Wie viele Elemente der Fibonacci-Folge sollen ausgegeben werden? 10
 * 1 1 2 3 5 8 13 21 34 55
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // scanner
        Scanner reader = new Scanner(System.in);

        // Input
        System.out.print("Anzahl der Fibonacci-Elemente: ");
        int input = reader.nextInt();

        // fibonacci
        int a = 0;
        int b = 1;

        for (int i = 0; i < input; i++) {
            System.out.printf("%d, ", b);

            int tmp = a + b;
            a = b;
            b = tmp;
        }

        // close scanner handle
        reader.close();
    }
}
