package io.philslab.prog1.vorlesung_05;

/*
 * Schreiben Sie dann ein Programm Doubles, dass beginnend mit 1 immer das vorherige
 * Ergebnis mit zwei multipliziert und ausgibt.
 * Nutzen Sie hierfür die While-Schleife.
 *
 * Beispiel:
 * 1
 * 2
 * 4
 * [...]
 * 128
 *
 * oder (etwas schwerer)
 * 1, 2, 4, 8, 16, 32, 64, 128
 */

public class Doubles {
    public static void main(String[] args) {
        int number = 1;

        System.out.print(number);

        while (number < 128) {
            number *= 2;
            System.out.printf(", %d", number);
        }
    }
}
