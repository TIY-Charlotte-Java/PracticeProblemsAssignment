package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Ben on 12/15/16.
 */
public class Increment {
    public static int boost(int input) {
        ArrayList<String> ints = new ArrayList<>();
        while (input > 0) {
            int lastDigit = input % 10;

            ints.add(Integer.toString((lastDigit+ 1) % 10));

            input /= 10;
        }
//        Collections.reverse(ints);
        StringBuilder sb = new StringBuilder();

        for (int i = ints.size() -1; i >= 0; i--) {
            sb.append(ints.get(i));
        }
        return Integer.valueOf(sb.toString());
    }
}
