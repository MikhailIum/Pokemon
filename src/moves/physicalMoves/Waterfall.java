package ru.ifmo.pokemon.task.moves.physicalMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {

    public Waterfall(){
        super(Type.WATER, 80, 100);
    }

    @Override
    protected String describe(){
        return "заливает водой";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        double rand = Math.random();
        if (rand <= 0.2)
            Effect.flinch(p);
    }
}
