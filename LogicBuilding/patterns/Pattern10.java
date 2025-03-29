/*


Input Format: N = 3
Result: 
  *  
  **
  ***  
  **
  *   
Input Format: N = 6
Result:   
     *
     **
     *** 
     ****
     *****
     ******  
     *****
     ****
     ***    
     **
     *

Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

### **Logic:**
- The **outer loop** runs from `i = 0` to `(2 * N - 1)`, controlling the number of rows.

- In each row, we handle **two conditions**:

  1. **First Half (Increasing Stars)**
     - If `i < N`, print `(i + 1)` stars.

  2. **Second Half (Decreasing Stars)**
     - If `i >= N`, print `((2 * N) - i - 1)` stars.

- **No spaces are needed** in this pattern.



 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < 2 * n -1; i++){

            int stars = i + 1;

            if ( i >= n ) stars = ((2 * n)-i)-1;

            for(int j = 0; j < stars; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }


        scanner.close();
        
    }
}
