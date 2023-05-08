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

    @RequestMapping(value = "/check/coprime/{number1}/{number2}", method = RequestMethod.GET)
    public String verifyCoPrimeNumber(@PathVariable("number1") int number1,@PathVariable("number2")  int number2) {
        Boolean isCoPrime = numberService.verifyCoPrimeNumber(number1, number2);
        return number1 + " & " + number2 + " are Co-prime: " + isCoPrime;
    }

    @RequestMapping(value = "/check/twinPrime/{number1}/{number2}", method = RequestMethod.GET)
    public String verifyTwinPrimeNumber(@PathVariable("number1") int number1,@PathVariable("number2") int number2){
        Boolean isTwinPrime = numberService.verifyTwinPrimeNumber(number1, number2);
        return number1 + " & " + number2 + " are Twin-Prime: " + isTwinPrime;
    }
}

