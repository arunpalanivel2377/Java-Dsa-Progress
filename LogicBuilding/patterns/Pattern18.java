/*
Input Format: N = 3
Result:
C
B C
A B C

Input Format: N = 6
Result:
F
E F
D E F
C D E F
B C D E F
A B C D E F
 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            char ch = 'A';
            ch += n -i-1;
            for(int j = 0; j <= i; j++){
                System.out.print(ch + " ");
                ch +=1;
            }
            System.out.println();
        }
    }
}
