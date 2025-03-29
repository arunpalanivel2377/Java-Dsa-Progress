/*

Input Format: N = 3
Result: 
1
01
101

Input Format: N = 6
Result:   
1
01
101
0101
10101
010101

Always use nested loops to solve the pattern programs
outter loop is for rows and 
inner loop is for colums
inner loop will print and contains logic.

Logic:
outer loop will run from 1 to n
for odd number of rows starts from 1 
for even number of rrows starts from 0
to print the binary digits we use 1 - num. Because 1 - 0 is 1 and 1 - 1 is 0. 


 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <=n; i++){
            int num = 1;
            if(i%2 == 0) num = 0;
            else num = 1;
            for(int j = 1; j<=i;j++){
                System.out.print(num);
                num = 1 - num;
            }
            System.out.println();
        }

        /*
        for(int i = 1; i < n +1; i++){
            for(int j = 1; j <= i; j++){
                if( i % 2 != 0){
                    if((j % 2) != 0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }
                else{
                    if ((j%2) == 0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                
            }
            System.out.println();
            
            
        }
        
         */
        

    }
}
