package com.cool.poke;

import com.cool.poke.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Zapdos("Биба", 1337);
        Pokemon p2 = new Rufflet("Боба", 5836);
        Pokemon p3 = new Braviary("Олег", 1344);
        Pokemon p4 = new Bounsweet("Альберт", 584);
        Pokemon p5 = new Steenee("Пупырка", 228);
        Pokemon p6 = new Tsareena("Никита Алексеевич", 1448);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
