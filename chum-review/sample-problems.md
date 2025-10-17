# Java Code Challenges - Programming Fundamentals Review

## Challenge 1: Magic Matrix Scanner
Write a program that reads an N×M matrix of integers. Calculate the "magic value" for each row (sum of elements multiplied by row index) and each column (product of elements divided by column index + 1). Print all positions where the element equals either its row's or column's magic value.

**Concepts:** Arrays (2D), Iterative Structures, Arithmetic operators, Input/Output

**Example Input:**
```
3 3
2 4 6
8 10 12
14 16 18
```

**Example Output:**
```
Magic positions found at:
Row 1, Column 2
```

---

## Challenge 2: Binary Pattern Detector
Create a program that accepts a string of digits. Convert each digit to its binary representation, then count sequences where three consecutive binary numbers form an ascending pattern (e.g., 2→010, 3→011, 4→100 is NOT ascending because 100 < 011 in value). Print the count and all starting positions of valid sequences.

**Concepts:** Strings, Typecasting, Bitwise operators, Nested loops, Arrays

**Example Input:**
```
123456789
```

**Example Output:**
```
Ascending sequences found: 5
Starting positions: 0, 1, 2, 3, 4
```

---

## Challenge 3: Fibonacci Cipher
Write a program that takes a sentence and a shift value. Generate Fibonacci numbers (starting with 1, 1) up to the length of the sentence. For each character at position i, shift it by (fibonacci[i] * shift) % 26 positions in the alphabet. Non-alphabetic characters remain unchanged. Print the encrypted message.

**Concepts:** String handling, Arrays, While/For loops, Math functions, Selection structures

**Example Input:**
```
HELLO
2
```

**Example Output:**
```
Encrypted message: JGOOL
```

---

## Challenge 4: Diamond Number Filter
Ask the user for three values: lower bound, upper bound, and a filter digit. Print all numbers in the range where:
- The sum of digits equals the product of digits
- The number contains the filter digit
- The number is NOT divisible by the sum of its first and last digit

Format output with proper spacing to form a diamond pattern based on digit count.

**Concepts:** Nested loops, Selection structures, Arithmetic operators, String handling, Output formatting

**Example Input:**
```
1
200
1
```

**Example Output:**
```
    1
   11
  111
   22
    1
```

---

## Challenge 5: Matrix Spiral Sum
Read two integers N and M, then read an N×M matrix. Calculate the sum of elements following a spiral pattern (clockwise from top-left). However, skip elements where:
- Row index + Column index is prime
- The element itself is divisible by 3
- The absolute difference between the element and its adjacent diagonal is less than 5

**Concepts:** 2D arrays, Array traversal, Math functions, Complex selection, Nested loops

**Example Input:**
```
3 3
1 2 3
4 5 6
7 8 9
```

**Example Output:**
```
Spiral sum (with filters): 28
```

---

## Challenge 6: Palindrome Transformer
Write a program that reads a string and an integer K. For each word in the string:
- If word length is even, reverse every K characters
- If word length is odd, swap characters at positions i and (length-1-i) only if their ASCII difference is divisible by K
- Count how many words become palindromes after transformation

Print the transformed string and palindrome count.

**Concepts:** String handling, Typecasting, Selection structures, For loops, Boolean operators

**Example Input:**
```
hello world test
2
```

**Example Output:**
```
Transformed: lehlo world tset
Palindromes: 0
```

---

## Challenge 7: Array Wave Detector
Input an array size and elements. Detect "wave patterns" where three consecutive elements form either a peak (a[i-1] < a[i] > a[i+1]) or valley (a[i-1] > a[i] < a[i+1]). Calculate:
- Total number of complete wave cycles (peak followed by valley or vice versa)
- The amplitude (max element - min element) of the largest wave cycle
- Print all wave cycle starting indices

**Concepts:** 1D arrays, Array traversal, Relational operators, Nested loops, Break/Continue

**Example Input:**
```
7
1 3 2 4 1 5 3
```

**Example Output:**
```
Complete wave cycles: 2
Largest amplitude: 4
Wave cycle positions: 0, 2
```

---

## Challenge 8: Custom Base Converter Matrix
Create a program that reads a 3×3 matrix of integers and a base (2-16). For each element:
- Convert it to the specified base
- Count digits in the converted representation
- Replace the element with (original value XOR digit count)

Print the transformed matrix and calculate the bitwise AND of all elements in each diagonal.

**Concepts:** 2D arrays, Bitwise operators, Typecasting, Math functions, Nested loops

**Example Input:**
```
10 15 20
25 30 35
40 45 50
2
```

**Example Output:**
```
Transformed Matrix:
14 12 22
28 27 32
46 42 49

Main diagonal AND: 8
Anti-diagonal AND: 0
```

---

## Challenge 9: String Subsequence Validator
Write a program that accepts two strings: main and pattern. Find all subsequences of main that:
- Have length equal to pattern length
- Contain at least 50% of pattern's characters
- Have alternating uppercase/lowercase if converted to title case
- The sum of ASCII values is divisible by the length

Print count of valid subsequences and the lexicographically smallest one.

**Concepts:** String handling, Nested loops, Boolean operators, Selection structures, Math functions

**Example Input:**
```
programming
gram
```

**Example Output:**
```
Valid subsequences: 3
Smallest: gram
```

---

## Challenge 10: Number Pyramid Filter
Ask for start, end, and magic number. For each number in range:
1. Calculate digit root (repeatedly sum digits until single digit)
2. Find sum of all divisors excluding the number itself
3. Check if (number % digit_root == 0) AND (divisor_sum % magic == 0) AND (number's reverse is prime)

Print qualifying numbers in a pyramid format where row i contains i numbers, padding with spaces for alignment.

**Concepts:** Nested loops, Math functions, Switch/If-else structures, Output formatting, Continue/Break

**Example Input:**
```
1
100
3
```

**Example Output:**
```
      11
    13  31
  17  71  79
```

---

## Difficulty Level
All challenges are designed to match the complexity of "Numbers That Feel Right" - requiring multiple concept integration, mathematical operations, conditional logic, and algorithmic thinking.