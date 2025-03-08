# Classes in Java
A class is a blueprint for creating objects. It defines fields (variables) and methods (functions) that describe the behavior of objects.

## Class Declaration
A class is declared using the class keyword:

```
public class MyClass {
    int x = 10; // Instance variable

    void display() {
        System.out.println("Hello from MyClass!");
    }
}
```
## Objects in Java
An object is an instance of a class. It is created using the new keyword.

## Object Declaration

```
MyClass obj = new MyClass();  // Creates an object of MyClass
```
---
obj is a reference variable that stores the memory address of the created object.
The new keyword allocates memory for the object on the heap.
Each object gets its own copy of instance variables.
---