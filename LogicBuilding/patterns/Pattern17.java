/*
Input Format: N = 3
Result:
  A
 ABA
ABCBA


Input Format: N = 6
Result:
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
ABCDEFEDCBA
 */


package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();



        for(int i = 0; i < n; i++){
            char ch = 'A';
            for(int j = 0; j < n-i-1 ; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < 2 * i + 1; j++){
                int checkpoint = n - 1;
                System.out.print(ch);
                if (j < checkpoint) ch += 1;
                else ch -= 1;
            }
            /*
            for(int j = 0; j <= i; j++){
                System.out.print(ch);
                ch += 1;
            }
            ch -= 1;
            for(int j = 0; j < i; j++){
                ch -= 1;
                System.out.print(ch);
            }
            */

            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }



    }

}
