
import java.util.HashSet;

// 160. Intersection of Two Linked Lists

// https://leetcode.com/problems/intersection-of-two-linked-lists/description/





// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

// Approach: Two Pointers Technique 
// Time Complexity: O(n + m) where n and m are the lengths of the two linked lists.

   class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*
        ListNode p1 = headA;
        ListNode p2 = headB;                // O(n+m)   O(1)
        while(p1 != p2){
            p1 = (p1 != null) ? p1.next : headB;
            p2 = (p2 != null) ? p2.next : headA;
        }
        return p1;
        */


        
        // Logic 2 

        // Using a HashSet to store the nodes of the first list and then checking for intersection in the second list.


        HashSet<ListNode> set = new HashSet<>();    // O(n+m)  O(n)

        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }

        while(headB != null){
            if (set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}

