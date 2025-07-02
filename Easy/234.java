// 234. Palindrome Linked List

// https://leetcode.com/problems/palindrome-linked-list/description/

// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }




// Approach: Two Pointers Technique and Reverse the second half

  class Solution {
    public ListNode FindMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
           }

    public boolean isPalindrome(ListNode head) {      // O(N)  and O(1)
        if(head == null || head.next == null){
            return true; // empty or single node is a palindrome
        }
        
        // find mid;
        ListNode mid = FindMid(head);

        // rev 2nd half
        ListNode curr = mid;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
     ListNode LH = head;
     ListNode RH = prev;
      while(RH != null){ 
        if(LH.val != RH.val){  // if one mismatch
            return false;
        }
        LH = LH.next;
        RH = RH.next;
      }
      return true;   // if all matches
    }
}