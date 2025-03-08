package Java.Code;

public class ControlStatements {
    public static void main(String[] args) {
        int num = 10;
        
        // If-else Statement
        if (num > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is non-positive.");
        }
        
        // Switch-case Statement
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }
        
        // Looping Statements
        System.out.println("For Loop Output:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nWhile Loop Output:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        
        System.out.println("\nDo-While Loop Output:");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        
        // Jump Statements
        System.out.println("\nBreak Statement:");
        for (i = 1; i <= 10; i++) {
            if (i == 6) break;
            System.out.print(i + " ");
        }
        
        System.out.println("\nContinue Statement:");
        for (i = 1; i <= 10; i++) {
            if (i == 6) continue;
            System.out.print(i + " ");
        }
    }
}