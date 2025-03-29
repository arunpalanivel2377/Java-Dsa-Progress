/*


Input Format: N = 3
Result: 
* 
* * 
* * *

Input Format: N = 6
Result:
* 
* * 
* * *
* * * *
* * * * *
* * * * * *


Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

### **Logic:**  
- The **outer loop** runs from `i = 1` to `i <= N`, controlling the number of rows.  
- The **inner loop** runs from `j = 1` to `j <= i`, printing `*` for each column in a row.  
- In each row, the number of `*` increases, forming a **right-angled triangle pattern**.  
- After the inner loop completes, `System.out.println()` moves to the next line to print the next row.  

 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   
        int n = scanner.nextInt();

        for (int i = 1; i<n+1; i++){

            for (int j=1; j<i+1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        
        scanner.close();
    }
}
