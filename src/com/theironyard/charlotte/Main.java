package com.theironyard.charlotte;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number between 0 - 100 and be amazed!");
        String input = scanner.nextLine();
        System.out.println(fizzBuzz(input));
        System.out.println(Arrays.toString(fibSeq(6)));
        System.out.println(boost(359));
    }

    public static String fizzBuzz(String value) {
        int passValue = parseInt(value);
        boolean flag3 = false;
        boolean flag5 = false;
        if (passValue >= 0 && passValue <= 100) {
            // if value is divisible by 3 evenly print FIZZ
            if (passValue % 3 == 0) {
                flag3 = true;
            }
            // if value is divisible by 5 evenly print BUZZ
            if (passValue % 5 == 0) {
                flag5 = true;
            }
            // if value is divisible by both print FIZZBUZZ
            if (flag3 == true && flag5 == true) {
                return "FizzBuzz";
            }
            if (flag3 == true && flag5 == false) {
                return "Fizz";
            }
            if (flag3 == false && flag5 == true) {
                return "Buzz";
            }
            // if value is neither print the number
            return value;
        } else {
            return "Incorrect input";
        }
    }

    public static int[] fibSeq(int length) {
        int[] freshArray = new int[length];
        freshArray[0] = 1;
        freshArray[1] = 1;
        int i = 2;
        while (i < length) {
            freshArray[i] = freshArray[(i - 1)] + freshArray[(i - 2)];
            i++;
        }

        return freshArray;
    }

    public static int boost(int n) {
        int digitCount = Integer.toString(n).length();
        int[] result = new int[digitCount];
        while (digitCount > 0) {
            int temp;
            digitCount--;
            temp = n % 10;
            if (temp == 9) {
                result[digitCount] = 0;
                n /= 10;
            } else {
                result[digitCount] = (temp + 1);
                n /= 10;
            }
        }
        digitCount--;
        return Integer.parseInt(Arrays.toString(result).replaceAll("\\D+", ""));

    }
}
