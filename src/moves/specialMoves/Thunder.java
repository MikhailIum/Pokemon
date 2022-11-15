package ru.ifmo.pokemon.task.moves.specialMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public class Thunder extends SpecialMove {

    public Thunder(){
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected String describe(){
        return "бьет молнией";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        double rand = Math.random();
        if (rand <= 0.3)
            Effect.paralyze(p);
    }
}
