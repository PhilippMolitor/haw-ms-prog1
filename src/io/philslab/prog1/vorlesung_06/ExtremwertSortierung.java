package io.philslab.prog1.vorlesung_06;

/*
 * Schreiben Sie eine Variante (also gleiches Ein-und Ausgabeverhalten) des Programms Extremwerte namens
 * ExtremwerteSortierung, das die Extremwerte ermittelt, indem es die Zufallszahlen der Größe nach sortiert!
 *
 * Anleitung: Iterieren Sie über den Zufallszahlen-Array und vertauschen Sie zwei benachbarte Werte,
 * wenn der "linke" Wert größer ist als der "rechte".
 * Iterieren Sie so oft über den Array, bis keine Vertauschung mehr stattfindet!
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExtremwertSortierung {
    public static void main(String[] args) {
        // settings
        int valueCount = 10;

        // array of
        List<Float> values = new ArrayList<>();

        // generate random values
        for (int i = 0; i < valueCount; i++) {
            values.add(1.0f + new Random().nextFloat() * 99.0f);
        }

        // output before
        for (float v : values) {
            System.out.printf("%.2f -> ", v);
        }
        System.out.println();

        // sorting, basically bubble sort
        boolean sorted = false;

        do {
            // reset sorted for each iteration
            sorted = false;

            // begin at 1 because we can't compare index 0 to -1
            for (int i = 1; i < values.size(); i++) {
                float previous = values.get(i - 1);
                float current = values.get(i);

                // swap
                if (current < previous) {
                    Collections.swap(values, i, i - 1);
                    sorted = true;

                    // output sub-iteration result
                    for (float v : values) {
                        System.out.printf("%.2f -> ", v);
                    }
                    System.out.println();
                }
            }
        } while (sorted);

        // final output
        System.out.printf("Extremwerte: %f und %f\n", values.get(0), values.get(values.size() - 1));
    }
}
