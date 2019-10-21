package io.philslab.prog1.vorlesung_06;

/*
 * Schreiben Sie dann ein Programm Mittelwert, das den Mittelwert von einer beliebigen Anzahl
 * einzugebender Messwerte (Gleitkommazahlen) auf zwei Nachkommastellen genau ausgibt!
 *
 * Beispiel:
 * Anzahle der Messwerte: 4
 * 1. Messwert: 2,5
 * 2. Messwert: 3,26
 * 3. Messwert: 12,801
 * 4. Messwert: 6,3
 *
 * Mittelwert: 6,22
 */

import java.util.Scanner;

public class Mittelwert {
    public static void main(String[] args) {
        // scanner
        Scanner reader = new Scanner(System.in);

        // count input
        System.out.print("Anzahl der Messwerte: ");
        int count = reader.nextInt();
        float[] values = new float[count];

        // get every value as input
        for(int i = 0; i < count; i++) {
            System.out.printf("%d. Wert: ", i + 1);
            values[i] = reader.nextFloat();
        }

        // sum up
        float sum = 0;
        for(float v: values) {
            sum += v;
        }

        // output
        System.out.printf("Mittelwert: %.2f\n", sum/count);

        // close scanner
        reader.close();
    }
}
