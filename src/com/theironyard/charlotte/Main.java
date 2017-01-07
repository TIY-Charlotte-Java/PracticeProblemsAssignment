package com.theironyard.charlotte;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number between 0 - 100");
        String value  = scanner.nextLine();
        System.out.println(fizzBuzz(value));
        System.out.println(Arrays.toString(fibb(8)));
        System.out.println(boost(578));



        int[] a = new int[100];
        for (int i = 0; i < 100; ++i) {
            a[i] = i;
        }
        // fb.divisible(new int[]{a}, new int[]{3, 5});
    }
    public static String fizzBuzz (String val) {
        int passVal = parseInt(val);
        boolean is3 = false;
        boolean is5 = false;

        if (passVal >= 0 && passVal <= 100) {
            if (passVal % 3 == 0) {
                is3 = true;
            }
            if (passVal % 5 == 0) {
                is5 = true;
            }
            if (is3 == true && is5 == true) {
                return "FizzBuzz";
            }
            if (is3 == true && is5 == false) {
                return "Fizz";
            }
            if (is3 == false && is5 == true) {
                return  "Buzz";
            } return val;
        } else {
            return "Must be a number betweeen 0 and 100";
        }
    }
    public static int[] fibb(int input) {
        int[] array = new int[input];
        array[0] = 1;
        array[1] = 1;
        int i = 2;
        while (i < input) {
            array[i] = array[i-1] + array[i-2];
            i++;
        }
        return array;
    }
    public static int boost(int x) {
        int numbers = Integer.toString(x).length();
        int[] fin = new int[numbers];
        while (numbers > 0) {
            int temp;
            numbers--;
            temp = x % 10;
            if (temp == 9) {
                fin[numbers] = 0;
                x /= 10;
            } else {
                fin[numbers] = temp + 1;
                x /= 10;
            }
        }
        numbers--;
        return Integer.parseInt(Arrays.toString(fin).replaceAll("\\D+", ""));
    }
}
