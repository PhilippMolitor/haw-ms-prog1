package io.philslab.prog1.vorlesung_08;

import io.philslab.prog1.vorlesung_08.pokemon.Pokemon;

import java.util.Random;

public class Programmablauf {
    public static void main(String[] args) {
        // Create two trainers
        Trainer t1 = new Trainer("Phil");
        Trainer t2 = new Trainer("Ashe");

        // Create 6 pokemons
        for (int i = 0; i < 6; i++) {
            // Create pokemon and add some attacks
            Pokemon newPoke = new Pokemon();
            newPoke.new Attack("Attacke 1", 1 + new Random().nextInt(4));
            newPoke.new Attack("Attacke 2", 1 + new Random().nextInt(4));

            // Assign evenly to the trainers
            if (i % 2 == 0) {
                t1.addPokemon(newPoke);
            } else {
                t2.addPokemon(newPoke);
            }
        }

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
