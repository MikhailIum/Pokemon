package ru.ifmo.pokemon.task;

import ru.ifmo.se.pokemon.*;

class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected String describe() {
        return "устал и прилёг отдохнуть";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(e);
        p.setMod(Stat.HP, +6);
    }
}
