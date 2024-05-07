package recursion;

public class FibonaciiSeries {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 10;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static long fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
