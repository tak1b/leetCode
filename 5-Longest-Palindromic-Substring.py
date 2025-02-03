class Solution:
    def longestPalindrome(self, s: str) -> str:
        def is_palindrome(sub: str) -> bool:
            return sub == sub[::-1]  # Reverse and check
        
        longest = ""
        
        for i in range(len(s)):
            for j in range(i, len(s)):
                sub = s[i:j+1]  # Extract substring
                if is_palindrome(sub) and len(sub) > len(longest):
                    longest = sub
        
        return longest
