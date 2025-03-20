/*
Input Format: N = 3
Result: 
* * *
* * 
*

Input Format: N = 6
Result:
* * * * * *
* * * * * 
* * * * 
* * * 
* * 
* 

Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

Logic: 
Outer loop will start from n to 1 (reverse)
Inner loop will run i + 1 times

 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = n; i > 0; i--){
            for(int j = 1; j < i+1; j++){
                System.out.print(("* "));
            }
            System.out.println();
        }
        
    }
}
