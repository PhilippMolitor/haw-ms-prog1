package io.philslab.prog1.vorlesung_08;

import io.philslab.prog1.vorlesung_08.pokemon.feuer.Glumanda;
import io.philslab.prog1.vorlesung_08.pokemon.pflanze.Bisaknosp;
import io.philslab.prog1.vorlesung_08.pokemon.pflanze.Bisasam;
import io.philslab.prog1.vorlesung_08.pokemon.wasser.Schiggy;

public class Programmablauf {
    public static void main(String[] args) {
        // Create two trainers
        Trainer t1 = new Trainer("Phil");
        Trainer t2 = new Trainer("Ashe");

        // Create 6 pokemons
        t1.addPokemon(new Glumanda());
        t1.addPokemon(new Bisasam());
        t1.addPokemon(new Bisaknosp());
        t2.addPokemon(new Glumanda());
        t2.addPokemon(new Bisasam());
        t2.addPokemon(new Schiggy());

        // state: is the battle over yet?
        boolean battleOver = false;
        Trainer winner = null;

        // battle loop
        while (!battleOver) {
            if (t1.activePokemon == null || t1.activePokemon.getHealth() < 1 && t1.getLivingPokemons().length > 0) {
                t1.callPokemon();
                System.out.format("\n%s wechselt %s ein!\n", t1.name, t1.activePokemon.getName());
            }

            if (t2.activePokemon == null || t2.activePokemon.getHealth() < 1 && t2.getLivingPokemons().length > 0) {
                t2.callPokemon();
                System.out.format("\n%s wechselt %s ein!\n", t2.name, t2.activePokemon.getName());
            }

            // t1 attacks t2
            // check if any trainer is done
            if (t1.getLivingPokemons().length < 1) {
                winner = t2;
                battleOver = true;
            } else {
                System.out.format("%s (von %s) attackiert: %s (von %s)\n", t1.activePokemon.getName(), t1.name, t2.activePokemon.getName(), t2.name);
                t1.fight(t2);
            }

            // t2 attacks t1
            // check if any trainer is done
            if (t2.getLivingPokemons().length < 1) {
                winner = t1;
                battleOver = true;
            } else {
                System.out.format("%s (von %s) attackiert: %s (von %s)\n", t2.activePokemon.getName(), t2.name, t1.activePokemon.getName(), t1.name);
                t2.fight(t1);
            }
        }

        // result
        System.out.println("\nGewinner ist: " + winner.name);
    }
}
