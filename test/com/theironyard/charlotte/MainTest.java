package com.theironyard.charlotte;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ben on 12/13/16.
 */
public class MainTest {

    @Test
    public void boostWorks() throws Exception {
        assertEquals(678, Main.boost(567));
    }

    @Test
    public void fizzBuzzWorks() throws Exception {
        assertEquals("FizzBuzz", Main.fizzBuzz("15"));
        assertEquals("Fizz", Main.fizzBuzz("9"));
        assertEquals("Buzz", Main.fizzBuzz("20"));
    }

    @Test
    public void fibWorks() throws Exception {
        assertEquals(21, Main.fibb(8));
    }
}