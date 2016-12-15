package com.theironyard.charlotte;

/**
 * Created by Ben on 12/14/16.
 */
public class Fibonacci {
    double fibbonaci(int n){
        Double fin;
        double prev=0d, next=1d, result=0d;
        for (int i = 0; i < n; i++) {
            result=prev+next;
            prev=next;
            next=result;
            //System.out.println("The result is: " + result);
        }
        System.out.println("The result is: " + result);
        return result;
    }
}
