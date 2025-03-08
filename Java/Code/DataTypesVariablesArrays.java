package Java.Code;

public class DataTypesVariablesArrays {
    public static void main(String[] args) {
        // Primitive Data Types
        int num = 10;
        double price = 99.99;
        char grade = 'A';
        boolean isJavaFun = true;

        // Non-Primitive Data Type (String)
        String message = "Hello, Java!";
        
        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Printing values
        System.out.println("Integer: " + num);
        System.out.println("Double: " + price);
        System.out.println("Char: " + grade);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("String: " + message);
        System.out.print("Array Elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}