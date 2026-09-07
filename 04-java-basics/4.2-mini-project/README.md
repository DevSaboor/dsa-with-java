# 🛠️ Mini-Project — Unit Converter CLI

## 🎯 Goal

Build a **command-line unit converter** that accepts user input, performs different unit conversions, and displays the results.

This project combines several Java fundamentals you've learned so far into one small interactive program.

---

## 🧠 Concepts Used

* `Scanner`
* Primitive data types
* Arithmetic expressions
* Type conversion
* Type promotion
* `if-else`
* `while` loop
* Console input/output

---

## 📋 Requirements

Create a menu similar to:

```text
===== Unit Converter =====

1. Celsius → Fahrenheit
2. Celsius → Kelvin
3. Kilometers → Miles
4. Exit

Enter your choice:
```

Your program should:

1. Display the conversion menu.
2. Read the user's choice.
3. Ask for the required value.
4. Perform the selected conversion.
5. Display the converted value.
6. Return to the menu after completing a conversion.
7. Continue running until the user selects **Exit**.
8. Handle an invalid menu choice appropriately.

---

## 📐 Conversion Formulas

Use the following formulas:

```text
Fahrenheit = (Celsius × 9 / 5) + 32

Kelvin = Celsius + 273.15

Miles = Kilometers × 0.621371
```

### Example

If the user enters:

```text
Celsius = 25
```

The program should calculate:

```text
Fahrenheit = 77.0
Kelvin = 298.15
```

---

## 🔄 Suggested Program Flow

Think about the program as a loop:

<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/1f18d1d3-b040-422f-94ed-53e8a0f998be" />

You decide how to translate this flow into Java.

---

## 💡 Hints

### Hint 1 — User Input

Use `Scanner` to read both:

* The menu choice
* The value being converted

---

### Hint 2 — Choosing the Conversion

You need to execute different code depending on the user's menu choice.

Which Java control structure have you learned that is suitable for this?

```text
if
else if
else
```

---

### Hint 3 — Repeating the Menu

The menu should continue appearing until the user chooses **Exit**.

Ask yourself:

> Which loop can repeatedly execute the menu and stop when a condition becomes false?

---

### Hint 4 — Data Type

The conversion results can contain decimal values.

For example:

```text
298.15
15.534275
```

Consider which primitive data type is appropriate for these calculations.

---

### Hint 5 — Exit

You need a way to stop the loop when the user selects option `4`.

Think about how the loop's condition can depend on the user's choice.

---

## ⚠️ Optional Challenge — Absolute Zero

Add input validation for Celsius temperatures.

A temperature below absolute zero is physically invalid:

```text
Celsius < -273.15
```

If the user enters such a value:

```text
Invalid temperature.
```

should be displayed instead of calculating the Kelvin conversion.

### Challenge

Try implementing this yourself using the conditional statements you've learned.

---

## 🚫 Constraints

* Use `Scanner` for input.
* Do not use external libraries.
* Use appropriate primitive data types.
* Do not cast values unnecessarily.
* Use only concepts learned so far.
* Keep the program as a CLI application.
* Do not use advanced Java features that haven't been covered yet.

---

## 🏁 Completion Criteria

Consider the project complete when your program can:

* [ ] Display the menu
* [ ] Accept a user's choice
* [ ] Convert Celsius → Fahrenheit
* [ ] Convert Celsius → Kelvin
* [ ] Convert Kilometers → Miles
* [ ] Display conversion results
* [ ] Return to the menu after each conversion
* [ ] Exit when requested
* [ ] Handle invalid choices
* [ ] Reject temperatures below absolute zero *(optional)*

---

## 🎯 What This Project Should Teach You

The objective isn't just to make a converter.

You should practice **combining individual Java fundamentals into a complete program**:

```text
Input
  ↓
Decision
  ↓
Calculation
  ↓
Output
  ↓
Repetition
  ↺
```

Try to solve the project **without looking for a complete solution first**. If you get stuck, use the hints above to identify the concept you need rather than immediately copying code.
