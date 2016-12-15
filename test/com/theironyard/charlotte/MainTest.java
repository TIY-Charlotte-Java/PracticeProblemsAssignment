package com.theironyard.charlotte;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ben on 12/13/16.
 */
public class MainTest {

    @Test
    public void boostWorks() throws Exception {
        assertEquals(53, Increment.boost(42));
        assertEquals(2990, Increment.boost(3001));
        assertEquals(0, Increment.boost(999999));
    }
}