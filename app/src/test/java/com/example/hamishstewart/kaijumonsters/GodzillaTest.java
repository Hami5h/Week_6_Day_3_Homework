package com.example.hamishstewart.kaijumonsters;

import com.example.hamishstewart.kaijumonsters.Monsters.Monsters.Godzilla;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by hamishstewart on 01/11/2017.
 */

public class GodzillaTest {
    Godzilla godzilla;

    @Before
    public void before(){
        godzilla = new Godzilla("Chris", 90, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Chris", godzilla.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(90, godzilla.gethealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(100, godzilla.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("I am Godzilla!!!!", godzilla.roar());
    }

}
