# ☕ Java — Input/Output, Debugging, Data Types & Type Conversion
---
# 1. ⚙️ How Java Programs Work

Java programs go through **compilation** and **execution** before they actually run.

<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/3d627bad-109a-4ae5-90c5-c71ba6957394" />

### Compilation

```bash
javac Main.java
```

The Java compiler (`javac`) translates human-readable Java source code into **bytecode**, stored in a `.class` file.

```text
Main.java → javac → Main.class
```

### Execution

```bash
java Main
```

The JVM loads the bytecode and executes it. The JVM may interpret bytecode and/or compile frequently executed code using the **JIT (Just-In-Time) compiler**.

### Platform Independence

Java bytecode is designed to be platform-independent.

<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/eb296aa4-1042-4019-a410-75b022db5a22" />

The same `.class` bytecode can run on different operating systems as long as an appropriate JVM is available.

> **WORA:** Write Once, Run Anywhere.

---

# 2. 📄 Structure of a Java File

A Java source file uses the `.java` extension.

A simple Java application:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

## Public Class and Filename

If a class is declared `public`, the filename must match that class name exactly, including capitalization.

```text
Main.java
   │
   └── public class Main
```

This would be invalid:

```text
Demo.java

public class Main {
}
```

because the public class is `Main`, while the file is `Demo.java`.

A file can contain other **non-public classes** whose names don't match the filename:

```java
class Divide {
    // No requirement for filename to be Divide.java
}
```

### Naming Convention

Java class names conventionally begin with an uppercase letter:

```java
class Student
class Calculator
class Main
```

This is a **convention**, not a requirement.

---

# 3. 📦 Packages

A package groups related Java classes and provides a namespace for organizing code.

```java
package com.example;
```

A package structure is conventionally represented by directories:

```text
com
└── example
    ├── File1.java
    └── File2.java
```

Packages become especially useful as projects grow and contain many classes.

---

# 4. 🚪 The `main()` Method

The standard entry point of a standalone Java application is:

```java
public static void main(String[] args) {
    // program starts here
}
```

### Breaking It Down

| Part            | Meaning                                                         |
| --------------- | --------------------------------------------------------------- |
| `public`        | Allows the JVM to access the method                             |
| `static`        | Allows the method to be called without creating a `Main` object |
| `void`          | Method doesn't return a value                                   |
| `main`          | Recognized entry-point method name                              |
| `String[] args` | Array containing command-line arguments                         |

---

# 5. 🖨️ Output in Java

Java commonly uses `System.out` for console output.

```java
System.out.println("Hello");
System.out.print("World");
```

### `println()`

Prints the value and moves to the next line.

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```text
Hello
World
```

### `print()`

Prints without automatically adding a newline.

```java
System.out.print("Hello ");
System.out.print("World");
```

Output:

```text
Hello World
```

### Understanding `System.out.println()`

```java
System.out.println("Hello");
```

Conceptually:

```text
System  → class
  │
  └── out → output stream
             │
             └── println() → method
```

---

# 6. 🔨 Compiling and Running Java

Compile:

```bash
javac Demo.java
```

This normally produces:

```text
Demo.class
```

Run:

```bash
java Demo
```

Notice that you normally **don't write `.class`** when using `java`:

```bash
java Demo
```

not:

```bash
java Demo.class
```

### Choosing the Output Directory

The `-d` option specifies where compiled class files should be placed:

```bash
javac -d <path> Demo.java
```

### `PATH`

On Linux, you can inspect the executable search path with:

```bash
echo $PATH
```

`PATH` is an environment variable containing directories that the shell searches when you enter commands.

---

# 7. 🔢 Primitive Data Types

Java is **strongly typed**, meaning variables have defined types.

Java has eight primitive data types:

