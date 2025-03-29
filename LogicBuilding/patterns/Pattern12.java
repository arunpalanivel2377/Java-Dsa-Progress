/*

Input Format: N = 3
Result: 
1    1
12  21
123321

Input Format: N = 6
Result:   
1          1
12        21
12       321
1234    4321
12345  54321
123456654321

Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

### **Logic:**
- The **outer loop** runs from `i = 1` to `i <= N`, controlling the number of rows.
- We have to take care of three things in each row:

  1. **Print increasing numbers (`1` to `i`)**:
     - The first **inner loop** runs from `j = 1` to `j <= i`, printing `j`.

  2. **Print spaces (`(2 * N) - (2 * i)`)**:
     - The second **inner loop** runs from `j = 1` to `j <= (2 * N) - (2 * i)`, printing spaces.

  3. **Print decreasing numbers (`i` to `1`)**:
     - A **while loop** prints numbers in reverse from `i` down to `1`.

- This creates a mirrored pattern where numbers expand outward while spaces contract.


 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i<=n;i++){

            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }

            for(int j = 1; j <= (2 * n) - (2 * i);j++){
                System.out.print(" ");
            }

            int m = i;

            while (m != 0) {
                System.out.print(m);
                m -= 1;
            }

            System.out.println();
            
        }
        scanner.close();
    }
}
