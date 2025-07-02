// 83. Remove Duplicates from Sorted List

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



// Approach: Iterative Traversal                                 // O(n)  and O(1)
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head; // If the list is empty or has only one node, return it as is
        ListNode temp = head;                                
        while(temp != null && temp.next!= null){    // temp.next!= null to avoid NullPointerException
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else {
            temp = temp.next;
            }
        }
        return head ;  // Return the modified list with duplicates removed
    }
}


// Approach: Recursive Traversal          // O(n)  and O(n) space complexity due to recursion stack

/*
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head; // Base case: if the list is empty or has only one node
        
      if(head.val == head.next.val) {  // If the current node's value is equal to the next node's value
            head.next = head.next.next; // Skip the duplicate node
            return deleteDuplicates(head); // Recursively call the function
        } else {
            head.next = deleteDuplicates(head.next); // Recur for the next node
            return head; // Return the current node
        }
 */