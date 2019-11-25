package io.philslab.prog1.vorlesung_10.Pokemon;

public class Schiggy extends Pokemon {
    public Schiggy() {
        super("Schiggy", pokemonType.WATER, 10);
        addAttack(new Attack("Aquaknarre", 3));
    }

    protected void takeDamage(int dmg) {
        super.takeDamage(dmg - 1);
    }
}
