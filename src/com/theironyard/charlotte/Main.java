package com.theironyard.charlotte;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*for (int i = 0; i < 1; i++) {
            System.out.println(fizzBuzz(i));
        }

        //*/

        fizzBuzz();
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
    }
}