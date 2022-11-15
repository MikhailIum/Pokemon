package ru.ifmo.pokemon.task.moves.physicalMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Liquidation extends PhysicalMove {

    public Liquidation(){
        super(Type.WATER, 85, 100);
    }

    @Override
    protected String describe(){
        return "ликвидировал соперника";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        double rand = Math.random();
        if (rand <= 0.2)
            p.setMod(Stat.DEFENSE, -1);

    }
}
