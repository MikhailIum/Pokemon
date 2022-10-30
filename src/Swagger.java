package ru.ifmo.pokemon.task;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected String describe(){
        return "начал вилять хвостом";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }

}
