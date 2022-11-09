package ru.ifmo.pokemon.task;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon {

    public Cleffa(String name, int level){
        super(name, level);
        setType(Type.FAIRY);
        setMove(new Flamethrower(), new Sing());

        int HP = 50;
        int attack = 25;
        int defence = 28;
        int special_attack = 45;
        int special_defence = 55;
        int speed = 15;
        super.setStats(HP, attack, defence, special_attack, special_defence, speed);

    }

}
