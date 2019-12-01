package io.philslab.prog1.vorlesung_10.Pokemon;

import io.philslab.prog1.vorlesung_10.Trainer.Trainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Pokemon {
    // ENUMS
    public enum pokemonType {FIRE, WATER, PLANT, NORMAL}

    // ATTRIBUTES
    private String name;
    private int lvl;
    private int exp;
    public pokemonType type;
    private int health;
    private List<Attack> attacks = new ArrayList<Attack>();
    public Trainer myTrainer;

    // CONSTRUCTORS
    protected Pokemon(String _name, pokemonType _type, int _health) {
        name = _name;
        lvl = 1;
        exp = 0;
        type = _type;
        health = _health;
        // default Attack for all Pokemon
        attacks.add(new Attack("tackle", 2));
    }

    // METHODS
    public void fight(Pokemon enemy) {
        // check if both Pokemon can fight
        if (health > 0 && enemy.getHealth() > 0) {
            Attack atk;
            if (attacks.size() > 1) {
                // when there are more then attacks => choose one by random
                Random rd = new Random();
                atk = attacks.get(rd.nextInt(attacks.size()));
            } else {
                // just one attack? => take it
                atk = attacks.get(0);
            }

            System.out.printf("\t%s(%d) attacks %s(%d) with ",
                    name, health, enemy.name, enemy.health);

            // deal damage to the enemys-pokemon
            atk.doDamage(enemy);

            // enemy defeated? => earn exp/lvl
            if (enemy.getHealth() <= 0) {
                addExp(enemy.lvl);
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    protected void takeDamage(int dmg) {
        health -= dmg;
    }

    public String toString() {
        return "Pokemon: " + name + " lvl:" + lvl + " type:" + type + " health:" + health + " damage:" + attacks.get(0).damage;
    }

    // ===== AUFGABE 9.1 =========================================
    public int getLevel() {
        return lvl;
    }

    public int getExp() {
        return exp;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void checkLevelUp() {
        if (exp >= lvl) {
            lvl++;
            health = lvl * 10;
            exp = 0;
            System.out.println("\tLEVEL-UP!: " + name + " is now Level: " + lvl + "\n");
        }
    }

    public void addExp(int value) {
        value = Math.abs(value);
        exp += value;
        System.out.println("\n\t" + name + " earned " + value + " exp" + "\n");
        // every time a pokemon gains exp, check if it leveled up
        checkLevelUp();
    }

    public void addAttack(Attack atk) {
        for (Attack a : attacks) {
            if (a.name.equals(atk.name)) {
                System.out.println(
                        "Adding attack (" + atk.name +
                                ") failed. Pokemon already has an attack with this name.");
                return;
            }
        }

        attacks.add(atk);
    }
    // ===== AUFGABE 9.1 ENDE ====================================

    // INNER CLASSES
    public class Attack {
        private String name;
        private int damage;
        pokemonType type = pokemonType.NORMAL;
        protected List<pokemonType> effectiveAgainst = new ArrayList<>();
        protected List<pokemonType> ineffectiveAgainst = new ArrayList<>();

        private Attack(String n, int d) {
            name = n;
            damage = Math.abs(d);
        }

        public void doDamage(Pokemon p) {
            String bonusText = "";

            // calculate efficiency and damage the enemy pokemon
            if (effectiveAgainst.contains(p.type)) {
                // effective
                p.takeDamage(damage + 2);
                bonusText = "is very effective!";
            } else if (ineffectiveAgainst.contains(p.type)) {
                // ineffective
                p.takeDamage(damage - 2);
                bonusText = "is not very effective...";
            } else {
                // neutral
                p.takeDamage(damage);
            }

            // output bonus info
            System.out.println(name + " (" + damage + " " + type + " damage) " + bonusText);
        }

        public void attackInfo() {
            System.out.println(name + " (" + damage + " " + type + " damage)");
        }
    }

    public class Attack_Plant extends Attack {
        Attack_Plant(String name, int dmg) {
            super(name, dmg);

            type = pokemonType.PLANT;

            effectiveAgainst.add(pokemonType.WATER);
            ineffectiveAgainst.add(pokemonType.PLANT);
            ineffectiveAgainst.add(pokemonType.FIRE);
        }
    }

    public class Attack_Water extends Attack {
        Attack_Water(String name, int dmg) {
            super(name, dmg);

            type = pokemonType.WATER;

            effectiveAgainst.add(pokemonType.FIRE);
            ineffectiveAgainst.add(pokemonType.PLANT);
            ineffectiveAgainst.add(pokemonType.WATER);
        }
    }

    public class Attack_Fire extends Attack {
        Attack_Fire(String name, int dmg) {
            super(name, dmg);

            type = pokemonType.FIRE;

            effectiveAgainst.add(pokemonType.PLANT);
            ineffectiveAgainst.add(pokemonType.FIRE);
            ineffectiveAgainst.add(pokemonType.WATER);
        }
    }

    public void speak() {
        System.out.println("Pokemon");
    }
}
