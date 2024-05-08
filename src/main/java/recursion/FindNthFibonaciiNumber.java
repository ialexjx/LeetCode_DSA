package recursion;

public class FindNthFibonaciiNumber {
    public static void main(String[] args) {
        System.out.println(nthFibonaciiNumber(5));
    }
    public static int nthFibonaciiNumber(int num){
        if(num == 1 || num == 2){
            return 1;
        }else {
            return nthFibonaciiNumber(num - 1) + nthFibonaciiNumber(num - 2);
        }
    }
}
