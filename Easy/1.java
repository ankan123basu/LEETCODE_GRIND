
import java.util.HashMap;

// 1. Two Sum


//https://leetcode.com/problems/two-sum/description/


class Solution {
    public int[] twoSum(int[] nums, int target) {

    // Main apparoach HashMap   O(n) O(n)

       int n = nums.length;
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i=0; i<n; i++){
        int rem = target - nums[i];
        if(map.containsKey(rem)){
            return new int[]{i,map.get(rem)};
        }
        map.put(nums[i],i);
       }
       return new int[]{};
    }
}

     /*   Brute force   O(n^2) O(1)
   
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
*/
