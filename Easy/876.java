// 876. Middle of the Linked List

// https://leetcode.com/problems/middle-of-the-linked-list/description/


// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


  // Approach: Two Pointers Technique
  
  class Solution {
    public ListNode middleNode(ListNode head) {  // O(n) && O(1)
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}