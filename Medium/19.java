package Medium;

// 19. Remove Nth Node From End of List

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



// Approach: Iterative technique
  class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
/* logic 1
     int sz = 0;
     ListNode temp = head;
     while(temp!=null){                     // O(N) TC AND O(1) SC
        sz++;
        temp = temp.next;
     }
     if(sz == n){     //  remove first
        head = head.next;
        return head;
     }
     ListNode prev = head;
     int i = 1;
     while(i<sz-n){
        prev = prev.next;
        i++;
     }
     prev.next = prev.next.next;
     return head;
        
 */

 //logic 2
 // Two pointer technique                   // O(N) TC and O(1) SC
                              
 ListNode s = head;
 ListNode f = head;

 for(int i =0; i<n; i++){ // Move the fast pointer n steps ahead
    f = f.next;
 }

    if(f == null){      // Remove first * 
        head = head.next;
        return head;
    }

 while(f.next != null){
    s = s.next;
    f = f.next;
 }
 s.next = s.next.next;
    
    return head;
    }
}
