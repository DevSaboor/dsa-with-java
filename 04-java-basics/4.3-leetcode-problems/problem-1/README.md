# 🧩 LeetCode #1281 — Subtract the Product and Sum of Digits of an Integer

## 🎯 Goal

Given an integer `n`, calculate the **sum of its digits** and the **product of its digits**, then return the difference:

```text
Product of digits - Sum of digits
```

---

## 📋 Problem

Given an integer number `n`, return the difference between the product of its digits and the sum of its digits.

### Example 1

```text
Input: n = 234

Product of digits = 2 × 3 × 4 = 24
Sum of digits = 2 + 3 + 4 = 9

Result = 24 - 9 = 15
```

### Example 2

```text
Input: n = 4421

Product of digits = 4 × 4 × 2 × 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11

Result = 32 - 11 = 21
```

---

## 🧠 Concepts Practiced

* `int`
* `%` modulo operator
* Integer division `/`
* `while` loop
* Variables and accumulation
* Arithmetic operations
* Digit extraction

---

## 🔑 Key Technique

The problem requires processing **one digit at a time**.

For an integer such as:

```text
234
```

The last digit can be extracted using:

```text
234 % 10 → 4
```

The last digit can then be removed using integer division:

```text
234 / 10 → 23
```

Repeating this process allows every digit to be processed:

```text
234
 ↓
4   ← 234 % 10
 ↓
23  ← 234 / 10

23
 ↓
3   ← 23 % 10
 ↓
2   ← 23 / 10

2
 ↓
2   ← 2 % 10
 ↓
0   ← 2 / 10
```

---

## 💡 Hints

### Hint 1 — Two Accumulators

You need to keep track of two separate values:

```text
sum
product
```

Think about what their initial values should be.

> ⚠️ Remember: multiplication has a different natural starting value than addition.

---

### Hint 2 — Extract the Digit

Use the modulo operator to obtain the **last digit** of `n`.

```text
n % 10
```

Store that digit so you can use it for both calculations.

---

### Hint 3 — Process the Digit

Once you have the digit, update both:

```text
sum
product
```

The sum should accumulate by **addition**.

The product should accumulate by **multiplication**.

---

### Hint 4 — Remove the Digit

After processing the current digit, use integer division to remove it:

```text
n / 10
```

Store the result back into `n`.

---

### Hint 5 — Loop Condition

Continue processing digits while there are still digits remaining.

Think about what happens to `n` after repeatedly dividing it by `10`:

```text
234 → 23 → 2 → 0
```

---

### Hint 6 — Final Result

Once every digit has been processed, you have:

```text
sum
product
```

The required answer is the **difference between them**.

---

## 🔄 Algorithm Flow

```text
             Start
               │
               ▼
        Initialize sum
        Initialize product
               │
               ▼
        Is n still > 0?
          /          \
        Yes           No
         │             │
         ▼             ▼
   Extract digit    Calculate
      n % 10        product - sum
         │             │
         ▼             ▼
   Update sum       Return result
   Update product
         │
         ▼
    Remove digit
      n / 10
         │
         └──────────────► Repeat
```

---

## ⚠️ Important Detail

Why does `product` start at `1` instead of `0`?

Consider what would happen if you started with:

```text
product = 0
```

and then multiplied it by the first digit.

Think about:

```text
0 × digit
```

This is an important example of choosing the correct **initial value for an accumulator**.

---

## 📊 Complexity

If `n` contains `d` digits:

* **Time:** `O(d)`
* **Space:** `O(1)`

The algorithm processes each digit exactly once and uses only a constant amount of extra space.

---

## 🎯 Learning Objective

This problem is an introduction to **digit manipulation**.

The key pattern to remember is:

```text
        Extract              Remove
           │                    │
           ▼                    ▼
        n % 10                n / 10
           │                    │
           ▼                    │
      Process digit              │
           │                    │
           └─────────┬──────────┘
                     ▼
                  Repeat
```

This `% 10` + `/ 10` technique will become useful in many number-based algorithm problems.
