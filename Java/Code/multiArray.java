package Java.Code;

public class multiArray {
    public static void main(String[] args) {
        int array[][] = new int[4][3];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                array[i][j] = (int)(Math.random() * 10);
            }
        }
        System.out.println();
        for (int n[] : array){
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println();

        int array1[][] = new int[3][];
        array1[0] = new int[4];
        array1[1] = new int[5];
        array1[2] = new int[6];

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                array1[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int n[] : array1){
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }


        int array2[][][] = new int[2][2][2];
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                for (int k = 0; k < 2; k++){
                    System.out.print(array2[i][j][k]);
                    
                }
                
            }System.out.println();
        }System.out.println();

    }
}
