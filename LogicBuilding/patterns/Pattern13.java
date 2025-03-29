
/*
Input Format: N = 3
Result: 
1
2 3
4 5 6

Input Format: N = 6
Result:   
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21


Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

### **Logic:**
- **Initialize a variable `num` with `1`** to keep track of the numbers to be printed.
- The **outer loop** runs from `i = 1` to `i <= N`, controlling the number of rows.
- The **inner loop** runs from `j = 1` to `j <= i`, controlling the number of columns in each row.
- In each iteration of the inner loop:
  - Print `num`.
  - Increment `num` by `1` to ensure the next number is printed in sequence.
- A `System.out.println()` is used after each row to move to the next line.



 */


package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int num = 1;

        for(int i = 1; i <= n;i++){
            
            for(int j =1; j <= i;j++){
                System.out.print(num + " ");
                num += 1;
            }

            System.out.println();
            
            }

        scanner.close(); 
        } 
    }
    

