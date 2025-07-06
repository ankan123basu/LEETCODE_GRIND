
import java.util.ArrayList;

// Indexes of Subarray Sum

//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

// You need to find the first subarray whose sum is equal to the target.

class Solution {
    
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        
        // Sliding Window Approach   O(n)  O(1)
        
        ArrayList<Integer> list = new ArrayList<>();
        int l =0, r =0;
        int n = arr.length;
        int sum = 0;
        
        while(r<n){
            sum += arr[r];
             while(sum > target && l<=r){
                 sum -=arr[l];
                 l++;
             }
            
            if(sum == target){
                list.add(l+1);
                list.add(r+1);
                return list;
            }
            r++;
            
            
        }
        list.add(-1);
        return list;
    }
}
