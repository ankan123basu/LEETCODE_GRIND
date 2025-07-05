package Medium;

// Longest Subarray with Sum K

//  https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1


import java.util.HashMap;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        
        // Prefix Sum + Hashmap                                    // O(n)  O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int sum = 0 , maxLen = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            
            if(sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }
            
            if(map.containsKey(sum-k)){
                int idx = map.get(sum - k);
                maxLen = Math.max(maxLen, i-idx);
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
            
        }
        return maxLen;
    }
}
        // Brute Force      // O(n3)  O(1)
        /*
        int n = arr.length;
      int maxi = 0; //  length cant be negative
        for(int i =0; i<n; i++){
            for(int j =i; j<n; j++){
                int sum = 0;
                 for(int p=i; p<=j; p++){
                     sum+=arr[p];
                 }
                     if(sum == k){
                         maxi = Math.max(maxi, j-i+1);
                     }
                 }
                
            }
        
        return maxi;
       
        
        // O(n2)  O(1)
        
         int n = arr.length;
      int maxi = 0; //  length cant be negative
        for(int i =0; i<n; i++){
            int sum =0;
            for(int j =i; j<n; j++){
                sum+=arr[j];
                if(sum == k){
                         maxi = Math.max(maxi, j-i+1);
                }
            }
        }
        return maxi;
         
        
    }
}
*/
