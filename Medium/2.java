package Medium;

// 2. Add Two Numbers

// https://leetcode.com/problems/add-two-numbers/description/




 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {        // O(max(n,m)) TC and SC
        
        // create dummy list
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        // Traverse 
        while(l1 != null || l2 != null || carry != 0){  // 

            // fetch

            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            // Merging
            temp.next = new ListNode(digit);
            temp = temp.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
}