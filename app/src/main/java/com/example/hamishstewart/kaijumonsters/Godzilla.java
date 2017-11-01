package com.example.hamishstewart.kaijumonsters;

/**
 * Created by hamishstewart on 01/11/2017.
 */

public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthvalue, int attackValue) {
        super(name, healthvalue, attackValue);
    }

    public String roar(){
        return "I am Godzilla!!!!";
    }
}
