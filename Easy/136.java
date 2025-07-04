// 136. Single Number

 // https://leetcode.com/problems/single-number/description/


// Main Approach // using XOR

class Solution {
    public int singleNumber(int[] nums) {
          int xor = 0;
    for(int num  : nums){
        xor ^= num;
    }
    return xor;
}
}

 /* 

 // Approach 1 : Brute force                            O(n2) O(1)
 class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int num = nums[i];
            int c = 0;
            for(int j = 0; j<n; j++){
                  if(nums[j] == num){
                    c++;
                  }
               }

             if(c == 1) return num;
            
        }
        return -1;
    }
}

// Approach 2 : Hashset    O(n)   O(n)

import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);  // Second time we remove
            } else {
                set.add(num);     // First time we add
            }
        }

        // Now set with 1 element
        for (int num : set) {
            return num;
        }

        return -1;  // Should never reach here
    }
}

// Approach :  HashMap                       // O(n)   O(n)
public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (int num : nums) {
        if (map.get(num) == 1) return num;
    }

    return -1;
}




*/