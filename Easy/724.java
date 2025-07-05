// 724. Find Pivot Index

//https://leetcode.com/problems/find-pivot-index/description/


// Main Approach   O(n) O(1)
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i =0; i<n; i++){
            sum+=nums[i];
        }
         int lf = 0;
        for(int i =0; i<n; i++){
           int rf = sum - lf - nums[i];
          
           if(lf == rf){
            return i;
           }
           lf += nums[i];
        }
        return -1;
    }
}

/*
 // Brute force O(n2)  O(1)

 class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int l = 0; l < i; l++) {
                leftSum += nums[l];
            }

            // Calculate right sum
            for (int r = i + 1; r < n; r++) {
                rightSum += nums[r];
            }

            // Check if pivot index
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1; // No pivot index found
    }
}

 */