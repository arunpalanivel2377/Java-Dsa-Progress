# Chapter 2: An Overview of Java

## 📌 Introduction
Java is a powerful, high-level programming language known for its portability, object-oriented nature, and robustness. This chapter provides an overview of Java’s fundamental characteristics and how it differs from other programming languages.

---

## 🚀 Evolution and Characteristics of Java
- Java was developed by **James Gosling** at Sun Microsystems in 1991.
- Released officially in **1995**.
- Acquired by **Oracle** in **2009**.
- Uses a **6-month release cycle** since **Java 9 (2017)**.

---

## 🎯 Key Features of Java
### 1️⃣ **Platform Independence**
   - Java uses **Java Virtual Machine (JVM)**, making it **Write Once, Run Anywhere (WORA)**.
   - Unlike C/C++, Java is not compiled into native machine code but into **bytecode**, which runs on any platform with a JVM.

### 2️⃣ **Object-Oriented**
   - Everything in Java revolves around objects and classes.
   - Supports OOP concepts like:
     - Encapsulation
     - Inheritance
     - Polymorphism
     - Abstraction

### 3️⃣ **Robust and Secure**
   - Strong memory management with **Garbage Collection**.
   - No explicit pointers, reducing security vulnerabilities.
   - Exception handling to prevent unexpected crashes.

### 4️⃣ **Multithreading & Performance**
   - Java supports **multithreading**, allowing efficient CPU utilization.
   - **Just-In-Time (JIT) compiler** optimizes performance.

### 5️⃣ **Rich API and Libraries**
   - Java provides extensive built-in libraries for:
     - **Networking** (`java.net`)
     - **Database Connectivity** (`JDBC`)
     - **Data Structures** (`java.util`)
     - **Concurrency** (`java.util.concurrent`)

### 6️⃣ **Open-Source and Community Support**
   - Strong support from the **Java community**.
   - Open-source frameworks like **Spring, Hibernate, and Apache**.

---

## 🔄 Java Development Process
1️⃣ **Write Code:** Create a `.java` file with Java code.
2️⃣ **Compile:** Use `javac` to convert Java code into bytecode (`.class` file).
3️⃣ **Execute:** Run the bytecode using `java` command in JVM.

Example:
```java
// Simple Java Program
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

Compilation:
```sh
javac HelloWorld.java
java HelloWorld
```

---

## 🌍 Java Editions
Java has different editions tailored for specific application domains:
- **Java SE (Standard Edition):** Core Java programming.
- **Java EE (Enterprise Edition):** Web and enterprise applications.
- **Java ME (Micro Edition):** Mobile and embedded systems.

---

## 📌 Conclusion
Java's flexibility, platform independence, and rich ecosystem make it one of the most widely used programming languages. It is used in various domains like **web development, mobile apps, cloud computing, AI, and IoT**.

---

🔹 **Next Chapter:** Data Types, Variables, and Arrays →
