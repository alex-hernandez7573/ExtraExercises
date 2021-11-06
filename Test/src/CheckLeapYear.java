import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {



        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter the year");
            int year = scanner.nextInt();
            System.out.println("the year you choose was: " +year);
            if (isLeapYear(year)){
                System.out.println("its leap");
                break;

            }
        }
    }

    public static boolean isLeapYear (int year) {
        if(year % 4 !=0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
