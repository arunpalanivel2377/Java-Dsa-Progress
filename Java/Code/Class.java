package Java.Code;


class Calculator{
    int x = 10;
    public int add(int x, int y){
        return x + y;
    }
    public int sub(int x, int y){
        return x - y;
    }
}
public class Class {
    public static void main(String[] args) {

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        int result1 = obj.add(5, 4);
        int result2 = obj.sub(result1, 5);

        System.out.println(result1);
        System.out.println(result2);

        obj.x = 11;
        System.out.println(obj.x); // output: 11
        System.out.println(obj1.x); // output: 10
    
}

}