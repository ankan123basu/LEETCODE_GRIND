// 485. Max Consecutive Ones

// https://leetcode.com/problems/max-consecutive-ones/description/

// Approach :

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {  // O(n)   O(1)
        int n = nums.length;
        int c = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if (nums[i] == 1){
                c++;
                maxi = Math.max(maxi,c);
            } else {
                c = 0;
            }
        }
        return maxi;
    }
}