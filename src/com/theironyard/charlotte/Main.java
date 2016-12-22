package com.theironyard.charlotte;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        fizzBuzz();
        System.out.println("****************");
        System.out.println(Arrays.toString(fibSeq(15)));
        System.out.println("****************");
        System.out.println(boost(123));
    }

    //For each number 1-100 inclusive, print out a value based off the current number.
    //If the value is evenly divisible by 3, print "Fizz"
    public static void fizzBuzz() {

        for (Integer i = 1; i <= 100; i++) {
            //If the value is evenly divisible by both 3 and 5, print "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            //If the value is evenly divisible by 3, print "Fizz"
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            //If the value is evenly divisible by 5, print "Buzz"
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            //Otherwise, print the number
            else {
                System.out.println(i);
            }
        }
    }

    public static int[] fibSeq(int x) {

        int[] fib = new int[x];

        for (int i = 0; i < x; i++) {
            if (i == 0) {
                fib[i] = 1;
            } else if (i == 1) {
                fib[i] = 1;
            } else if (i >= 2) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib;
    }

    public static int boost(int input) {
        String n = Integer.toString(input);
        int[] digit = new int[n.length()];

        for(int i = (n.length()-1); i >= 0; i--){
            digit[i] = input % 10;
            input = input / 10;

            if (digit[i] == 9) {
                digit[i] = 0;
            } else {
                digit[i] += 1;
            }
        }
        n = "";
        for (Integer number : digit) {
            n = n + number;
        }
            return Integer.valueOf(n);
    }
}


// The Fibonacci sequence is a pretty sweet numerical sequence that is defined as:
// fib(n) = fib(n-1) + fib(n-2)
//...and fib(0) and fib(1) are both defined as 1. So the Fibonacci sequence starting
//from the beginning looks like [1, 1, 2, 3, 5, 8, 13,...].
//Write the fibseq(x) function that returns the first X elements of the Fibonacci sequence.

//Problem 3 Increment All The Things
//
//Write a function called boost() that accepts a number as a parameter and increments
//all of the digits of the number individually. If the digit is 0-8, it should be incremented,
//but if its 9 then it should be reset to 0.
//
//The function should return a number.
//
//boost(129);   // 230
//boost(49);    // 50
//boost(412);   // 523
//Write all of these as static methods in the Main class,and demonstrate
//their functionality by calling them from the main method.