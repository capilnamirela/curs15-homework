package org.fasttrackit.recursivity;

import java.util.HashMap;
import java.util.Map;

public class MainRecursivity {

    public static Map<Integer, Integer> fibonacciMap = new HashMap<>();
    public static int nrFibonacci = 0;
    public static int nrFibonacciMap = 0;


    public static void main(String[] args) {

        System.out.println(sumOfFirstNIntegerNumbers(5));
        System.out.println(sumOfFirstNEvenNumbers(8));
        System.out.println(sumOfDigitsForANumber(123458));
        System.out.println(fibonacci(8));
        System.out.println(nrFibonacci);
        System.out.println(fibonacciMapMethod(8));
        System.out.println(nrFibonacciMap);

    }

    public static int sumOfFirstNIntegerNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfFirstNIntegerNumbers(n - 1);
    }

    public static int sumOfFirstNEvenNumbers(int n) {

        if (n == 0) {
            return 0;
        }
        return n * 2 + sumOfFirstNEvenNumbers(n - 1);
    }

    public static int sumOfDigitsForANumber(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return n % 10 + sumOfDigitsForANumber(n / 10);
    }

    public static int fibonacci(int n) {
        nrFibonacci++;
        if (n == 1 || n == 0) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciMapMethod(int n) {
        nrFibonacciMap++;
        if (n == 1 || n == 0) {
            return 1;
        }
        if (fibonacciMap.containsKey(n)) {
            return fibonacciMap.get(n);
        }
        fibonacciMap.put(n, fibonacciMapMethod(n - 1) + fibonacciMapMethod(n - 2));
        return fibonacciMapMethod(n - 1) + fibonacciMapMethod(n - 2);
    }


}
