package com.example.NumberProblems.Services;

import org.springframework.stereotype.Component;

@Component
public class NumberServiceImpl implements NumberService {

    @Override
    public boolean verifyPrimeNumber(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verifyPalindromeNumber(int n) {

        int lastDigit, rev = 0, tmp = n;
        while (n > 0) {
            System.out.println("Input Number " + n);
            lastDigit = n % 10;
            System.out.println("Last Digit " + lastDigit);
            System.out.println("Digit " + lastDigit + " was added to sum " + (rev * 10));
            rev = rev * 10 + lastDigit;
            n = n / 10;

        }
        if (rev == tmp) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean verifyCoPrimeNumber(int n, int n1) {
        int gcd = 1;
        int min, max;
        min = n;
        if (min > n1) {
            min = n1;
            max = n;
        } else {
            min = n;
            max = n1;
        }
        while (max > min) {
            int r = max % min;
            if (r == 0) {
                gcd = min;
                break;
            } else {
                max = min;
                min = r;
            }
        }
        if (gcd == 1) {
            return true;
        } else {
            return false;
        }
    }

        // Returns true if n1 and n2 are twin primes
        public boolean twinPrime(int n, int n1)
        {
            return (verifyPrimeNumber(n) && verifyPrimeNumber(n1) &&
                    Math.abs(n - n1) == 2);
        }

        @Override
        public boolean verifyTwinPrimeNumber(int n, int n1){
            if (twinPrime(n, n1))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        @Override
        public boolean verifyAutomorphicNumber(int n) {
            int square = n * n;

            while (n > 0) {
                if (n % 10 != square % 10) {
                    return false;
                }
                n /= 10;
                square /= 10;
            }

            return true;
        }

    }