| Type      |  Typical Size | Purpose                  | Example                   |
| --------- | ------------: | ------------------------ | ------------------------- |
| `byte`    |        8 bits | Small integers           | `byte b = 100;`           |
| `short`   |       16 bits | Small integers           | `short s = 5000;`         |
| `int`     |       32 bits | General integers         | `int n = 10;`             |
| `long`    |       64 bits | Large integers           | `long n = 234587293847L;` |
| `float`   |       32 bits | Single-precision decimal | `float p = 3.14f;`        |
| `double`  |       64 bits | Double-precision decimal | `double d = 98.4523;`     |
| `char`    |       16 bits | Single UTF-16 code unit  | `char c = 'A';`           |
| `boolean` | JVM-dependent | Logical value            | `boolean flag = true;`    |

> Java does not specify `boolean` as exactly 1 bit. Its storage representation is implementation-dependent.

### Examples

```java
int rollno = 64;
char letter = 'r';
float marks = 98.67f;
double decimal = 4567654.4567;
long largeInteger = 34567834567876543L;
boolean check = false;
```

---

# 8. 🧩 Important Literal Rules

A **literal** is a value written directly in source code.

```java
int a = 10;
```

Here:

```text
a  → identifier
10 → literal
```

## Decimal Literals

Decimal/floating-point literals are `double` by default:

```java
double x = 7.2;
```

To make the literal a `float`, use `f` or `F`:

```java
float x = 7.2f;
```

## Long Literals

Integer literals are generally treated as `int` when possible.

For a `long` literal, use `L` or `l`:

```java
long population = 345678345678L;
```

Using uppercase `L` is generally preferred because lowercase `l` can look like `1`.

---

# 9. 🏷️ Identifiers vs Literals

### Identifier

A name assigned to something in the program:

```java
int age = 18;
```

Here:

```text
age → identifier
```

Identifiers can be names of:

* Variables
* Methods
* Classes
* Packages
* Interfaces

### Literal

The actual value written in the code:

```java
int age = 18;
```

Here:

```text
18 → literal
```

---

# 10. 🔢 Numeric Literal Improvements

Underscores can make large numbers easier to read:

```java
int amount = 10_00_000;
```

The compiler treats it as:

```text
1000000
```

The underscores are only for readability.

### Other Number Systems

#### Octal

Starts with `0`:

```java
int x = 07;
```

Only digits `0–7` are valid.

```java
int x = 09; // invalid octal literal
```

#### Hexadecimal

Starts with `0x` or `0X`:

```java
int x = 0xFF;
```

#### Binary

Supported since Java 7:

```java
int x = 0b1010;
```

`0b1010` represents decimal `10`.

### Boolean Values

Java does **not** treat `true`/`false` as `1`/`0`.

```java
boolean flag = true;
```

This is not valid:

```java
boolean flag = 1; // ❌
```

---

# 11. 📝 Comments

Comments are ignored by the compiler.

### Single-Line Comment

```java
// This is a comment
```

### Multi-Line Comment

```java
/*
   This is a
   multi-line comment.
*/
```

---

# 12. 🧱 Wrapper Classes

Primitive types are not objects.

Java also provides wrapper classes that represent primitive values as objects:

| Primitive | Wrapper     |
| --------- | ----------- |
| `byte`    | `Byte`      |
| `short`   | `Short`     |
| `int`     | `Integer`   |
| `long`    | `Long`      |
| `float`   | `Float`     |
| `double`  | `Double`    |
| `char`    | `Character` |
| `boolean` | `Boolean`   |

For example:

```java
int x = 10;
Integer y = 10;
```

`Integer` is a class, while `int` is a primitive type.

---

# 13. ⌨️ Taking Input with `Scanner`

The `Scanner` class from `java.util` can read input from standard input.

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
```

### Components

```text
Scanner
   │
   └── class used for reading input

input
   │
   └── Scanner object

new
   │
   └── creates an object

System.in
   │
   └── standard input
```

---

## Reading Different Types

```java
int rollno = input.nextInt();

float marks = input.nextFloat();

String name = input.next();

