//   2351. First Letter to Appear Twice

//  https://leetcode.com/problems/first-letter-to-appear-twice/description/


class Solution {
    public char repeatedCharacter(String s) {

    // Approach: Use a HashSet to track seen characters
        // logic 1

   /*     HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){     // O(N) &&  O(1)
            if(set.contains(ch)){
                return ch;
            } else {
                set.add(ch);
            }
        }
        throw new IllegalArgumentException("No duplicates found");
*/

     // Approach: Use a boolean array to track seen characters
    // logic 2
    
    boolean[] seen = new boolean[26];   // create boolean array 
    for (char ch : s.toCharArray()){
        if (seen[ch-'a']) return ch;         // O(n) & O(1)
        else seen[ch-'a'] = true;
    }

throw new IllegalArgumentException("No duplicates found");





  /*  logic 3 (brute force)      // O(N^2) & O(1)

// Approach: Use a nested loop to check each character against all others         
     for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return s.charAt(i);
                }
            }
        }
        throw new IllegalArgumentException("No duplicates found");
*/

    }

}