package com.cool.poke.move;

import ru.ifmo.se.pokemon.*;

public class Zap_Cannon extends SpecialMove {
    public Zap_Cannon() {
        super(Type.ELECTRIC, 120, 50);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
        if (Math.random() == 0.25) {
            Effect e = new Effect().stat(Stat.ATTACK, 0);
            System.out.println("Противник не может атаковать");
        }
    }
    @Override
    protected String describe(){
        return "Нанёс урон и парализовал противника";
    }
}