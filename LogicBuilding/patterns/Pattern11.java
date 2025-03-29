/*

Input Format: N = 3
Result: 
1
01
101

Input Format: N = 6
Result:   
1
01
101
0101
10101
010101

Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

### **Logic:**
- The **outer loop** runs from `i = 1` to `i <= N`, controlling the number of rows.
- We have to take care of two things in each row:

  1. **Determine the starting number (`num`)**:
     - If `i` is **odd**, start with `1`.
     - If `i` is **even**, start with `0`.

  2. **Print binary values (`num`)**:
     - The **inner loop** runs from `j = 1` to `j <= i`, printing `num`.
     - Toggle `num` using `1 - num` in each iteration (since `1 - 0 = 1` and `1 - 1 = 0`).

 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <=n; i++){

            int num = 1;

            if(i%2 == 0) num = 0;

            else num = 1;

            for(int j = 1; j<=i;j++){
                System.out.print(num);
                num = 1 - num;
            }
            
            System.out.println();
        }
        scanner.close();
       
    }
}
