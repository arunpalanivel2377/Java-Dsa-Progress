# Chapter 4: Operators in Java

## Introduction
Operators in Java are special symbols that perform operations on variables and values. Java supports a rich set of operators, including arithmetic, relational, bitwise, logical, and assignment operators.

---

## Types of Operators in Java
Java provides the following types of operators:

1. **Arithmetic Operators**
2. **Relational (Comparison) Operators**
3. **Logical Operators**
4. **Bitwise Operators**
5. **Assignment Operators**
6. **Unary Operators**
7. **Ternary Operator**
8. **Instanceof Operator**
9. **Type Cast Operator**

---

## 1. Arithmetic Operators
These operators are used for mathematical calculations.

| Operator | Meaning | Example |
|----------|---------|---------|
| `+` | Addition | `a + b` |
| `-` | Subtraction | `a - b` |
| `*` | Multiplication | `a * b` |
| `/` | Division | `a / b` |
| `%` | Modulus (Remainder) | `a % b` |

### Example
```java
int a = 10, b = 5;
System.out.println(a + b); // 15
System.out.println(a - b); // 5
System.out.println(a * b); // 50
System.out.println(a / b); // 2
System.out.println(a % b); // 0
```

---

## 2. Relational (Comparison) Operators
These operators compare values and return a boolean result.

| Operator | Meaning | Example |
|----------|---------|---------|
| `==` | Equal to | `a == b` |
| `!=` | Not equal to | `a != b` |
| `>` | Greater than | `a > b` |
| `<` | Less than | `a < b` |
| `>=` | Greater than or equal to | `a >= b` |
| `<=` | Less than or equal to | `a <= b` |

### Example
```java
int a = 10, b = 5;
System.out.println(a > b);  // true
System.out.println(a < b);  // false
System.out.println(a == b); // false
```

---

## 3. Logical Operators
Used to perform logical operations.

| Operator | Meaning | Example |
|----------|---------|---------|
| `&&` | Logical AND | `a && b` |
| `||` | Logical OR | `a || b` |
| `!` | Logical NOT | `!a` |

### Example
```java
boolean a = true, b = false;
System.out.println(a && b); // false
System.out.println(a || b); // true
System.out.println(!a);     // false
```

---

## 4. Bitwise Operators
Used to manipulate bits.

| Operator | Meaning | Example |
|----------|---------|---------|
| `&` | Bitwise AND | `a & b` |
| `|` | Bitwise OR | `a | b` |
| `^` | Bitwise XOR | `a ^ b` |
| `~` | Bitwise Complement | `~a` |
| `<<` | Left Shift | `a << b` |
| `>>` | Right Shift | `a >> b` |

### Example
```java
int a = 5, b = 3;
System.out.println(a & b); // 1
System.out.println(a | b); // 7
System.out.println(a ^ b); // 6
System.out.println(~a);    // -6
System.out.println(a << 1); // 10
System.out.println(a >> 1); // 2
```

---

## 5. Assignment Operators
Used to assign values to variables.

| Operator | Meaning | Example |
|----------|---------|---------|
| `=` | Assigns value | `a = b` |
| `+=` | Add and assign | `a += b` (same as `a = a + b`) |
| `-=` | Subtract and assign | `a -= b` |
| `*=` | Multiply and assign | `a *= b` |
| `/=` | Divide and assign | `a /= b` |
| `%=` | Modulus and assign | `a %= b` |

### Example
```java
int a = 10;
a += 5; // a = 15
a *= 2; // a = 30
System.out.println(a);
```

---

## 6. Unary Operators
Used with a single operand.

| Operator | Meaning | Example |
|----------|---------|---------|
| `+` | Unary plus | `+a` |
| `-` | Unary minus | `-a` |
| `++` | Increment | `a++` or `++a` |
| `--` | Decrement | `a--` or `--a` |

### Example
```java
int a = 5;
System.out.println(++a); // 6
System.out.println(a--); // 6 (then decrements to 5)
```

---

## 7. Ternary Operator
The ternary operator (`? :`) is a shorthand for `if-else`.

### Syntax
```java
variable = (condition) ? value_if_true : value_if_false;
```

### Example
```java
int a = 10, b = 5;
int min = (a < b) ? a : b;
System.out.println(min); // 5
```

---

## 8. `instanceof` Operator
Used to check if an object is an instance of a class.

### Example
```java
String str = "Hello";
System.out.println(str instanceof String); // true
```

---

## 9. Type Cast Operator
Used to convert data types.

### Example
```java
double d = 10.5;
int i = (int) d;
System.out.println(i); // 10
```

---

## Summary
- Java provides various operators for arithmetic, comparison, logical, bitwise, and assignment operations.
- The ternary operator is a shorthand for `if-else`.
- The `instanceof` operator checks object type.
- Type casting allows conversion between different data types.

---

### ✅ Next: [Chapter 5 - Control Statements](./Ch4_Operators.md)

