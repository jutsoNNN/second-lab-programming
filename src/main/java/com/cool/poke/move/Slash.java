package com.cool.poke.move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove {
    public Slash(){
        super(Type.NORMAL,70,100);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 1d/8d;
    }
}
