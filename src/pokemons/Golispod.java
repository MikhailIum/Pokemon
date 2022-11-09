package ru.ifmo.pokemon.task;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Golispod extends Wimpod {

    public Golispod(String name, int level){
        super(name, level);

        addMove(new Liquidation());

        int HP = 75;
        int attack = 125;
        int defence = 140;
        int special_attack = 60;
        int special_defence = 90;
        int speed = 40;
        super.setStats(HP, attack, defence, special_attack, special_defence, speed);
    }
}
