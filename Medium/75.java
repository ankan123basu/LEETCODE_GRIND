package Medium;

// 75. Sort Colors

// https://leetcode.com/problems/sort-colors/description/


class Solution {
    public void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;

        // Main Approach : DNF(Dutch National Flag)  Algorithm   O(n) O(1)

        int low = 0;
        int mid = 0;
        int high = n-1;
         while(mid<=high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++ ;
                mid++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                swap(nums ,mid, high);
                high --;
            }
         }

    }
}

/*      
 Better Approach :  O(2n) O(1)
 
    public void sortColors(int[] nums) {
        int n = nums.length;
        int c0 = 0, c1 = 0, c2 = 0;
        for(int i =0; i<n; i++){
            if(nums[i] == 0) c0++;
            else if(nums[i] == 1) c1++;
            else c2++;
        }
        for(int i =0; i<c0; i++) nums[i] = 0;
        for(int i =c0; i<c0+c1; i++) nums[i] = 1;
        for(int i =c0+c1; i<n; i++) nums[i] = 2;
    }



// Brute Force Approach : O(nlogn) O(1)
    public void sortColors(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
    }
 */