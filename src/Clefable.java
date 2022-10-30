package ru.ifmo.pokemon.task;

import ru.ifmo.se.pokemon.Type;

public class Clefable extends Clefairy{
    public Clefable(String name, int level) {
        super(name, level);

        addMove(new Thunder());

        int HP = 95;
        int attack = 70;
        int defence = 73;
        int special_attack = 95;
        int special_defence = 90;
        int speed = 60;
        super.setStats(HP, attack, defence, special_attack, special_defence, speed);
    }
}
