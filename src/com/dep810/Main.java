package com.dep810;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x_n = p * x_n-1 + q * x_n-2");

        System.out.print("Введите нижнюю границу рапределения: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Введите верхнюю границу рапределения: ");
        int upperBound = scanner.nextInt();

        int range = Math.abs(upperBound - lowerBound);

        Random rand = new Random();

        BigInteger p = BigInteger.valueOf(rand.nextInt(range) + lowerBound);
        System.out.println("p = " + p);

        BigInteger x2 = BigInteger.valueOf(rand.nextInt(range) + lowerBound);
        System.out.println("x2 = " + x2);

        BigInteger q = BigInteger.valueOf(rand.nextInt(range) + lowerBound);
        System.out.println("q = " + q);

        BigInteger x1 = BigInteger.valueOf(rand.nextInt(range) + lowerBound);
        System.out.println("x1 = " + x1);

        System.out.print("Введите длину последовательности: ");
        Integer n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            BigInteger x3 = p.multiply(x2).add(q.multiply(x1));
            System.out.print(x3 + " ");
            if (i % 2 == 0) {
                x1 = x3;
            } else {
                x2 = x3;
            }
        }
    }
}
