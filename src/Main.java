package ru.ifmo.pokemon.task;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();



        Cleffa cleffa = new Cleffa("John", 50);
        Clefairy clefairy = new Clefairy("Brian", 50);
        Clefable clefable = new Clefable("Sara", 50);
        Wimpod wimpod = new Wimpod("Alex", 50);
        Golispod golispod = new Golispod("Andrew", 50);
        Seviper seviper = new Seviper("Arnold", 50);

        b.addAlly(golispod);
        b.addAlly(wimpod);
        b.addAlly(clefairy);
        b.addFoe(clefable);
        b.addFoe(seviper);
        b.addFoe(cleffa);

        b.go();
    }
}
