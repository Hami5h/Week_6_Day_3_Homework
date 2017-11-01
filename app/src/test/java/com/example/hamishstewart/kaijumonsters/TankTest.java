package com.example.hamishstewart.kaijumonsters;

import com.example.hamishstewart.kaijumonsters.Monsters.Vehicles.Tank;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by hamishstewart on 01/11/2017.
 */

public class TankTest {
    Tank tank;

    @Before
    public void before(){
        tank = new Tank("Sherman", 100);
    }

    @Test
    public void hasType() {
        assertEquals("Sherman", tank.getType());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, tank.getHealthValue());
    }

    @Test
    public void hasDamage() {
        tank.damage(10);
        assertEquals(90, tank.getHealthValue());
    }
}
