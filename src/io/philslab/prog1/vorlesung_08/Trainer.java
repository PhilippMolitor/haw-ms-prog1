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

    // fight another trainer
    public void fight(Trainer enemy) {
        activePokemon.fight(enemy.activePokemon);
    }

    // Get a list of only living pokemons
    public Pokemon[] getLivingPokemons() {
        List<Pokemon> livingPokemons = new ArrayList<>();

        for (Pokemon p : pokemons) {
            if (p.getHealth() > 0) {
                livingPokemons.add(p);
            }
        }
        
        Pokemon[] result = new Pokemon[livingPokemons.size()];
        livingPokemons.toArray(result);

        return result;
    }

    // select random pokemon from available ones and set the current one
    void callPokemon() {
        Pokemon[] livingPokemons = getLivingPokemons();
        activePokemon = livingPokemons[new Random().nextInt(livingPokemons.length)];
    }
}
