package io.philslab.prog1.vorlesung_08;

import io.philslab.prog1.vorlesung_08.pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trainer {
    public String name;
    private List<Pokemon> pokemons;
    public Pokemon activePokemon;

    // constructor
    public Trainer(String name) {
        this.name = name;
        pokemons = new ArrayList<>();
    }

    // add a new pokemon to the list of available ones
    public void addPokemon(Pokemon poke) {
        pokemons.add(poke);
    }

    // select random pokemon from available ones and set the current one
    void callPokemon() {
        activePokemon = pokemons.get(new Random().nextInt(pokemons.size()));
    }
}
