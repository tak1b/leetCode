#include <stdbool.h>
#include <stdio.h>

bool isPalindrome(int x) {
    if (x < 0) return false; // Negative numbers are not palindromes

    long long original = x;  // Store original number
    long long reversed = 0;  // Use long long to prevent overflow

    while (x > 0) {
        int digit = x % 10;
        reversed = reversed * 10 + digit;
        x /= 10;
    }

    return original == reversed;
}