/*

Input Format: N = 3
Result: 
*****  
 ***
  *   
Input Format: N = 6
Result:     
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

Logic:  
- The **outer loop** runs from `i = 0` to `i < N`, controlling the number of rows.  
- We have to take care of three things in each row:  

  1. **Print spaces before the stars** → `i` spaces.  
  2. **Print stars** → `(2 * n - 1) - 2 * i` stars in each row.  
  3. **Print spaces after the stars** → `i` spaces (though not needed for output formatting).  

Pattern breakdown for `N = 3`:  
Row 1 → 0 spaces, 5 stars, 0 spaces
Row 2 → 1 space, 3 stars, 1 space
Row 3 → 2 spaces, 1 star, 2 spaces


 */


package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){

            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for(int j = i; j < (2 * n - 1) - i; j++){
                System.out.print("*");
            }

            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
