package com.example.hamishstewart.kaijumonsters.Monsters.Monsters;

import com.example.hamishstewart.kaijumonsters.Monsters.Behaviours.Flyable;
import com.example.hamishstewart.kaijumonsters.Monsters.Behaviours.Movable;

/**
 * Created by hamishstewart on 01/11/2017.
 */

public class Godjuki extends Kaiju implements Movable, Flyable {

    public Godjuki(String name, int healthvalue, int attackValue) {
        super(name, healthvalue, attackValue);
    }

    public String roar() {
        return "I am Godjuki!!!!";
    }

    public String move() {
        return "I am going to the pub!";
    }

    @Override
    public String fly() {
        return "I am flying to Edinburgh!!";
    }
}