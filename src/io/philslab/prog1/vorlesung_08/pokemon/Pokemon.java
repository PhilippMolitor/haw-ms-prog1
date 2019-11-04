package io.philslab.prog1.vorlesung_08.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pokemon {
    // subclass for attack info
    private class Attack {
        private String name = "Generische Attacke";
        private int damage = 0;

        // constructor
        public Attack(String name, int damage) {
            name = name;
            damage = damage;

            attacks.add(this);
        }

        // print info about this attack
        public void attackInfo() {
            System.out.format("%s (%d %s-Damage)", this.name, this.damage, type);
        }
    }

    // enum of different pokemon types
    public enum PokemonTyp {
        FEUER,
        WASSER,
        PFLANZE
    }

    // type of the current pokemon is public
    public PokemonTyp type;

    // private attributes
    private String name;
    private int lvl;
    private int exp;
    private int health;
    private List<Attack> attacks;

    // constructor
    public Pokemon() {
        type = PokemonTyp.values()[new Random().nextInt(PokemonTyp.values().length)];
        name = "Generisches Pokemon";
        lvl = 1;
        exp = 0;
        health = 10;
        attacks = new ArrayList<>();
    }

    /**
     * +fight(Pokemonp):void
     * +getName(): String
     * +getHealth(): int
     * ~takeDamage(intdmg): void
     * +toString(): String
     */

    // deal damgage to another pokemon
    public void fight(Pokemon p) {
        // pick a random attack
        Attack a = attacks.get(new Random().nextInt(attacks.size()));

        // deal damage to other pokemon
        p.takeDamage(a.damage);

        // show dealt damage
        a.attackInfo();
    }

    // get the name of the pokemon
    public String getName() {
        return name;
    }

    // get the current health of the pokemon
    public int getHealth() {
        return health;
    }

    // string representation of the pokemon
    public String toString() {
        Attack a = attacks.get(new Random().nextInt(attacks.size()));
        return String.format("%s (Level %d), %s-Pokemon\nExp: %d\nLeben: %d\nSchaden: %d", name, lvl, type.toString().toLowerCase(), exp, health, a.damage);
    }

    // take damage and substract it from the current health
    void takeDamage(int dmg) {
        health -= dmg;
    }
}
