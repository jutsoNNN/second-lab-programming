package com.cool.poke.move;

import ru.ifmo.se.pokemon.*;

public class Dazzling_Gleam extends SpecialMove {
    public Dazzling_Gleam(){
        super(Type.FAIRY,80,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if(Math.random() <= 0.7){
            Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, +1);
        }
    }
    @Override
    protected String describe(){
        return "Нанёс урон всем противникам";
    }
}
