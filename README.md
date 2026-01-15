# Valid Anagram Task

## Problem Description
Write a function to determine if two provided strings are anagrams of each other.

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once

### Examples
- Input: s = "listen", t = "silent" -> Output: True
- Input: s = "rat", t = "car" -> Output: False

---

## Approach

1. **Check Lengths**  
   - If the lengths of the two strings are different, they **cannot** be anagrams.

2. **Frequency Array for Counting Characters**  
   - Use an integer array of size 26 (for lowercase English letters).  
   - Increment the count for each character in the first string.  
   - Decrement the count for each character in the second string.

3. **Validation**  
   - If all values in the frequency array are zero, the strings are **anagrams**.  
   - Otherwise, they are **not anagrams**.

4. **User Input**  
   - Read strings from the user using `Scanner` and convert to lowercase to handle case-insensitive input.

This approach avoids sorting and ensures optimal performance.

---

## Implementation (Java)

- **File:** `ValidAnagram.java`  
- **Features:**  
  - Dynamic user input  
  - Step-by-step character counting  
  - Case-insensitive comparison  
  - Fully commented for clarity  

## Time and Space Complexity

- **Time Complexity: O(n)** : single pass through each string to build/check frequency array.

- **Space Complexity: O(1)** : fixed-size array of 26 elements, independent of input size.
---

## How to Run

**1. Compile the program:**

```
javac ValidAnagram.java
```

**2. Run the program**

```
java ValidAnagram.java
```