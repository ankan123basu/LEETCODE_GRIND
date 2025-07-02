package Hard;

 //23. Merge k Sorted Lists
import java.util.PriorityQueue;



// https://leetcode.com/problems/merge-k-sorted-lists/description/



// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }






// // Approach: Using a Min Heap (Priority Queue) to merge k sorted linked lists
// // Time Complexity: O(n log k) where n is the total number of nodes across all lists and k is the number of lists.

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
     PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val - b.val);

     for(ListNode n : lists){ // Insertion of heads of each list
        if(n != null){
            pq.add(n);          // O(nlogk)      O(k) sc 
        }
     }
     
     ListNode dummy = new ListNode(-1);
     ListNode temp = dummy;
     while(!pq.isEmpty()) {
        ListNode k = pq.poll();  // return the min 
        temp.next = k;
        temp = temp.next;

        if(k.next != null){
            pq.add(k.next);
        }
     }

     return dummy.next;
    }
    
 }

