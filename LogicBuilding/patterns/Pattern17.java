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

### **Logic:**
- The **outer loop** runs from `i = 0` to `i < N`, controlling the number of rows.
- In each row:
  - **Print leading spaces**:  
    - Run an inner loop from `j = 0` to `j < N - i - 1`, printing spaces for alignment.
  - **Print left-side characters**:  
    - Initialize `ch = 'A'` and print it while incrementing `ch` in each iteration.
    - Run an inner loop from `j = 0` to `i`, printing `ch`.
  - **Print right-side characters**:  
    - Before starting this part, decrement `ch` by 2 (`ch -= 2`) to maintain symmetry.
    - Run an inner loop from `j = 0` to `i - 1`, printing `ch` while decrementing it.
  - Move to the next line after printing all characters in the current row.

 */


 package LogicBuilding.patterns;

 import java.util.Scanner;
 
 public class Pattern17 {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
 
         for(int i = 0; i < n; i++){
             
             for(int j = 0; j < n - i - 1; j++){
                 System.out.print(" ");
             }
 
             char ch = 'A';
             
             for(int j = 0; j <= i; j++){
                 System.out.print(ch);
                 ch++;
             }
 
             
             ch -= 2;
             for(int j = 0; j < i; j++){
                 System.out.print(ch);
                 ch--;
             }
 
             System.out.println();
         }
         scanner.close();
     }
 }
 