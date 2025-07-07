// 169. Majority Element

// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        
        // Main Aproach : Boyer Moore's Voting Algo  O(n) O(1)

        int cnt =0;
        int candidate = 0;

        // Voting Phase 
        for(int num : nums){
        if(cnt == 0){
            cnt = 1;
            candidate = num;
        }
        else if(candidate == num){
            cnt++;
        }
        else {
            cnt--;
        }
        }

        // Verification Phase
        int c = 0;
        for(int num : nums){
            if(candidate == num)
            c++;
        }
        if(c>nums.length/2){
            return candidate;
        }
        
         return -1;
    }
}

/*
 Alternative Approach :
   HashMap  O(n) O(n)
    import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > n/2){
                return num;
            }
        }
        return -1; 
    }
}

// Alternative Approach : Sorting  O(nlogn) O(1)   ** Only work if majority element is guaranteed to exist
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];  // The majority element will always be at the middle after sorting
    }
}

// Alternative Approach : brute force  O(n^2) O(1)
class Solution {    
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int c = 0;
            for(int j = 0; j<n; j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
            if(c > n/2){
                return nums[i];
            }
        }
        return -1;
    }
    }

 */