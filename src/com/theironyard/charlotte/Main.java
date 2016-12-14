package com.theironyard.charlotte;

import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        fizzBuzz();
        fibonacciSequence(6);
        System.out.println("----------------------");
        boost(569);

        //System.out.println(Arrays.toString(boost(567)));

        //int[] boostNumer = boost(4256);
        //System.out.println(Arrays.toString(boostNumer));


    }

    public static void fizzBuzz() {
        //If the value is evenly divisible by 3, print "Fizz"
        //If the value is evenly divisible by 5, print "Buzz"
        //If the value is evenly divisible by both 3 and 5, print "fizzBuzz"
        // Otherwise, print the number
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println(i);
            }

        }
    }


    public static int[] fibonacciSequence(int x) {

        int[] fib = new int[x];
        fib[0] = 0;
        fib[1] = 1;

        for (int a = 2; a < x; a++) {
            fib[a] = fib[a - 1] + fib[a - 2];
        }

        System.out.println(Arrays.toString(fib));
        return fib;

    }

    public static int[] boost(int a) {

        // take the number from the user
        //use the integer.toString to convert the into to string
        //convert the character into int
        // check if the int is between 1-8 then add 1 or if its 9 change to 0
        //put the indiviudal int together and print it out

        String passedA = Integer.toString(a);
        System.out.println("number that is passed " + passedA);
        int[] number = new int[passedA.length()];


        for (int i = (passedA.length() - 1); i >= 0; i--) {

            number[i] = a % 10;
            a = a / 10;


            if (number[i] == 9) {
                number[i] = 0;
            } else {
                number[i] += 1;
            }
        }

        for (int built : number)

            System.out.print(built);


        return number;

    }

}

