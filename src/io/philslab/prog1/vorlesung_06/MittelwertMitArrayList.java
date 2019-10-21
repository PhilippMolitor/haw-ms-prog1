package io.philslab.prog1.vorlesung_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

public class MittelwertMitArrayList {
    public static void main(String[] args) {
        // scanner
        Scanner reader = new Scanner(System.in);

        // state
        int counter = 0;
        List<Float> values = new ArrayList<>();

        // calculation loop
        while(true) {
            // input
            counter++;
            System.out.printf("%d. Element: ", counter);
            float input = reader.nextFloat();
            values.add(input);

            // optional: end program if input is "0"
            if(input == 0.0f) {
                break;
            }

            // sum up (and print values)
            float sum = 0.0f;
            for(int i = 0; i < values.size(); i++) {
                sum += values.get(i);
                System.out.printf("%f ", values.get(i));
            }
            float avg = sum / values.size();

            // output
            System.out.printf("- Mittelwert: %.2f\n", avg);
        }

        // close scanner
        reader.close();
    }
}
