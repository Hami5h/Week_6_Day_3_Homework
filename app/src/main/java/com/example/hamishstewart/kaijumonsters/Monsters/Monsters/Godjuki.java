package com.example.hamishstewart.kaijumonsters.Monsters.Monsters;

/**
 * Created by hamishstewart on 01/11/2017.
 */

public class Godjuki extends Kaiju {

    public Godjuki(String name, int healthvalue, int attackValue) {
        super(name, healthvalue, attackValue);
    }

    public String roar(){
        return "I am Godjuki!!!!";
    }
}