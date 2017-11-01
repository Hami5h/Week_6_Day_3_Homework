package com.example.hamishstewart.kaijumonsters.Monsters.Monsters;

import com.example.hamishstewart.kaijumonsters.Monsters.Behaviours.Movable;
import com.example.hamishstewart.kaijumonsters.Monsters.Behaviours.Flyable;

/**
 * Created by hamishstewart on 01/11/2017.
 */

public class Godzilla extends Kaiju implements Movable, Flyable {

    public Godzilla(String name, int healthvalue, int attackValue) {
        super(name, healthvalue, attackValue);
    }

    public String roar(){
        return "I am Godzilla!!!!";
    }

    public String move() {
        return "I am going to China!!";
    }

    @Override
    public String fly() {
        return "I am flying to the Moon!";
    }
}
