/*

Input Format: N = 3
Result:
A B C
A B
A

Input Format: N = 6
Result:
A B C D E F
A B C D E
A B C D
A B C
A B
A
 */

package LogicBuilding.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            char ch = 'A';
            for(int j = 0; j < n - i; j++){
                System.out.print(ch + " ");
                ch += 1;
            }
            System.out.println();
        }
    }
}
