# Methods in Java
A method is a block of code within a class that defines the behavior of an object. It can accept input parameters, perform actions, and return a value.

## Example:
```java
class Calculator{
    int x = 10; // instance variable
    // Method to add two integers
    public int add(int x, int y){
        return x + y;
    }
    // Method to subtract two integers
    public int sub(int x, int y){
        return x - y;
    }
}
```
### In this example:

- add and sub are methods that perform addition and subtraction, respectively.
- The method add takes two integers (x and y) as input and returns their sum.
- Similarly, sub takes two integers and returns their difference.


# Method Overloading

Method overloading occurs when multiple methods in the same class have the same name but different parameter lists (either by number of parameters or type).

## Example:

```java
class Calculator{
    int x = 10;
    // Method to add two integers
    public int add(int x, int y){
        return x + y;
    }
    // Method to subtract two integers
    public int sub(int x, int y){
        return x - y;
    }
    // Method to add three integers (overloaded version of add)
    public int add(int x, int y, int z){
        return x + y + z;
    }
}
```
### In this example:

- The method add is overloaded with a different number of parameters. The first version adds two integers, while the second one adds three integers. Even though both methods are named add, Java can distinguish them based on the number of parameters.

## Key Points:
* Method Signature: The method's name and parameter list form its signature. In the case of overloading, the signature must differ in the number or type of parameters.

* Return Type: Method overloading is based on parameters, not the return type. You cannot differentiate overloaded methods by return type alone.