String fullName = input.nextLine();
```

### `next()`

Reads one token/word and stops at whitespace.

Input:

```text
Hey Saboor
```

```java
String name = input.next();
```

Result:

```text
Hey
```

### `nextLine()`

Reads the complete line.

Input:

```text
Hey Saboor
```

```java
String name = input.nextLine();
```

Result:

```text
Hey Saboor
```

### Quick Comparison

| Method         | Reads         |
| -------------- | ------------- |
| `nextInt()`    | Integer       |
| `nextFloat()`  | Float         |
| `nextDouble()` | Double        |
| `next()`       | One token     |
| `nextLine()`   | Complete line |

---

# 14. 🔄 Type Conversion

Type conversion means converting a value from one data type to another.

There are two major forms:

```text
Type Conversion
├── Widening / Implicit
└── Narrowing / Explicit Casting
```

---

# 15. 📈 Widening — Automatic Conversion

Widening occurs when a value is converted to a compatible type that can represent a broader set of values.

For example:

```java
int i = 100;
long l = i;
float f = l;
```

Java can perform these conversions automatically.

A commonly used widening relationship is:

```text
byte → short → int → long → float → double
```

`char` also participates in numeric widening conversions, with `char` converting to `int` and above.

Example:

```java
int num = 55;
float f = num;
```

No explicit cast is required.

---

# 16. 📉 Narrowing — Explicit Casting

Narrowing converts a value to a type that may not be able to represent the original value completely.

An explicit cast is required:

```java
double d = 100.04;
long l = (long) d;
```

Result:

```text
100.04 → 100
```

The fractional portion is discarded.

Another example:

```java
int val = (int) 67.89;
```

Result:

```text
67
```

Casting does **not** round the decimal. It truncates the fractional part.

---

# 17. ⚠️ Overflow During Narrowing

Suppose an `int` is cast to a `byte`.

A `byte` can represent:

```text
-128 → 127
```

There are 256 possible values.

```java
int a = 257;
byte b = (byte) a;
```

The result is:

```text
257 % 256 = 1
```

So:

```text
b = 1
```

The important idea is that when an integer value is narrowed to a smaller signed integer type, the low-order bits are retained, producing the corresponding value in the target type's range.

---

# 18. ⬆️ Automatic Type Promotion in Expressions

Java also promotes operands while evaluating arithmetic expressions.

### Rule 1 — `byte`, `short`, and `char`

These are promoted to at least `int` during most arithmetic operations.

```java
byte a = 40;
byte b = 50;
byte c = 100;

int d = (a * b) / c;
```

Even though `a`, `b`, and `c` are `byte`, the arithmetic is performed using `int`.

Therefore:

```text
a * b
↓
40 * 50
↓
2000
```

The intermediate calculation does not overflow a `byte`.

---

## Why This Doesn't Compile

```java
byte b = 50;

b = b * 2;
```

`b * 2` produces an `int`, not a `byte`.

Therefore:

```text
byte × int → int
```

and Java does not automatically narrow that `int` back to `byte`.

A cast would be required:

```java
b = (byte) (b * 2);
```

---

# 19. 📊 Promotion by Larger Types

If an expression contains a larger numeric type, other operands are promoted accordingly.

For example:

```text
byte + long   → long
long + float  → float
float + double → double
```

The expression generally moves toward the widest applicable type present.

---

# 20. 🧮 Worked Promotion Example

```java
byte b = 42;
char c = 'a';
short s = 1024;
int i = 50000;
float f = 5.67f;
double d = 0.1234;

double result = (f * b) + (i / c) - (d * s);
```

Break it down:

### `f * b`

```text
float × byte
     ↓
byte promoted to float
     ↓
float
```

### `i / c`

```text
int ÷ char
    ↓
char promoted to int
    ↓
int
```

### `d * s`

```text
double × short
       ↓
short promoted to double
       ↓
double
```

Now:

```text
float + int - double
          ↓
       double
