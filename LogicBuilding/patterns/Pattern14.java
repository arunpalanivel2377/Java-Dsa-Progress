/*
 
Input Format: N = 3
Result: 
A
A B
A B C

Input Format: N = 6
Result:   
A
A B
A B C
A B C D
A B C D E
A B C D E F
 */

 //Hello Guys
package LogicBuilding.patterns;
 


import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i = 0; i < n;i++){
            char ch = 'A';
            for(int j = 0; j <=i; j++){
                System.out.print(ch + " ");
                ch += 1;
            }
            System.out.println();
        }
    }
}
