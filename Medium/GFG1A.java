package Medium;

// Longest Subarray with Sum K  (It has only positive numbers and 0) *******


// Approach : 2 pointer ( Sliding Window Technique)  // O(n)  O(1)

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Sliding Window Approach   O(n)  O(1)
        
        int l = 0, r = 0;
        int n = arr.length;
        int sum = 0, maxLen = 0;
        
        while (r < n) {
            sum += arr[r];
            
            while (sum > k && l <= r) {
                sum -= arr[l];
                l++;
            }
            
            if (sum == k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        
        return maxLen;
    }
}