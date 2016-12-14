package com.theironyard.charlotte;

import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // write your code here
        /*for (int i = 0; i < 1; i++) {
            System.out.println(fizzBuzz(i));
        }

        //*/

        //fizzBuzz();
        //fibonacciSequence(10);
        //System.out.println("----------------------");
        boost(4256);


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


    /*public static String fizzBuzz(int i) {
        //If the value is evenly divisible by 3, print "Fizz"
        //If the value is evenly divisible by 5, print "Buzz"
        //If the value is evenly divisible by both 3 and 5, print "fizzBuzz"
        // Otherwise, print the number
        for (i = 1; i <= 100; i++) {

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
        return fizzBuzz(i);

    }*/

    public static int[] fibonacciSequence(int x) {

        // given a specific number print out the sequence for the fibonacci
        //fib(n) = fib(n-1) + fib(n-2)

        int[] fib = new int[x];
        fib[0] = 0;
        fib[1] = 1;

        for (int a = 2; a < x; a++) {
            fib[a] = fib[a - 1] + fib[a - 2];
            System.out.print(" " + fib[a]);


        }


        return fib;

    }

    public static int[] boost(int a) {

        // take the number from the user
        //use the integer.toString to convert the into to string
        // take the string and get the character at each point and store it into array
        //convert the character into int
        // check if the int is between 1-8 then add 1 or if its 9 change to 0
        //put the indiviudal int together and print it out

        String passedA = Integer.toString(a);
        System.out.println(passedA);
        int[] number = new int[passedA.length()];
        //System.out.println(number[1]);

        for (int i = 0; i < passedA.length() ; i++) {

            number[i] = a % 10;
            a = a / 10;


            if (number[i] == 9) {
                number[i] = 0;
            } else {
                number[i] += 1;
            }

            System.out.print(number[i]);

        }


        return number;
    }


}


