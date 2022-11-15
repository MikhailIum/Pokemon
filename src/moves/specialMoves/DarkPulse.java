package ru.ifmo.pokemon.task.moves.specialMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DarkPulse extends SpecialMove {

    public DarkPulse(){
        super(Type.DARK, 80, 100);
    }

    @Override
    protected String describe() {
        return "запугивает оппонента";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        double rand = Math.random();
        if (rand <= 0.2){
            Effect.flinch(p);
        }
    }
}
