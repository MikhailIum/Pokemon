package ru.ifmo.pokemon.task.moves.statusMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Sing extends StatusMove {

    public Sing(){
        super(Type.NORMAL, 0, 55);
    }

    @Override
    protected String describe(){
        return "усыпляет оппонента";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.sleep(p);
    }


}
