// 283. Move Zeroes

// https://leetcode.com/problems/move-zeroes/description/

class Solution {
    void swap(int nums[], int a, int b) {
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // Optimal : 2 pointer       O(n) O(1)
        int j = -1;
        for (int i =0; i<n; i++){
            if (nums[i] == 0) { // getting 1st 0
            j = i;
            break;
        }
        }
        if (j == -1){
            return;
        }
        for(int i = j+1; i<n; i++){
            if (nums[i] != 0){
                swap(nums, i, j);
                j++;
            }
        }
    }
}

/*
 // Approach 2 : another 2 pointer approach
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // Optimal : 2 pointer                   O(n) O(1)
        int j = 0; // pointer for non-zero elements
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i]; // place non-zero element at j and increment j
            }
        }
        // Fill remaining elements with 0
        while (j < n) {
            nums[j++] = 0;
        }
    }


// Approach 3 : Using ArrayList    O(n) O(n)

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }
        
        for(int i =0; i<list.size(); i++) {
            nums[i] = list.get(i);
        }
        for (int i = list.size(); i < n; i++) {
            nums[i] = 0;
        }
    
    }

    // Approach 4 : Using EXtra Array   O(n) O(n)
    class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int index = 0;

        // Step 1: Copy non-zero elements to temp
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[index++] = nums[i];
            }
        }

        // Step 2: Copy elements back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i]; // will have 0s automatically at end
        }
    }
}

 */