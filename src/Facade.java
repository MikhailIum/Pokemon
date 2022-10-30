package ru.ifmo.pokemon.task;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe(){
        return "в ярости наносит урон";
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        double probability;
        if (att.getCondition() == Status.POISON || att.getCondition() == Status.BURN || att.getCondition() == Status.PARALYZE)
            probability = 1;
        else
            probability = att.getStat(Stat.SPEED) / 512;
        double rand = Math.random();
        if (rand < probability)
            return 2;
        return 1;
    }
}
