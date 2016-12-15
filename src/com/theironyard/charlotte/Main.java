package com.theironyard.charlotte;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int max = 100;

        FizzBuzz(max);

        Fibonacci();

        Boost(23);

    }

    public static void FizzBuzz(int f) {
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

    public static void Fibonacci() {
        System.out.println("How many places of the Fibonacci series would you like to print?");
        Scanner s = new Scanner(System.in);
        int fibPlace = s.nextInt();

        int[] fibSeq = new int[fibPlace];
        fibSeq[0] = 0;
        fibSeq[1] = 1;
        for (int i = 2; i < fibPlace; i++) {
            fibSeq[i] = fibSeq[i - 1] + fibSeq[i - 2];
        }

        for (int i = 0; i < fibPlace; i++) {
            System.out.print(fibSeq[i] + " \n");
        }
    }

    static int Boost(int n) {
        Integer digitPlaces = String.valueOf(n).length();
        Integer[] digit = new Integer[digitPlaces];
        String number = "";

        for (int i = 0; i < digitPlaces; i++) {
            digit[digitPlaces - 1 - i] = n % 10;
            n = n / 10;

            if (digit[digitPlaces - 1 - i] == 9) {

                digit[digitPlaces - 1 - i] = 0;

            } else {
                digit[digitPlaces - 1 - i] = digit[digitPlaces - 1 - i] + 1;

            }
        }
        for (int i : digit) {
            number += i;

        }
        System.out.println(Integer.valueOf(number));
        return Integer.valueOf(number);
    }
}

