/*
Input Format: N = 3
Result:
A
B B
C C C

Input Format: N = 6
Result:
A
B B
C C C
D D D D
E E E E E
F F F F F F

### **Logic:**
- The **outer loop** runs from `i = 0` to `i < N`, controlling the number of rows.
- In each row:
  - Initialize `ch` to `'A'` and increment it after every row.
  - The **inner loop** runs from `j = 0` to `j <= i`, printing the same character `ch` in that row.
  - Move to the next line after printing all characters for the current row.

 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        char ch = 'A';

        for (int i = 0; i < n; i++){

            for (int j = 0; j <= i; j++){
                System.out.print(ch + " ");
            }

            ch += 1;
            System.out.println();
        }
        
        scanner.close();
    }
}
