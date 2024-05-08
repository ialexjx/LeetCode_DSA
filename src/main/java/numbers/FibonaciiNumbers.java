package numbers;

public class FibonaciiNumbers {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int num = 5;
        for(int i = 3; i <= num; i++){
            int fib = a + b;
            System.out.println(fib);
            a = b;
            b = fib;
        }
        System.out.println("values after the loop execution is " + a + " " + b);
    }
}
