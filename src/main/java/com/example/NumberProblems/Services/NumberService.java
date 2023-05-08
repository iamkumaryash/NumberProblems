package com.example.NumberProblems.Services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface NumberService {

    boolean verifyPrimeNumber(int n);
    boolean verifyPalindromeNumber(int n);
    boolean verifyCoPrimeNumber(int n,int n1);
    boolean verifyTwinPrimeNumber(int n,int n1);
}
