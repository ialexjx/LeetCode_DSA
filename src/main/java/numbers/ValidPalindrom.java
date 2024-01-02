package numbers;

// This is a program for the Valid Palindrom of Leetcode.
public class ValidPalindrom {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        //test case 1 - where input is 121
        System.out.println(validPalindrom(121));

        //test case 2 - where input is 10
        System.out.println(validPalindrom(10));

        //test case 3 - where input is 1121
        System.out.println(validPalindrom(-121));

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Total execution time: " + elapsedTime / 1000000 + " milliseconds");
    }
    public static boolean validPalindrom(int x){
        if(x >= 0){
            int number = x, r = 0, reverseNumber = 0;
            while (x != 0) {
                r = x % 10;
                reverseNumber = reverseNumber * 10 + r;
                x = x / 10;
            }
            return reverseNumber == number;

        }else {
            return false;
        }
    }
}

