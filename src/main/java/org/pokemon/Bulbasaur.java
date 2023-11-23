package org.pokemon;

public class Bulbasaur extends Pokemon implements IPlant {

    public Bulbasaur() {
    }
    public Bulbasaur(String name) {
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
    public void attackDrain() {
        System.out.println("I'm "+ this.name +" and this my attack Drain");
    }

    @Override
    public void attackParalyze() {
        System.out.println("I'm "+ this.name +" and this my attack Paralyze");
    }
}
