package Java.Code;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        
        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        
        // Logical Operators
        System.out.println("(a > 5 && b < 10): " + ((a > 5) && (b < 10)));
        System.out.println("(a > 5 || b > 10): " + ((a > 5) || (b > 10)));
        System.out.println("!(a > 5): " + !(a > 5));
        
        // Assignment Operators
        a += 2;
        System.out.println("a after +=2: " + a);
    }
}