package recursion;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfAllNumbers(20));
    }

    public static int sumOfAllNumbers(int num){
        if (num == 1){
            return 1;
        }else {
            return num + sumOfAllNumbers(num - 1);
        }
    }
}
