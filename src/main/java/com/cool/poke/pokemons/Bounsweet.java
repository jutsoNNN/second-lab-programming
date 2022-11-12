package com.cool.poke.pokemons;

import com.cool.poke.move.Dazzling_Gleam;
import com.cool.poke.move.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon{
    public Bounsweet(String name, int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(42,30,38,30,38,32);
        setLevel(level);
        setMove(new Swagger(), new Dazzling_Gleam());
    }
}
