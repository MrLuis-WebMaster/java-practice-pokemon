package org.pokemon;

public abstract class Pokemon {
    protected int numPokedex;
    protected String name;
    protected double weight;
    protected String gender;
    protected int season;

    public Pokemon() {

    }

    public Pokemon(String name) {
        this.name = name;
    }

    protected abstract void attackArmor();
    protected abstract void attackScratch();
    protected abstract void attackBite();


}
