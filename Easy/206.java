// 206. Reverse Linked List

// https://leetcode.com/problems/reverse-linked-list/description/


// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



  
// Approach: Iterative Reversal

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;

        while(curr != null){         // O(n)  and O(1)

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
       head = prev;     // prev will be the new head after reversal  ***********
        return head;
    }
}