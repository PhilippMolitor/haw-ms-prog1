package io.philslab.prog1.vorlesung_10.Pokemon;

public class Glumanda extends Pokemon {
    public Glumanda() {
        super("Glumanda", pokemonType.FIRE, 10);
        addAttack(new Attack_Fire("Glut", 3));
    }

    public void speak() {
        System.out.println(this.getName() + "!");
    }
}
