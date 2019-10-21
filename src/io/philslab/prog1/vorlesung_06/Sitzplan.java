package io.philslab.prog1.vorlesung_06;

/*
 * Schreiben Sie ein Programm Sitzplan, bei dem man einen bestimmten Sitz in einem Kino
 * mit 5 Reihen und 10 Sitzen pro Reihe belegen kann! Der Benutzer soll hierzu gefragt
 * werden, in welcher Reihe welcher Sitz belegt werden soll. Diese Information soll in
 * einem zweidimensionalen Array gespeichert werden, der anschließend "grafisch"
 * dargestellt wird.
 *
 * Beispiel:
 * Reihe (1-5): 3
 * Sitz: 7
 * 0000000000
 * 0000000000
 * 000000X000
 * 0000000000
 * 0000000000
 */

import java.util.Scanner;

public class Sitzplan {
    public static void main(String[] args) {
        // scanner
        Scanner reader = new Scanner(System.in);

        // dimensions
        int rows = 5;
        int columns = 10;

        // input
        System.out.printf("Reihe (%d-%d): ", 1, rows);
        int inputRow = reader.nextInt();
        System.out.printf("Sitz (%d-%d): ", 1, columns);
        int inputColumn = reader.nextInt();

        // create array and output simultaneously
        char[][] plan = new char[columns][rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (inputColumn - 1 == c && inputRow - 1 == r) {
                    plan[c][r] = 'X';
                } else {
                    plan[c][r] = '0';
                }
                System.out.print(plan[c][r]);
            }
            System.out.println();
        }

        // close scanner
        reader.close();
    }
}
