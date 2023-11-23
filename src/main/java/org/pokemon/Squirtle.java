package org.pokemon;

public class Squirtle extends Pokemon implements IWater {
    public Squirtle() {}

    public Squirtle(String name) {
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
    public void attackHydroPump() {
        System.out.println("I'm "+ this.name +" and this my attack hydro pump");
    }

    @Override
    public void attackBubble() {
        System.out.println("I'm "+ this.name +" and this my attack Bubble");
    }

    @Override
    public void attackPistolWater() {
        System.out.println("I'm "+ this.name +" and this my attack Pistol Water");
    }
}
