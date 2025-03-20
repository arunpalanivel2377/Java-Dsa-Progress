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

Logic:
outer loop will run from 0 to (2 * n -1) times.
1 to n spaces and then n-1 to 1 spaces.
if (row > n) print ((2 * n)-i)-1 stars.
else print(i+1) stars.


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


        /*
          for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n-1;i++){
            for(int j = 0; j < n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
        
    }
}
