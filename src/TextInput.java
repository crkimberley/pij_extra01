import java.util.Scanner;

/**
 * @author Chris Kimberley
 */
public class TextInput {

    public static void main (String [] args) {
        System.out.println ("Tell me something...");
        Scanner text = new Scanner(new Scanner(System.in).nextLine());
        while (text.hasNext()) {
            System.out.println (text.next());
        }
    }
}