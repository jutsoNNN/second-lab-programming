package com.cool.poke.move;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Charge_Beam extends SpecialMove {
    public Charge_Beam(){
        super(Type.ELECTRIC,50,90);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if(Math.random() <= 0.7){
            Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, +1);
        }
    }
    @Override
    protected String describe(){
        return "Увеличил свою специальную атаку на 1";
    }
}
