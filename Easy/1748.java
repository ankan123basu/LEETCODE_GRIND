// 1748. Sum of Unique Elements

// https://leetcode.com/problems/sum-of-unique-elements/description/

class Solution {
    public int sumOfUnique(int[] nums) {
        // Approach 1 : use freq array    O(n)  O(1)
        int sum = 0;
        int n = nums.length;
        int freq[] = new int[101];  // from 0 to 100 indexing

        for(int num : nums){
            freq[num]++;
        }

        for(int num : nums){
            if (freq[num] == 1){
                sum += num;
            }
        }
        return sum;
    }
}

  /* 
    // Approach 2 : use HashMap   O(n) O(n)
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums){
            if (map.get(num) == 1){
                sum += num;
            }
        }
        return sum;
    }
    */

