package Medium;
// 152. Maximum Product Subarray

// https://leetcode.com/problems/maximum-product-subarray/


// Intuitive Approach:

class Solution {
    public int maxProduct(int[] nums) {       // O(n)  O(1)
      int  maxi = Integer.MIN_VALUE;
        int p = 1, s =1;
        int n = nums.length;
        for(int i =0; i<n; i++){
        if(p == 0) p=1;
        if(s == 0) s =1;
        p*= nums[i];
        s*= nums[n-i-1]; // reverse iteration *************
        maxi = Math.max(maxi, Math.max(p,s));
    }
    return maxi;
    }
}

 // Logic 2 : Better

 /*
    public int maxProduct(int[] nums) {       // O(n^2)  O(1)
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            int p = 1;
            for(int j = i; j<n; j++){
                p*= nums[j];
                maxi = Math.max(maxi, p);
            }
        }
        return maxi;
    }


    // Logic 3 :  Brute Force Approach:
    public int maxProduct(int[] nums) {          // O(n3) O(1)
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            for(int j = i; j<n; j++){
                int p = 1;
                for(int k = i; k<=j; k++){
                    p*= nums[k];
                }
                maxi = Math.max(maxi, p);
            }
        }
        return maxi;
    }
  */