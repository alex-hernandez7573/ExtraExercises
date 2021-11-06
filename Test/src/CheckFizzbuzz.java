import java.util.Scanner;

public class CheckFizzbuzz {

    public static void main(String[] args) {


        // while loop to check if the number is divisible by 3 & 5 or just singular multiples of 3 or singular
        // multiples of 5

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Number to Check the FIZZBUZZ");
            int userNum = scanner.nextInt();
            System.out.println("The number you chose was: "+ userNum);
            if (isNumberFizzBuzz(userNum)) {
                System.out.println("Cool Thanks :D");
            } else {
                System.out.println("nope");
            }

        }
    }
        public static boolean isNumberFizzBuzz (int userNum) {

        if ((userNum == 5) && (userNum == 3)) {
            System.out.println("Multiple of 5 & 3: FIZZBUZZ");
            return true;
            } else if (userNum == 5) {
            System.out.println("Multiple of 5: FIZZ");
                return true;
            } else if(userNum == 3) {
            System.out.println("Multiple of 3: BUZZ");
                return true;
        }
         return  false;
        }

    }

