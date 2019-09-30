package io.philslab.prog1.vorlesung_03;

/*
 * Erstellen Sie im Projekt vorlesung_03 ein Java-Programm namens SchalterWahl, in dem
 * ein vorgegebenes, zufälliges 8-Bit-Muster gezielt verändert werden kann.
 *
 * Beispiel:
 * Anfangszustand:10011010
 * Wähle Schalter (1-8): 5
 * Endzustand: 10001010
 *
 * Hinweis:
 * Erzeugung des Strings zur Ausgabe eines Integers als 8-Bit-Muster:
 * String.format("%8s", Integer.toBinaryString(myByte)).replace(' ', '0')
 */

import java.util.Random;
import java.util.Scanner;

public class SchalterWahl {
    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // generate random byte
        byte[] byteBuffer = new byte[1];
        new Random().nextBytes(byteBuffer);
        byte byteBlob = byteBuffer[0];

        // input integer (-1 because indexes begin at 0)
        System.out.print("Flip which bit of " + String.format("%8s?", Integer.toBinaryString(byteBlob)).replace(' ', '0') + " (1-8): ");
        int modifier = reader.nextInt() - 1;

        // flip byte: n ^ (1 << m)
        byteBlob ^= 1 << (byte)modifier;

        // output
        System.out.println("Changed byte to:  " + String.format("%8s", Integer.toBinaryString(byteBlob)).replace(' ', '0'));

        // close scanner object
        reader.close();
    }
}
