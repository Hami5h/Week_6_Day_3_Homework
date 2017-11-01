package com.example.hamishstewart.kaijumonsters.Monsters.Monsters;

import com.example.hamishstewart.kaijumonsters.Monsters.Vehicles.Vehicle;

/**
 * Created by hamishstewart on 01/11/2017.
 */

public abstract class Kaiju {
    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    abstract String roar();

    public String getName(){
        return this.name;
    }

    public int gethealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public void attack(Vehicle vehicle ) {
        vehicle.damage(this.attackValue);
    }
}
