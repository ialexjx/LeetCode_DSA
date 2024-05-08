package recursion;

public class PrintMessage {
    public static void dispalayMessage(int num){
        int count = 0;
        if(num > 0){
            System.out.println("Hello there");
            dispalayMessage(num - 1);
        }
    }

    public static void main(String[] args) {
        dispalayMessage(5);
    }
}
