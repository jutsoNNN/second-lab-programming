package com.cool.poke.move;

import ru.ifmo.se.pokemon.*;

public class Trop_Kick extends PhysicalMove {
    public Trop_Kick(){
        super(Type.GRASS,70,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.ATTACK, -1);
    }
    @Override
    protected String describe(){
        return "Нанёс противнику урон и понизил его атаку на одну ступень";
    }
}

