package Medium;

// 142. Linked List Cycle II

import java.util.HashSet;


// https://leetcode.com/problems/linked-list-cycle-ii/description/


// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



  // Approach: fast and slow pointer technique

   class Solution {                               // O(N) && O(1)
    public ListNode detectCycle(ListNode head) {
   /*     ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                 flag = true;
                 break;
            }
        }
        if(flag == false){
            return null;
        }
         slow = head;
        ListNode prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        return fast;
        */



        // Logic 2
        
        // Using a HashSet to store the nodes and check for cycles.
        // If a node is already in the set, it means we have found a cycle.

        HashSet<ListNode> visited = new HashSet<>();     // O(N) &&  O(N)
        ListNode temp = head;
        while(temp!= null){
            if(visited.contains(temp)){
               return temp;
            }
            visited.add(temp);
            temp = temp.next;
        }
            return null;  // if no cycle is found
    }
}