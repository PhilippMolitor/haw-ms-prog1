package io.philslab.prog1.vorlesung_08.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pokemon {
    // subclass for attack info
    public class Attack {
        private String name;
        private int damage;

        // constructor
        public Attack(String name, int damage) {
            this.name = name;
            this.damage = damage;

            attacks.add(this);
        }

        // print info about this attack
        public void attackInfo() {
            System.out.format("%s (%d %s-Damage)\n", this.name, this.damage, type);
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
    protected Pokemon() {
        type = PokemonTyp.values()[new Random().nextInt(PokemonTyp.values().length)];
        name = "Generisches Pokemon";
        lvl = 1;
        exp = 0;
        health = 10;
        attacks = new ArrayList<>();
    }

    public PokemonTyp getType() {
        return type;
    }

    public void setType(PokemonTyp type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // deal damgage to another pokemon
    public void fight(Pokemon p) {
        // pick a random attack
        Attack a = attacks.get(new Random().nextInt(attacks.size()));

        // deal damage to other pokemon
        p.takeDamage(a.damage);

        // show dealt damage
        a.attackInfo();
    }

    // string representation of the pokemon
    public String toString() {
        Attack a = attacks.get(new Random().nextInt(attacks.size()));
        return String.format("%s (Level %d), %s-Pokemon\nExp: %d\nLeben: %d\nSchaden: %d\n", name, lvl, type.toString().toLowerCase(), exp, health, a.damage);
    }

    // take damage and substract it from the current health
    void takeDamage(int dmg) {
        health -= dmg;
    }
}
