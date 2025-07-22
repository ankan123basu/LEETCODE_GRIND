package Medium;
// 328. Odd Even Linked List

// https://leetcode.com/problems/odd-even-linked-list/description/


   // Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode oddEvenList(ListNode head) {   // O(n) && O(1)

     if (head == null || head.next == null) return head;
     
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even2 = head.next;
        
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = even2;

        return head;
    }
}

