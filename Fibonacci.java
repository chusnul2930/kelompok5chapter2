package com.example.demo.chapter2;

import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n) {
        int j, k;
        if (n == 0 || n == 1) {
            return n;
        } else {
            return (fibo(n - 1) + fibo(n - 2));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i;

        System.out.print("Masukkan jumlah deret bilangan fibonacci : ");
        int n = scan.nextInt();
        System.out.print("Masukkan angka pertama : ");
        int j = scan.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int k = scan.nextInt();
        System.out.println();

        System.out.println("Hasil bilangan fibonacci :");
        for (i = 0; i < n; i++) {
            int l = j + k;
            System.out.print(fibo(l)+", ");
            j++;
        }
        System.out.println();
    }
}