package io.philslab.prog1.vorlesung_07;

import java.util.Scanner;

public class KontoMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Set attributes
        System.out.print("Name des Kontoinhabers: ");
        String owner = reader.nextLine();

        System.out.print("Kontostand: ");
        Double balance = reader.nextDouble();

        // Konto is in the same package, therefore already imported
        Konto k = new Konto(owner, balance);
        Konto j = new Konto("Mr. X", (double) 1000000f);
        System.out.println(k.toString());
        System.out.println(j.toString());

        k.kontostandErhoehen();

        Konto.getZinsen();

        Konto.jahresAbschlussAll();

        // Close scanner
        reader.close();
    }
}
