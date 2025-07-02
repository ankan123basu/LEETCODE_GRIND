// 141. Linked List Cycle

// https://leetcode.com/problems/linked-list-cycle/description/

// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


// Approach: Fast and Slow Pointer Technique(Floyd's Cycle Detection Algorithm)
  class Solution {
    public boolean hasCycle(ListNode head) {      // O(N) && O(1)
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        
        if (slow == fast){
            return true;
        }
        }

        return false;
    }
}