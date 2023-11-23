package org.pokemon;

public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu("Pikachu");
        Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur");
        Squirtle squirtle = new Squirtle("Squirtle");
        Charmander charmander = new Charmander("Squirtle");

        pikachu.attackArmor();
        pikachu.attackThunderFist();
        squirtle.attackArmor();
        bulbasaur.attackParalyze();
        charmander.attackFlameThrower();


    }
}