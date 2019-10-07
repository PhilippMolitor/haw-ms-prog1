package io.philslab.prog1.vorlesung_04;

/*
 * Schreiben Sie dann ein Programm NotenChecker, das dazu auffordert, eine Note
 * zwischen 1 und 5 einzugeben. Lassen Sie das Programm dann aussagen, ob die
 * Note zum Bestehen reicht!
 *
 * Hinweis: Nur Noten 1 bis 4 bestehen. Verwenden Sie die switch-Verzweigung
 * und codieren Sie möglichst effizient!
 *
 * Beispiel:
 * Geben Sie ihre Note ein: 2
 * Sie haben bestanden!
 */

import java.util.Scanner;

public class NotenChecker {
    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // input
        System.out.print("Geben Sie ihre Note ein: ");
        int grade = reader.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Sie haben bestanden!");
                break;
            case 5:
                System.out.println("Sie sind durchgefallen!");
                break;
            default:
                System.out.println("Ungültige Note!");
                break;
        }

        // close scanner object
        reader.close();
    }
}
