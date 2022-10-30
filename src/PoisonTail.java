package ru.ifmo.pokemon.task;

import ru.ifmo.se.pokemon.*;

public class PoisonTail extends PhysicalMove {

    public PoisonTail(){
        super(Type.POISON, 50, 100);
    }

    @Override
    protected String describe(){
        return "ударил ядовитым хвостиком";
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        double probability = 3 * att.getStat(Stat.SPEED) / 512;
        double rand = Math.random();
        if (rand < probability)
            return 2;
        return 1;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        double rand = Math.random();
        if (rand <= 0.1){
            Effect.poison(p);
        }
    }

}
