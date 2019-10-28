package io.philslab.prog1.vorlesung_07;

import java.security.InvalidParameterException;
import java.util.Random;

public class Motorrad {
    // enums inside classes are static by default
    public enum Typ {
        SPORTLER,
        CHOPPER,
        CRUISER,
        ENDURO
    }

    public enum Farbe {
        SCHWARZ,
        ROT,
        BLAU,
        SILBER
    }

    private final static int ccMin = 125;
    private final static int ccMax = 1300;
    private final static double yearlyTaxesPer25Ccm = 1.84f;

    private Typ type;
    private Farbe color;
    private int displacement;

    // Constructor (random values)
    public Motorrad() {
        // Pick by random
        this(
                Typ.values()[new Random().nextInt(Typ.values().length)],
                Farbe.values()[new Random().nextInt(Farbe.values().length)],
                (int) Math.floor(ccMin + new Random().nextInt(ccMax - ccMin - 1))
        );
    }

    // Constructor with 3-argument overload
    public Motorrad(Typ typ, Farbe farbe, int hubraum) {
        type = typ;
        color = farbe;

        // validate input range
        if (hubraum < ccMin || hubraum > ccMax) {
            throw new InvalidParameterException(String.format("Value must be between %d and %d", ccMin, ccMax));
        } else {
            displacement = hubraum;
        }
    }

    public void printInfo() {
        System.out.format("%10s%10s\n", "Attribut", "Wert");
        System.out.format("%10s%10s\n", "Typ", type.toString().substring(0, 1).toUpperCase() + type.toString().substring(1).toLowerCase());
        System.out.format("%10s%10s\n", "Farbe", color.toString().toLowerCase());
        System.out.format("%10s%10d\n", "Hubraum", displacement);
    }

    public double calculateTaxes() {
        // calculated for each 25ccm or part thereof
        return ((int) (displacement / 25) + (displacement % 25 > 0f ? 1 : 0)) * yearlyTaxesPer25Ccm;
    }

    // german methods
    public void schreibeInfos() {
        printInfo();
    }

    public double berechneSteuern() {
        return calculateTaxes();
    }
}
