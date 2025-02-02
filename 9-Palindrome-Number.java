class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) return false;

        int original = x; // Store the original number
        long reversed = 0; // Use long to prevent overflow

        while (x > 0) {
            int digit = x % 10;         // Extract last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            x /= 10;                    // Remove last digit from x
        }

        // Check if reversed number matches the original
        return original == reversed;
    }
}
