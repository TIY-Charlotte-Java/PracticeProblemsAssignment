package com.theironyard.charlotte;

//import java.util.Arrays;
//import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int max = 100;

        FizzBuzz(max);
    }

    static void FizzBuzz(int f) {
        for (int i = 1; i < f; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("Fizz & Buzz\n");

                continue;

            } else if (i % 3 == 0) {

                System.out.print(" Just Fizz\n");

                continue;

            } else if (i % 5 == 0) {

                System.out.print("Just Buzz\n");

            } else {

                System.out.println(i);
            }
        }
    }

   /* public static int fiboSeq(int number) {
        System.out.println("How many places of the Fibonacci series would you like to print?");
        int number = new Scanner(System.in).nextInt();

        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci;
        System.out.println("Fibonacci number at location " + number + " is" + (fiboSeq(number)));
        }
*/

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

