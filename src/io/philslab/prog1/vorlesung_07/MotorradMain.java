package io.philslab.prog1.vorlesung_07;

public class MotorradMain {
    public static void main(String[] args) {
        Motorrad m1 = new Motorrad();
        m1.printInfo();
        System.out.println("Taxes: " + m1.calculateTaxes());
    }
}
