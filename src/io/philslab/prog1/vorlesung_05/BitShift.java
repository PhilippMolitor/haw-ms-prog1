package io.philslab.prog1.vorlesung_05;

/*
 * Schreiben Sie ein Programm BitShift, das ausgehend vom Wert 1, bei jedem
 * Durchlauf der Schleife den vorherigen Wert mit Hilfe des Bitshift-Operators
 * um eine Stelle nach links verschiebt.
 * Geben Sie jeweils den Dezimalwert des aktuellen Ergebnisses in der Konsole
 * aus. Die Schleife soll genau 10 mal durchlaufen werden.
 *
 * Beispiel:
 * 1.Durchlauf: 1
 * 2.Durchlauf: 2
 * 3.Durchlauf: 4
 * ...
 */

public class BitShift {
    public static void main(String[] args) {
        int number = 1;

        while (Math.log(number) / Math.log(2) < 10) {
            System.out.printf("%.0f. Durchlauf: %d\n", Math.log(number) / Math.log(2) + 1, number);
            number = number << 1;
        }
    }
}
