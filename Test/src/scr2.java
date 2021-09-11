import java.util.Scanner;

public class scr2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer i = scan.nextInt();
        Double d = scan.nextDouble();

        /// really specific statement to stringify a sentence, instead of one word
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
