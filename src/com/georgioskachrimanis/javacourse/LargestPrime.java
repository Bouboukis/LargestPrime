package com.georgioskachrimanis.javacourse;

public class LargestPrime {
    public static int getLargestPrime(int value) {
        int maxPrime = 0;


        if (value < 2) {
            return -1;
        }

        // Main Loop. It will run the numbers sequence and check which
        // of the combinations produce the largest prime number.
        // I was thinking to make the for loop run only prime numbers loop but this way the solution will be wrong

        for (int i = 0; i < value; i++) {
            for (int j = 1; j < value; j++) {
                if (i * j == value) {
                    if (isPrime(j)) {
                        if (maxPrime < j) {
                            maxPrime = j;
                        }
                    }
                }
            }
        }

       // If there is a combination of a prime number to give the value we need will return it, else the return is -1
        if (maxPrime != 0){
            return maxPrime;
        }

        return -1;


    }

    //Algorithm to check if number is prime.
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; (long) i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
