/*

Input Format: N = 3
Result: 
  *  
 ***
***** 
*****  
 ***
  *   
Input Format: N = 6
Result:   
     *
    ***
   ***** 
  *******
 *********
***********  
***********
 *********
  *******
   ***** 
    ***    
     *



Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

### **Logic:**  
- The **outer loop** runs twice:
  1. **First half (Upper Pyramid)** → from `i = 0` to `i < N`
  2. **Second half (Inverted Pyramid)** → from `i = 0` to `i < N`

- In each row, we take care of three things:

#### **First Half (Upper Pyramid)**
  1. **Print spaces before stars** → `(N - i - 1)` spaces.
  2. **Print stars** → `(2 * i + 1)` stars.
  3. **Print spaces after stars** → `(N - i - 1)` spaces (not needed for output formatting).

#### **Second Half (Inverted Pyramid)**
  1. **Print spaces before stars** → `i` spaces.
  2. **Print stars** → `((2 * N) - 1 - 2 * i)` stars.
  3. **Print spaces after stars** → `i` spaces (not needed for output formatting).



 */


package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }

            for(int j = 0; j <  2 * i+1;j++){
                System.out.print("*");
            }

            for(int j = 0; j < n - i - 1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < i;j++){
                System.out.print(" ");
            }
            
            for(int j = i; j < ((2 * n)-1)-i;j++){
                System.out.print("*");
            }

            for(int j = 0; j < i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
        scanner.close();
    }
}
