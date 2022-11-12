package com.cool.poke.move;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC,90,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() <= 0.10){
            Effect.paralyze(p); ;
        }
    }
    @Override
    protected String describe(){
        return "Нанёс урон и парализовал противника";
    }
}
