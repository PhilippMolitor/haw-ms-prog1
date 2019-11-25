package io.philslab.prog1.vorlesung_10.Pokemon;

public class Bisasam extends Pokemon {
    protected Bisasam(String _name, int _health) {
        super(_name, pokemonType.PLANT, _health);
        addAttack(new Attack("Rankenhieb", 3));
    }

    public Bisasam() {
        super("Bisasam", pokemonType.PLANT, 10);
        addAttack(new Attack("Rankenhieb", 3));
    }
}
