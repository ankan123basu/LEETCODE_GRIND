
//  Merge Two Sorted Lists

//  https://leetcode.com/problems/merge-two-sorted-lists/description/


// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



// Approach: Iterative Merging
// Time Complexity: O(n + m) where n and m are the lengths of the two linked lists.

  class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);   // O(n+m)   O(1)
        ListNode temp = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

            while(list1 != null){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }

            while(list2 != null){
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        
        return dummy.next;
    }
}
