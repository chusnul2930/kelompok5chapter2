package com.example.demo.chapter2;

import java.util.Scanner;

public class Kel5Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret fibonacci : ");
        int n = scan.nextInt();
        System.out.print("Masukkan angka pertama : ");
        int first = scan.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int second = scan.nextInt();

        Fibonacci fibonacci = new Fibonacci(n, first, second);
        fibonacci.printFibonacciSeries();
    }

    /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, fibo;

        System.out.print("Masukkan jumlah deret fibonacci : ");
        int n = scan.nextInt();
        System.out.print("Masukkan angka pertama : ");
        int first = scan.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int second = scan.nextInt();

        System.out.println();
        System.out.println("Deret fibonacci yang terbentuk yaitu :");
        System.out.print(first + "  " + second);
        for (i = 2; i < n; ++i) {
            fibo = first + second;
            System.out.print("  " + fibo);
            first = second;
            second = fibo;
        }
        System.out.println();
    }
    */
}