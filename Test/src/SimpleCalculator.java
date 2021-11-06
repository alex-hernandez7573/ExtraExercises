import java.util.Scanner;

public class SimpleCalculator {


    // application.
    // we want to add
    // we want to subtract
    // we want to divide

    public static void main(String[] args) {


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your first number");
            int userNumA = scanner.nextInt();
            System.out.println("Please enter your second number");
            int userNumB = scanner.nextInt();

            addTwoNums(userNumA ,userNumB );
            subtractTwoNums(userNumA ,userNumB );
            dividingTwoNums(userNumA ,userNumB );

            break;

        }

    }


    public static void addTwoNums (int userNumA, int userNumB ) {
        System.out.println("adding ...");
        System.out.println(userNumA + userNumB);
    }

    public static void subtractTwoNums (int userNumA, int userNumB) {
        System.out.println("subtracting ...");
        System.out.println(userNumA - userNumB);
    }
    public static void dividingTwoNums (int userNumA, int userNumB) {
        System.out.println("dividing ...");
        System.out.println(userNumA / userNumB);
    }

}
