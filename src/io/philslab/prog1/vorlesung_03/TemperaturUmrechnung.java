package io.philslab.prog1.vorlesung_03;

/*
 * Erstellen Sie im Projekt vorlesung_03 ein Programm TemperaturUmrechnung, dass
 * einen eingegebenen Wert auf zwei Nachkommastellen genau in
 * Grad Fahrenheit (°F) und Kelvin (K) umrechnet!
 * Hinweis: Erkundigen Sie sich ggf. im Internet, wie die Umrechnung erfolgt!
 *
 * Beispiel:
 * Geben Sie eine Temperatur in Grad Celsius ein: 22
 * 22°C entsprechen 71.6°F und 295.15K.
 */

import java.util.Scanner;

public class TemperaturUmrechnung {
    public static void main(String[] args) {
        // open scanner object
        Scanner reader = new Scanner(System.in);

        // input celsius
        System.out.print("Enter a temperature in degrees celsius: ");
        float degCelsius = reader.nextFloat();

        // celsius -> fahrenheit
        double degFahrenheit = (degCelsius * 9 / 5) + 32;
        // celsius -> kelvin
        double degKelvin = degCelsius + 273.15;

        // output
        System.out.printf("%.2f°C = %.2f°F, %.2fK", degCelsius, degFahrenheit, degKelvin);

        // close scanner object
        reader.close();
    }
}