```

Therefore:

```java
result
```

is a `double`.

---

# 21. 🌍 Unicode and `char`

Java supports Unicode text.

A `char` represents a UTF-16 code unit.

```java
char ch = 'A';
```

A `char` can participate in numeric expressions:

```java
char ch = 'A';
int value = ch;
```

For `'A'`, the numeric value is:

```text
65
```

Java can also output Unicode text:

```java
System.out.println("नमस्ते");
```

---

# 22. 🐞 Debugging in IntelliJ IDEA

Debugging allows you to observe how a program executes instead of simply seeing the final output.

### 1. Set a Breakpoint

Click the left gutter beside a line of code.

```text
int a = 10;      ← breakpoint
```

Execution pauses when it reaches that line.

### 2. Start Debugging

In IntelliJ IDEA:

```text
Shift + F9
```

### 3. Step Through the Program

| Shortcut | Action         |
| -------- | -------------- |
| `F8`     | Step Over      |
| `F7`     | Step Into      |
| `F9`     | Resume Program |

**Step Over (`F8`)**

Executes the current line and moves to the next line.

**Step Into (`F7`)**

Enters the method being called.

**Resume (`F9`)**

Continues execution until the next breakpoint or program completion.

### Variables Window

The debugger displays the current values of variables.

You can also inspect and, where supported, modify variable values while paused.

---

# 23. 🔀 Basic Control Flow

These concepts are used in the practical programs and debugging exercises.

## `if-else`

```java
if (condition) {
    // executes when condition is true
} else {
    // executes when condition is false
}
```

Example:

```java
int salary = 25400;

if (salary > 10000) {
    salary += 2000;
} else {
    salary += 1000;
}
```

## `while`

Useful when the number of iterations depends on a condition.

```java
int count = 1;

while (count != 5) {
    System.out.println(count);
    count++;
}
```

## `for`

Useful when the loop structure is naturally expressed with initialization, condition, and update.

```java
for (int count = 1; count != 5; count++) {
    System.out.println(count);
}
```

> **Note:** Full conditionals, loops, and `switch` statements are covered more thoroughly in the next lesson.

---

# 24. 🧪 Practical Programs

## 1. Sum of Two Numbers

```java
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}
```

---

## 2. Celsius → Fahrenheit

Formula:

```text
°F = (°C × 9 / 5) + 32
```

```java
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter temp in C: ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9 / 5) + 32;

        System.out.println("Temp in Fahrenheit: " + tempF);
    }
}
```

---

## 3. Prime Number Check

A number is prime if it has exactly two positive divisors:

```text
1 and itself
```

Instead of checking every number from `2` to `n - 1`, we only need to check up to:

```text
√n
```

```java
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = in.nextInt();

        if (n <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }

        int c = 2;

        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("Not Prime");
                return;
            }

            c++;
        }

        System.out.println("Prime");
    }
}
```

### Why `√n`?

If a number `n` has a factor larger than `√n`, its corresponding factor must be smaller than `√n`.

For example:

```text
36 = 4 × 9
```

One factor is below `√36 = 6`, while the other is above it.

Therefore, if no divisor exists up to `√n`, there cannot be another factor beyond it.
---

# 27. 📌 Key Takeaways

* Java source code is compiled with `javac` into `.class` bytecode.
* The JVM executes bytecode through interpretation and/or JIT compilation.
* Java bytecode enables platform independence through platform-specific JVMs.
* A `public` class must have the same name as its `.java` file.
* `public static void main(String[] args)` is the standard application entry point.
* `System.out.print()` doesn't add a newline; `println()` does.
* `Scanner` reads input from standard input.
* `next()` reads one token, while `nextLine()` reads an entire line.
* Java has eight primitive data types.
* Decimal literals are `double` by default; use `f`/`F` for `float`.
* Large integer literals may require the `L` suffix for `long`.
* Identifiers are names; literals are actual values written in source code.
* Wrapper classes such as `Integer` and `Double` represent primitive values as objects.
* Widening conversions can happen automatically.
* Narrowing conversions generally require explicit casting.
* Casting a floating-point value to an integer removes its fractional portion.
* Narrowing an integer can cause overflow/wrapping when the value cannot be represented by the target type.
* `byte`, `short`, and `char` are promoted to `int` during arithmetic.
* Larger types such as `long`, `float`, and `double` influence the resulting type of arithmetic expressions.
* Debuggers allow execution to be paused and inspected line by line.
* Prime checking can be optimized by testing divisors only up to `√n`.
* `if`, `while`, and `for` have been introduced here; their broader use belongs to the next lesson.
