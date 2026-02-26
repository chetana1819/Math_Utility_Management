package main.java.mathutils.module2;

public class NumberProperty {
    public int checkPrime(int num){
        if (num <= 1) {
        return 0;   // 0 not prime
    }

    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return 0;   // divisible → not prime
        }
    }

    return 1;//prime 
    }

    public int checkPalindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            return 1;   // Palindrome
        } else {
            return 0;   // Not Palindrome
        }
    }

    public int checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return 1;   // Even
        } else {
            return 0;   // Odd
        }
    }

    
}
