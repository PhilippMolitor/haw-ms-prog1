package io.philslab.prog1.vorlesung_09.Trainer;

import io.philslab.prog1.vorlesung_09.Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    public String name;
    private List<Pokemon> catchedPokemon = new ArrayList<Pokemon>();
    public Pokemon activePokemon;

    public Trainer(String name, Pokemon pokemon) {
        this.name = name;
        System.out.println("\n== A new Trainer appeared: " + name + " ==");
        addPokemon(pokemon);
    }

    public void addPokemon(Pokemon pokemon) {
        if (pokemon.myTrainer == null) {
            catchedPokemon.add(pokemon);
            System.out.println(name + " has a new Pokemon: " + pokemon.getName());
        } else {
            System.out.print(pokemon.getName() + " already has a trainer, sry " + name);
        }

    }

    // check all pokemon and pick the first who is able to fight.
    public void callPokemon() {
        for (Pokemon p : catchedPokemon) {
            if (p.getHealth() > 0) {
                activePokemon = p;
                System.out.println("\t" + name + ": " + p.getName() + " i am calling you!");
                return;
            }
        }

        System.out.println(name + ": I am defeated, my Pokemons all got beaten up ;(");
    }
}
