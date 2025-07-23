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

/*
 Approach : using stack                    // O(2n) time and O(n) space
 
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        // Push all nodes onto the stack
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        // Pop the top element to be the new head
        ListNode newHead = stack.pop();
        ListNode current = newHead;

        // Rebuild the reversed list
        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }

        current.next = null; // important to avoid cycle

        return newHead;
    }
}
    
 */