package com.cool.poke.move;

import ru.ifmo.se.pokemon.*;

public class Play_Nice extends StatusMove{
    public Play_Nice(){
        super(Type.NORMAL,0,0);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.ATTACK, -1);
    }
    protected String describe(){
        return "Снизил атаку противника на 1 ступень";
    }
}