
/*
Input Format: N = 3
Result: 
1
2 3
4 5 6

Input Format: N = 6
Result:   
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21


Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

Logic:
declare a variable num and initialise it with 1.
outer loop will run from 1 to n
inner loop will run from 1 to i(outer loop)
print num and increament by 1.


 */


package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        for(int i = 1; i <= n;i++){
            
            for(int j =1; j <= i;j++){
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
            }

            
        } 
    }
    

