package org.pokemon;

public class Charmander extends Pokemon implements IFire {
    public Charmander() {
    }

    public Charmander(String name) {
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
    public void attackFireFist() {
        System.out.println("I'm "+ this.name +" and this my attack Fire Fist");
    }

    @Override
    public void attackFlameThrower() {
        System.out.println("I'm "+ this.name +" and this my attack Flame");

    }

    @Override
    public void attackAscuas() {
        System.out.println("I'm "+ this.name +" and this my attack Ascuas");

    }
}
