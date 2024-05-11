package recursion;

public class ReverseString {
    public static String reverseString(String str) {
        String reversedString = "";
        for(int i = str.length() - 1; i >=0; i--){
            reversedString = reversedString + str.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String name = "akshat";
        String reversedString = reverseString(name);
        System.out.println(reversedString);
    }
}
