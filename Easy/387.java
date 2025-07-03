// 387. First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/description/

import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        // Logic 1
    // Approach: Using a HashMap to count character frequencies
    HashMap<Character, Integer> map = new HashMap<>();  // O(n) && O(1)
    for (char ch : s.toCharArray()){
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i; // return the index
            }
        }
    return -1;


    // logic 2
    //Brute force
    /*
    for (int i = 0; i < s.length(); i++) {   // O(n2) && O(1)
    char ch = s.charAt(i);
    int count = 0;
    for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == ch) count++;
    }
    if (count == 1) return i;
}
return -1;


   //logic 3 
 // Approach: Using a frequency array
  class Solution {           // O(n) & O(1)
    public int firstUniqChar(String s) {
        int[] freq = new int[26];  // create a freq array

        // Count frequency

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
        */
    }
}


    
