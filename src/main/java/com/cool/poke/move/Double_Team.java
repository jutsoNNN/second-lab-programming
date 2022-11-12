package com.cool.poke.move;

import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {
    public Double_Team(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.EVASION, +1);
    }
    @Override
    protected String describe(){
        return "Повысил своё уклонение на 1 ступень";
    }
}
