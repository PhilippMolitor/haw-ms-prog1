package io.philslab.prog1.vorlesung_08.pokemon.feuer;

import io.philslab.prog1.vorlesung_08.pokemon.Pokemon;

public class Glumanda extends Pokemon {
    public Glumanda() {
        super();
        setName("Glumanda");
        setType(PokemonTyp.FEUER);
        this.new Attack("Feuerstoß", 3);
        this.new Attack("Tackle", 1);
    }
}
