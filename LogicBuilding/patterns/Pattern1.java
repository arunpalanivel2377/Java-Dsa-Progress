/*

Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

Example 1:
Input: N = 3
Output: 
* * *
* * *
* * *


Example 2:
Input: N = 6
Output:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *

 */

package LogicBuilding.patterns;

import java.util.Scanner;
public class Pattern1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++ ){
        for (int j = 0; j < n; j++){
            System.out.print("* " );
        }
        System.out.println();
    }
    }
    
}
