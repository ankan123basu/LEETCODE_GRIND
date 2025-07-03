// 9. Palindrome Number

// https://leetcode.com/problems/palindrome-number/description/



// logic 1 
// Approach: Reverse the number halfway and compare it with the original number.
class Solution {
    public boolean isPalindrome(int x) {   
        if(x<0 || (x%10 == 0 && x != 0)){
            return false;
        }
        int revhalf = 0;
        while(x > revhalf){
           int d = x % 10;                    // O(log10x)  or O(log n)  tc      O(1) sc
            revhalf = (revhalf*10) + d;
            x/=10;
        }
        return x == revhalf || x == revhalf/10;
    }
}

// logic 2
// Approach: Convert the number to a string and check if it reads the same forwards and backwards.
/*
 public boolean isPalindrome(int x) {
    String s = String.valueOf(x);  // or Integer.toString(x)        / O(log10x) or O(log n) time complexity     O(Logx) space complexity
    if (s.length() == 0) return false;
    int left = 0, right = s.length() - 1;
    
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) return false;
        left++;
        right--;
    }
    
    return true;
}

 */