package Medium;

// 237. Delete Node in a Linked List

// https://leetcode.com/problems/delete-node-in-a-linked-list/description/


// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


// Approach: Copy the value of the next node to the current node and then delete the next node.
class Solution {
    public void deleteNode(ListNode node) {   // O(1) TC  AND O(1) SC
       node.val = node.next.val;
       node.next = node.next.next;

    }
}



 //You are given the node to be deleted node. You will not be given access to the first node of head.

    // You will only be given access to the node to be deleted.


    // The problem states that the node to be deleted will not be the last node, so we can safely copy the value of the next node and then delete it.
    



