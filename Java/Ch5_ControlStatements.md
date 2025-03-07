# Chapter 5: Control Statements

## Introduction
Control statements determine the flow of execution in a Java program. Java provides three types of control statements:
1. **Selection Statements** (`if`, `if-else`, `switch`)
2. **Iteration Statements** (`for`, `while`, `do-while`)
3. **Jump Statements** (`break`, `continue`, `return`)

---

## 1. Selection Statements
### if-else Statement
```java
if (condition) {
    // Code executes if condition is true
} else {
    // Code executes if condition is false
}
```
**Example:**
```java
int age = 18;
if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible to vote");
}
```

### switch Statement (Updated in Java 14)
The `switch` statement is used to execute one block of code from multiple options.

#### **Traditional switch**
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Other day");
}
```

#### **Enhanced switch (Java 14+)**
- **No need for `break`**
- **Return values directly**
```java
int day = 3;
String result = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3, 4 -> "Midweek";
    default -> "Other day";
};
System.out.println(result);
```

---

## 2. Iteration Statements
### while Loop
Executes the block **while** the condition is `true`.
```java
while (condition) {
    // Statements
}
```

### do-while Loop
Executes at least **once** before checking the condition.
```java
do {
    // Statements
} while (condition);
```

### for Loop
```java
for (initialization; condition; update) {
    // Statements
}
```
**Example:**
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### Enhanced for Loop (for-each)
Used to iterate over arrays and collections.
```java
int[] numbers = {1, 2, 3};
for (int num : numbers) {
    System.out.println(num);
}
```

---

## 3. Jump Statements
### break Statement
Exits the loop immediately.
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;
    System.out.println(i);
}
```

### continue Statement
Skips the current iteration and continues.
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) continue;
    System.out.println(i);
}
```

### return Statement
Exits from a method.
```java
void display() {
    System.out.println("Hello");
    return;
}
```

---

## Summary
- **Selection Statements:** `if-else`, `switch` (Enhanced in Java 14)
- **Iteration Statements:** `for`, `while`, `do-while`
- **Jump Statements:** `break`, `continue`, `return`

---

### ✅ Next: [Chapter 6 - Classes and Objects](./Ch6_Classes_Objects.md)  
---Coming Soon---


