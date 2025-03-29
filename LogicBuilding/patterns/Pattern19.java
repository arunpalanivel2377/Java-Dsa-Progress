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


### **Logic:**
- The pattern consists of **two mirrored halves** (upper and lower).
- **Upper Half (First `N` rows)**:
  - The **first loop** runs from `i = 0` to `i < N`, controlling the rows.
  - Each row has three parts:
    1. **Stars (`*`)** on the left: Printed `N - i` times.
    2. **Spaces (` `)** in the middle: Printed `2 * i` times.
    3. **Stars (`*`)** on the right: Printed `N - i` times.

- **Lower Half (Next `N` rows)**:
  - The **second loop** runs from `i = 1` to `i <= N`, controlling the rows.
  - Each row also has three parts:
    1. **Stars (`*`)** on the left: Printed `i` times.
    2. **Spaces (` `)** in the middle: Printed `(2 * N) - (2 * i)` times.
    3. **Stars (`*`)** on the right: Printed `i` times.

- This ensures the symmetric **hourglass** pattern is formed.

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

