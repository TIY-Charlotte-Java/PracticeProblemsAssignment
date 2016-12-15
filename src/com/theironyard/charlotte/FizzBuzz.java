package com.theironyard.charlotte;

import java.util.ArrayList;

/**
 * Created by Ben on 12/13/16.
 */
public class FizzBuzz {
    public static Integer[] divisible(int[] values, int[] divis) {
        ArrayList<Integer> divisibles = new ArrayList<>();

        int leastCommonMultiple = 1;

        for (int d : divis) {
            leastCommonMultiple *= d;
        }

        for (int v : values) {
            if (v % leastCommonMultiple == 0) {
                divisibles.add(v);
            }
        }

        return divisibles.toArray(new Integer[0]);
    }

    public static boolean divisibleByAll(int[] values, int test) {
        for (int v : values) {
            if (test % v != 0) {
                return false;
            }
        }

        return true;
    }
}
