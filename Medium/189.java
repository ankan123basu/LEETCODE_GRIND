package Medium;

// 189. Rotate Array right by k steps

// https://leetcode.com/problems/rotate-array/description/

class Solution {

    // Approach 1: Reversing O(n) O(1)
    public void reverse(int arr[], int left , int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;   // ******** to handle cases where k >= n
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
}

/*
// Approach 2: Using Extra Array O(n) O(n)
class Solution {    
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    // Approach 3 : Using list  O(n+d) O(d)   
class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n; // To handle cases where k >= n
        List<Integer> list = new ArrayList<>();
        
        for (int i = n - k; i < n; i++) {
            list.add(nums[i]);
        }
        
        for (int i = 0; i < n - k; i++) {
            list.add(nums[i]);
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = list.get(i);
        }
    }
 */
