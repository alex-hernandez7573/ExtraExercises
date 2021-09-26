import java.io.File;
import java.io.IOException;

public class fileIOTest {
    public static void main(String[] args) throws IOException {
     try {
         File myObject = new File("NewFile.txt");
         if (myObject.createNewFile()){
             System.out.println("file created: "+myObject.getName());
         }else{
             System.out.println("file already exist");
         }
     } catch (IOException e) {
         System.out.println("an error has occured");
         e.printStackTrace();
     }

    }
}
