package com.cool.poke.move;

import ru.ifmo.se.pokemon.*;

public class Drill_Peck extends PhysicalMove{
    public Drill_Peck(){
        super(Type.FLYING,80,100);
    }
    @Override
    protected String describe(){
        return "Нанёс урон противнику в размере 80ти единиц";
    }

}
