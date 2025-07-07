// Two pointer 2nd variety (where we need to return true / false)
import java.util.Arrays;

 class Solution {
     public boolean twoSum(int[] nums, int target) {
        // Approach : sort and then 2 pointers
        // O(nlogn)  O(1)
       Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        return false;
    }
}



