/*
Input Format: N = 3
Result: 
* * *
* * 
*

Input Format: N = 6
Result:
* * * * * *
* * * * * 
* * * * 
* * * 
* * 
* 

Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

### **Logic:**  
- The **outer loop** starts from `i = N` and **decrements** until `i = 1`, controlling the number of rows.  
- The **inner loop** runs from `j = 1` to `j <= i`, printing `*` `i` times in each row.  
- Since `i` decreases in each iteration, the number of `*` printed **reduces** in each row, forming an **inverted right-angled triangle**.  
- After printing all `*` in a row, `System.out.println()` moves to the next line.  


 */


package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = n; i > 0; i--){

            for(int j = 1; j < i+1; j++){
                System.out.print(("* "));
            }

            System.out.println();

        }

        scanner.close();
        
    }
}
