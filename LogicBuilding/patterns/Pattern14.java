/*
 
Input Format: N = 3
Result: 
A
A B
A B C

Input Format: N = 6
Result:   
A
A B
A B C
A B C D
A B C D E
A B C D E F

### **Logic:**
- The **outer loop** runs from `i = 0` to `i < N`, controlling the number of rows.
- In each row, we start with the character `'A'`.
- The **inner loop** runs from `j = 0` to `j <= i`, controlling the number of columns in each row.
  - Print the character `ch`.
  - Increment `ch` by `1` to move to the next letter in the alphabet.
- After the inner loop completes, move to the next line using `System.out.println()`.

 */

package LogicBuilding.patterns;
 

import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i = 0; i < n;i++){

            char ch = 'A';

            for(int j = 0; j <=i; j++){
                System.out.print(ch + " ");
                ch += 1;
            }
            
            System.out.println();
        }
        scanner.close();
    }
}
