package io.philslab.prog1.vorlesung_04;

/*
 * PassenSie ihr Programm IntervallChecker so an, dass es differenziert
 * Rückmeldung gibt, ob die Zahl, die eingegeben wurde, unterhalb, innerhalb
 * oder oberhalbdes Intervalls [10,20] liegt!
 *
 * Beispiel:
 * Geben Sie eine Ganzzahl innerhalb des Intervalls [10,20] ein: 22
 * 22 liegt OBERHALB des Intervall [10,20]
 */

import java.util.Scanner;

public class IntervallChecker {
    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // interval variables
        int boundLower = 10;
        int boundUpper = 20;

        // input
        System.out.printf("Geben Sie eine Zahl innerhalb des Intervalls [%d,%d] ein: ", boundLower, boundUpper);
        int input = reader.nextInt();

        // compare
        String result;
        if (input <= boundLower) {
            result = "UNTERHALB";
        } else if (input >= boundUpper) {
            result = "OBERHALB";
        } else {
            result = "INNERHALB";
        }

        System.out.printf("Die Zahl %d liegt %s der Intervalls [%d,%d] !", input, result, boundLower, boundUpper);

        // close scanner object
        reader.close();
    }
}
