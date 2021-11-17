import java.util.Stack;

public class DSPracticeLIFO {

    // Stack
    // -> linear Data Structure <-
    // Last In First Out LIFO
    // Stack has one end while a Queue has two ends->> (FRONT and Rear)
    //Stack can be defined as a container in which insertion a deletion can be done from the on end known sas the
    // top of stack.
    // (it's called a stack because it simulates a real world example of a 'stack of book')
    // Common operations
    // -Push
    // -Pop
    // -isEmpty
    // -isFull
    // -Peek
    // -Count
    // -Change
    // -Display

    public static void main(String[] args) {
        Stack<String> FavFoodStack = new Stack<String>();
        FavFoodStack.push("Sushi"); // adds to the stack
        FavFoodStack.push("Pizza"); // adds to the stack
        FavFoodStack.push("Hot Pot"); // adds to the stack
        FavFoodStack.push("Spicy Chicken Tenders"); // adds to the stack
        FavFoodStack.push("Ramen"); // adds to the stack

//        for (int i = 0; i < 10; i++ ) {
//            FavFoodStack.push ("Carbs");
//        }

        FavFoodStack.pop(); // pops or takes top most item from the stack (it will omit ramen when it prints)

        String mySingleFavFood = FavFoodStack.pop(); // Since we popped again it will grab the top most object and
        System.out.println(mySingleFavFood);        //print that.

        System.out.println(FavFoodStack.peek()+" <-- to peek the top of the current stack");
        System.out.println(FavFoodStack.search("Pizza")+" <- what pos is the item of Pizza");
        System.out.println(FavFoodStack); // draws out the stack
        System.out.println(FavFoodStack.empty()); // boolean check to see if stack is empty




        // why use stacks
        //- 1. undo/redo features in text editors
        //- 2. Moving back and forth through browser history
        //- 3. Backtracking algorithms
        //- 4. Calling functions (call stack)

    }

}
