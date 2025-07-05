// 1394. Find Lucky Integer in an Array

//https://leetcode.com/problems/find-lucky-integer-in-an-array/description/?envType=daily-question&envId=2025-07-05


class Solution {
    public int findLucky(int[] arr) {
        
        // Approach 1 : freq array   O(n)  O(1)
        
        int freq[] = new int [501];
          for (int num : arr) {
            freq[num]++;
        }
        int maxi = -1;
        for (int num : arr) {
            if (freq[num] == num) {
                maxi = Math.max(maxi, num);
            }
        }

        return maxi;
    }
}

// Approach 2 : HashMap   O(n)  O(n)
/*
class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxLucky = -1;
        for (int num : arr) {
            if (freq.get(num) == num) {
                maxLucky = Math.max(maxLucky, num);
            }
        }

        return maxLucky;
    }
}
    */