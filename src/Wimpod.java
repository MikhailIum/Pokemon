package ru.ifmo.pokemon.task;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wimpod extends Pokemon {

    public Wimpod(String name, int level){
        super(name, level);
        super.setType(Type.BUG, Type.WATER);

        setMove(new Facade(), new Waterfall(), new Double_team());

        int HP = 25;
        int attack = 35;
        int defence = 40;
        int special_attack = 20;
        int special_defence = 30;
        int speed = 80;
        super.setStats(HP, attack, defence, special_attack, special_defence, speed);
    }
}
