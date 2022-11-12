package com.cool.poke.pokemons;

import com.cool.poke.move.Trop_Kick;
import ru.ifmo.se.pokemon.Type;

public class Tsareena extends Steenee{
    public Tsareena(String name, int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(72,120,98,50,98,72);
        setLevel(level);
        setMove(new Trop_Kick());
    }
}
