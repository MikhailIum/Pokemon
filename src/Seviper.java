package ru.ifmo.pokemon.task;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Seviper extends Pokemon {
    public Seviper(String name, int level){
        super(name, level);
        super.addType(Type.POISON);

        setMove(new PoisonTail(), new Swagger(), new Rest(), new DarkPulse());


        int HP = 73;
        int attack = 100;
        int defence = 60;
        int special_attack = 100;
        int special_defence = 60;
        int speed = 65;
        super.setStats(HP, attack, defence, special_attack, special_defence, speed);
    }
}
