import java.util.Random;

public class simpleOneVOneGame {

    //random draw game

    // both player draw from a random number 1-10
    // player with the highest random number wins
    // 10 wins to finish game

    // I need a a random number
    public static void main(String[] args) {
        System.out.println("Player 1 goes first");



//        System.out.println(a == b);
        randomNumberGiven();
        randomNumberGiven();



    }

    private static void randomNumberGiven() {
        Random rand = new Random();
        int upperBound = 10;
        int int_random = rand.nextInt(upperBound);
        System.out.println("Given Random: "+int_random);
    }
}
