package com.example.NumberProblems.Resources;

import com.example.NumberProblems.Services.NumberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rest/number")
public class Controller {

    @Autowired
    NumberServiceImpl numberService;

    @RequestMapping(value = "/check/prime/{number}", method = RequestMethod.GET) //localhost:8080/rest/number/check/17
    public String verifyPrimeNumber(@PathVariable("number") int number) {
        Boolean isPrime = numberService.verifyPrimeNumber(number);
        return number + " is prime: " + isPrime;
    }

    @RequestMapping(value = "/check/palindrome/{number}", method = RequestMethod.GET)
    public String verifyPalindromeNumber(@PathVariable("number") int number) {
        Boolean isPalindrome = numberService.verifyPalindromeNumber(number);
        return number + " is palindrome " + isPalindrome;
    }
}

