package com.theironyard.charlotte;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        fizzBuzz();
        System.out.println(Arrays.toString(fibSeq(9)));
        System.out.println(boost(345));
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(String.valueOf(i));
            }
    }

    public static int[] fibSeq(int x) {
        int[] fib = new int[x];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < x; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int boost(Integer x) {

        String valueX = Integer.toString(x);

        Integer[] digitsX = new Integer[valueX.length()];
        for (Integer i = (valueX.length() - 1); i >= 0; i--) {
            digitsX[i] = x % 10;
            x = x / 10;
            if (i == 9) {
                digitsX[i] = 0;
            } else {
                digitsX[i] += 1;
            }
        }
        valueX = "";
        for (int n : digitsX) {
            valueX = valueX + n;
        }
        return Integer.valueOf(valueX);
    }
}




