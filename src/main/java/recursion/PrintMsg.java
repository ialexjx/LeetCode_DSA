package recursion;

public class PrintMsg {
    public static void displayMsg(int num){
        if(num > 0){
        System.out.println("Hello there " + num);
        displayMsg(num - 1);
            System.out.println("hello " + num);
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        displayMsg(3);
    }
}
