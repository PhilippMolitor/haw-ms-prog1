package io.philslab.prog1.vorlesung_08.pokemon.pflanze;

import io.philslab.prog1.vorlesung_08.pokemon.Pokemon;

public class Bisasam extends Pokemon {
    public Bisasam() {
        super();
        setName("Bisasam");
        setType(PokemonTyp.PFLANZE);
        this.new Attack("Rasierblatt", 3);
        this.new Attack("Tackle", 1);
    }
}
