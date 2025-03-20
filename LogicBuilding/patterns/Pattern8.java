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
Outer loop will start from 1 to n for the rows
We have to take care about three things:
1. Print Spaces before the star.
2. print the stars
3. print the spaces after the stars.


n = 3
at first line we have 0 spaces, 5 star, 0 spaces, which means i spaces, ((2 * n - 1) - i) stars, again i spaces.

 */


package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern8 {
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
    }
}
