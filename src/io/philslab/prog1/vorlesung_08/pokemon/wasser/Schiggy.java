package io.philslab.prog1.vorlesung_08.pokemon.wasser;

import io.philslab.prog1.vorlesung_08.pokemon.Pokemon;

public class Schiggy extends Pokemon {
    public Schiggy() {
        super();
        setName("Schiggy");
        setType(PokemonTyp.WASSER);
        this.new Attack("Aquaknarre", 2);
        this.new Attack("Tackle", 1);
    }

    void takeDamage(int dmg) {
        setHealth(getHealth() - (dmg - 1));
    }

}
