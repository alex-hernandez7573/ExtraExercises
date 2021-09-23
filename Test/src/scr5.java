import java.util.Scanner;

public class scr5 {
    public static void main(String[] args) {
        System.out.print("loops");
        // simple while loop that counts 0-4
        int a = 0;
        while (a < 5) {
            System.out.print(a);
            a++;
        }
        String carName = "volvo";
        // do while that counts
        int b = 0;
        do {
            System.out.println(b);
            b++;
        }
        while (b < 5);
        //for loop that finds the multiples of inputted number
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.printf("%d x %d = %d%n", N, i, N*i);
        }

    }
}
