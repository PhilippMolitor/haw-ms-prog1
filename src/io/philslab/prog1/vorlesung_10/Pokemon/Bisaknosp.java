package io.philslab.prog1.vorlesung_10.Pokemon;


public class Bisaknosp extends Bisasam {
    public Bisaknosp() {
        super("Bisaknosp", 20);
        addAttack(new Attack_Plant("Rasierblatt", 5));
    }

    public void speak() {
        System.out.println(this.getName() + "!");
    }
}
