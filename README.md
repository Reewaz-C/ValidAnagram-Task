# Valid Anagram

## Problem Description
Write a program to determine whether two given strings are anagrams of each other.

An **anagram** is a word or phrase formed by rearranging the letters of another word, using all original letters exactly once.

### Examples
- Input: `s = "listen"`, `t = "silent"` → Output: `"The strings are anagrams."`
- Input: `s = "rat"`, `t = "car"` → Output: `"The strings are NOT anagrams."`

---

## Approach / Algorithm

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


