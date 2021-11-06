public class FizzBuzzPractice {
    public static void main(String[] args) {
        // her we set an n to equal 100
        int n = 100;

        // create a simple for loop
        for (int i=1; i <= n; i ++) {

            //we need to check if the number is divisible by 3 & 5
            if ((i%5 == 0) && (i%3 == 0)) {
                System.out.println("FizzBuzz");
            }
            // multiples of 5
            else if (i%5 == 0) {
                System.out.println("Buzz");
                // multiples of 3
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else {
                // everything else ®
                System.out.println(i);
            }
        }
    }
}
