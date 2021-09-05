public class GroceryListV2Test {

    public static void main(String[] args) {

        GroceryListV2 myList = new GroceryListV2();

        System.out.println("Grocery List: " + myList);
//      Original items on list
        myList.addItem("coffee");
        myList.addItem("creamer");
        myList.addItem("green tea");

        System.out.println("Grocery List: "+myList);

        System.out.println("Number of items: "+myList.numberOfItemsInList());
//        adding items to list
        myList.addItem(1,"doughnuts");
        myList.addItem(2,"sushi");

//        showing the entire list
        System.out.println("Grocery List: " +myList);
//        showing a get
        System.out.println(myList.getItem(3));
//        showing set
        System.out.println(myList.setItem(3,"chai"));

        System.out.println("-------");
    }
}
