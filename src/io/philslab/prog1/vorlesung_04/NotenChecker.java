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
 *
 * Erweitern Sie das Programm NotenChecker, sodass bei invaliden Eingaben mit
 * „ungültige Note“ quittiert wird.
 * Außerdem sollen die Noten entsprechend ihrer Textform ausgegeben werden
 * (1 = mit sehr gut bestanden, 2 = mit gut bestanden, usw...)
 *
 * Fertigen Sie zusätzlich ein UML Diagramm zum Programmablauf an.
 *
 * Beispiel:
 * Geben Sie ihre Note ein: 3
 * Sie haben mit der Note befriedigend bestanden!
 */

import java.util.Scanner;

public class NotenChecker {
    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // input
        System.out.print("Geben Sie ihre Note ein: ");
        int grade = reader.nextInt();

        // state
        boolean validGrade = true;
        boolean passed = true;
        String textGrade = "";

        // analyze grade
        switch (grade) {
            case 1:
                textGrade = "sehr gut";
                break;
            case 2:
                textGrade = "gut";
                break;
            case 3:
                textGrade = "befriedigend";
                break;
            case 4:
                textGrade = "ausreichend";
                break;
            case 5:
                passed = false;
                break;
            default:
                validGrade = false;
                break;
        }

        // output
        if(!validGrade) {
            System.out.println("Ungültige Note!");
        } else if(passed) {
            System.out.printf("Sie haben mit \"%s\" bestanden!\n", textGrade);
        } else {
            System.out.println("Sie sind durchgefallen!");
        }

        // close scanner object
        reader.close();
    }
}
