package ru.ifmo.pokemon.task.pokemons;

import ru.ifmo.se.pokemon.Type;

public class Clefairy extends Cleffa{

    public Clefairy(String name, int level) {
        super(name, level);

        addMove(new Wake_up());

        int HP = 70;
        int attack = 45;
        int defence = 48;
        int special_attack = 60;
        int special_defence = 65;
        int speed = 35;
        super.setStats(HP, attack, defence, special_attack, special_defence, speed);
    }
}
