package com.theironyard.charlotte;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();


        int[] a = new int[100];
        for (int i = 0; i < 100; ++i) {
            a[i] = i;
        }
        // fb.divisible(new int[]{a}, new int[]{3, 5});
    }
    public static void fibb() {
        Fibonacci f = new Fibonacci();
        f.fibbonaci(25);
    }
}
