
import java.util.ArrayList;

// Union of 2 Sorted Arrays

// https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

// Approach: Using 2 pointers O(n+m) O(1)

   class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                    list.add(b[j]);
                }
                j++; 
            }
        }

        while (i < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }

        while (j < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                list.add(b[j]);
            }
            j++;
        }

        return list;
    }
}

/*
  // Approach: Using TreeSet O((n+m)logk)  O(n+m)
import java.util.TreeSet;
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }



    // Approach: Using HashSet O(n+m) O(n+m)
import java.util.HashSet;
    




 */
