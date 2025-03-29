/*
Input Format: N = 3
Result:
******
**  **
*    *
*    *
**  **
******

Input Format: N = 6
Result:
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************

 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < (2 * i);j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < (2 * n) - (2 * i);j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

