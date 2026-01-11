package javaPrograms;

import java.util.Scanner;

public class sumOfPrimeNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please provide the first number: ");
        int first = in.nextInt();

        System.out.println("Please provide the second number: ");
        int last = in.nextInt();

        int sum = primeFinder(first, last);
        System.out.println(sum);
    }

    static int primeFinder(int first, int last) {
        int prime = 0;

        for (int i = first; i <= last; i++) {
            if (isPrime(i)) {
                prime = prime + i;
            }
        }

        return prime; // ✅ now inside the method
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
