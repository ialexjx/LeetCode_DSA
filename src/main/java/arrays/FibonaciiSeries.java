package arrays;

public class FibonaciiSeries {
        public static void main(String[] args) {
            System.out.println("Fibonacii Numbers");
            displayFibWithoutRecursion();
        }

        public static void displayFibWithoutRecursion(){
            System.out.println("inside displayFibWithoutRecursion");
            int arr[] = new int[10];
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2; i< arr.length; i++){
                arr[i] = arr[i-1] + arr[i-2];
            }

            System.out.println(arr);
        }
    }

