package ru.ifmo.pokemon.task.moves.physicalMoves;

import ru.ifmo.se.pokemon.*;

public class Wake_up extends PhysicalMove {

    public Wake_up(){
        super(Type.FIGHTING, 70, 100);
    }

    @Override
    protected String describe(){
        return "даёт пощечину";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (p.getCondition() == Status.SLEEP){
            p.restore();
        }
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        double probability;
        if (def.getCondition() == Status.SLEEP)
            probability = 1;
        else
            probability = att.getStat(Stat.SPEED) / 512;
        double rand = Math.random();
        if (rand < probability)
            return 2;
        return 1;
    }

}
