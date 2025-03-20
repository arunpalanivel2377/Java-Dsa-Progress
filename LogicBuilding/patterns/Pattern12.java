/*

Input Format: N = 3
Result: 
1    1
12  21
123321

Input Format: N = 6
Result:   
1          1
12        21
12       321
1234    4321
12345  54321
123456654321

Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

Logic:
outer loop will run from 1 to n
we have to print i numbers and n -(2 * i) spaces and again i numbers but in the reverse

 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            for(int j = 1; j <= (2 * n) - (2 * i);j++){
                System.out.print(" ");
            }

            int m = i;
            while (m != 0) {
                System.out.print(m);
                m -= 1;
            }
            System.out.println();
            
        }
    }
}
