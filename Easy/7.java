// Reverse Integer

// https://leetcode.com/problems/reverse-integer/description/

class Solution {
    public int reverse(int x) {
        long rev = 0;             // O(log10(X))
                                  // O(1)
        while (x != 0) {
            int d = x % 10;
            rev = rev * 10 + d;
            x /= 10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) rev; 
    }
}

