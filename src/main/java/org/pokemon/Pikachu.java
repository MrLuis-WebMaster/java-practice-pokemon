package org.pokemon;

public class Pikachu extends Pokemon implements IElectric {
    public Pikachu() {
    }

    public Pikachu(String name) {
        super(name);
    }

    @Override
    protected void attackArmor() {
        System.out.println("I'm "+ this.name +" and this my attack to armor");
    }

    @Override
    protected void attackScratch() {
        System.out.println("I'm "+ this.name +" and this my attack scratch");
    }

    @Override
    protected void attackBite() {
        System.out.println("I'm "+ this.name +" and this my attack bite");
    }

    @Override
    public void attackThunderImpact() {
        System.out.println("I'm "+ this.name +" and this my attack thunder impact");
    }

    @Override
    public void attackThunderFist() {
        System.out.println("I'm "+ this.name +" and this my attack thunder fist");
    }
}
