// 645. Set Mismatch

// https://leetcode.com/problems/set-mismatch/description/


class Solution {
    // logic 1
    // Mathematical Approach:
    public int[] findErrorNums(int[] nums) {   // O(n)  O(1)
        long n = nums.length;
        long s1n = n*(n+1)/2; // sum of 1st n natural no
        long s2n = (n*(n+1)*(2*n+1))/6;  // sum of squeares of 1st n natural no
 
        long s1 =0, s2 =0;

        for(int num : nums){
          s1+=num;
          s2+=num * num;
        }

        long val1 = s1 - s1n;  // x -y
        long val2 = s2 - s2n; // x2 -y2

        long val3 = val2/val1;  // x+y

        long x = (val3 + val1)/2;
        long y = x - val1;

        return new int[]{(int)x, (int)y};

    }
}

    // logic 2
    // Hashing Approach:
 /*   
     public int[] findErrorNums(int[] nums) {     // O(n)  O(n)

       int m = -1 , d = -1;
       int n = nums.length;
       int [] freq = new int[n+1];

       for(int num : nums){
           freq[num]++;
       }

       for(int i = 1; i<=n; i++){
           if(freq[i] == 2) m = i; // duplicate
           if(freq[i] == 0) d = i; // missing
       }
           return new int[]{m, d};
    }


    // logic 3  Hashmap Approach:

    public int[] findErrorNums(int[] nums) {         // O(n)  O(n)
        Map<Integer, Integer> map = new HashMap<>();
        int m = -1, d = -1;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int i = 1; i <= nums.length; i++){
            if(map.getOrDefault(i, 0) == 2) m = i; // duplicate
            if(!map.containsKey(i)) d = i; // missing
        }
        return new int[]{m, d};
    }



    // logic 4 : Brute Force Approach:
    public int[] findErrorNums(int[] nums) {         // O(n^2)  O(1)
        int n = nums.length;
        int m = -1, d = -1;
        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[j] == i) count++;
            }
            if(count == 2) m = i; // duplicate
            if(count == 0) d = i; // missing
        }


    */