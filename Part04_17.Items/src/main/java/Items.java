
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            items.add(new Item(input));
        }
    }
}
