package ru.ifmo.pokemon.task.moves.specialMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Flamethrower extends SpecialMove {

    public Flamethrower(){
        super(Type.FIRE, 90, 100);
    }

    @Override
    protected String describe(){
        return "кидает фаербол";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        double rand = Math.random();
        if (rand <= 0.1){
            Effect.burn(p);
        }
    }
}
