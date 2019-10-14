package io.philslab.prog1.vorlesung_05;

/*
 * Schreiben Sie das Programm Bottles99, welches den gesamten Text
 * von 99-Bottles-of-Beer ausgibt (Lyrics). Viel Spaß!
 *
 * 99 bottles of beer on the wall, 99 bottles of beer.
 * Take one down and pass it around, 98 bottles of beer on the wall.
 * 98 bottles of beer on the wall, 98 bottles of beer.
 * Take one down and pass it around, 97 bottles of beer on the wall.
 * 97 bottles of beer on the wall, 97 bottles of beer.
 * Take one down and pass it around, 96 bottles of beer on the wall.
 * [...]
 * No more bottles of beer on the wall, no more bottles of beer.
 * Go to the store and buy some more, 99 bottles of beer on the wall.
 */

public class Bottles99 {
    public static void main(String[] args) {
        for(int bottles = 99; bottles >= 0; bottles--) {
            String pluralOn = bottles > 1 ? "s": "";
            String pluralOff = bottles - 1 > 1 ? "s": "";

            // first line
            if(bottles != 0) {
                System.out.printf("%d bottle%s of beer on the wall, %d bottle%s of beer.\n", bottles, pluralOn, bottles, pluralOn);
            }

            // second line
            if (bottles > 1) {
                System.out.printf("Take one down and pass it around, %d bottle%s of beer on the wall.\n", bottles - 1, pluralOff);
            } else if(bottles == 1) {
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
            } else {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }
        }
    }
}
