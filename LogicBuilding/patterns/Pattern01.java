/*



Example 1:
Input: N = 3
Output: 
* * *
* * *
* * *


Example 2:
Input: N = 6
Output:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *

Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

### **Logic:**  
- The **outer loop** runs from `i = 0` to `i < N`, controlling the number of rows.  
- The **inner loop** runs from `j = 0` to `j < N`, printing `*` for each column in a row.  
- After the inner loop completes, `System.out.println()` moves to the next line to print the next row.  
- This results in an **N x N square pattern** of `*`.  

 */

package LogicBuilding.patterns;

import java.util.Scanner;
public class Pattern01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++ ){

            for (int j = 0; j < n; j++){
                System.out.print("* " );
            }

        System.out.println();
        }

    scanner.close();
    }
    
}
