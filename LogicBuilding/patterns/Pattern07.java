/*


Input Format: N = 3
Result: 
  *  
 *** 
*****

Input Format: N = 6
Result:
     *     
    ***    
   *****   
  *******  
 ********* 
***********

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
at first line we have 2 spaces, 1 star, 2 spaces, which means n - i - 1 spaces, 2 * i + 1 stars, again n - i - 1 spaces.

 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            

            for(int j =  0; j < n - i - 1; j++){
                System.out.print(" ");

            }
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            
            System.out.println();
            
                
        }
}}
