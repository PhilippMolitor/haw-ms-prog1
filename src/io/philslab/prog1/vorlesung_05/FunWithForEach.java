package io.philslab.prog1.vorlesung_05;

/*
 * Schreiben Sie ein Programm FunWithForEach, dass mit Hilfe der for-each-Schleife
 * ein int-Array ausliest und folgende Werte berechnet:
 * • Summe aller Zahlen
 * • Anzahl der Elemente
 * • Anzahl der Geraden Zahlen
 *
 * Beispiel Ausgabe:
 * count: 5
 * sum: 20
 * evens: 1
 * multiple: 5 19 (optional)
 *
 * Array Deklaration:
 * int[]arr = {1, 5, 2, 5, 7};
 */

import java.util.ArrayList;

public class FunWithForEach {

    public static void main(String[] args) {
        // input
        int[] input = {1, 5, 2, 5, 7, 19, 4, 16, 32, 64, 128, 19, 20, 21, -5, -13, 4};

        // state
        int count = 0;
        int sum = 0;
        int evens = 0;
        ArrayList<Integer> found = new ArrayList<>();
        ArrayList<Integer> multiples = new ArrayList<>();
        
        // calculation
        for (int number : input) {
            // increment count
            count++;

            // add to sum
            sum += number;

            // add count to evens
            if (number % 2 == 0) {
                evens++;
            }

            // add to multiples, if already in found list
            if(found.contains(number)) {
                multiples.add(number);
            } else {
                found.add(number);
            }
        }

        // output
        System.out.printf("count: %d\nsum: %d\nevens: %d\nmultiple:", count, sum, evens);
        for(int m : multiples) {
            System.out.printf(" %d", m);
        }
        System.out.println();
    }
}
