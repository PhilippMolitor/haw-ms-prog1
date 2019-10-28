package io.philslab.prog1.vorlesung_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Konto {
    static List<Konto> allAccounts = new ArrayList<>();
    static float zinsen = 0.145f;

    String besitzer;
    Double kontostand;

    Konto(String name, Double amount) {
        besitzer = name;
        kontostand = amount;
        allAccounts.add(this);
    }

    // never use umlauts in programming...
    void kontostandErhoehen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nutzereingabe: ");
        kontostand += sc.nextDouble();
        sc.close();
        System.out.println("Kontostand jetzt: " + kontostand);
    }

    void kontostandErhoehen(double amount) {
        kontostand += amount;
        System.out.println("Kontostand jetzt: " + kontostand);
    }

    public String toString() {
        return String.format("Konto: %s - %f", besitzer, kontostand);
    }

    static String getZinsen() {
        return String.format("Zinssatz: %f%%", zinsen * 100);
    }

    void jahresAbschluss() {
        kontostand += kontostand * zinsen;
        System.out.println(String.format("Neuer Kontostand: %f (bei %f%% Zinsen)", kontostand, zinsen * 100));
    }

    static void jahresAbschlussAll() {
        for (Konto k : allAccounts) {
            k.jahresAbschluss();
        }
    }
}
