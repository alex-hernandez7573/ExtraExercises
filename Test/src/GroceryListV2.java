import java.util.ArrayList;

public class GroceryListV2 {

    private ArrayList <String> groceries;

    public GroceryListV2 (){
        groceries = new ArrayList<>();
    }

    public int numberOfItemsInList () {
        return groceries.size();
    }

    public boolean addItem (String item) {
        return groceries.add(item);
    }

    public void addItem (int index, String item) {
        groceries.add (index, item);
    }

    public String getItem (int index) {
        return groceries.get(index);
    }
    public String setItem (int index, String item) {
        return groceries.set(index, item);
    }
    public String removeItem (int index){
        return groceries.remove(index);
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < groceries.size(); i++){
            s += groceries.get(i) + " ";
        }
        if (groceries.size() == 0) {
            s = "*** == NOTHING TO SHOW == ***";
        }
        return s;
    }


    public static void main(String[] args) {

    }

}
