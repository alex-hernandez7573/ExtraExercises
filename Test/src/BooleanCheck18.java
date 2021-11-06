import java.util.InputMismatchException;
import java.util.Scanner;

public class BooleanCheck18 {

    public static void main(String[] args) {

        System.out.println("hello world");
        boolean b = false;

        do {
            try {
                System.out.println("Are you above 18?");
                Scanner scanner = new Scanner(System.in);
                boolean check = scanner.nextBoolean();
                if (check == true) {
                    System.out.println("over 18");
                } else if (check == false) {
                    System.out.println("under 18");
                }
            }
             catch (InputMismatchException e) {
                 System.out.println("Invalid Input");
             }
        } while (!b);
    }

}
