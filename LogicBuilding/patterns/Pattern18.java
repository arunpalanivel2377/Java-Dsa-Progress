/*
Input Format: N = 3
Result:
C
B C
A B C

Input Format: N = 6
Result:
F
E F
D E F
C D E F
B C D E F
A B C D E F

### **Logic:**
- The **outer loop** runs from `i = 0` to `i < N`, controlling the number of rows.
- In each row:
  - **Determine the starting character (`ch`)**:
    - Set `ch = 'A' + (N - i - 1)`, ensuring the first character of each row starts correctly.
  - **Print characters**:
    - The **inner loop** runs from `j = 0` to `j <= i`, printing `ch` while incrementing it in each iteration.
  - Move to the next line after printing all characters for the current row.

 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){

            char ch = 'A';
            ch += n -i-1;

            for(int j = 0; j <= i; j++){
                System.out.print(ch + " ");
                ch +=1;
            }
            
            System.out.println();
        }
    }
}
