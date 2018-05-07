package com.dep810.Fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci");

        System.out.print("Введите N: ");
        int N = scanner.nextInt();

        BigInteger x1 = BigInteger.ONE;
        System.out.println("x1 = " + x1);

        BigInteger x2 = BigInteger.ONE;
        System.out.println("x2 = " + x2);

        System.out.print("Введите длину последовательности: ");
        Integer n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            BigInteger x3 = x1.add(x2).mod(BigInteger.valueOf(N));
            System.out.print(x3 + " ");
            if (i % 2 == 0) {
                x1 = x3;
            } else {
                x2 = x3;
            }
        }
    }
}
