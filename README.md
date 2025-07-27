# Find Numbers with Even Number of Digits

[LeetCode Problem 1295](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/)

## 🧩 Problem Description

Given an array of integers `nums`, return **how many** of them contain an **even number of digits**.

### Example:

**Explanation:**
- 12 → 2 digits → even ✅  
- 345 → 3 digits → odd ❌  
- 2 → 1 digit → odd ❌  
- 6 → 1 digit → odd ❌  
- 7896 → 4 digits → even ✅  
→ Total: **2 numbers**

---

## 🧠 Approach

- Traverse the array
- For each number, count its digits
- If digit count is even, increment the counter
- Return the final count

## Compile the Java File:
```javac Solution.java

## Run the Program 
```java Solution
