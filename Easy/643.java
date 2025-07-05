// 643. Maximum Average Subarray I

//https://leetcode.com/problems/maximum-average-subarray-i/description/


class Solution {
    public double findMaxAverage(int[] nums, int k) { 
        
        // Sliding Window approach 
         // O(n)  O(1)
        int l = 0;
        int r = 0;
        int n = nums.length;
        double maxi = Double.NEGATIVE_INFINITY;
        double sum = 0;
        while(r<n){
           sum += nums[r];
            while(r-l+1 > k && l<=r){
                sum -= nums[l];
                l++;
            }
            if(r-l+1 == k){
                maxi=Math.max(maxi,sum);
            }
            r++;
        }
        return (double)maxi/k;
    }
}

/*  // Brute force

   int n = nums.length;
        double maxi = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < n; i++) {   // O(n3)  O(1)
           
            for (int j = i; j < n; j++) {
                int len = j - i + 1;
                if (len == k) {
                    double sum = 0;
                    
                    for (int p = i; p <= j; p++) { //// Inner loop: calculate sum of subarray
                        sum += nums[p];
                    }
                    maxi = Math.max(maxi,sum);
                }
            }
        }

        return (double)maxi/k;
    }
}
       
 */