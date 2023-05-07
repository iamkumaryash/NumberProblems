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

        int lastDigit, rev = 0, tmp=n;
        while (n > 0) {
            System.out.println("Input Number " + n);
            lastDigit = n % 10;
            System.out.println("Last Digit " + lastDigit);
            System.out.println("Digit " + lastDigit + " was added to sum " + (rev * 10));
            rev = rev*10 + lastDigit;
            n = n/ 10;

        }
        if (rev == tmp) {
            return true;
        } else {
            return false;
        }
    }
}


