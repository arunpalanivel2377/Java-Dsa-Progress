/*
Input Format: N = 3
Result:
A
B B
C C C

Input Format: N = 6
Result:
A
B B
C C C
D D D D
E E E E E
F F F F F F
 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char ch = 'A';
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(ch + " ");
            }
            ch += 1;
            System.out.println();
        }
    }
}
