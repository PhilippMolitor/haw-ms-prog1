package io.philslab.prog1.vorlesung_10;


import io.philslab.prog1.vorlesung_10.Pokemon.Bisaknosp;
import io.philslab.prog1.vorlesung_10.Pokemon.Bisasam;
import io.philslab.prog1.vorlesung_10.Pokemon.Glumanda;
import io.philslab.prog1.vorlesung_10.Pokemon.Schiggy;
import io.philslab.prog1.vorlesung_10.Trainer.Trainer;

public class Pr0gramm {

    public static void main(String[] args) {
        Bisasam p1 = new Bisasam();
        Bisaknosp p2 = new Bisaknosp();
        Schiggy p3 = new Schiggy();
        Glumanda p4 = new Glumanda();

        Trainer t1 = new Trainer("Ashe", p1);
        t1.addPokemon(p2);

        Trainer t2 = new Trainer("Rocket", p3);
        t2.addPokemon(p4);

        trainerFight(t1, t2);
    }


    static void trainerFight(Trainer t1, Trainer t2) {
        System.out.println("\n_______________________________________");
        System.out.println("  FIGHT!: " + t1.name + " vs. " + t2.name + "\n");
        t1.callPokemon();
        t2.callPokemon();

        Trainer activeTrainer = t1;
        Trainer inactiveTrainer = t2;
        int i = 1;

        while (t1.activePokemon.getHealth() > 0 &&
                t2.activePokemon.getHealth() > 0) {
            System.out.println("\nRound " + i++ + "\n\t" + activeTrainer.name + "'s turn.");
            activeTrainer.activePokemon.fight(inactiveTrainer.activePokemon);

            if (inactiveTrainer.activePokemon.getHealth() <= 0) {
                inactiveTrainer.callPokemon();
            }

            // switch active state
            Trainer tmp = activeTrainer;
            activeTrainer = inactiveTrainer;
            inactiveTrainer = tmp;
        }
    }
}
