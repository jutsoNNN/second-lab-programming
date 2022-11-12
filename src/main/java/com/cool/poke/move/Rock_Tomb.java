package com.cool.poke.move;

import ru.ifmo.se.pokemon.*;

public class Rock_Tomb extends PhysicalMove {
    public Rock_Tomb(){
        super(Type.ROCK,60,95);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.SPEED, -1);
    }
    protected String describe(){
        return "анёс урон и понизил скорость противника на 1 ступень";
    }
}