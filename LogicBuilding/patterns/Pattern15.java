/*

Input Format: N = 3
Result:
A B C
A B
A

Input Format: N = 6
Result:
A B C D E F
A B C D E
A B C D
A B C
A B
A

### **Logic:**
- The **outer loop** runs from `i = 0` to `i < N`, controlling the number of rows.
- In each row:
  - Start with the character `'A'`.
  - The **inner loop** runs from `j = 0` to `j < (N - i)`, printing letters from `'A'` onward.
  - Increment `ch` by `1` in each iteration to move to the next letter.
- After the inner loop completes, move to the next line using `System.out.println()`.

 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){

            char ch = 'A';

            for(int j = 0; j < n - i; j++){
                System.out.print(ch + " ");
                ch += 1;
            }
            
            System.out.println();
        }
        scanner.close();
    }
}
