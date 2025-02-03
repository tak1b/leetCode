class Solution:
    def romanToInt(self, s: str) -> int:
        roman = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        total = 0
        prev_value = 0  # Keep track of the previous numeral's value

        for char in reversed(s):  # Process from right to left
            value = roman[char]
            if value < prev_value:
                total -= value  # Subtract if it's a special case (e.g., IV, IX)
            else:
                total += value  # Otherwise, just add
            prev_value = value  # Update previous value
        
        return total
