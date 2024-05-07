package recursion;

public class SimpleRecursion {
    public static void main(String[] args) {
        displayNumbers(5);
    }
    public static void displayNumbers(int x){
       if(x > 0){
           System.out.println("hello world");
           displayNumbers(x - 1);
           System.out.println("hello");
           System.out.println(x);
       }
    }
}
