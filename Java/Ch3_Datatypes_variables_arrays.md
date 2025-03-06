# Chapter 3: Variables, Data Types, and Arrays

## Data Types

Data types define the type of data a variable can hold, such as integers, floating-point numbers, characters, or boolean values.

### Java is a Strongly Typed Language

Java has 8 primitive data types, categorized into four groups:

1. **Integer Types** → `byte`, `short`, `int`, `long`
2. **Floating Point Types** → `float`, `double`
3. **Character Type** → `char`
4. **Boolean Type** → `boolean` (true, false)

| Data Type | Size | Bits | Range |
|-----------|------|------|--------------------------------------|
| `byte` | 1 byte | 8 bits | -128 to 127 |
| `short` | 2 bytes | 16 bits | -32,768 to 32,767 |
| `int` | 4 bytes | 32 bits | -2^31 to 2^31-1 |
| `long` | 8 bytes | 64 bits | -2^63 to 2^63-1 |
| `float` | 4 bytes | 32 bits | 6-7 decimal digits |
| `double` | 8 bytes | 64 bits | 15 decimal digits |
| `char` | 2 bytes | 16 bits | Unicode characters (0 - 65535) |
| `boolean` | 1 byte | 8 bits | `true` or `false` |

### Type Promotion in Expressions

- `byte` and `short` are promoted to `int` in expressions.
- Arithmetic operations with integers return `int` unless `long` is involved.

### Floating Point

- `float` → 32-bit (single precision)
- `double` → 64-bit (double precision, **default in Java**)
- Math functions return `double` values.

### Character and Boolean

- `char` uses Unicode encoding (16-bit).
- `boolean` has only two possible values: `true` or `false`.

## Integer Literals

Java supports various number systems:

- **Decimal (base 10)** → `int x = 100;`
- **Octal (base 8)** → `int x = 0123;` // Prefix `0`
- **Hexadecimal (base 16)** → `int x = 0x1A3F;` // Prefix `0x`
- **Binary (base 2)** → `int x = 0b1010;` // Prefix `0b`
- **Underscore separator** → `int x = 123_45_67_89_0;` (Allowed in Java for readability)

## Special Characters in Strings

| Escape Sequence | Meaning |
|----------------|---------|
| `\ddd` | Octal characters |
| `\uxxxx` | Unicode characters |
| `\'` | Single quote |
| `\"` | Double quotes |
| `\\` | Backslash |
| `\r` | Carriage return |
| `\n` | New line |
| `\f` | Form feed |
| `\t` | Tab |
| `\b` | Backspace |

---

## Variables

Variables store values temporarily during program execution.

### Declaring a Variable
```java
// Syntax:
type identifier [= value] [, identifier [= value] ...];
```

#### Example:
```java
int a, b, c;
int d = 10, e, f = 45;
byte z = 99;
double pi = 3.14159;
char x = 'x';
```

### Dynamic Initialization
```java
int a = 45, b = 77;
double c = Math.sqrt(a * a + b * b); // Initialized dynamically
```

### Scope and Lifetime of Variables

| Scope | Description |
|-------|-------------|
| **Global Scope** | Variables accessible throughout the class |
| **Local Scope** | Variables declared within a method or block |

### Type Conversion and Casting

#### Implicit Type Conversion (Widening Casting):
```java
int num = 10;
double d = num; // int to double (automatic conversion)
```
**Compatible conversions:**
- `int` → `long`
- `int` → `double`
- `int` → `float`
- `short` → `int`
- `byte` → `short`

#### Explicit Type Casting (Narrowing Casting):
```java
double d = 99.99;
int num = (int) d; // Explicit casting (double to int)
```
- **Narrowing conversions may cause data loss.**

---

## Arrays

An **array** is a collection of elements of the same data type, stored in contiguous memory locations.

### One-Dimensional Array
```java
// Declaring and initializing an array
int arr[] = new int[12];

// Initializing values directly
int months[] = {12, 45, 78};
```
**Array indexing starts at 0 and ends at `length-1`**

#### **Visual Representation:**
```
Index:   0   1   2
Values:  12  45  78
```

**Accessing Elements:**
```java
System.out.println(arr[0]); // Prints 12
```

**Out-of-bounds Access:**
```java
arr[100] = 5; // Runtime Error: ArrayIndexOutOfBoundsException
```

---

### Multidimensional Arrays
```java
// Declaring a 2D array
int matrix[][] = new int[4][5];
```

#### **Visual Representation:**
```
[ [ 0, 0, 0, 0, 0 ],
  [ 0, 0, 0, 0, 0 ],
  [ 0, 0, 0, 0, 0 ],
  [ 0, 0, 0, 0, 0 ] ]
```

**Initializing a 2D Array:**
```java
int matrix[][] = {
    {1, 2, 3, 4, 5},
    {6, 7, 8, 9, 10},
    {11, 12, 13, 14, 15},
    {16, 17, 18, 19, 20}
};
```

---

## Summary

- Java has **8 primitive data types** categorized into integers, floating points, characters, and booleans.
- **Type promotion** occurs automatically in expressions.
- **Variables** must be declared before use.
- **Type conversion** can be implicit (widening) or explicit (narrowing).
- **Arrays** store multiple values of the same type and can be **one-dimensional or multidimensional**.

---

## GitHub Formatting Guide
- **Use tables for structured data.**
- **Use fenced code blocks for syntax highlighting.**
- **Use escape sequences for special characters in Java strings.**
- **Use visuals like diagrams (if needed) for better understanding.**

---