import java.util.Scanner;
public class Input {

    private  static Scanner scanner;

    /* public Input(){
        scanner = new Scanner(System.in);
    } */

    public static String readString(){
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner.nextLine();
    }
    public static int readInt(){
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner.nextInt();
    }
}
