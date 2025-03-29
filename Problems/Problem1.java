package Problems;

public class Problem1 {
    public static void main(String[] args){
        int number = 23;
        int m = number;
        int result = 0;
        while(m!= 0){
            int last = m % 10;

            if ((last != 0) && ((number % last) == 0)) result += 1;

            m = m / 10;
        }
        System.out.println(result);
    }

}
