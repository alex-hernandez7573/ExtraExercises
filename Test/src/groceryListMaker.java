import java.util.Arrays;
import java.util.Scanner;

public class groceryListMaker {




    public static void main(String[] args) {




        String greeting = "How many items do you need from the grocery store?";
        System.out.println(greeting);
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int myArray[] = new int [size];
        System.out.println("Enter the Items one by one");
        for (int i = 0; i < size; i++) {
            myArray [i] = sc.nextInt();
        }
        System.out.println("the list of groceries you entered were "+ Arrays.toString(myArray));




    }
}
