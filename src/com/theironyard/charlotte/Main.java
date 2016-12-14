package com.theironyard.charlotte;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //FizzBuzz
        int fizzBuzzRange = 100;
        FizzBuzz(fizzBuzzRange);

        //Fibonacci Sequence
        int fibonacciRange = 93;
        System.out.println(Arrays.toString(FibonacciSequence(fibonacciRange)));

        //Boost
        int n = 343429;
        System.out.println(Boost(n));


    }

    static void FizzBuzz(int f) {
        for (int i = 1; i < f; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("FizzBuzz\n");
                continue;
            } else if (i % 3 == 0) {
                System.out.printf("Fizz\n");
                continue;
            } else if (i % 5 == 0) {
                System.out.printf("Buzz\n");
            } else {
                System.out.println(i);
            }

        }
    }

    static int[] FibonacciSequence(int n) {
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sequence[i] = 1;
            } else if (i == 1) {
                sequence[i] = 1;
            } else if (i >= 2) {
                sequence[i] = (sequence[i - 1] + (sequence[i - 2]));
            }
        }
        return sequence;
    }

    static int Boost(int n) {
        Integer nDigits = String.valueOf(n).length();
        Integer[] digit = new Integer[nDigits];
        String number = "";

        for (int i = 0; i < nDigits; i++) {
            digit[nDigits - 1 - i] = n % 10;
            n = n / 10;

            if (digit[nDigits - 1 - i] == 9) {
                digit[nDigits - 1 - i] = 0;
            } else {
                digit[nDigits - 1 - i] = digit[nDigits - 1 - i] + 1;
            }
        }
        for (int i : digit) {
            number += i;
        }
        return Integer.valueOf(number);
    }

}
