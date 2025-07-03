// 268. Missing Number

// https://leetcode.com/problems/missing-number/description/

//  main logic :  sum
  class Solution {
    int missingNumber(int[] nums) {        // O(n)  O(1)
    int n = nums.length;
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;
    for (int num : nums) actualSum += num;
    return expectedSum - actualSum;
}
  }

 /* class Solution {
    public int missingNumber(int[] nums) {
    int xor1 = 0; // for nums[i]
    int xor2 = 0; // for 1 to n

    for (int i = 0; i < nums.length; i++) {
        xor1 ^= nums[i];
        xor2 ^= i + 1; // from 1 to n
    }

    return xor1 ^ xor2;
}
}







//Logic 1 Brute force:       // O(n2)  O(1)
/* 
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) { // from 0 to n
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1; 
    }
}

// Logic 2 : Hash Array 
public int missingNumber(int[] nums) {                 // O(n)  O(n)
    int n = nums.length;
    boolean[] seen = new boolean[n + 1]; // range [0...n]

    // Mark all present numbers
    for (int num : nums) {
        seen[num] = true;
    }

    // Find the number that's not marked
    for (int i = 0; i <= n; i++) {
        if (!seen[i]) return i;
    }

    return -1; // Should never reach here
}

// Logic 3   : HashSet
public int missingNumber(int[] nums) {      // O(n)  O(n)
    Set<Integer> set = new HashSet<>();
    for (int num : nums) set.add(num);
    for (int i = 0; i <= nums.length; i++) {
        if (!set.contains(i)) return i;
    }
    return -1;
}





*/