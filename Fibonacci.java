package com.example.demo.chapter2;

public class Fibonacci {
    public int n, first, second;
    public Fibonacci(int n, int first, int second) {
        this.n = n;
        this.first = first;
        this.second = second;
    }

    public void printFibonacciSeries() {
        int i, fibo;
        System.out.println("\nDeret fibonacci yang terbentuk yaitu :");
        System.out.print(first + "  " + second);
        for (i = 2; i < n; ++i) {
            fibo = first + second;
            System.out.print("  " + fibo);
            first = second;
            second = fibo;
        }
        System.out.println();
    }
}