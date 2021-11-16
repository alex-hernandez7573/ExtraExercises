import java.util.HashMap;

public class DSPractice {
// hash map reference
    public static void main(String[] args) {

        //create the HashMap object

        HashMap <String, String> FavoriteMovies = new HashMap<String, String>();

        // this will add values
        FavoriteMovies.put("Action", "John Wick");
        FavoriteMovies.put("Fantasy", "Lord of Rings");
        FavoriteMovies.put("Sci-Fi", "Blade Runner");
        FavoriteMovies.put("Indie", "Fantastic Mr.Fox");
        FavoriteMovies.put("Horror", "Pandorum");
        FavoriteMovies.put("Thriller", "Hurt Locker");
        System.out.println(FavoriteMovies);


        System.out.println(FavoriteMovies.get("Action")+" <- GET method that grabs the refers to its key");
        FavoriteMovies.remove("Horror"); // method to remove from the hash map refers by key
        System.out.println(FavoriteMovies);
        System.out.println(FavoriteMovies.size()); // method to grab size
        System.out.println(FavoriteMovies.isEmpty()); // boolean check if empty
        System.out.println(FavoriteMovies.keySet()); // grabs the keys & prints them
        System.out.println(FavoriteMovies.entrySet()); // grabs each entry by set pairs in this instance
        FavoriteMovies.clear();
        System.out.println(FavoriteMovies); // method to clear the HashMap

    }
}
