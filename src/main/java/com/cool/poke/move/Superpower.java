package com.cool.poke.move;

import ru.ifmo.se.pokemon.*;

public class Superpower extends PhysicalMove {
    public Superpower(){
        super(Type.FIGHTING,120,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.DEFENSE, -1).stat(Stat.ATTACK, -1);
    }
    @Override
    protected String describe(){
        return "Нанёс урон, но у него уменьшились защита и атака на 1 ступень";
    }
}
