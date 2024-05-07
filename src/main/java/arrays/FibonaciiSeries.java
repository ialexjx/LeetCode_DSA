package arrays;

import java.util.Arrays;

public class FibonaciiSeries {
        public static void main(String[] args) {
            System.out.println("Fibonacii Numbers");
            displayFibWithoutRecursion();
        }

        public static void displayFibWithoutRecursion(){
            long startTime = System.currentTimeMillis();
            System.out.println("inside displayFibWithoutRecursion");
            int arr[] = new int[10];
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2; i< arr.length; i++){
                arr[i] = arr[i-1] + arr[i-2];
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(System.currentTimeMillis() - startTime);
        }
    }

