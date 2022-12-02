import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("prueba.txt");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }

    }
}
