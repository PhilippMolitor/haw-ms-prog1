package io.philslab.prog1.vorlesung_11;

public class Freund {
    public String name;

    public Freund(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.format("Hallo, mein Name ist %s!\n", name);
    }
}
