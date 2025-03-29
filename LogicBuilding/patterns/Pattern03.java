/*

Input Format: N = 3
Result: 
1
1 2 
1 2 3

Input Format: N = 6
Result:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6 

Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

Logic:
Print j, when i == j 

 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i< n+1; i++){
            for(int j=1; j < i+1; j++){
            System.out.print(j + " ");
            }
        System.out.println();
        }

    }
    
}
