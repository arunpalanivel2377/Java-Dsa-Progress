
```markdown
# Java 101 – Everything You Need to Know: Basics, JDK Installation & First Code

## 📌 1. What is Java?
Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle). It is widely used for web development, mobile apps (Android), enterprise applications, and competitive programming.

### ✅ Key Features of Java:
- 🔹 **Write Once, Run Anywhere (WORA)** – Java code runs on any platform with JVM (Java Virtual Machine).
- 🔹 **Object-Oriented** – Uses classes and objects for structured programming.
- 🔹 **Secure & Robust** – Handles memory management and exception handling efficiently.
- 🔹 **Multithreaded** – Can handle multiple tasks simultaneously for better performance.

---

## 📌 2. Why Learn Java?
Java is used in various domains, making it a valuable skill for developers:

### ✅ Applications:
- ✅ **Android Development** – Used to build Android apps.
- ✅ **Backend Development** – Used in Spring Boot, Hibernate, and REST APIs.
- ✅ **Competitive Programming & DSA** – Fast execution and rich libraries.
- ✅ **IoT & Embedded Systems** – Used in smart devices and automation.

---

## 📌 3. A Brief History of Java
- 🔹 **1991**: Java was originally called "Oak", created by James Gosling and his team at Sun Microsystems.
- 🔹 **1995**: Renamed to "Java", inspired by Java coffee beans from Indonesia.
- 🔹 **1996**: Java 1.0 released with the WORA philosophy.
- 🔹 **2009**: Oracle Corporation acquired Sun Microsystems.
- 🔹 **Present**: Java is continuously updated, with **Java 24** being the latest version.

---

## 📌 4. How to Install Java (JDK) on Your System

### 🔹 Step 1: Download JDK
1. Visit the official download page: [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Choose the latest Java SE Development Kit.
3. Download the version for your OS (Windows/macOS/Linux).

### 🔹 Step 2: Install JDK
1. Open the downloaded file and follow the installation steps.
2. Note the installation path (e.g., `C:\Program Files\Java\jdk-XX.X.X`).

### 🔹 Step 3: Set Up Java Environment Variables (Windows)
1. Search for **"Environment Variables"** in the Start menu.
2. Under **System Variables**, select **Path → Edit → New**.
3. Add the Java bin path:  
   `C:\Program Files\Java\jdk-XX.X.X\bin`
4. Click **OK** and restart your PC.

### 🔹 Step 4: Verify Installation
Open **Command Prompt** or **Terminal**, then type:

```bash
java -version
```

### ✅ Output:
```
java version "23.0.2" 2025-01-21
Java(TM) SE Runtime Environment (build 23.0.2+7-58)
Java HotSpot(TM) 64-Bit Server VM (build 23.0.2+7-58, mixed mode, sharing)
```

---

## 📌 5. Install an IDE (Optional but Recommended)

To make Java development easier, use an IDE:

- ✅ **IntelliJ IDEA** (Best for beginners)  
- ✅ **Eclipse** (Popular for Java development)  
- ✅ **VS Code** (With Java extensions – Lightweight alternative)

**Download Links:**
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)  
- [VS Code](https://code.visualstudio.com/)

---

## 📌 6. Your First Java Program

### 🔹 Step 1: Write the Code

Create a file called `HelloWorld.java` and add the following:

```java
// Simple Java Program
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### 🔹 Step 2: Compile the Code

Open terminal or command prompt, navigate to the file location, and type:

```bash
javac HelloWorld.java
```

### 🔹 Step 3: Run the Program

```bash
java HelloWorld
```

### ✅ Output:
```
Hello, Java!
```

---

## 📌 7. Understanding the Code

- 🔹 `public class HelloWorld {}` → Defines a Java class named `HelloWorld`.
- 🔹 `public static void main(String[] args) {}` → Entry point of Java programs.
- 🔹 `System.out.println("Hello, Java!");` → Prints to console.

---

## 📌 8. Common Errors & Fixes

❌ **Error**: `'javac' is not recognized as an internal or external command`  
✅ **Fix**: Add Java bin path to Environment Variables.

❌ **Error**: `Main method not found in class HelloWorld`  
✅ **Fix**: Ensure the main method is defined as:

```java
public static void main(String[] args)
```

---

## 📌 9. Next Steps

🎯 Now that you've written your first Java program, here’s what to learn next:

- ✅ Java Syntax (Classes, Methods, main() method, Print Statements)
- ✅ Operators & Control Statements
- ✅ Loops, Arrays & Functions

📘 Stay tuned for the next blog: **"Understanding Java Syntax & Variables"** 🚀

---

## 📌 Summary

- ✅ Java is platform-independent, object-oriented, and widely used.
- ✅ JDK (Java Development Kit) is required to run Java programs.
- ✅ You’ve written and executed your first Hello World Java program.

---
```

