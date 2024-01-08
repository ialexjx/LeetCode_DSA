package basics;

import java.util.Scanner;

// This code will take an input character from user
// If character is A-Z print 1
// If character is a-z print 0
// Otherwise print -1
public class CheckAlphabets {
    public static void main(String[] args) {
        System.out.println("Enter a character you want");
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        System.out.println(isAlphabet(c));
    }
    public static int isAlphabet(char x){
        if(Character.isUpperCase(x)){
            return 1;
        } else if (Character.isLowerCase(x)) {
            return 0;
        }else{
            return -1;
        }
    }
}
