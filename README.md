# 💻 LeetCode Solutions in Java

Welcome to my curated list of **LeetCode solutions**. This repository contains well-structured and clean Java solutions for LeetCode problems, categorized by difficulty and topic.

---

## 📚 Structure

- 🔹 **Easy** – Beginner-friendly problems with simple logic
- 🔸 **Medium** – Intermediate problems that involve common patterns
- 🔴 **Hard** – Challenging problems that require optimization or complex logic

---

## ✅ Languages Used

- Primary: **Java**
- You may also find code snippets in:
  - Python (future)
  - C++ (future)

---

## 🧠 Topics Covered

- Arrays & Strings
- Linked Lists
- Stacks & Queues
- Trees & Graphs
- Dynamic Programming
- Sliding Window
- Heaps
- Backtracking
- Greedy
- ...more

---

## 🚀 How to Use

Each file is named like this:

```
ProblemNumber_ProblemName.java
```

Each file contains:
- ✅ Problem statement (short)
- ✅ Link to LeetCode
- ✅ Approach used (Brute → Optimal)
- ✅ Time and Space Complexity
- ✅ Code with comments

## 🌟 Highlights
- Consistent coding style
- Time-space complexities mentioned
- Brute-force to optimal progression
- Interview-prep friendly

## 📌 Sample Problem File

```java
/*
 * ✅ Problem: 1. Two Sum
 * 🔗 https://leetcode.com/problems/two-sum/
 * 💡 Approach: HashMap for O(1) lookups
 * 🕒 Time: O(n), 🛠️ Space: O(n)
 */
import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
```

## 🗂️ Question Tracker
See [All_Questions_List.md](./All_Questions_List.md) for the full list of problems solved.

## 📈 Contribution & Tracking
I'll update this repo regularly as I solve more problems. If you want to contribute or collaborate, feel free to fork & pull request.

## 📬 Contact
- 🧑🏻‍💻 GitHub: [Your Username](https://github.com/your-username)
- 📧 Email: your-email@example.com
